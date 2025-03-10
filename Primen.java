import java.util.*;
class Primen{
    static void prime(int n){
        int x,y,flg;
        for(x=1;x<=n;x++){
            if(x==0||x==1)
               continue;
               flg=1;
               for(y=2;y<=x/2;y++){
                if(x%y==0)
                flg=0;
                break;
                
               }
               if(flg==1){
               System.out.println(x+"");
               }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        prime(n);
    }
}