import java.util.Scanner;

public class TugasIndividu3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3, maksimal 5): ");
        int N = sc.nextInt();

        if (N < 3 || N > 5) {
            System.out.println("Nilai N harus antara 3 dan 5.");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print("" + N); 
                    } else {
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }
        }
    }
}
