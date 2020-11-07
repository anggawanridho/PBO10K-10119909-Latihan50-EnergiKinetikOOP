package energi_kinetik;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class Kinetik {
    private double massa, usaha, energiKinetik, kecepatanAwal, kecepatanAkhir;

    public Kinetik(double massa, double kecepatanAkhir) {
        this.massa = massa;
        this.kecepatanAkhir = kecepatanAkhir;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getUsaha() {
        return usaha;
    }

    public void setUsaha(double usaha) {
        this.usaha = usaha;
    }

    public double getEnergiKinetik() {
        return energiKinetik;
    }

    public void setEnergiKinetik(double energiKinetik) {
        this.energiKinetik = energiKinetik;
    }

    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(double kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

    public double getKecepatanAkhir() {
        return kecepatanAkhir;
    }

    public void setKecepatanAkhir(double kecepatanAkhir) {
        this.kecepatanAkhir = kecepatanAkhir;
    }

    public double hitungEnergiKinetik(double massa, double kecepatanAkhir){
        return 0.5*massa*(kecepatanAkhir*kecepatanAkhir);
    }

    public double hitungUsaha(double massa, double kecepatanAwal, double kecepatanAkhir){
        return 0.5*massa*((kecepatanAkhir*kecepatanAkhir)-(kecepatanAwal*kecepatanAwal));
    }
}
