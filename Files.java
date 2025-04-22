import java.io.*;
class Files{
    public static void main(String[] args){
        File file=new File("Java.java");
        String filename=file.toString();
        int index=filename.lastIndexOf('.');
       if(index>0){
        String extension=filename.substring(index+1);
        System.out.print("File : "+extension);
       }
    }
}