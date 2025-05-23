import java.util.Scanner;
public class Subrangestring {
    public static String getSmallestAndLargest(String s, int k) {
    String smallest="";
     String largest="";
     smallest=s.substring(0,k);
     largest=s.substring(0,k);
     for(int i=1;i<=s.length()-k;i++){
        String substr=s.substring(i,i+k);
        if(substr.compareTo(smallest)<0)
        smallest=substr;
        else if(substr.compareTo(largest)>0)
        largest=substr;
    }
    return smallest+"\n"+largest;
   }
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}