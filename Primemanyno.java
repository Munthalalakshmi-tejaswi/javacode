class Primemanyno{
    static int count(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)&&!isSquare(i)){
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int num){
        if(num<2)
        return false;
        for(int j=2;j*j<=num;j++){
            if(num%j==0)
            return false;
        }
        return true;
    }
    static  boolean isSquare(int num){
        int sqrt=(int)Math.sqrt(num);
        return (sqrt*sqrt==num);
    }
    public static void main(String[] args) {
        int N=100;
        System.out.println(count(N));
    }
}