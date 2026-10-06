package com.tugaspraktikum.modul5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    
    private String namaPemilik;
    private String namaFile;

    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        
        String namaAman = namaPemilik.replaceAll("\\s+", "_");
        this.namaFile = "diary_" + namaAman + ".txt";
    }

    public void tulisCatatan(String tanggal, String isi) {
        
        try {
            FileWriter writer = new FileWriter(namaFile, true);

            writer.write("[" + tanggal + "] - " + isi + "\n");

            writer.close();

            System.out.println("Catatan berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan catatan.");
        }
    }

    public void bacaCatatan() {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));

            String baris;
            boolean adaCatatan = false;

            System.out.println("\n=== CATATAN HARIAN ===");

            while ((baris = reader.readLine()) != null) {
                if (!baris.isEmpty()) {
                    System.out.println(baris);
                    adaCatatan = true;
                }
            }

            reader.close();

            if (!adaCatatan) {
                System.out.println("Belum ada catatan harian.");
            }

        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }
}