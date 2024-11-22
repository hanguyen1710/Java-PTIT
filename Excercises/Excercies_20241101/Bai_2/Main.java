package Bai_2;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.PrintCheckerPattern();
        System.out.println();
        main.PrintSquarePattern();
        System.out.println();
        main.PrintTriangularPattern();
        System.out.println();
        main.PrintStarPattern();
        System.out.println();

    }
    public void PrintCheckerPattern(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 ==0){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void PrintSquarePattern(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public void PrintTriangularPattern(){
        for (int i = 5; i > 0; i--) {
            // In khoảng trắng đầu dòng
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            // In dấu *
            for (int k = 0; k < i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void PrintStarPattern(){
        System.out.println("    *");
        System.out.println("* *   * *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
    }

}
