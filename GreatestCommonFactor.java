import java.util.*;

interface GCD{
    int find(int n1,int n2);
}
class A implements GCD{
    public int find(int n1,int n2){
        if(n1<0||n2<0)
        return -1;
        else if(n2==0)
        return n1;
        else if(n1>n2)
        return find(n2,n1%n2);
        else 
        return find(n2,n1%n2);
    }
}
class GreatestCommonFactor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        A val=new A();
        System.out.println(val.find(n1, n2));
    }
}