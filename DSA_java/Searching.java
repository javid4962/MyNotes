import java.util.*;

public class Searching{
    public static void main(String[] args){
        int nums[] = new int[1000];
        int target = 7;

        int result1 = LinearSearch(nums, target);
        int result2 = BinarySearch(nums, target);
        
        StatusFound(result1);
        StatusFound(result2);
        
        
    }
    public static void StatusFound(int result){
        if(result != -1)
            System.out.println("The element is found at index : "+result);
        else
            System.out.println("The element is not found");
    }

    public static int LinearSearch(int[] nums, int target){
        int steps = 0;
        for(int i = 0; i < nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("The steps required in LinearSearch : "+steps);
                return i;
            }

        }
        System.out.println("The steps required in LinearSearch : "+steps);
        return -1;
    }

    public static int BinarySearch(int[] nums, int target){
        int steps = 0;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            steps++;
            int mid = (left + right)/2;
            if(nums[mid] == target){
                System.out.println("The steps required in BinarySearch : "+steps);
                return mid;
            }
            else if(nums[mid] > target)
                right = mid - 1;
            else 
                left = mid + 1;
        }
        System.out.println("The steps required in BinarySearch : "+steps);
        return -1;
    }
}
