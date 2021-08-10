package com.xxjsmile.rpc;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 17:32
 * All Rights Reserved
 */
public class TcpClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 8001);
            System.out.println("客户端socket:" + s);
            //service 的输出流就是 client的输入流
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            new Thread() {
                public void run() {
                    try {
                        String str = "";
                        while (true && s.isConnected() && (str = br.readLine()) != null) {
                            //String echo = br.readLine();
                            System.out.println("service said : " + str);
                        }
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }.start();
            //客户端输入
            BufferedReader writer = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String strWord = writer.readLine();
                dos.writeBytes(strWord + System.getProperty("line.separator"));
                if (strWord.equals("quit")) {
                    break;
                }
            }

            dos.close();
            br.close();
            writer.close();
            s.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
