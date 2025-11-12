import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        
        sc.nextLine(); 
        
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul]; 

 
        System.out.println("\n=========================================");
        System.out.println("          INPUT NILAI MAHASISWA          ");
        System.out.println("=========================================");
        
        for (int i = 0; i < nilai.length; i++) { 
            System.out.println("Input nilai siswa ke-" + (i + 1));
            
            for (int j = 0; j < nilai[i].length; j++) { 
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        
        sc.nextLine(); 

        System.out.println("\n=========================================");
        System.out.println("    Rata-Rata Nilai Setiap Siswa     ");
        System.out.println("=========================================");
        
        for (int i = 0; i < nilai.length; i++) {
            double totalPerSiswa = 0;
            
            for (int j = 0; j < nilai[i].length; j++) {
                totalPerSiswa += nilai[i][j];
            }
            
            double rataRataSiswa = totalPerSiswa / nilai[i].length; 
            
            System.out.println("Siswa ke-" + (i + 1) + 
                               ": " + String.format("%.2f", rataRataSiswa));
        }


        System.out.println("\n=========================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah:");
        
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < jumlahSiswa; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            
            double rataRataMatkul = totalPerMatkul / nilai.length; 
            
            System.out.println("Mata Kuliah " + (j + 1) + " : " + 
                               String.format("%.2f", rataRataMatkul));
        }
        
        sc.close();
    }
}