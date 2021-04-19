import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.lang.Double;

public class LinearEquationResolver {
    public static void main(String[] args) {
        //thong bao ve chuc nang cua chuong trinh cung nhu dinh dang cua ham
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants: ");
        //thu vien Scanner trong goi java.util để doc gia tri mà nguoi dung nhap vao console(luong in)
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        //tim nghiem cua pt khi a != 0
        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
