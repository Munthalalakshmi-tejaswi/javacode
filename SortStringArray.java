class SortStringArray{
    public static void main(String[] args) {
        
    
    String[] cars={"Telsa","Ford","BMW","Marthi","Honda","Audi"};
    for(int i=0;i<cars.length;i++){
        for(int j=0;j<cars.length-1-i;j++){
            if(cars[j].compareTo(cars[j+1])>0){
                String temp=cars[j];
                cars[j]=cars[j+1];
                cars[j+1]=temp;
            }
        }
    }
    for(String i:cars){
        System.out.print(i+","+" ");
    }
}

}