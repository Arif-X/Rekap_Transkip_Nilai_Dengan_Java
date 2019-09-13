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
public class allMethod {

    private double[] arr3SKS;
    private String[] matkul3SKS;
    private int nElementArr3SKS;
    private int nElemenM3SKS;

    private double[] arr2SKS;
    private String[] matkul2SKS;
    private int nElementArr2SKS;
    private int nElemenM2SKS;

    private double[] arr1SKS;
    private String[] matkul1SKS;
    private int nElementArr1SKS;
    private int nElemenM1SKS;

    public allMethod(double max, int maax) {
        arr3SKS = new double[(int) max];
        matkul3SKS = new String[maax];
        nElementArr3SKS = 0;
        nElemenM3SKS = 0;

        arr2SKS = new double[(int) max];
        matkul2SKS = new String[maax];
        nElementArr2SKS = 0;
        nElemenM2SKS = 0;

        arr1SKS = new double[(int) max];
        matkul1SKS = new String[maax];
        nElementArr1SKS = 0;
        nElemenM1SKS = 0;
    }

    public void insert3SKS(String mat, double value) {
        arr3SKS[nElementArr3SKS] = value;
        matkul3SKS[nElemenM3SKS] = mat;
        nElementArr3SKS++;
        nElemenM3SKS++;
    }

    public void insert2SKS(String mat, double value) {
        arr2SKS[nElementArr2SKS] = value;
        matkul2SKS[nElemenM2SKS] = mat;
        nElementArr2SKS++;
        nElemenM2SKS++;
    }

    public void insert1SKS(String mat, double value) {
        arr1SKS[nElementArr1SKS] = value;
        matkul1SKS[nElemenM1SKS] = mat;
        nElementArr1SKS++;
        nElemenM1SKS++;
    }

    public void jumlahSKS() {
        double allSum1 = nElementArr1SKS * 1;
        double allSum2 = nElementArr2SKS * 2;
        double allSum3 = nElementArr3SKS * 3;
        double allSum = allSum1 + allSum2 + allSum3;
        System.out.println("Jumlah SKS yang Pernah Diambil " + (int) allSum);
    }

    public void jumlahNilai1SKS() {
        double sum = 0;
        for (int i = 0; i < nElementArr1SKS; i++) {
            sum += arr1SKS[i] * 1;
        }
        System.out.println("Jumlah Nilai Semua Matkul 1 SKS " + sum);
    }

    public void jumlahNilai2SKS() {
        double sum = 0;
        for (int i = 0; i < nElementArr2SKS; i++) {
            sum += arr2SKS[i] * 2;
        }
        System.out.println("Jumlah Nilai Semua Matkul 2 SKS " + sum);
    }

    public void jumlahNilai3SKS() {
        double sum = 0;
        for (int i = 0; i < nElementArr3SKS; i++) {
            sum += arr3SKS[i] * 3;
        }
        System.out.println("Jumlah Nilai Semua Matkul 3 SKS " + sum);
    }

    public void jumlahNilai() {
        double sum1 = 0;
        for (int i = 0; i < nElementArr1SKS; i++) {
            sum1 += arr1SKS[i] * 1;
        }
        double sum2 = 0;
        for (int i = 0; i < nElementArr2SKS; i++) {
            sum2 += arr2SKS[i] * 2;
        }
        double sum3 = 0;
        for (int i = 0; i < nElementArr3SKS; i++) {
            sum3 += arr3SKS[i] * 3;
        }
        double allSum = sum1 + sum2 + sum3;
        System.out.println("Jumlah Semua Nilai = " + allSum);

        double allSum1 = nElementArr1SKS * 1;
        double allSum2 = nElementArr2SKS * 2;
        double allSum3 = nElementArr3SKS * 3;
        double allSums = allSum1 + allSum2 + allSum3;
        double allIP = allSum / allSums;
        System.out.println("IPK (Indeks Prestasi Kumulatif) = (SKS x Nilai Angka) / Jumlah SKS = " + allIP);
    }

    public void display3SKS() {
        String kat = null;
        for (int i = 0; i < nElementArr3SKS; i++) {
            if (arr3SKS[i] == 0) {
                kat = "E";
            } else if (arr3SKS[i] == 1.0) {
                kat = "D";
            } else if (arr3SKS[i] == 2.0) {
                kat = "C";
            } else if (arr3SKS[i] == 2.5) {
                kat = "C+";
            } else if (arr3SKS[i] == 3.0) {
                kat = "B";
            } else if (arr3SKS[i] == 3.5) {
                kat = "B+";
            } else if (arr3SKS[i] == 4.0) {
                kat = "A";
            }
            System.out.println(matkul3SKS[i] + " dengan Nilai " + arr3SKS[i] + " dalam 3 SKS dan Kategori Nilai " + kat);
        }
    }

    public void display2SKS() {
        String kat = null;
        for (int i = 0; i < nElementArr2SKS; i++) {
            if (arr2SKS[i] == 0) {
                kat = "E";
            } else if (arr2SKS[i] == 1.0) {
                kat = "D";
            } else if (arr2SKS[i] == 2.0) {
                kat = "C";
            } else if (arr2SKS[i] == 2.5) {
                kat = "C+";
            } else if (arr2SKS[i] == 3.0) {
                kat = "B";
            } else if (arr2SKS[i] == 3.5) {
                kat = "B+";
            } else if (arr2SKS[i] == 4.0) {
                kat = "A";
            }
            System.out.println(matkul2SKS[i] + " dengan Nilai " + arr2SKS[i] + " dalam 2 SKS dan Kategori Nilai " + kat);
        }
    }

    public void display1SKS() {
        String kat = null;
        for (int i = 0; i < nElementArr1SKS; i++) {            
            if (arr1SKS[i] == 0) {
                kat = "E";
            } else if (arr1SKS[i] == 1.0) {
                kat = "D";
            } else if (arr1SKS[i] == 2.0) {
                kat = "C";
            } else if (arr1SKS[i] == 2.5) {
                kat = "C+";
            } else if (arr1SKS[i] == 3.0) {
                kat = "B";
            } else if (arr1SKS[i] == 3.5) {
                kat = "B+";
            } else if (arr1SKS[i] == 4.0) {
                kat = "A";
            }
            System.out.println(matkul1SKS[i] + " dengan Nilai " + arr1SKS[i] + " dalam 1 SKS dan Kategori Nilai " + kat);
        }
    }
}
