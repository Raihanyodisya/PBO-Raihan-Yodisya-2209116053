package com.mycompany.posttest1;

import java.util.ArrayList;
public class Posttest1 {

    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek-objek AlatMusik
        ArrayList<alatmusik> instruments = new ArrayList<>();

        // Menambahkan 5 objek AlatMusik ke dalam ArrayList
        instruments.add(new  alatmusik("Gitar", "Dawai"));
        instruments.add(new  alatmusik("Biola", "Dawai"));
        instruments.add(new  alatmusik("Saxophone", "Tiup"));
        instruments.add(new  alatmusik("Drum", "Pukul"));
        instruments.add(new  alatmusik("Piano", "Pencet"));

        // Menampilkan informasi tentang setiap alat musik dalam ArrayList
        for (alatmusik instrument : instruments) {
            System.out.println("Alat musik " + instrument.getNama() + " adalah alat musik jenis " + instrument.getJenis() + ".");
        }
    }
}