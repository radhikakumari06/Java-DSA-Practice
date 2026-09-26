import java.util.Scanner;
public class PrintNumbers {
   
    static void PrintNumbers(int n) {
    if(n==0)
        return;
    System.out.println(n);
    PrintNumbers(n-1);
}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        PrintNumbers(n);
        sc.close();
        

    }
}