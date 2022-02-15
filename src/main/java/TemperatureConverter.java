import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    public TemperatureConverter() {
        JFrame frame = new JFrame("Hello World");
        frame.setLayout(new FlowLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelF = new JLabel("Fahrenheit Input");
        frame.add(labelF);

        JTextField textF = new JTextField(20);
        frame.add(textF);

        JButton buttonF = new JButton("Convert to Celsius");
        frame.add(buttonF);

        JLabel labelC = new JLabel("Celsius Input");
        frame.add(labelC);

        JTextField textC = new JTextField(20);
        frame.add(textC);

        JButton buttonC = new JButton("Convert to Fahrenheit");
        frame.add(buttonC);


        buttonF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Double tempF = Double.parseDouble(textF.getText());
                Double tempC = (tempF-32)*5/9;
                textC.setText(tempC+"");
            }
        });

        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Double tempC = Double.parseDouble(textC.getText());
                Double tempF = (tempC*9/5)+32;
                textF.setText(tempF+"");
            }
        });

        frame.setVisible(true);

        frame.setSize(300,200);

    }

    public static void main(String args[]){
        TemperatureConverter tc = new TemperatureConverter();
    }
}
