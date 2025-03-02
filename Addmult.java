import java.util.*;
class Ext1{
    void add(int a,int b){
        System.out.println(a+b);
       }
}
class Ext2 extends Ext1{
    void mult(int a,int b){
        System.out.println(a*b);
    }
    void squareofsum(int a,int b){
        System.out.println(a*a+b*b);
    }
}
class Addmult{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Ext2 obj=new Ext2();
        obj.add(a,b);
        obj.mult(a,b);
        obj.squareofsum(a, b);
    }
}