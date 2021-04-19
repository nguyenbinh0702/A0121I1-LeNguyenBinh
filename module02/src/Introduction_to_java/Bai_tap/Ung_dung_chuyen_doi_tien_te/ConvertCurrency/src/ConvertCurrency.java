import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri USD: ");
        usd = scanner.nextDouble();
        double doi = usd * rate;
        System.out.print("Giá trị vnđ: " + doi);
    }
}
