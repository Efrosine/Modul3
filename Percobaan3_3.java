package modul3;

import javax.swing.JOptionPane;

public class Percobaan3_3 {

    public static void main(String[] args) {

        int pendapatan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Pendapatan"));
        int uangJasa = 0;
        double komisi = 0;
        if (pendapatan < 2000000) {
            uangJasa = 100000;
            komisi = .1;
        }else if(pendapatan <5000000){
            uangJasa = 200000;
            komisi = .15;
        }else{
            uangJasa = 300000;
            komisi = .20;
        }
        
        double totalKomisi = pendapatan * komisi;
        double totalPendaptan = pendapatan + uangJasa + totalKomisi;
        
        System.out.println("Pendaptan bersih salesman adalah : Rp."+totalPendaptan);
    }
}
