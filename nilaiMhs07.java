public class nilaiMhs07 {
    
    String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
    int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

    int nilaiTertinggi(int [] arr, int kiri, int kanan){
        if (kiri == kanan) {
            return arr[kiri];
        }

        int mid = (kiri+kanan)/2;
        int maxKiri = nilaiTertinggi(arr, kiri, mid);
        int maxKanan = nilaiTertinggi(arr, mid + 1, kanan);
        
        return (maxKiri > maxKanan) ? maxKiri : maxKanan;
    }

    int nilaiTerendah(int [] arr, int kiri, int kanan){
        if (kiri == kanan) {
            return arr[kiri];
        }

        int mid = (kiri+kanan)/2;
        int maxKiri = nilaiTerendah(arr, kiri, mid);
        int maxKanan = nilaiTerendah(arr, mid + 1, kanan);

        return (maxKiri < maxKanan) ? maxKiri : maxKanan;
    }

    double rataUAS(){
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }
}
