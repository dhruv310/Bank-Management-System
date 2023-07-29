package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp2 extends JFrame implements ActionListener {
    JRadioButton b1,b2,b3,b4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit , cancel;
    String formno;
    SignUp2(String formno)
    {
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,10,100,100);
        add(image);

        JLabel l1=new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD,20));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details:");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 =  new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,140,200,30);
        add(l3);

        b1 = new JRadioButton("Saving Account");
        b1.setBackground(new Color(200,250,250));
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setBounds(100,180,150,30);
        add(b1);

        b2 = new JRadioButton("Fixed Deposit Account");
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setBackground(new Color(200,250,250));
        b2.setBounds(350,180,300,30);
        add(b2);

        b3 = new JRadioButton("Current Account");
        b3.setFont(new Font("Raleway",Font.BOLD,15));
        b3.setBackground(new Color(200,250,250));
        b3.setBounds(100,220,250,30);
        add(b3);

        b4 = new JRadioButton("Recurring Deposit Account");
        b4.setFont(new Font("Raleway",Font.BOLD,15));
        b4.setBackground(new Color(200,250,250));
        b4.setBounds(350,220,250,30);
        add(b4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(b1);
        buttonGroup.add(b2);
        buttonGroup.add(b3);
        buttonGroup.add(b4);

        JLabel l4 =  new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 =  new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,10));
        l5.setBounds(100,330,200,30);
        add(l5);

        JLabel l6 =  new JLabel("XXXX-XXXX-XXXX-0123");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 =  new JLabel("(It Would Appear On ATM card)");
        l7.setFont(new Font("Raleway",Font.BOLD,10));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 =  new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 =  new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 =  new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,10));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 =  new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,450,200,20);
        add(l11);

        c1= new JCheckBox("ATM Card");
        c1.setBackground(new Color(200,250,250));
        c1.setFont(new Font("Raleway", Font.BOLD,15));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setBackground(new Color(200,250,250));
        c2.setFont(new Font("Raleway", Font.BOLD,15));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3= new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(200,250,250));
        c3.setFont(new Font("Raleway", Font.BOLD,15));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4= new JCheckBox("Email Alerts");
        c4.setBackground(new Color(200,250,250));
        c4.setFont(new Font("Raleway", Font.BOLD,15));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5= new JCheckBox("Cheque Book");
        c5.setBackground(new Color(200,250,250));
        c5.setFont(new Font("Raleway", Font.BOLD,15));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6= new JCheckBox("E-Statement");
        c6.setBackground(new Color(200,250,250));
        c6.setFont(new Font("Raleway", Font.BOLD,15));
        c6.setBounds(350,600,200,30);
        add(c6);


        JCheckBox c7 = new JCheckBox("I Here Check My All Services Which I Required" , true);
        c7.setBackground(new Color(200,250,250));
        c7.setFont(new Font("Raleway", Font.BOLD,10));
        c7.setBounds(100,650,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,15));
        l12.setBounds(670,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(760,10,100,30);
        add(l13);

        submit= new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,20));
        submit.setBackground(Color.white);
        submit.setForeground(Color.black);
        submit.setBounds(250,680,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel= new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,15));
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
        cancel.setBounds(420,680,100,30);
        cancel.addActionListener(this);
        add(cancel);



        getContentPane().setBackground(new Color(200,250,250));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String acc_type=null;
        if(b1.isSelected())
        {
            acc_type = "Saving Account";
        }
        else if(b2.isSelected())
        {
            acc_type = "Fixed Deposit Account";
        }
        else if (b3.isSelected())
        {
            acc_type = "Current Account";
        }
        else if(b4.isSelected())
        {
            acc_type="Recurring Deposit Account";
        }
        Random ran =  new Random();
        long first1 = (ran.nextLong()%90000000L) +1409963000000000L;
        String cardno = ""+Math.abs(first1);
        long first2 = (ran.nextLong()%9000L)+1000L;
        String pin = " "+Math.abs(first2);

        String fac ="";
        if(c1.isSelected())
        {
            fac +="ATM Card";
        }
        else if(c2.isSelected())
        {
            fac+="Internet Banking";
        }
        else if(c3.isSelected())
        {
            fac +="Mobile Banking";
        }
        else if(c4.isSelected())
        {
            fac +="Email Alerts";
        }
        else if(c5.isSelected())
        {
            fac+="Cheque Book";
        }
        else if(c6.isSelected())
        {
            fac+="E-Statement";
        }

        try
        {
            if(e.getSource()==submit)
            {
                if(acc_type.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Enter All The Fields");
                    
                } else
                {
                    Conn c1= new Conn();
                    String db = "insert into signuptwo values ('"+formno+"' , '"+acc_type+"' , '"+cardno+"' , '"+pin+"' , '"+fac+"')";
                    String db1 = "insert into login values('"+formno +"' , '"+cardno+"' , '"+pin+"')";
                    c1.statement.executeUpdate(db);
                    c1.statement.executeUpdate(db1);
                    JOptionPane.showMessageDialog(null, "Card No:"+cardno+"\n Pin: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }
            else if (e.getSource()==cancel)
            {
                System.exit(0);
            }

        }
        catch (Exception E)
        {
            E.getStackTrace();
        }
    }


    public static void main(String[] args)
    {
        new SignUp2("");
    }
}
