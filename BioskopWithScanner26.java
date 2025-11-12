 import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2]; 
        int pilihan;

        do {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor baris (0-3): ");
                    int baris = input.nextInt();
                    System.out.print("Masukkan nomor kolom (0-1): ");
                    int kolom = input.nextInt();
                    input.nextLine();

                    if (baris < 0 || baris >= penonton.length || kolom < 0 || kolom >= penonton[baris].length) {
                        System.out.println("Nomor baris atau kolom tidak tersedia!");
                        break;
                    }

                    if (penonton[baris][kolom] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris][kolom] + "!");
                        System.out.println("Silakan pilih kursi lain.");
                    } else {
                        System.out.print("Masukkan nama penonton: ");
                        penonton[baris][kolom] = input.nextLine();
                        System.out.println("Data penonton berhasil disimpan!");
                    }
                    break;

                case 2:
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.print(isi + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);

        input.close();
    }
}
   

