public class First_Index {
    public static void main(String[] args) {
        int arr[] = {10,2,34,54,2,1};
        int target = 2;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(i);
                break ;
            }
        }
    }

    
}