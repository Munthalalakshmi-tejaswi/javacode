class Swapnum{
    static void twonum(int m,int n){
        int temp=m;
        m=n;
        n=temp;
        System.out.println(m+" "+n);
    }
    public static void main(String[] args) {
        int m=4;
        int n=5;
    twonum(m, n);
    }
}