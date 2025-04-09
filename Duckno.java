class Duckno{
    static boolean check(int n){
        while(n!=0){
            if(n%10==0)
            return true;
            n=n/10;
        }
            return false;
            
        
    }
    public static void main(String[] args) {
        int n=1011;
        if(check(n))
            System.out.print(n+" is a Duck no");
        
        else
            System.out.print(n+" is not a Duck no");
        
    }
}