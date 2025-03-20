class Increment1{
    public static void main(String[] args){
        int n,m=0,a;
        n=1267;
        while(n>0){
            a=n%10;
            a++;
            m=m*10+a;
            n=n/10;
        }
        n=m;
        m=0;
        while(n>0){
            a=n%10;
            m=m*10+a;
            n=n/10;
        }
        System.out.print(m);
    }
}