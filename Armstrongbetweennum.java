
import java.util.*;

class Armstrongbetweennum{
    static void Armstrong(int l,int h){
        for(int j=l+1;j<h;j++){
         
            int n=0;
            int y=j;
           while(y!=0){
            y/=10;
            ++n;
           }
           int sum=0;
           y=j;
           while(y!=0){
            int d=y%10;
            sum+=Math.pow(d,n);
            y/=10;
           }
           if(sum==j)
           System.out.println(j+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values to find armstrong numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Armstrong(n1, n2);
    }
}