public class MyLiterGallons {

    public static void main(String[] args) {

        // Conversion: gallons = liters / 3.78541
        float lit, gal;
        int lineCount = 1;

        for (gal = 1; gal <= 100; gal += 5) {
            lit = (gal * 3.78541f);


            lineCount++;
            if(gal <= 1) {
                System.out.printf("%.2f liters is equal to %.1f gallon\n", lit, gal);
            } else { System.out.printf("%.2f liters is equal to %.1f gallons\n", lit, gal);

            }
            if (lineCount % 5 == 2) {
                System.out.println(); // Blank line every 5 lines


            }
        }
        System.out.println("All done!");
    }
}

