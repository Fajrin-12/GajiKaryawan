/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikarywan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class GajiKarywan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upah=5000;
        int bonus=7500;
        int denda=2500;
        int jam;
        int lembur;
        int kelebihan=60;
        int gajilembur;
        System.out.println("Masukkan jam kerja anda selama seminggu : ");
        jam=input.nextInt();
        ///tipe waktu///
        ///seleksi///
        gajilembur=(jam-(kelebihan))*bonus;
        if (jam<50){
            System.out.println("Gaji anda sebesar : "+jam*denda);
        } 
        
        else if (jam>=50 && jam<=60){
            System.out.println("Gaji anda sebesar : "+jam*upah);
        }
        else{
            System.out.println("Kelebihan waktu anda : "+(jam-(kelebihan))+" jam");
            System.out.println("Gaji bonus anda sebesar : "+(jam-(jam-(kelebihan*(upah)+gajilembur))));
        } 
        
    }   
}
