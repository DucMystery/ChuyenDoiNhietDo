import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice!=0){
            System.out.println("1. Chuyển đổi F sang C ");
            System.out.println("2. Chuyển đổi C sang F ");
            System.out.println("0. Exit");
            System.out.println("Bạn muốn chuyển :");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Mời bạn nhập vào giá trị:");
                    double valueF= scanner.nextDouble();
                    double valueC = (5.0/9)*(valueF-32);
                    System.out.println("Giá trị của độ C : "+valueC);
                    break;
                case 2:
                    System.out.println("Mời bạn nhập vào giá trị:");
                    double valueC1= scanner.nextDouble();
                    double valueF1 = (9.0/5)*valueC1+32;
                    System.out.println("Giá trị của độ F : "+valueF1);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
