class Occurenceno{
    public static void main(String[] args) {
        int count=0,x,i=0;
        int[] a={1,2,3,2,3,1,3,4,1,2,2,3,3,2};
        x=2;
        for(i=0;i<a.length;i++){
            if(a[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}