import java.util.*;
class Map{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value n");
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> obj=new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name=sc.nextLine();
            int no=sc.nextInt();
            sc.nextLine();
            obj.put(name,no);
        }
        while(sc.hasNext()){
            String s=sc.nextLine();
            if(obj.containsKey(s)){
                System.out.println(s+"="+obj.get(s));
            }
            else{
                System.out.println("Not valid");
            }
        }
       }
    }
