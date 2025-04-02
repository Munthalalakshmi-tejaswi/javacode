class Stringrevsen{
    public static void main(String[] args){
        String sen="Do work";
        String rev=reverse(sen);
        System.out.println(rev);
    }
    static String reverse(String sen){
        if(sen.isEmpty())
        return sen;
    return reverse(sen.substring(1))+sen.charAt(0);
    }
}