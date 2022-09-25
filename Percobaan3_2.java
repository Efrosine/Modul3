package modul3;

import java.io.*;


public class Percobaan3_2 {
public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
         int pertama = 0, kedua = 0, ketiga = 0;
        try {
            System.out.print("Masukkan Nilai Pertama = ");
            pertama = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Nilai Kedua = ");
            kedua = Integer.parseInt(reader.readLine());
            System.out.print("Masukkan Nilai Ketiga = ");
            ketiga = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
            System.out.println("error");
        }
        System.out.println("Nilai yang dimasukkan = "+pertama+", "+kedua+", "+ketiga);
        
        int terbesar = 0, terkecil = 0,dummyBes,dummyKec;
        dummyBes = pertama>kedua?pertama:kedua;
        terbesar = dummyBes>ketiga?dummyBes:ketiga;
        
        dummyKec = pertama<kedua?pertama:kedua;
        terkecil = dummyKec<ketiga?dummyKec:ketiga;
        System.out.println("Nilai Terbesar Adalah = "+terbesar+"\nNilai Terkecil Adalah = "+terkecil);
    }
}
