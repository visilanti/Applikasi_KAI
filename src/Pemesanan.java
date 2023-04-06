public class Pemesanan extends AbstrakPemesanan {
    public Pemesanan(String namaPenumpang, String tujuan, int jumlahTiket, KelasKereta kelasKereta) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
        this.jumlahTiket = jumlahTiket;
        this.kelasKereta = kelasKereta;

        // generate harga tiket otomatis berdasarkan kelas kereta
        switch (kelasKereta) {
            case EKONOMI:
                this.hargaTiket = generateHargaTiket(50000, 75000);
                break;
            case BISNIS:
                this.hargaTiket = generateHargaTiket(75000, 100000);
                break;
            case EKSEKUTIF:
                this.hargaTiket = generateHargaTiket(100000, 150000);
                break;
            default:
                this.hargaTiket = 0;
        }
    }

    public void tampilkanDetailTiket() {
    }

    // getter untuk harga tiket
    public int getHargaTiket() {
        return this.hargaTiket;
    }

    public int getJumlahTiket() {
        return this.jumlahTiket;
    }

    public void pembayaran() {
    }
}
