import java.util.*;
class Ipvaildnot{
    public static void main(String[] args) {
        Regex obj=new Regex();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ip address");
        String ip=sc.next();
        System.out.println(ip.matches(obj.pattern));
    }
}
class Regex{
    String pattern="^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}