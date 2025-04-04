class Main{
    static int max=50;
    static int Normal(int[][] matrix,int N){
        int s=0;
        for(int j=0;j<N;j++){
            for(int k=0;k<N;k++){
                s+=matrix[j][k]*matrix[j][k];
            }
        }
        return (int)Math.sqrt(s);
    }
    static int Trace(int[][] matrix,int N){
        int s=0;
        for(int j=0;j<N;j++){
            s+=matrix[j][j];
        }
        return s;
    }
    public static void main(String[] args) {
        int[][] matrix={{2,5,6},{4,1,0},{8,2,2}};
        System.out.println(Trace(matrix, 3));
        System.out.println(Normal(matrix, 3));
    }
}