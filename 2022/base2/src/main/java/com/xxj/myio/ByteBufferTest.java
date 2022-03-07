package com.xxj.myio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/7 16:24
 * All Rights Reserved
 */
public class ByteBufferTest {


    static RandomAccessFile aFile;

    static {
        try {
            aFile = new RandomAccessFile("C:\\work\\123.txt", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static RandomAccessFile toFile;

    static {
        try {
            toFile = new RandomAccessFile("C:\\work\\123bak.txt", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        //test1();
        //test2();
        test3();
    }

    private static void test3() throws IOException {


        FileChannel      fromChannel = aFile.getChannel();

        FileChannel      toChannel = toFile.getChannel();

        long position = 0;
        long count = fromChannel.size();

        toChannel.transferFrom(fromChannel,position, count);






    }

    private static void test2() throws IOException {

        FileChannel inChannel = aFile.getChannel();
        ByteBuffer header = ByteBuffer.allocate(1024);
        ByteBuffer body = ByteBuffer.allocate(100);

        ByteBuffer[] bufferArray = {header, body};

        System.out.println(inChannel.read(bufferArray));
        inChannel.write(bufferArray);
        System.out.println(inChannel.read(bufferArray));
    }

    private static void test1() throws IOException {

        FileChannel inChannel = aFile.getChannel();

//create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(2);


        int bytesRead = inChannel.read(buf); //read into buffer.

        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while (buf.hasRemaining()) {
                char c = (char) buf.get();
                if (c == 'e') {
                    buf.mark();
                    buf.reset();
                }
                System.out.print(c); // read 1 byte at a time
            }

            //buf.clear(); //make buffer ready for writing
            //bytesRead = inChannel.read(buf);
            //buf.reset();
            //System.out.println(buf);
        }
        aFile.close();
    }

}
