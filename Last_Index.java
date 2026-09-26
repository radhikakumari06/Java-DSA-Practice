public class Last_Index {
    public static void main(String[] args) {
        int arr[] = {10,15,36,65,15};
        int target = 15;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
    
}
