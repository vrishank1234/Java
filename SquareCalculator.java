import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Calculator");
        JLabel label = new JLabel("Enter a number:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Calculate Square");
        JLabel resultLabel = new JLabel("Result: ");

        frame.setLayout(null);

        label.setBounds(30, 30, 100, 30);
        textField.setBounds(150, 30, 100, 30);
        button.setBounds(100, 70, 150, 30);
        resultLabel.setBounds(100, 110, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double number = Double.parseDouble(textField.getText());
                    double square = number * number;
                    resultLabel.setText("Result: " + square);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
