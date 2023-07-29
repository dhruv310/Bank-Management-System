package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin)
    {
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setBounds(445,180,700,35);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("System" , Font.BOLD,25));
        l3.add(l1);

        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.black);
        b1.setBackground(new Color(200,200,200));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.black);
        b2.setBackground(new Color(200,200,200));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.black);
        b3.setBackground(new Color(200,200,200));
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4= new JButton("Rs. 2000");
        b4.setForeground(Color.black);
        b4.setBackground(new Color(200,200,200));
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5= new JButton("Rs. 5000");
        b5.setForeground(Color.black);
        b5.setBackground(new Color(200,200,200));
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setForeground(Color.black);
        b6.setBackground(new Color(200,200,200));
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7= new JButton("Back");
        b7.setForeground(Color.black);
        b7.setBackground(new Color(200,200,200));
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b7)
        {
            setVisible(false);
            new Transaction(pin);
        }
        else
        {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Conn c = new Conn();
            Date date = new Date();
            try
            {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while(resultSet.next())
                {
                   if(resultSet.getString("type").equals("Deposit"))
                   {
                        balance+=Integer.parseInt(resultSet.getString("amount"));
                   }else
                   {
                       balance-=Integer.parseInt(resultSet.getString("amount"));
                   }
                }

                if(e.getSource()!=b7&&balance<Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insuffcient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values ('"+pin+"' , '"+date+"' , 'withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null , "Rs. "+amount+"Debited Successfully");
            }
            catch (Exception E)
            {
                E.getStackTrace();
            }
            new Transaction(pin);
            setVisible(false);

        }

    }
}
