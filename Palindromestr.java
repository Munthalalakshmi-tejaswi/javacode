import java.util.*;
class Palindromestr{
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            rev=ch+rev;
        }
        if(s.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}