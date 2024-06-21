import java.util.*;
public class prog1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n - 2];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int xor=nums[0];
        for (int i=1;i<nums.length;i++){
            xor=xor^nums[i];
        }
        for (int i=1;i<=n;i++){
            xor=xor^i;
        }
        int diff= xor & -xor;
        int d1=0;
        int d2=0;
        for (int i=0;i<nums.length;i++){
            if ((diff & nums[i])==0)
                d1=d1^nums[i];
            else
                d2=d2^nums[i];
        }
        for (int i=1;i<=n;i++){
            if ((diff & i)==0)
                d1=d1^i;
            else
                d2=d2^i;
        }
        System.out.println(d1);
        System.out.println(d2);
    }
}
