import java.util.*;
class Factorial{
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return  n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter num");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}