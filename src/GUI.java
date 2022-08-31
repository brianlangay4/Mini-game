import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GUI implements ActionListener{

    Random number1 = new Random();

    int min = 1;
    int max = 4;

    int i = ((number1.nextInt(max + min) + min));
    int b1 = 1;
    int b2 = 2;
    int b3 = 3;
    int b4 = 4;
    int b5 = 5;


    JFrame frame;

    JLabel label;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JPanel panel;
    public GUI (){

        button1 = new JButton();
        button1.setText("1");
        button1.addActionListener(this);
        button2 = new JButton();
        button2.setText("2");
        button2.addActionListener(this);
        button3 = new JButton();
        button3.setText("3");
        button3.addActionListener(this);
        button4 = new JButton();
        button4.setText("4");
        button4.addActionListener(this);
        button5 = new JButton();
        button5.setText("5");
        button5.addActionListener(this);
        frame = new JFrame();
        label = new JLabel();
        label.setText(" ");
        label.setBounds(10,50,50,70);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(70,100, 100,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(label);
        panel.setVisible(true);



        frame.add(panel,BorderLayout.CENTER);
        frame.pack();
        frame.setTitle("Mini Game");
        frame.setVisible(true);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main (String[]args){
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {


       boolean loop = true;
        do {
            if (button1.equals(i)){
                System.out.println("");
                label.setText("win");
            }
            if (button2.equals(i)){
                System.out.println("");
                label.setText("win");
            }
            if (button3.equals(i)){
                System.out.println("");
                label.setText("win");
            }
            if (button4.equals(i)){
                System.out.println("");
                label.setText("win");
            }
            if (button5.equals(i)){
                System.out.println("");
                label.setText("win");
            }
            else {
                System.out.println("");
                label.setText("incorrect");
            }

        }while (loop = false);
    }
}

