package CONTEST006_Tien_nong;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(10, 8);
        System.out.println(money1);
        Money money2 = new Money(5, 5);
        System.out.println(money2);
        Money money3 = money1.plus(money2);
        System.out.println(money3);
        Money money4 = new Money(10, 0);
        Money money5 = new Money(3, 0);
        Money money6 = new Money(5, 0);
        System.out.println(money4.lessThan(money5));
        System.out.println(money5.lessThan(money6));
        Money money7 = new Money(10, 0);
        System.out.println(money7);
        Money money8 = new Money(3, 50);
        System.out.println(money8);
        Money money9 = money7.minus(money8);
        System.out.println(money9);
        Money money10 = money8.minus(money9);
        System.out.println(money10);
    }
}

class Money {
    private int euros, cent;

    public Money(int euros, int cent) {
        this.euros = euros;
        this.cent = cent;
    }

    @Override
    public String toString() {
        String res = "";
        if (cent < 10) {
            res += euros + ".0" + cent + "e";
        } else {
            res += euros + "." + cent + "e";
        }
        return res;
    }

    public Money plus(Money added) {
        Money money = new Money(euros + added.euros, cent + added.cent);
        return money;
    }

    public boolean lessThan(Money compared) {
        if (euros > compared.euros) {
            return false;
        } else if (euros == compared.euros) {
            if (cent > compared.cent)
                return false;
            else
                return true;
        } else {
            return true;
        }
    }

    public Money minus(Money minus) {
        if (euros > minus.euros) {
            if (cent < minus.cent) {
                Money money = new Money(euros - minus.euros - 1, minus.cent - cent);
                return money;
            } else {
                Money money = new Money(euros - minus.euros, cent - minus.cent);
                return money;
            }
        } else
            return new Money(0, 0);
    }
}