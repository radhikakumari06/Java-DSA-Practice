import java.util.Scanner;
public class factorial {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args){
        System.out.println("Enter your num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial: "+ fact(num));
        sc.close();

    }

}
