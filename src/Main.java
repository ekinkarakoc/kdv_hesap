import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tutar;
        double kdv_oran = 0.18;

        System.out.println("Ücreti Giriniz");

        tutar = scanner.nextDouble();

        double kdv_tutar = tutar*kdv_oran;

        System.out.println("kdv tutarı: "+kdv_tutar);

        double kdvli_tutar = tutar + kdv_tutar;

        System.out.println("toplam tutar: " +kdvli_tutar);

    }
}