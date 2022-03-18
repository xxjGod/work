/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/15 15:43
 * All Rights Reserved
 */
public class A5 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("beabbaed"));
    }


    public static String longestPalindrome(String s) {
        int[] result = new int[2];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            generate(i, chars, result);
        }


        return s.substring(result[0],result[1]+1);

    }

    private static void generate(int i, char[] chars, int[] result) {
        int hight = i;
        int low = i;

        //中位数
        while (hight < chars.length - 1 && chars[hight + 1] == chars[low]) {
            hight++;
        }

        //移动
        while (low > 0 && hight < chars.length - 1 && chars[hight + 1] == chars[low - 1]) {
            hight++;
            low--;
        }
        if (result[1] - result[0] < (hight - low)) {
            result[0] = low;
            result[1] = hight;
        }

    }


}
