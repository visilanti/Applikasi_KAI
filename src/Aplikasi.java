import java.util.Scanner;
//import UserAccountSystem.*;

class Aplikasi{
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        // buat objek transaksi
        Transaksi transaksi = new Transaksi();

        // buat variabel untuk inputan user
        String namaPenumpang, tujuan;
        int jumlahTiket, nominal;

//        //---System Register Start--
//        LoginSystem menu = new LoginSystem();
//        //display menu
//        menu.displayMenu();
//        //---System Register End--

        // tampilkan menu
        System.out.println("Menu Pemesanan Tiket Kereta Api");
        System.out.println("1. Pemesanan Tiket Antar Kota");
        System.out.println("2. Pemesanan Tiket Lokal");
        System.out.println("3. Top Up Saldo");
        System.out.println("4. Keluar");

        // loop untuk menampilkan menu
        while (true) {
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                // input nama penumpang
                System.out.print("Nama Penumpang: ");
                scanner.nextLine();
                namaPenumpang = scanner.nextLine();

                // input tujuan
                System.out.print("Tujuan: ");
                tujuan = scanner.nextLine();

                // input jumlah tiket
                System.out.print("Jumlah Tiket: ");
                jumlahTiket = scanner.nextInt();

                // input kelas kereta
                System.out.print("Kelas Kereta (1. Ekonomi, 2. Bisnis, 3. Eksekutif): ");
                int kelas = scanner.nextInt();
                KelasKereta kelasKereta;
                switch (kelas) {
                    case 1:
                        kelasKereta = KelasKereta.EKONOMI;
                        break;
                    case 2:
                        kelasKereta = KelasKereta.BISNIS;
                        break;
                    case 3:
                        kelasKereta = KelasKereta.EKSEKUTIF;
                        break;
                    default:
                        kelasKereta = null;
                        break;
                }

                // buat objek tiket
                Pemesanan tiket = new PemesananAntarKota(namaPenumpang, tujuan, jumlahTiket, kelasKereta);

                // tampilkan detail tiket
                System.out.println("Detail Tiket");
                tiket.tampilkanDetailTiket();

                // hitung total pembayaran
                int totalPembayaran = transaksi.hitungTotalPembayaran(tiket);

                // lakukan pembayaran otomatis
                transaksi.lakukanPembayaran(totalPembayaran);
            } else if (pilihan == 2) {
                // input nama penumpang
                System.out.print("Nama Penumpang: ");
                scanner.nextLine();
                namaPenumpang = scanner.nextLine();

                // input tujuan
                System.out.print("Tujuan: ");
                tujuan = scanner.nextLine();

                // input jumlah tiket
                System.out.print("Jumlah Tiket: ");
                jumlahTiket = scanner.nextInt();

                // input kelas kereta
                System.out.print("Kelas Kereta (1. Ekonomi, 2. Bisnis, 3. Eksekutif): ");
                int kelas = scanner.nextInt();
                KelasKereta kelasKereta;
                switch (kelas) {
                    case 1:
                        kelasKereta = KelasKereta.EKONOMI;
                        break;
                    case 2:
                        kelasKereta = KelasKereta.BISNIS;
                        break;
                    case 3:
                        kelasKereta = KelasKereta.EKSEKUTIF;
                        break;
                    default:
                        kelasKereta = null;
                        break;
                }

                // buat objek tiket
                Pemesanan tiket = new PemesananLokal(namaPenumpang, tujuan, jumlahTiket, kelasKereta);

                // tampilkan detail tiket
                System.out.println("Detail Tiket");
                tiket.tampilkanDetailTiket();

                // hitung total pembayaran
                int totalPembayaran = transaksi.hitungTotalPembayaran(tiket);

                // lakukan pembayaran otomatis
                transaksi.lakukanPembayaran(totalPembayaran);
            } else if (pilihan == 3) {
                // input nominal top up
                System.out.print("Nominal Top Up: ");
                nominal = scanner.nextInt();

                // top up saldo
                transaksi.setSaldo(nominal);
                System.out.println("Saldo saat ini adalah "+ transaksi.getSaldo());
            } else if (pilihan == 4) {
                // keluar dari program
                break;
            } else {
                // pilihan menu salah
                System.out.println("Pilihan menu tidak valid");
            }
        }
    }
}