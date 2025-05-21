import java.awt.*;
import javax.swing.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 450;

        // Create the window
        JFrame window = new JFrame("My Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(450, 250);

        // Create a panel and set its background
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        // Create custom font
        Font customFont = new Font("Arial", Font.PLAIN, 16);
        Font customFont2 = new Font("Arial Bold", Font.BOLD, 14);

        // Create labels and set font
        JLabel myLabel1 = new JLabel("My First Big Label!!");
        myLabel1.setFont(customFont);
        myLabel1.setForeground(Color.WHITE); // to contrast with blue background

        JLabel myLabel2 = new JLabel("My Second Big Label!!");
        myLabel2.setFont(customFont2);
        myLabel2.setForeground(Color.WHITE);

        // Create text fields and set font
        JTextField textField1 = new JTextField(10);
        textField1.setFont(customFont);

        JTextField textField2 = new JTextField(10);
        textField2.setFont(customFont);

        // Add components to panel
        panel.add(myLabel1);
        panel.add(textField1);
        panel.add(myLabel2);
        panel.add(textField2);

        // Add panel to frame
        window.add(panel);

        // Make the window visible
        window.setVisible(true);
    }
}
