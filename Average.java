import java.util.*;
class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,avg;
        int[] ages=new int[n];
        for(int i=0;i<n;i++){
            ages[i]=sc.nextInt();
            sum+=ages[i];
        }
        avg=sum/n;
        System.out.println(avg);
    }
}