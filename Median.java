import java.util.*;
class Median
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        double median;
        if(n%2==1){
            median=arr[n/2];
        }
        else{
            median=(arr[n/2-1]+arr[n/2])/2.0;
        }
    
        System.out.printf("The median of the array is %.2f\n",median);
        
        
    }
}