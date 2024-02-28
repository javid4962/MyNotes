// import java.util.*;

public class HouseRober198{
    public static void main(String[] args){
        int[] arr =  {2,1,1,2};
        int prev1 = 0;
        int prev2 = 0;
        for(final int num : arr){
            final int dp = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = dp;
        }
        System.out.println(prev1);
    }
}