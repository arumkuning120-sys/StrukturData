package Tugas2StrukturData;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;

public class Tugas2StrukturData {

    public static void main(String[] args) {
        
        // 1. IMPLEMENTASI STACK (LIFO)
        System.out.println("1. IMPLEMENTASI STACK (LIFO) ");
        Stack<Integer> tumpukanData = new Stack<>();
        int[] inputAngkaStack = {15, 25, 35, 45, 55, 65, 75, 85};

        System.out.print("Proses Push: ");
        for (int angka : inputAngkaStack) {
            tumpukanData.push(angka);
            System.out.print(angka + " ");
        }

        System.out.println("\nIsi Stack SEBELUM Pop: " + tumpukanData);
        
        // Proses Pop (LIFO)
        int dataTerambil = tumpukanData.pop();
        System.out.println("Data yang di-pop: " + dataTerambil);
        
        System.out.println("Isi Stack SESUDAH Pop: " + tumpukanData);
        System.out.println("Analisis LIFO: Data " + dataTerambil + " keluar pertama karena terakhir masuk.");
        System.out.println("Kompleksitas Waktu: Push O(1), Pop O(1).\n");


        // 2. IMPLEMENTASI QUEUE (FIFO)
        System.out.println("2. IMPLEMENTASI QUEUE (FIFO) ");
        Queue<Integer> antreanData = new LinkedList<>();
        int[] inputAngkaQueue = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.print("Proses Enqueue: ");
        for (int angka : inputAngkaQueue) {
            antreanData.add(angka);
            System.out.print(angka + " ");
        }

        System.out.println("\nIsi Queue SEBELUM Dequeue: " + antreanData);
        
        // Proses Dequeue (FIFO)
        int dataKeluar = antreanData.poll();
        System.out.println("Data yang di-dequeue: " + dataKeluar);
        
        System.out.println("Isi Queue SESUDAH Dequeue: " + antreanData);
        System.out.println("Analisis FIFO: Data " + dataKeluar + " keluar pertama karena pertama masuk.");
        System.out.println("Kompleksitas Waktu: Enqueue O(1), Dequeue O(1).\n");

        // 3. IMPLEMENTASI QUICK SORT
        System.out.println("3. IMPLEMENTASI QUICK SORT");
        int[] angkaAcak = {50, 10, 90, 5, 30, 70, 20, 100};

        System.out.println("Data SEBELUM urut: " + Arrays.toString(angkaAcak));
        
        eksekusiQuickSort(angkaAcak, 0, angkaAcak.length - 1);

        System.out.println("Data SESUDAH urut: " + Arrays.toString(angkaAcak));
        System.out.println("Cara Kerja: Menggunakan 'pivot' untuk membagi data menjadi dua bagian.");
        System.out.println("Sisi kiri untuk data lebih kecil dari pivot, sisi kanan untuk lebih besar.");
    }

    // Fungsi Utama Quick Sort
    public static void eksekusiQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = buatPartisi(arr, low, high);
            eksekusiQuickSort(arr, low, pi - 1);  // Rekursif kiri
            eksekusiQuickSort(arr, pi + 1, high); // Rekursif kanan
        }
    }

    // Fungsi Partisi
    private static int buatPartisi(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
