public class Add_Two {
    public static void main(String[] args) {
        int arr[] = {10,20,39,4,5};
        int target = 30;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <  arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("The two element : "  + arr[i] + "and" + arr[j]);
                }
            }
            
    

        }
    }
}
