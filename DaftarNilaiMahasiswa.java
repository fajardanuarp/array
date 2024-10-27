package Array;

    import java.util.Scanner;

public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        double totalNilai = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            namaMahasiswa[i] = sc.nextLine();
            System.out.print("Nilai: ");
            nilaiMahasiswa[i] = sc.nextInt();
            sc.nextLine(); // Consume newline
        }

        // Print the results
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No \t Nama \t Nilai \t Status");
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            String status = (nilaiMahasiswa[i] >= 60) ? "Lulus" : "Tidak Lulus";
            System.out.printf("%d \t %s \t %d \t %s%n", (i + 1), namaMahasiswa[i], nilaiMahasiswa[i], status);
            totalNilai += nilaiMahasiswa[i];
        }

        double rataRata = totalNilai / jumlahMahasiswa;

        System.out.println("================================");
        System.out.printf("Jumlah: %.1f%n", totalNilai);
        System.out.printf("Nilai Rata-rata: %.1f%n", rataRata);

        sc.close();
    }
}

