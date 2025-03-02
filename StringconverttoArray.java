import java.util.*;
class StringconverttoArray{
    public static void main(String[] args) {
      System.out.println("Enter a str");  
      Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] arr=s.toCharArray();
    for(char i:arr){
        System.out.println(i);
    }
}
}