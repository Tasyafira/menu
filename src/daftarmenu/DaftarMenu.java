/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmenu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class DaftarMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<< ASRI RESTO >>>");
        System.out.println("DAFTAR MENU");
        String[] makanan = {" ", "Ayam Goreng", "Ayam Geprek", "Ayam Bakar", "Bebek Goreng", "Bebek Bakar"};
        int [] harga = {0, 21000, 15000, 25000, 25000, 29000};
            for (int i = 1; i < harga.length; i++)  
            System.out.println("No."+i+makanan[i]+" ==> "+harga[i]);
        Scanner input = new Scanner (System.in);
        
        System.out.println("<<<<<<SELAMAT DATANG DI ASRI RESTO>>>>>>");
        System.out.println("<<<   PEMESANAN   >>>");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan No Makanan Yang Anda Pesan : ");
        int pilihan = input.nextInt();
 
        switch (pilihan){
    
        case 1: 
            System.out.print("Masukan Jumlah Makanan Yang Anda Pesan : ");
            int jumlah = input.nextInt();
            int jumlahPembayaran = 21000*jumlah;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.print("Masukkan Nominal Uang Anda : ");
            double totalPembayaran = input.nextDouble();
            double kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;                     
                   
        case 2: 
            System.out.print("Masukan Jumlah Makanan Yang Anda Pesan :");
            jumlah = input.nextInt();
            jumlahPembayaran = 15000*jumlah;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.print("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;                  
        
        case 3: 
            System.out.print("MMasukan Jumlah Makanan Yang Anda Pesan:");
            jumlah = input.nextInt();
            jumlahPembayaran = 25000*jumlah;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.print("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;     
        
        case 4: 
            System.out.print("Masukan Jumlah Makanan Yang Anda Pesan :");
            jumlah = input.nextInt();
            jumlahPembayaran = 29000*jumlah;
            System.out.println("Total Yang Harus Dibayarkan = Rp. "+jumlahPembayaran);
            System.out.print("Masukkan Nominal Uang Anda : ");
            totalPembayaran = input.nextDouble();
            kembalian = totalPembayaran-jumlahPembayaran;
            System.out.println("kembalian Anda Rp." +kembalian);
            System.out.println("-TERIMA KASIH-");
        break;       
            }
      
    }
    
}
