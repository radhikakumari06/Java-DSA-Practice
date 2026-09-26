public class Second_Largest {
    public static void main(String[] args) {
        int arr[] = {10,38,49,30,29,58};
        
        int largest = arr[0];
        int Second_Largest = 0;
        for(int i = 0; i  < arr.length; i++) {
            if(arr[i] > largest) {
                Second_Largest = largest;
                largest = arr[i];
            } else if(arr[i] > Second_Largest && arr[i] != largest) {
               Second_Largest = arr[i];
            }
        }
        System.out.println("The Second Largest Elements is  : " + Second_Largest);
    }
    
}
