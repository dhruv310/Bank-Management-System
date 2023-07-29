package bank.management.system;

import com.mysql.cj.jdbc.exceptions.ConnectionFeatureNotAvailableException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin)
    {
        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Change Your PIN");
        label1.setFont(new Font("Raleway",Font.BOLD,15));
        label1.setForeground(Color.white);
        label1.setBounds(430,180,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN:");
        label2.setFont(new Font("Raleway",Font.BOLD,15));
        label2.setForeground(Color.white);
        label2.setBounds(430,220,150,35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(70,130,130));
        p1.setForeground(Color.WHITE );
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,20));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN:");
        label3.setFont(new Font("Raleway",Font.BOLD,15));
        label3.setForeground(Color.white);
        label3.setBounds(430,250,400,35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(70,130,130));
        p2.setForeground(Color.WHITE );
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,20));
        l3.add(p2);


        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(70,130,130));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(70,130,130));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Pin("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            String pin1 =  p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2))
            {
                JOptionPane.showMessageDialog(null,"Entered PIN Does Not Match");
                return;
            }
            if(e.getSource()==b1)
            {
                if(p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New Pin");
                    return;

                }
                if(p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, " Re-Enter New Pin");
                    return;

                }
                Conn c = new Conn();
                String db1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String db2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String db3 = "update signuptwo set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(db1);
                c.statement.executeUpdate(db2);
                c.statement.executeUpdate(db3);

                JOptionPane.showMessageDialog(null , "PIN Changed Successfully");
                setVisible(false);
                new Transaction(pin);

            }
            else if (e.getSource()==b2)
            {
                new Transaction(pin);
                setVisible(false);

            }
        }
        catch(Exception E)
        {
            E.getStackTrace();
        }

    }
}
