public class mainNilaiMhs07 {
    public static void main(String[] args) {
        nilaiMhs07 hitung = new nilaiMhs07();

        System.out.println("Nilai UTS tertinggi          : " + hitung.nilaiTertinggi(hitung.uts, 0, hitung.uts.length - 1));
        System.out.println("Nilai UTS terendah           : " + hitung.nilaiTerendah(hitung.uts, 0, hitung.uts.length - 1));
        System.out.println("Rata-rata nilai UAS mahasiswa: " + hitung.rataUAS());
    }
}
