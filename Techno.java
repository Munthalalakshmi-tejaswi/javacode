class Techno{
    public static void main(String[] args) {
        int n,num,fir,sec,digits=0,sumofsquares=0;
        n=2025;
        num=n;
        while(num>0){
            digits++;
            num/=10;
        }
        if(digits%2==0){
            num=n;
            fir=num%(int)Math.pow(10,digits/2);
            sec=num/(int)Math.pow(10,digits/2);
            sumofsquares=(fir+sec)*(fir+sec);
            if(n==sumofsquares){
                System.out.print(n+" is a tech no");
            }
            else{
                System.out.print(n+" is not a tech no");
            }
        }
    }
}