//package com.xxj.myio;
//
//
//import java.nio.ByteBuffer;
//import java.nio.CharBuffer;
//
///**
// * @Description:
// * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
// * @Date 2022/3/7 16:24
// * All Rights Reserved
// *
// * pos, lim, cap
// * flip -->pos=0 lim=len
// * compact -->pos=未读的index
// * clear -->pos=0 lim=cap
// * rewind -->pos=0 lim=len
// *
// *
// */
//public class BufferTest {
//
//
//    public static void main(String[] args) {
//        //test1();
//        //test2();
//        test3();
//        //test4();
//    }
//
//    private static void test4() {
//
//        ByteBuffer buf = ByteBuffer.allocate(10);
//        buf.put(new byte[]{1, 2, 3, 4, 5});
//        buf.flip();
//        System.out.println(buf.get());
//        System.out.println(buf.get());
//        buf.compact();
//        buf.put((byte) 10);
//        //buf.put((byte)9);
//        buf.flip();
//        while (buf.hasRemaining()) {
//            System.out.println("#####" + buf.get());
//        }
//    }
//
//    private static void test3() {
//        ByteBuffer buf = ByteBuffer.allocate(48);
//        buf.put(new byte[]{1, 2, 3, 4, 5});
//       // System.out.println(buf.get());    // 此时输出为 a
//        buf.clear();
//        //buf.put('g');
//        //buf.flip();
//        System.out.println(buf.get());    // 此时输出为 g
//
//        System.out.println(buf.get());    // 预期输出为 b
//    }
//
//    private static void test2() {
//        String str = "abcde";
//        //1.分配一个指定大小的缓冲区
//        ByteBuffer buf = ByteBuffer.allocate(1024);
//        System.out.println("-------allocate()-------");
//        System.out.println("正在操作的位置 " + buf.position());
//        System.out.println("缓冲区中可操作数据的大小 " + buf.limit());
//        System.out.println("容量 " + buf.capacity());
//
//        //2.利用put()方法存入数据到缓冲区
//        buf.put(str.getBytes());
//        System.out.println("-------put()-------");
//        System.out.println("正在操作的位置 " + buf.position());
//        System.out.println("缓冲区中可操作数据的大小 " + buf.limit());
//        System.out.println("容量 " + buf.capacity());
//        //3.切换成读取数据的模式,利用flip()方法来进行读取数据
//        buf.flip();
//        System.out.println("-------flip()-------");
//        System.out.println("正在操作的位置 " + buf.position());
//        System.out.println("缓冲区中可操作数据的大小 " + buf.limit());
//        System.out.println("容量 " + buf.capacity());
//        //4.利用get()读取缓冲区中的数据
//        byte[] dst = new byte[buf.limit()];
//        buf.get(dst);
//        System.out.println(new String(dst, 0, dst.length));
//        System.out.println("-------get()-------");
//        System.out.println("正在操作的位置 " + buf.position());
//        System.out.println("缓冲区中可操作数据的大小 " + buf.limit());
//        System.out.println("容量 " + buf.capacity());
//        //5.rewind():表示可以重复读取
//        buf.rewind();
//        System.out.println("-------rewind()-------");
//        System.out.println("正在操作的位置 " + buf.position());
//        System.out.println("缓冲区中可操作数据的大小 " + buf.limit());
//        System.out.println("容量 " + buf.capacity());
//        //6.清空缓冲区,但是缓冲区中的数据依然存在，只不过数据是处于被遗望的状态
//        buf.clear();
//        System.out.println("-------clear()-------");
//        System.out.println("正在操作的位置 " + buf.position());
//        System.out.println("缓冲区中可操作数据的大小 " + buf.limit());
//        System.out.println("容量 " + buf.capacity());
//
//        System.out.println((char) buf.get());
//
//    }
//
//    private static void test1() {
//        String str = "abcde";
//        ByteBuffer buf = ByteBuffer.allocate(1024);
//        buf.put(str.getBytes());
//
//        buf.flip();
//
//        byte[] dst = new byte[buf.limit()];
//        buf.get(dst, 0, 2);
//        System.out.println(new String(dst, 0, 2));
//
//        System.out.println(buf.position());
//
//        //mark()：标记
//        buf.mark();
//        buf.get(dst, 2, 2);
//        System.out.println(new String(dst, 2, 2));
//        System.out.println(buf.position());
//
//        //reset()
//        buf.reset();
//        System.out.println(buf.position());
//
//        //判断缓冲区中是否还有剩余数据
//        if (buf.hasRemaining()) {
//            //如果有的话，那么获取缓冲区中可以操作的数量
//            System.out.println(buf.remaining());
//        }
//
//
//    }
//
//
//}
