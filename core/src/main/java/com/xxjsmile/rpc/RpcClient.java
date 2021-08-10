package com.xxjsmile.rpc;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/7/1 17:36
 * All Rights Reserved
 */
public class RpcClient {

    private static <T> T getRemoteProxyObj(final Class<?> serviceInterface,final InetSocketAddress addr){
        return (T) Proxy.newProxyInstance(serviceInterface.getClassLoader(),new Class<?>[]{serviceInterface},
                new InvocationHandler(){
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Socket socket = null;
                        ObjectOutputStream output = null;
                        ObjectInputStream input = null;
                        try {
                            socket = new Socket();
                            socket.connect(addr);
                            OutputStream os = socket.getOutputStream();
                            InputStream is = socket.getInputStream();
                            output = new ObjectOutputStream(os);
                            input = new ObjectInputStream(is);
                            output.writeUTF(serviceInterface.getName());
                            output.writeUTF(method.getName());
                            output.writeObject(method.getParameterTypes());
                            output.writeObject(args);
                            return input.readObject();
                        } finally{
                            if(socket != null){
                                socket.close();
                            }
                            if(output != null){
                                output.close();
                            }
                            if(input != null){
                                input.close();
                            }
                        }
                    }
                });
    }
    public static void main(String[] args) {
        RpcSayHiService sayHiService = RpcClient.getRemoteProxyObj(RpcSayHiService.class,new InetSocketAddress("127.0.0.1",8088));
        if(sayHiService != null){
            String result =  sayHiService.sayHi("java");
            System.out.println(result);
        }
    }
}
