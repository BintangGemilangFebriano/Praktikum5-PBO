package com.tugaspraktikum.modul5;

public class MainDiary {

    public static void main(String[] args) {

        BukuHarian diary = new BukuHarian("Bintang");

        diary.tulisCatatan(
                "12-09-2026",
                "Hari ini saya belajar Pemrograman Berorientasi Objek."
        );

        diary.tulisCatatan(
                "13-09-2026",
                "Hari ini saya belajar tentang file dan persistence pada Java."
        );

        diary.bacaCatatan();
    }
}