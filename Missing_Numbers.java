public class Missing_Numbers {
    public static void main(String[] args) {
        int nums[] = {1,3,0,4};
        int n  = nums.length;
        int expectedsum = n * (n + 1) / 2;
        int actualsum = 0;
        for(int i = 0; i < nums.length; i++) {
            actualsum += nums[i];
        }
       int missing =  expectedsum - actualsum;
       System.out.println("The Missing Number is  : " + missing );
    }
    
}

// 11 question total