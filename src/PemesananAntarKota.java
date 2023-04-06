public class PemesananAntarKota extends Pemesanan {
    //constructor
    public PemesananAntarKota(String namaPenumpang, String tujuan, int jumlahTiket, KelasKereta kelasKereta) {
        super(namaPenumpang, tujuan, jumlahTiket, kelasKereta);
    }

    @Override
    public void tampilkanDetailTiket() {
        System.out.println("DETAIL PEMESANAN - Antar Kota");
        System.out.println("Nama Penumpang: " + this.namaPenumpang);
        System.out.println("Tujuan: " + this.tujuan);
        System.out.println("Jumlah Tiket: " + this.jumlahTiket);
        System.out.println("Kelas Kereta: " + this.kelasKereta);
        System.out.println("Harga Tiket: " + this.hargaTiket);
    }
}
