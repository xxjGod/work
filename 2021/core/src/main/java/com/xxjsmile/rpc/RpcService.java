package com.xxjsmile.rpc;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 17:34
 * All Rights Reserved
 */
public class RpcService {

    private static final HashMap<String, Class> serviceRegistry = new HashMap<String, Class>();

    public static void register(Class serviceInterface, Class impl) {
        serviceRegistry.put(serviceInterface.getName(), impl);
    }

    public static void main(String[] args) {
        RpcService.register(RpcSayHiService.class, RpcSayHiServiceImpl.class);
        String registerName = RpcSayHiService.class.getName();
        System.out.println("服务已注册" + serviceRegistry.get(registerName));
        try {
            ServerSocket server = new ServerSocket(8088);
            while (true) {
                Socket client = server.accept();
                System.out.println("接收到一个client连接");
                new Thread(new RpcWorker(client)).start();
            }
        } catch (Exception e) {
        } finally {
            //TODO: handle exception
        }
    }

    public static class RpcWorker implements Runnable {
        Socket s;

        public RpcWorker(Socket s) {
            this.s = s;
        }

        public void run() {
            try {
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                ObjectInputStream input = new ObjectInputStream(is);
                ObjectOutputStream ouput = new ObjectOutputStream(os);
                String serviceName = input.readUTF();
                String methodName = input.readUTF();
                Class<?>[] paramterTypes = (Class<?>[]) input.readObject();
                Object[] arguments = (Object[]) input.readObject();
                Class serviceClass = serviceRegistry.get(serviceName);
                if (serviceClass == null) {
                    System.out.println("未找到暴露的服务" + serviceName);
                }
                Method method = serviceClass.getMethod(methodName, paramterTypes);
                Object result = method.invoke(serviceClass.newInstance(), arguments);
                ouput.writeObject(result);
                ouput.close();
                input.close();
                os.close();
                is.close();
                s.close();

            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}

