import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
       int[] ans=intersect(nums1,nums2);
for (int num:ans){
    System.out.print(num+" ");
}
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ar=new ArrayList<>();
        int min=0,max=0;
        int[] x;
        int[] y;
        if (nums1.length < nums2.length){
            x = nums1;
            y = nums2;
            min = nums1.length;
            max = nums2.length;
        } else{
            x = nums2;
            y = nums1;
            min = nums2.length;
            max = nums1.length;
        }
        for (int i = 0; i < min; i++) {
            for (int j =0; j < max; j++){
                if (x[i]==y[j]){
                    ar.add(x[i]);
                    y[j] = -1;
                    break;
                }
            }
        }
        int[] ans =new int[ar.size()];
        for (int k=0;k<ar.size();k++){
            ans[k]=ar.get(k);
        }

        return ans;
    }
}