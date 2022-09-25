package modul3;

import java.util.Random;

public class Pendahuluan3_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int a = rand.nextInt(5);
        System.out.println("Nilai A = "+a);
        if(a>=3){
            System.out.println("Anda pintar");
        }
        
        int b = rand.nextInt(3);
        System.out.println("\nNilai B = "+b);
        if(b %2 == 0){
            System.out.println("Angka Genap");
        }else{
            System.out.println("Angka Ganjil");
        }
        
        int c = rand.nextInt(2);
        System.out.println("\nNilai C = "+c);
        if(c == 0){
            System.out.println("Anda tampan");
        }else if(c==1){
            System.out.println("Anda ehem......");
        }
        
        int d = rand.nextInt(3);
        System.out.println("\nNilai D = "+d);
        if(d ==0){
            System.out.println("Anda tidak beruntung");
        }else if(d ==1){
            System.out.println("Anda kurang beruntung");
        }else{
            System.out.println("Anda beruntung");
        }
        
        int e = rand.nextInt(3);
        System.out.println("\nNilai D = "+e);
        switch (e){
            case 0 :
                System.out.println("Kelas A");
                break;
            case 1 :
                System.out.println("Kelas B");
                break;
            case 2 :
                System.out.println("Kelas C");
                break;
            default:
                 System.out.println("Error");
        }
    }
}
