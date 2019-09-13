/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2;

/**
 *
 * @author Arif-X
 */
public class mainMethod {

    public static void main(String[] args) {
        int maxSizeMatkul = 100;
        int maxSizeNilai = 100;
                
        allMethod arrAll;
        arrAll = new allMethod(maxSizeMatkul, maxSizeNilai);
        arrAll.insert3SKS("KALKULUS", 3.0);
        arrAll.insert3SKS("ALGORITMA & PEMROGRAMAN 1", 2.5);
        arrAll.insert3SKS("MATEMATIKA DISKRIT", 1.0);
        arrAll.insert3SKS("STRUKTUR DATA", 3.5);
        arrAll.insert3SKS("ELEKTRONIKA DIGITAL", 4.0);
        arrAll.display3SKS();
        
        arrAll.insert2SKS("KEWARGANEGARAAN", 3.5);
        arrAll.insert2SKS("PENGANTAR KOMPUTASI", 3.5);
        arrAll.insert2SKS("ALJABAR LINIER", 3.0);
        arrAll.insert2SKS("ALGORITMA DAN PEMROGRAMAN 2", 3.5);
        arrAll.insert2SKS("PANCASILA", 4.0);
        arrAll.insert2SKS("BAHASA INDONESIA", 3.0);
        arrAll.insert2SKS("STUDI AL-QURAN DAN AL-HADITS", 3.5);
        arrAll.insert2SKS("BAHASA ARAB MAHARAH KALAM I", 4.0);
        arrAll.insert2SKS("BAHASA ARAB MAHARAH QIROAH I", 3.5);
        arrAll.insert2SKS("BAHASA ARAB MAHARAH KALAM II", 4.0);
        arrAll.insert2SKS("BAHASA ARAB MAHARAH QIROAH II", 3.5);
        arrAll.display2SKS();        
                
        arrAll.insert1SKS("PRAKTIKUM ALGORITMA & PEMROGRAMAN 1", 4.0);
        arrAll.insert1SKS("PRAKTIKUM STRUKTUR DATA", 3.5);
        arrAll.insert1SKS("PRAKTIKUM ELEKTRONIKA DIGITAL", 3.5);
        arrAll.insert1SKS("BAHASA ARAB MAHARAH ISTIMA I", 4.0);
        arrAll.insert1SKS("BAHASA ARAB MAHARAH KITABAH I", 4.0);
        arrAll.insert1SKS("BAHASA ARAB MAHARAH ISTIMA II", 4.0);
        arrAll.insert1SKS("BAHASA ARAB MAHARAH KITABAH II", 3.5);
        arrAll.display1SKS();
        
        System.out.println("");
        
        arrAll.jumlahSKS();
        
        System.out.println("");
        
        arrAll.jumlahNilai1SKS();
        arrAll.jumlahNilai2SKS();
        arrAll.jumlahNilai3SKS();
        
        System.out.println("");
        
        arrAll.jumlahNilai();
    }
}
