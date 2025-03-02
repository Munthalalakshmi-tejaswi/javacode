import java.util.*;
class LowestNoArray{
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages=new int[n];
       for (int i = 0; i <n; i++) {
          ages[i]=sc.nextInt();
           
       }
       int Lowest=ages[0];
       for(int i=1;i<n;i++){
        if(ages[i]<Lowest){
            Lowest=ages[i];
        }
       }
       System.out.println(Lowest);

    }
}