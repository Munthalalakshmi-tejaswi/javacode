class OctaltoNo{
    public static void main(String[] args) {
        int dec=78;
        int oct=convert(dec);
        System.out.printf("%d in dec=%d in oct",dec,oct);
    }
    static int convert(int dec){
        int octno=0,i=1;
        while(dec!=0){
            octno+=(dec%8)*i;
            dec/=8;
            i*=10;
        }
        return octno;
    }
}