package hard;

/**
 * @description: 寻找两个正序数组中的中位数
 * @author: xiangjie.xiao
 * @create: 2022-01-29 15:09
 **/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        // TO TEST
        solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{1, 2});
    }


    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int nums1Size = nums1.length;
            int nums2Size = nums2.length;
            int[] finalNums = new int[nums1Size + nums2Size];

            if (nums1Size == 0) {
                if (nums2Size % 2 == 0) {
                    return (nums2[nums2Size / 2] + nums2[nums2Size / 2 - 1]) / 2.0;

                } else {
                    return nums2[nums2Size / 2];
                }

            }
            if (nums2Size == 0) {
                if (nums1Size % 2 == 0) {
                    return (nums1[nums1Size / 2] + nums1[nums1Size / 2 - 1]) / 2.0;

                } else {
                    return nums1[nums1Size / 2];
                }

            }

            //nums1 nums2
            int m = 0;
            int n = 0;
            int count = 0;
            while (count != nums1Size + nums2Size) {

                if (m == nums1Size) {

                    while (n < nums2Size) {
                        finalNums[count++] = nums2[n++];
                    }

                    break;
                }

                if (n == nums2Size) {

                    while (m < nums1Size) {
                        finalNums[count++] = nums1[m++];
                    }
                    break;

                }


                if (nums1[m] < nums2[n]) {
                    finalNums[count++] = nums1[m++];
                } else {
                    finalNums[count++] = nums2[n++];
                }


            }
            if (finalNums.length % 2 == 0) {
                return (finalNums[finalNums.length / 2] + finalNums[finalNums.length / 2 - 1]) / 2.0;

            } else {
                return finalNums[finalNums.length / 2];

            }


        }
    }
}
