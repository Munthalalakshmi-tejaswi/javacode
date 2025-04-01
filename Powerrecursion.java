class Powerrecursion{
    public static void main(String[] args) {
    int base=3,pow=4;
    int res=power(base,pow);
    System.out.print(base+"^"+pow+"="+res);
    }
    static int power(int base,int pow){
        if(pow!=0){
            return (base*power(base,pow-1));
        }
        else{
            return 1;
        }
    }
}