/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.lang.reflect.Array;
import java.util.Arrays;

class Daftar implements Comparable<Daftar>{

    String nama;
    int nilai;

    public Daftar(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Daftar{" + "nama=" + nama + ", nilai=" + nilai + '}';
    }

    @Override
    public int compareTo(Daftar o) {
        return this.nilai - o.nilai;
    }
    
}

public class Percobaan3_4 {

    public static void main(String[] args) {
        Daftar[] siswa = new Daftar[4];
        siswa[0] = new Daftar("Adi", 70);
        siswa[1] = new Daftar("Budi", 65);
        siswa[2] = new Daftar("Caca", 90);
        siswa[3] = new Daftar("Deny", 75);
        
        for (int i = 0; i < siswa.length; i++) {
            String huruf ;
            int nilai = siswa[i].getNilai();
            if(nilai<46){
                huruf = "D";
            }else if(nilai<56){
                huruf = "C";
            }else if(nilai<66){
                huruf = "C+";
            }else if (nilai<76){
                huruf = "B";
            }else if (nilai <86){
                huruf = "B+";
            }else{
                huruf = "A";
            }
            System.out.println("Nama : "+siswa[i].getNama()+"\tNilai : "+huruf);
        }
        
        Arrays.sort(siswa);
        System.out.println("Nilai Tertinggi adalah "+siswa[siswa.length-1].getNama()+"("+siswa[siswa.length-1].getNilai()+")" );
        System.out.println("Nilai Terendah adalah "+siswa[0].getNama()+"("+siswa[0].getNilai()+")" );
        
        
        
        
    }
}
