import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("From File Path: ");
        String fromFilePath=sc.nextLine();
        System.out.println("To File Path: ");
        String toFilePath=sc.nextLine();
        copyFile(fromFilePath,toFilePath);
    }

    public static void copyFile(String fromFilePath,String toFilePath){
        File fromFile=new File(fromFilePath);
        File toFile=new File(toFilePath);

        if (!fromFile.exists()) {
            System.out.println("This file is no exists!");
            return;
        }
        if (toFile.exists()){
            System.out.println("This file already!");
            return;
        }

        try{
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream(fromFile));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(toFile));
            {
                int len;
                byte [] buffer=new byte[1024];
                while((len=bis.read(buffer))>0){
                    bos.write(buffer,0,len);
                }
                bos.flush();
                System.out.println("Copy file done!");
            }
        }catch (IOException e){
            System.out.println("Copy file fail!");
            return;
        }
    }
}
