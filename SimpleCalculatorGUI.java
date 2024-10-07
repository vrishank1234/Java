import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculatorGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Square Calculator");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 50, 100, 30);
        f.add(tf1);

        JButton squareButton = new JButton("Square");
        squareButton.setBounds(150, 100, 100, 30);a
        f.add(squareButton);

        JLabel jl = new JLabel("Result:");
        jl.setBounds(150, 150, 200, 30);
        f.add(jl);

        squareButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(tf1.getText());
                    int square = num * num;
                    jl.setText("Square: " + square);
                } catch (NumberFormatException ex) {
                    jl.setText("Please enter a valid number!");
                }
            }
        });

        f.setVisible(true);
    }
}
