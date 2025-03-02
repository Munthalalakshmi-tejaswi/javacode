import java.util.*;
class Countwords{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String words=sc.nextLine();
        int Count=words.split("\\s").length;
        System.out.println(Count);
        }
}