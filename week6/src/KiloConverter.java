import javax.swing.*;

public class KiloConverter extends JFrame {

    JPanel panel;

    JLabel messageLable;

    JTextField kiloTextField;

    JButton calcButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

//    always be aware
//    create

    public KiloConverter() {
      setTitle("Kilometer Converter");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      buildPanel();
      add(panel);
      setVisible(true);
    }

public void buildPanel() {

        messageLable = new JLabel("Enter distance in kilometers");
//        text, button, panel

    kiloTextField = new JTextField(10);

    calcButton = new JButton("Calculate");

    panel = new JPanel();
//    we now have to add the above three components onto the JPanel

    panel.add(messageLable);
    panel.add(kiloTextField);
    panel.add(calcButton);

//    we have to add our main method


    }
    public static void main(String[] args) {
        new KiloConverter();


    }




}
