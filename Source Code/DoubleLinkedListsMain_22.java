import java.util.Scanner;

public class DoubleLinkedListsMain_22 {
    static String menu[] = { "Tambah Antrian", "Cetak Antrian", "Hapus Antrian", "Laporan Pengurutan Pesanan by Nama",
            "Hitung Total Pendapatan", "Keluar" };
    static Scanner wildan = new Scanner(System.in);
    static int noPesanan = 1, totalHarga = 0;

    public static void main(String[] args) throws Exception {
        System.out.println("=========== QUIZ 2 PRAKTIKUM ASD TI - 1F ===========");
        System.out.println("Dibuat oleh\t : Wildan Hafdz Mauludin");
        System.out.println("NIM\t\t : 2141720036");
        System.out.println("Absen\t\t : 17");
        System.out.println("====================================================");
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("");
        System.out.println("        Sistem Antrian Resto Royal Delish");
        DoubleLinkedLists_22 dll = new DoubleLinkedLists_22();
        DoubleLinkedLists_22 dl = new DoubleLinkedLists_22();
        int pilih;
        int antrian = 1;

        do {
            System.out.println("");
            System.out.println("----------------------------------------------------");
            System.out.println("");
            System.out.println("====================================================");
            System.out.println("");
            System.out.println("\t\t\tMENU\t\t");
            System.out.println("");
            System.out.println("====================================================");
            System.out.println("");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.println("");
            System.out.print("Pilih [1 - 6]: ");
            pilih = wildan.nextInt();
            Pesanan_22 newPsn;
            switch (pilih) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nomor Antrian\t : " + antrian);
                    System.out.print("Nama Customer\t : ");
                    wildan.nextLine();
                    String nama = wildan.nextLine();
                    System.out.print("No Handphone\t : ");
                    String no = wildan.nextLine();
                    dll.addLast(antrian, nama, no);
                    antrian += 1;
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println("----------------------------------------------");
                    dll.print();
                    break;
                case 3:
                    dll.removeFirst();
                    newPsn = add();
                    dl.addLast2(newPsn);
                    noPesanan += 1;
                    break;
                case 4:
                    System.out.println("----------------------------------------------");
                    System.out.println("Transaksi Input Pesanan");
                    System.out.println("----------------------------------------------");
                    dl.bubbleSort();
                    dl.print2();
                    break;
                case 5:
                    System.out.println("----------------------------------------------");
                    System.out.println("Total Pendapatan");
                    System.out.println("----------------------------------------------");
                    System.out.println("Pendapatan hari ini: Rp. " + totalHarga);
                    break;

            }
            System.out.println("----------------------------------------------");
        } while (pilih > 0 && pilih < 6);
    }

    public static Pesanan_22 add() {
        System.out.println("Nomor Pesanan\t : " + noPesanan);
        System.out.print("Pesanan\t\t : ");
        wildan.nextLine();
        String pesanan = wildan.nextLine();
        System.out.print("Harga\t\t : ");
        int harga = wildan.nextInt();
        totalHarga += harga;
        return new Pesanan_22(noPesanan, pesanan, harga);
    }
}