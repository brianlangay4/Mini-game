import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GUI implements ActionListener{
    
    //the guessed number
    Random number1 = new Random();
    int min = 1;
    int max = 4;
    String i = String.valueOf(number1.nextInt(max + min) + min);
    //used to obtain text field value
    String perform1;
    //j frame classes
    JFrame frame;
    JLabel label;
    JLabel label2;
    JTextField textField;
    JLabel  Main;
    JLabel  hint;
    JPanel panel;
    JPanel panel1;
    public GUI (){
     //label1
     Main = new JLabel();
     Main.setText("number Guessing");
     //label2
     label2 = new JLabel();
     //label3
     label = new JLabel();
     label.setText(" ");
     perform1 = "";
     //label3
     hint = new JLabel();
     hint.setText("HINT!(1-5)");
     //text field
     textField = new JTextField();
     textField.setSize(50,50);
     textField.addActionListener(this);
     //button
     JButton login = new JButton();
     login.setText("Enter");
     login.setBackground(Color.cyan);
     login.addActionListener(this);
     //first panel
     panel1 = new JPanel();
     panel1.setBorder(BorderFactory.createEmptyBorder(20,30, 20,30));
     panel1.add(label2);
     panel1.add(label);
     //second panel
     panel = new JPanel();
     panel.setBorder(BorderFactory.createEmptyBorder(0,100, 50,100));
     panel.setLayout(new GridLayout(0,1));
     panel.add(textField);
     panel.add(login);
     panel.setVisible(true);
     panel.add(Main);
     panel.add(hint);
     //frame components
     frame = new JFrame();
     frame.add(panel1,BorderLayout.BEFORE_FIRST_LINE);
     frame.add(panel,BorderLayout.CENTER);
     frame.pack();
     frame.setTitle("Mini Game");
     frame.setVisible(true);
     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    //main methods
    public static void main (String[]args){
        new GUI();

    }
    //Action condition from implemented Action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        //getting the text field
       textField.setAction(textField.getAction());
        perform1 = textField.getText();
        //loop to maintain all condition
        boolean loop = true;
        do {
        //conditions
            if (perform1.isBlank()){
                System.out.println("no inputs");
                label.setText("no input");
            }
           if (perform1.equals(i)){
               label.setText("");
               label2.setText("you win");
               System.out.println("you win");
           }
            else {
                label2.setText("not correct");
               System.out.println("not correct");
           }

        } while (loop = false);

    }
}

