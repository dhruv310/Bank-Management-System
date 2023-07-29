package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton button1,button2,button3;
    JLabel lable1 , lable2 , lable3;
    JTextField textfield2;
    JPasswordField p1;
    Login()
    {
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image iii2 = iii1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(630,350,100,100);
        add(iiimage);

        lable1 = new JLabel("Welcome to ATM");
        lable1.setForeground(Color.white);
        lable1.setFont(new Font("AvantGarde", Font.BOLD , 38));
        lable1.setBounds(230,125,450,40);
        add(lable1);

        lable2 = new JLabel("Card No:");
        lable2.setFont(new Font("Railway",Font.BOLD , 28));
        lable2.setForeground(Color.WHITE);
        lable2.setBounds(150,190,375,30);
        add(lable2);

        textfield2 = new JTextField(15);
        textfield2.setBounds(325 , 190 , 230 ,30);
        textfield2.setForeground(Color.black);
        textfield2.setBackground(Color.CYAN);
        textfield2.setFont(new Font("Arial", Font.BOLD , 14));
        add(textfield2);

        lable3 = new JLabel("PIN:");
        lable3.setFont(new Font("Railway",Font.BOLD,28));
        lable3.setForeground(Color.white);
        lable3.setBounds(150,250,375,30);
        add(lable3);




        p1 = new JPasswordField(15);
        p1.setForeground(Color.BLACK );
        p1.setBackground(Color.CYAN);
        p1.setBounds(325,250,230,30);
        p1.setFont(new Font("Raleway",Font.BOLD,20));
        add(p1);

        button1 = new JButton("Sign In");
        button1.setFont(new Font("Arial" , Font.BOLD , 14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Arial" , Font.BOLD , 14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image ii2 = ii1.getImage().getScaledInstance(850,480 ,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,850,480);
        add(iimage);





        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            if(e.getSource()==button1)
            {
                Conn c = new Conn();
                String cardno=textfield2.getText();
                String pin = p1.getText();
                String q = "select * from login where card_number ='"+cardno+"' and pin ='"+pin+"'";
                ResultSet resultSet =c.statement.executeQuery(q);
                if(resultSet.next()) {
                    setVisible(false);
                    new Transaction(pin);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Enter valid Card Number and PIN Number");
                }




            }else if(e.getSource()==button2)
            {
                textfield2.setText("");
                p1.setText("");
            }
            else if(e.getSource()==button3)
            {
                new Signup();
                setVisible(false);
            }
        }
        catch (Exception E)
        {
            E.getStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new Login();
    }
}
