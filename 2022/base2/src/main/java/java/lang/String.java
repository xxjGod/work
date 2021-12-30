package java.lang;

/**
 * @description:
 * @author: xiangjie.xiao
 * @create: 2021-12-16 15:04
 **/
public class String {

    String value;

    @Override
    public String toString() {
        return "String{" +
                "xxj_value='" + value + '\'' +
                '}';
    }

    public void say(){
        System.out.println("say haha");
    }
}
