/**
 * @Description:
 * @Author 肖相杰 （xiangjie.xiao@17zuoye.com）
 * @Date 2022/3/8 16:33
 * All Rights Reserved
 */
public class A2 {


    public static void main(String[] args) {
        //ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        System.out.println(towSum(l1, l2));

    }

    private static ListNode towSum(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        int carry = 0;
        while (l1 != null || l2 != null||carry!=0) {
            ListNode nowStep = root;

            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (carry == 1) {
                sum += 1;
                carry = 0;
            }

            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            }
            while (nowStep.next != null) {
                nowStep = nowStep.next;
            }

            nowStep.next = new ListNode(sum);
        }

        return root.next;

    }

    private static int listToNum(ListNode node) {

        int i = 0;
        int sum = 0;
        for (ListNode item = node; item != null; item = item.next) {
            sum += item.val * Math.pow(10, i);
            i++;
        }
        return sum;

    }


}

class ListNode {
    int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}