package Test;

public class StarPatterns {
    public static void main(String[] args) {
        // Hình (a)
        System.out.println("Hình (a):");
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

        // Hình (b)
        System.out.println("Hình (b):");
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
        System.out.println();

        // Hình (c)

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


        // Hình (d)
        System.out.println("Hình (d):");
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <=5/2; j++) {
                if (j == i || j == (6 - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
