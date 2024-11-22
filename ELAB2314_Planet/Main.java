package ELAB2314_Planet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        HanhTinh hanhTinh = new HanhTinh(Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()));
        double khoiLuongTrenHanhTinh = Double.parseDouble(scanner.nextLine());
        System.out.println("Your weight on "+ name+ " is "+ String.format("%.2f", hanhTinh.khoiLuongBeMat(khoiLuongTrenHanhTinh)));
    }
}
class HanhTinh {
    private double khoiLuong;
    private double banKinh;
    public static double G = 6.67300e-11;
    public HanhTinh (double khoiLuong, double banKinh){
        this.banKinh = banKinh;
        this.khoiLuong = khoiLuong;
    }
    public double trongLucBeMat(){
        return (khoiLuong * G)/(banKinh * banKinh);
    }
    public double khoiLuongBeMat (double khoiLuongTrenHanhTinh){
        HanhTinh traiDat = new HanhTinh(5.976e+24, 6.37814e6);
        return khoiLuongTrenHanhTinh * this.trongLucBeMat()/traiDat.trongLucBeMat();
    }
}