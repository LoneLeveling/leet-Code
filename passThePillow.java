import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class passThePillow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n=sc.nextInt();
        System.out.println("Input t");
        int t=sc.nextInt();
//        System.out.println("Input t");
//        int t=sc.nextInt();
//        System.out.println(passThePillow(n,t));
//    }
//
//public static int passThePillow(int n, int time) {
    List<Integer> al = new ArrayList<>();
    for (int i=1;i<=n;i++){
        al.add(i);
    }
    for (int i=n-1;i>=1;i--){
        al.add(i);
    }
//        for (int i=)
//
//        return ans;
        for (int k=0;k<al.size();k++){
            System.out.print(al.get(k)+" ");
        }
        System.out.println();
        System.out.println(al.get(t));
}
        }
