package lab_2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        
       Scanner myObjScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat(); 

        System.out.print("Nhap a: ");
        int a = myObjScanner.nextInt();
        System.out.print("Nhap b: ");
        int b = myObjScanner.nextInt();
         
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + decimalFormat.format(thuong)); 
        int PhanDu = a % b;
        System.out.println(a + " % " + b + " = " + PhanDu);
    }
}

