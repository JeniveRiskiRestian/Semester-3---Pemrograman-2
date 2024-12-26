/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPertemuan2;

/**
 *
 * @author ASUS
 */
public class MethodStaticdanNonStaticFungsi {
    
    static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        System.out.println("Sisi = " + sisi);
        return luas;
    }
    public static void main(String[] args) {
        int sisi = 10;
        hitungLuasPersegi(10);
    }
    
}
