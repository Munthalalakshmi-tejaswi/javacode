import java.util.*;
class SumofArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        System.out.println("Enter array numbers");
        int[] arr=new int[n];
        int i;
        int sum=0;
        
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}