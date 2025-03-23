class Primenth{
  static int nthprime(int n){
    int count=0,num=2;
    while(true){
        if(isPrime(num)){
            count++;
            if(count==n){
                return num;
            }
        }
        num++;
    }
  }
  static boolean isPrime(int num){
    if(num<2)
    return false;
    for(int i=2;i*i<=num;i++){
        if(num%i==0)
    return false;
    }
    return true;
  }
  public static void main(String[] args) {
      int n=3;
      int nth=nthprime(n);
      System.out.println(nth*nth);
  }
}