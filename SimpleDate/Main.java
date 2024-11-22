package SimpleDate;

public class Main {
    public static void main(String[] args) {
        String s = "heh";
        SimpleDate s1 = new SimpleDate(5,2,2012);
        SimpleDate s2 = new SimpleDate(1,2,2000);
        SimpleDate inital = new SimpleDate(1,2,2000);
        System.out.println(inital.equals(s));
        System.out.println(inital.equals(s1));
        System.out.println(inital.equals(s2));
    }
}
class SimpleDate{
    private int day,month,year;
    public SimpleDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    @Override
    public boolean equals (Object obj){
        if (!(obj instanceof SimpleDate)) return false;
        SimpleDate simpleDate = (SimpleDate) obj;
        if (simpleDate.day == day && simpleDate.month == month && simpleDate.year == year)
            return true;
        return false;
    }
}