import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition Calculator");
        JLabel label1 = new JLabel("Enter first number:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Enter second number:");
        JTextField textField2 = new JTextField(10);
        JButton button = new JButton("Calculate Sum");
        JLabel resultLabel = new JLabel("Sum: ");

        frame.setLayout(null);

        label1.setBounds(30, 30, 150, 30);
        textField1.setBounds(180, 30, 100, 30);
        label2.setBounds(30, 70, 150, 30);
        textField2.setBounds(180, 70, 100, 30);
        button.setBounds(100, 110, 150, 30);
        resultLabel.setBounds(100, 150, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Sum: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(button);
        frame.add(resultLabel);

        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
