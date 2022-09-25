package modul3;

import java.io.*;
import javax.swing.JOptionPane;

public class Pendahuluan3_4 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input Nilai a = ");
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {

        }
        int b = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai B"));
        
        System.out.println("\nHasil penjumlahan a dan b adalah = "+(a+b));
    }
}
