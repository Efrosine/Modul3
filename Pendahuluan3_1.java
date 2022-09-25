package modul3;

import java.io.*;

public class Pendahuluan3_1 {
    
     public static void main(String[] args) {
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
        try {     
            System.out.print("Nama : ");
            String nama = reader.readLine();
            System.out.print("Umur : ");
            String umur = reader.readLine();
            
            System.out.println("\nHasil");
            System.out.println("Nama : " +nama+"\nUmur : " + umur+" tahun");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        
    }
    
}
