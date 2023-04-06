import java.util.Random;

public abstract class AbstrakPemesanan {
    public String namaPenumpang;
    public String tujuan;
    public int jumlahTiket;
    public int hargaTiket;
    public KelasKereta kelasKereta;

    // method untuk generate harga tiket otomatis
    int generateHargaTiket(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public abstract void tampilkanDetailTiket();

    public abstract void pembayaran();
}
