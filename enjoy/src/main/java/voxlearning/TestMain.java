package voxlearning;

/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2021/6/10 18:27
 * All Rights Reserved
 */
public class TestMain {

    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("xxj");
        threadLocal.remove();
        //(Class<Boolean>) Class.getPrimitiveClass("boolean");
        Class<Boolean> type1 = Boolean.TYPE;
        Class<Integer> type2 = Integer.TYPE;
        Class<Double> type3 = Double.TYPE;
        Class<Character> type4 = Character.TYPE;
        System.out.println(type1);
        System.out.println(type2);
        System.out.println(type3);
        System.out.println(type4);
    }
}
