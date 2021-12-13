package com.xxjsmile.rpc;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 17:31
 * All Rights Reserved
 */
public class TcpService {
    public static void main(String[] args) {
        try {
            ServerSocket echo = new ServerSocket(8001);
            while(true){
                Socket clientSocket = echo.accept();
                System.out.println("服务端socket:"+clientSocket);
                System.out.println("接收到一个client连接");
                new Thread(new Worker(clientSocket)).start();
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
class Worker implements Runnable{
    Socket s;
    public Worker(Socket s){
        this.s = s;
    }
    public void run(){
        try {
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            DataOutputStream dos = new DataOutputStream(os);
            //PrintWriter pw = new PrintWriter(os);
            while(true){
                String strWord = br.readLine();
                if(strWord.equals("quit")){
                    System.out.println("客户端断开链接");
                    break;
                }
                System.out.println("client said : "+strWord);
                String echo = "echo:" + strWord + System.getProperty("line.separator");
                dos.writeBytes(echo);
                //pw.println(echo);
            }
            br.close();
            dos.close();
            s.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
