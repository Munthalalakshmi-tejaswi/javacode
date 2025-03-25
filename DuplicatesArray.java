class DuplicatesArray{
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 3, 4, 4, 5, 5, 6};
        int n=arr.length;
        n=removeDuplicate(arr,n);
        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" ");
        }

    }
    static  int removeDuplicate(int[] arr,int n){
        if(n==0||n==1){
            return n;
        }
        int newLength=0;
        for(int i=0;i<n;i++){
            boolean isDuplicate=false;
            for(int j=0;j<newLength;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[newLength]=arr[i];
                newLength++;
            }
        }
        return newLength;
    }
}