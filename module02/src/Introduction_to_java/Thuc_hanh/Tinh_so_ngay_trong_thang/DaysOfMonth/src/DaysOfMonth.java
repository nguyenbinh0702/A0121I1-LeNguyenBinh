import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        //nhan thong tin ve thang
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon tim so ngay cua thang may? ");
        int month = scanner.nextInt();
        //tinh so ngay
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "") System.out.printf("Thang %d co %s ngay!", month, daysInMonth);
        else System.out.println("Dau vao khong hop le!");
    }
}
