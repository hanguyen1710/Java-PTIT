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
        System.out.println("* * * * * ");
        System.out.println(" * * * * *");
        System.out.println("* * * * * ");
        System.out.println(" * * * * *");
        System.out.println("* * * * * ");
    }
    public void PrintSquarePattern(){
        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("* * * * *");
    }
    public void PrintTriangularPattern(){
        System.out.println("* * * * *");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *  ");
        System.out.println("    *   ");
    }
    public void PrintStarPattern(){
        System.out.println("    *");
        System.out.println("* *   * *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
    }

}
