import java.util.*;
class Untilgivenno{
    public static void main(String[] args){
        int num;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        while (true) { 
            num=sc.nextInt();
            if(num==-999){
                break;
            }
            sum+=num;
        }
        System.out.print(sum);
    }
}