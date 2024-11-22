package ELAB2313_Point_and_Line;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namePoints = new ArrayList<>();
        ArrayList<Point> points = new ArrayList<>();
        String nameStartPoint = null;
        while (true) {
            try {
                String name = scanner.nextLine();
                namePoints.add(name);
                nameStartPoint = name;
                String[] s = scanner.nextLine().split("\\s+");
                Point point = new Point(Double.parseDouble(s[0]), Double.parseDouble(s[1]), Double.parseDouble(s[2]));
                points.add(point);
            } catch (Exception e) {
                break;
            }
        }
        int indexStartPoint = 0;
        int checkDuplicatePoint = 0;
        for (int i = 0; i < points.size(); i++) {
            if (nameStartPoint.equals(namePoints.get(i))) {
                indexStartPoint = i;
                checkDuplicatePoint++;
            }
        }
        for (int i = 0; i < points.size(); i++) {
            Line line = new Line(points.get(indexStartPoint), points.get(i));
            // Neu diem do la chinh no thi khong xet
            if (i == indexStartPoint) {
                continue;
            }
            // Neu diem do khong hop le
            if (indexStartPoint == 0 && checkDuplicatePoint == 0) {
                System.out.println("invalid input");
                break;
            }
            // Diem trung nhau
            if (line.distance() == 0) {
                System.out.println("Line " + nameStartPoint + namePoints.get(i) + ": same point");
            } else {
                System.out.printf("Line %s%s: %.2f\n", nameStartPoint, namePoints.get(i), line.distance());
            }
        }
    }
}

class Point {
    private double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

}

class Line extends Point {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        super(0, 0, 0);
        this.start = start;
        this.end = end;
    }

    public Line(double x1, double y1, double z1, double x2, double y2, double z2) {
        super(0, 0, 0);
        this.start = new Point(x1, y1, z1);
        this.end = new Point(x2, y2, z2);
    }

    public double distance() {
        double deltaX = end.getX() - start.getX();
        double deltaY = end.getY() - start.getY();
        double deltaZ = end.getZ() - start.getZ();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2) + Math.pow(deltaZ, 2));
    }
}