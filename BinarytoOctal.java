class BinarytoOctal{
    public static void main(String[] args) {
    int dec=101001;
    int oct=convert(dec);
    System.out.print(oct);
    }
    static int convert(long dec){
        int decno=0,octno=0,i=0;
        while(dec!=0){
            decno+=(dec%10)*Math.pow(2,i);
            ++i;
            dec/=10;
        }
        i=1;
        while(decno!=0){
            octno+=(decno%8)*i;
            decno/=8;
            i*=10;
        }
        return octno;
    }
}