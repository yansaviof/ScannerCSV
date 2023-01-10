import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path =  ("C:\\Users\\Usuário\\Documents\\in.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }

        catch (IOException e ){
            System.out.println(e.getMessage());
        }

        finally {
            try{
                br.close();
                fr.close();}
            catch (IOException e ){
                e.printStackTrace();
            }

        }



    }

}