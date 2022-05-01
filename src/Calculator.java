import java.util.Scanner;

public class Calculator {
    public String calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int n = scanner.nextInt();
        double result = 0;
        for(double i = 1;i<=n;i++){

            result += (1/i);
        }
        return "Sonuç : " + result;

    }
}
