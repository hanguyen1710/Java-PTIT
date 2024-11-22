package LAB02_StaticClass_Static_Account_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = Integer.parseInt(scanner.nextLine());
        while (test-- > 0) {
            ArrayList<Account> accounts = new ArrayList<>();
            String taiKhoan = scanner.nextLine();
            String ten[] = taiKhoan.split("\\d+"); // Tach theo so
            String soDu[] = taiKhoan.split("\\D+"); // Tach theo chu
            for (int i = 0; i < Integer.parseInt(soDu[0]); i++) {
                Account account = new Account(i + 1, ten[i + 1], Integer.parseInt(soDu[i + 1]));
                accounts.add(account);
            }
            String thaoTac[] = scanner.nextLine().split("\\s+");
            for (int i = 0; i < thaoTac.length; i++) {
                if (thaoTac[i].equals("rut")) {
                    for (Account account : accounts) {
                        if (Integer.parseInt(thaoTac[i + 1]) == Integer.parseInt(account.getId())) {
                            int soTien = Integer.parseInt(thaoTac[i + 2]);
                            account.rutTien(soTien);
                        }
                    }
                } else if (thaoTac[i].equals("nap")) {
                    for (Account account : accounts) {
                        if (Integer.parseInt(thaoTac[i + 1]) == Integer.parseInt(account.getId())) {
                            int soTien = Integer.parseInt(thaoTac[i + 2]);
                            account.napTien(soTien);
                        }
                    }
                } else if (thaoTac[i].equals("chuyen")) {
                    for (Account account : accounts) {
                        if (Integer.parseInt(thaoTac[i + 1]) == Integer.parseInt(account.getId())) {
                            int soTien = Integer.parseInt(thaoTac[i + 3]);
                            for (Account account1 : accounts) {
                                if (Integer.parseInt(thaoTac[i + 2]) == Integer.parseInt(account1.getId())) {
                                    account.chuyenTien(account1, soTien);
                                }
                            }
                        }
                    }
                }
            }
            for (Account account : accounts) {
                System.out.print(account);
            }
            System.out.println();
        }
    }

    static class Account {
        private String id, ten;
        private int soDu;

        public Account(int id, String ten, int soDu) {
            this.id = String.format("%03d", id);
            this.ten = ten;
            this.soDu = soDu;
        }

        public String getId() {
            return id;
        }

        public String getTen() {
            return ten;
        }

        public int getSoDu() {
            return soDu;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setSoDu(int soDu) {
            this.soDu = soDu;
        }

        @Override
        public String toString() {
            return "[" + id + ", " + ten.trim() + ", " + soDu + "]";
        }

        public void rutTien(int soTien) {
            if (soDu < soTien) {
                return;
            } else {
                soDu -= soTien;
            }
        }

        public void chuyenTien(Account account, int soTien) {
            if (soDu < soTien) {
                return;
            } else {
                this.soDu -= soTien;
                account.soDu += soTien;
            }
        }

        public void napTien(int soTien) {
            soDu += soTien;
        }
    }
}