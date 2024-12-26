/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPertemuan2;

/**
 *
 * @author ASUS
 */
public class ProsedurMenggunkanParameter {
void hitungLuasPersegi (int sisi){
    int luas = sisi * sisi;
    System.out.println("Sisi = " + sisi);
    System.out.println("Luas persegi = " + luas);
}
    public static void main(String[] args) {
        int sisi = 10;
        ProsedurMenggunkanParameter F = new ProsedurMenggunkanParameter();
        F.hitungLuasPersegi(sisi);
        
    }
    
}
