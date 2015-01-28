
public class TestCards
{
    public static void main(String[] args)
    {
        DriverLicense izzy = new DriverLicense("Izzy", "2016");
        IDCard annika = new IDCard("Annika", "413");
        Billfold bill = new Billfold(izzy, annika);
        System.out.print(bill.formatCards());
    }

}
