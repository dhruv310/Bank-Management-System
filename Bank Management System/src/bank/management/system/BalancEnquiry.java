package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalancEnquiry extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1;
    String pin;
    BalancEnquiry(String pin)
    {
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance is Rs");
        label1.setFont(new Font("Raleway",Font.BOLD,15));
        label1.setForeground(Color.white);
        label1.setBounds(430,180,700,35);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("Raleway",Font.BOLD,15));
        label2.setForeground(Color.white);
        label2.setBounds(430,220,400,35);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(70,130,130));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        int balance =0 ;
        try
        {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next())
            {
                if(resultSet.getString("type").equals("Deposit"))
                {
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }
                else
                {
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }
        catch(Exception E)
        {
            E.getStackTrace();
        }
        label2.setText(""+balance);
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new BalancEnquiry("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transaction(pin);
    }
}
