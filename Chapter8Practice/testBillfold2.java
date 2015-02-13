public class testBillfold2
{
    public static void main(String[] args)
    {
        CallingCard izzy = new CallingCard("Izzy", "111", "123");
        DriverLicense annika = new DriverLicense("Annika", "2000");
        Billfold bill = new Billfold(izzy, annika);
        System.out.print(bill.getExpiredCardCount());
    }

}