package energi_kinetik;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan50 {

    public static void main(String[] args) {
        double massa, energiKinetik, usaha, kAwal, kAkhir;
        Kinetik bola_baseball = new Kinetik(145,25);
        bola_baseball.setKecepatanAwal(0);
        kAwal = bola_baseball.getKecepatanAwal();
        kAkhir = bola_baseball.getKecepatanAkhir();
        massa = bola_baseball.getMassa();
        energiKinetik = bola_baseball.hitungEnergiKinetik(massa,kAkhir);
        usaha = bola_baseball.hitungUsaha(massa,kAwal,kAkhir);

        System.out.println("=====Penghitungan Energi Kinetik=====");
        System.out.printf("Sebuah bola baseball dengan massa %1$.0f g dilempar dengan kecepatan %2$.0f m/s.%n", massa, kAkhir);
        System.out.printf("Hasil energi kinetik = %.0f J%n", energiKinetik);
        System.out.println();
        System.out.println("=====Perhitungan Usaha=====");
        System.out.printf("Usaha yang dilakukan terhadap bola untuk mencapai kecepatan %1$.0f m/s, keadaan awal diam.%n", kAkhir);
        System.out.printf("Usaha = %.0f J%n",usaha);
    }
}
