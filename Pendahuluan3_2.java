/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import javax.swing.JOptionPane;

public class Pendahuluan3_2 {
    public static void main(String[] args) {
     
        String nDepan = "", nBelakang = "";
        nDepan = JOptionPane.showInputDialog("Nama depan kamu");
        nBelakang = JOptionPane.showInputDialog("Nama belakang kamu");
        
        String msg = "Nama lengkap kamu adalah " +nDepan+ " " +nBelakang;
        JOptionPane.showMessageDialog(null, msg);
    }
}
