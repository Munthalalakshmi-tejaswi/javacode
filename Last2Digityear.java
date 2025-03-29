class Last2Digityear{
    public static void main(String[] args){
        int x,y,i=0;
        String z="";
        x=2025;
        while(i<2){
            y=x%10;
            z=y+""+z;
            x=x/10;
            i++;
        }
    System.out.println(z);
    }
}