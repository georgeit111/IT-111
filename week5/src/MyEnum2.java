


public class MyEnum2 {
    enum Wines {CABERNET, MERLOT, SYRAH }


    public static void main(String[] args) {
        Wines choose = Wines.CABERNET;



        switch (choose) {
            case CABERNET:
                System.out.println("Love my Washington Cabernets");
            break;

            case MERLOT:
                System.out.println("The main character in Sideways  did not like Merlots");
                break;

            case SYRAH:
                System.out.println("I like some Syrahs");
                break;

            default:
                System.out.println("Invalid input");





        }






    }
}
