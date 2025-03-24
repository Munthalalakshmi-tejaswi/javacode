class CountVowel{
    public static void main(String[] args){
        String input="Tejaswi";
        int count=Vowelcount(input);
        System.out.print(count);
    }
    static int Vowelcount(String str){
        int count=0;
        str=str.toLowerCase();
        for(char c:str.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
}