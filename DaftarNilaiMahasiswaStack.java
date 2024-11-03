import java.util.Scanner;
import java.util.Stack;

public class DaftarNilaiMahasiswaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); // Consume newline

        Stack<String> namaMahasiswa = new Stack<>();
        Stack<Integer> nilaiMahasiswa = new Stack<>();
        double totalNilai = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            namaMahasiswa.push(nama);
            System.out.print("Nilai: ");
            int nilai = sc.nextInt();
            nilaiMahasiswa.push(nilai);
            sc.nextLine(); // Consume newline
        }

        // Print the results
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No \t Nama \t Nilai \t Status");
        
        int i = 1;
        while (!namaMahasiswa.empty()) {
            String nama = namaMahasiswa.pop();
            int nilai = nilaiMahasiswa.pop();
            String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
            System.out.printf("%d \t %s \t %d \t %s%n", i, nama, nilai, status);
            totalNilai += nilai;
            i++;
        }

        double rataRata = totalNilai / jumlahMahasiswa;

        System.out.println("================================");
        System.out.printf("Jumlah: %.1f%n", totalNilai);
        System.out.printf("Nilai Rata-rata: %.1f%n", rataRata);

        sc.close();
    }
}