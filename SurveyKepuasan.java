public class SurveyKepuasan {

    public static void main(String[] args) {

        double[][] hasilSurvey = {
            {4, 5, 3, 4, 5, 4},
            {3, 4, 2, 4, 4, 3},
            {5, 5, 5, 4, 5, 5},
            {4, 3, 4, 4, 3, 4},
            {3, 4, 3, 3, 4, 4},
            {4, 5, 4, 5, 4, 5},
            {2, 3, 3, 4, 3, 3},
            {5, 4, 5, 5, 5, 5},
            {3, 3, 4, 3, 3, 3},
            {4, 4, 4, 5, 4, 5}
        };

        int jumlahResponden = hasilSurvey.length; // 10
        int jumlahPertanyaan = hasilSurvey[0].length; // 6 
        double totalKeseluruhan = 0;

        System.out.println("--- Rata-rata Nilai Per Responden (Per Baris) ---");
        for (int i = 0; i < jumlahResponden; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalPerResponden += hasilSurvey[i][j];
            }
            double rataRataResponden = totalPerResponden / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + 
                               ": " + String.format("%.2f", rataRataResponden));
            totalKeseluruhan += totalPerResponden;
        }

        System.out.println("\n--- Rata-rata Nilai Per Pertanyaan (Per Kolom) ---");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = totalPerPertanyaan / jumlahResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + 
                               ": " + String.format("%.2f", rataRataPertanyaan));
        }

        System.out.println("\n--- Rata-rata Nilai Secara Keseluruhan ---");
        int totalDataPoin = jumlahResponden * jumlahPertanyaan;
        double rataRataKeseluruhan = totalKeseluruhan / totalDataPoin;
        System.out.println("Total Poin Survei: " + totalKeseluruhan);
        System.out.println("Total Data Poin: " + totalDataPoin);
        System.out.println("Rata-rata Keseluruhan: " + String.format("%.2f", rataRataKeseluruhan));
    }
}