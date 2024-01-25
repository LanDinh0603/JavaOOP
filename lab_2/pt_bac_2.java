package lab_2;

public class pt_bac_2 {
    public static void main(String[] args) {
        int a = scanner.nextInt();
        System.out.println("Nhap a: ");
        int b = scanner.nextInt();
        System.out.println("Nhap b: ");
        int c = scanner.nextInt();
        System.out.println("Nhap c: ");
        
        if(a == 0) {
            if(b == 0) {
                if(c == 0){
                    System.out.println("Phuong trinh VSN");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                float x = (float) -c / b;
                System.out.println("Phuong trinh co 1 nghiem : " + x);
            }               
        } else {
            int delta = (b*b) - (4*a*c);
            if(delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep : " + x);
            } else {
                float canDelta = (float)Math.sqrt(delta);
                float x1 = (float) (-b + canDelta) / (2 * a);
                float x2 = (float) (-b - canDelta) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
