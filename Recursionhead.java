public class Recursionhead {
    static void f1(int n) {
    if(n==0)
        return;
    System.out.println(n);
    f1(n-1);
}
public static void main(String[] args){
    f1(7);
}
}