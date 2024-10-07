import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Area Calculator");
        JLabel lengthLabel = new JLabel("Enter length:");
        JTextField lengthField = new JTextField(10);
        JLabel breadthLabel = new JLabel("Enter breadth:");
        JTextField breadthField = new JTextField(10);
        JButton button = new JButton("Calculate Area");
        JLabel resultLabel = new JLabel("Area: ");

        frame.setLayout(null);

        lengthLabel.setBounds(30, 30, 100, 30);
        lengthField.setBounds(150, 30, 100, 30);
        breadthLabel.setBounds(30, 70, 100, 30);
        breadthField.setBounds(150, 70, 100, 30);
        button.setBounds(100, 110, 150, 30);
        resultLabel.setBounds(100, 150, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double breadth = Double.parseDouble(breadthField.getText());
                    double area = length * breadth;
                    resultLabel.setText("Area: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        frame.add(lengthLabel);
        frame.add(lengthField);
        frame.add(breadthLabel);
        frame.add(breadthField);
        frame.add(button);
        frame.add(resultLabel);

        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
