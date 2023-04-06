public class Transaksi {
    private int saldo;

    // constructor
    public Transaksi() {
        this.saldo = 0;
    }

    //getter dan setter
    public int getSaldo(){
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo += saldo;
    }

    // method untuk hitung total pembayaran
    public int hitungTotalPembayaran(Pemesanan tiket) {
        int total = tiket.getHargaTiket() * tiket.getJumlahTiket();
        return total;
    }

    // tambah
    // method untuk melakukan pembayaran otomatis
    public void lakukanPembayaran(int totalPembayaran) {
        if (this.saldo >= totalPembayaran) {
            this.saldo -= totalPembayaran;
            System.out.println("Pembayaran berhasil");
            // tampilkan sisa saldo
            System.out.println("Sisa saldo: " + this.saldo);
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
