

class Count{
    public static void main(String[] args) {
        int num=123,count=0;
        while(num>0){
            num/=10;
            ++count;
           
        }
        System.out.print(""+count);
    }
}