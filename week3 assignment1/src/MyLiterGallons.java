public class MyLiterGallons {

    public static void main(String[] args) {

        // Conversion: gallons = liters / 3.78541
        float lit, gal;
        int lineCount = 1;

        for (lit = 3.78541f; lit <= 100; lit += 5) {
            gal = (lit / 3.78541f);
            System.out.printf("%.2f liters is equal to %.2f gallons\n", lit, gal);

            lineCount++;
            if (lineCount % 5 == 2) {
                System.out.println(); // Blank line every 5 lines


            }
        }
        System.out.println("All done!");
    }
}

