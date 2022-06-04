import java.util.Scanner;

public class DoubleLinkedListMain_22 {
    private static int menu;

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan pengurutan pesanan by nama");
        System.out.println("5. Hitung total Pendapatan");
        System.out.println("6. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        Scanner scint = new Scanner(System.in);
        Scanner scstring = new Scanner(System.in);
        DoubleLinkedListMain_22 dll = new DoubleLinkedListMain_22();
        int pilih;
        do {
            menu();
            System.out.print("Nomor yang dipilih : ");
            pilih = scint.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("\n");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.print("Nomor Antrian : ");
                    int noUrut = scint.nextInt();
                    System.out.print("Nama Customer : ");
                    String nama = scstring.nextLine();
                    System.out.print("Nomor HP : ");
                    String noHP = scstring.nextLine();
                    Pembeli_22 input = new Pembeli_22(noUrut, nama, noHP);
                    dll.add(input);
                    System.out.println("------------------------------");
                    System.out.print("\n");
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    dll.remove();
                    break;
                case 4:
                    System.out.println("Terimakasih");
                    break;
            }
            System.out.println("");
        } while (pilih != 4);
    }

    private void remove() {
    }

    private void print() {
    }

    private void add(Pembeli_22 input) {
    }
}