import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergedSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        int[] nums2 = {1, 2, 2};
        merge(nums1, nums2);
    }

    public static void merge(int[] nums1, int[] nums2) {
        // int k = nums1.length + nums2.length;
        //int[] arr = new int[k];
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                if (j < nums2.length) {
                    nums1[i] = nums2[j];
                    j++;
                }

            }
        }
            Arrays.sort(nums1);
            for (int i = 0; i < nums1.length; i++) {
                System.out.print(nums1[i]);
                if (i < nums1.length - 1) {
                    System.out.print(" , ");
                }
            }
        }
    }


//            arr[i] = nums1[i];
//        }
//        for (int j = 0; j < nums2.length; j++) {
//            arr[nums1.length + j] = nums2[j];
//        }
//        Arrays.sort(arr);
//        List<Integer> al = new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                al.add(arr[i]);
//            }
//        }
//
//        System.out.println(al);



//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if (i != arr.length - 1)
//                System.out.print(" , ");
//        }


