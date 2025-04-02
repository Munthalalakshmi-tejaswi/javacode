class Binarytono{
    public static void main(String[] args) {
        long num=1001;
        long dec=convert(num);
        System.out.println(dec);
    }
    static int convert(long num){
        int decno=0,i=0;
        long rem=0;
        while(num!=0){
            rem=num%10;
            num/=10;
            decno+=rem*Math.pow(2, i);
            ++i;
        }
        return decno;
    }
}