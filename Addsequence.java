import java.util.*;
class Add{
    public void add(int... n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
            System.out.print(n[i]+(i<n.length-1?"+":""));
        }
        System.out.println("="+sum);
    }
}
class Addsequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Add obj=new Add();
        System.out.println("Enter values");
        obj.add(sc.nextInt(),sc.nextInt());
        obj.add(sc.nextInt(),sc.nextInt(),sc.nextInt());
        obj.add(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
}