import java.util.*;
class VolumeCylinder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height radius");
        double pi=3.142;
        double height=sc.nextDouble();
        double radius=sc.nextDouble();
        double voulme=pi*height*radius;
        System.out.printf("Volume %.2f",voulme);
    }
}