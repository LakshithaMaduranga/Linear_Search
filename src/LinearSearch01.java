import java.util.Scanner;

public class LinearSearch01 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 11, 13};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value that you want!");
        int target= sc.nextInt();
        int result = linearSearch(nums, target);


        if (result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found!");
        }


    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }


        return -1;
    }


}
