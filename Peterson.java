class Peterson{
    static long[] fact={1,1,2,6,24,120,720,5040};
    static boolean check(int n){
   
        int num=n;
        int sum=0;
        while(n>0){
            int digits=n%10;
            sum+=fact[digits];
            n=n/10;
        }
    
        return (sum==num);
    
    }
    public static void main(String[] args) {
        int num=145;
        if(check(num)){
            System.out.print(num+" is a peterson number");
        }
        else{
            System.out.println(num+ "not a peterson number");
        }
    }
}