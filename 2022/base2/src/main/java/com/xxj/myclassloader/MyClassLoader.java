package com.xxj.myclassloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-15 17:18
 **/
public class MyClassLoader extends ClassLoader {

    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }


    //C:/work/demoproject/work/2021/base/target/classes/com/xxjsmile/bean/Bird.class
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;
        String classFilename = path;
        File file = new File(classFilename);
        if (file.exists()) {
            try {

                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(file);
                    out = new ByteArrayOutputStream();

                    byte[] buffer = new byte[1024];
                    int size = 0;
                    while ((size = in.read(buffer)) != -1) {
                        out.write(buffer, 0, size);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        in.close();
                    } catch (IOException e) {

                        e.printStackTrace();
                    }
                }

                byte[] data = out.toByteArray();

                clazz = defineClass(name, data, 0, data.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (clazz == null) {
            throw new ClassNotFoundException(name);
        }
        return clazz;
    }

    @Override
    public String toString() {
        return "MyClassLoader{" +
                "path='" + path + '\'' +
                '}';
    }
}
