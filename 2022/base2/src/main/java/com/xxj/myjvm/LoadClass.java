package com.xxj.myjvm;


import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-30 11:17
 **/
public class LoadClass extends ClassLoader{
    public static void main(String[] args) {
        int count = 0;
        try {
            LoadClass loadClass = new LoadClass();
            for (int i = 0; i < 10000; i++) {
                String className = "Class" + i;
                // 创建ClassWriter对象，用于生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                // 指定版本号、修饰符、类名、包名、父类和接口
                classWriter.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, className, null, "java/lang/Object", null);
                byte[] bytes = classWriter.toByteArray();
                // 加载类
                loadClass.defineClass(className, bytes, 0, bytes.length);
                count++;
            }
        } finally {
            System.out.println(count);
        }
    }


}
