package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp1 extends JFrame implements ActionListener {
    JComboBox cb , cb1 , cb2 , cb3 , cb4 , cb5;
    JButton nextbutton;
    JTextField textpan , adno;
    JRadioButton b1 , b2 , b3 , b4;
    String formno;
    SignUp1(String formno)
    {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,10,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details:");
        l2.setFont(new Font("Raleway" , Font.BOLD,20));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
        cb = new JComboBox(religion);
        cb.setBackground(new Color(250,200,80));
        cb.setFont(new Font("Raleway",Font.BOLD,15));
        cb.setBounds(350,120,320,30);
        add(cb);

        JLabel l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General" , "OBC" , "SC" , "ST" , "Other"};
        cb1 = new JComboBox(category);
        cb1.setBackground(new Color(250,200,80));
        cb1.setFont(new Font("Raleway",Font.BOLD,15));
        cb1.setBounds(350,170,320,30);
        add(cb1);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null" , "<1,50,000" , "2,50,000" , "7,00,000" , "upto 10,00,000" , "Above 10,00,000"};
        cb2 = new JComboBox(income);
        cb2.setBackground(new Color(250,200,80));
        cb2.setFont(new Font("Raleway",Font.BOLD,15));
        cb2.setBounds(350,220,320,30);
        add(cb2);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"Non-Graduate" , "Graduate" , "Post-Graduate"  , "Other"};
        cb3 = new JComboBox(education);
        cb3.setBackground(new Color(250,200,80));
        cb3.setFont(new Font("Raleway",Font.BOLD,15));
        cb3.setBounds(350,270,320,30);
        add(cb3);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,340,150,30);
        add(l7);

        String occupation[] = {"Salaried" , "Self-Employed" , "Buisness"  , "Student" , "Retired" , "Other"};
        cb4 = new JComboBox(occupation);
        cb4.setBackground(new Color(250,200,80));
        cb4.setFont(new Font("Raleway",Font.BOLD,15));
        cb4.setBounds(350,340,320,30);
        add(cb4);

        JLabel l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,390,150,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,20));
        textpan.setBounds(350,390,150,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,440,180,30);
        add(l9);

        adno = new JTextField();
        adno.setFont(new Font("Raleway",Font.BOLD,20));
        adno.setBounds(350,440  ,320,30);
        add(adno);

        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,490,180,30);
        add(l10);

        b1= new JRadioButton("Yes");
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setBackground(new Color(250,200,80));
        b1.setBounds(350,490,100,30);
        add(b1);

        b2= new JRadioButton("No");
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setBackground(new Color(250,200,80));
        b2.setBounds(460,490,100,30);
        add(b2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);

        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,540,180,30);
        add(l11);

        b3= new JRadioButton("Yes");
        b3.setFont(new Font("Raleway",Font.BOLD,15));
        b3.setBackground(new Color(250,200,80));
        b3.setBounds(350,540,100,30);
        add(b3);

        b4= new JRadioButton("no");
        b4.setFont(new Font("Raleway",Font.BOLD,15));
        b4.setBackground(new Color(250,200,80));
        b4.setBounds(460,540,100,30);
        add(b4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(b3);
        buttonGroup2.add(b4);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(670,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(760,10,100,30);
        add(l13);

        nextbutton = new JButton("Next");
        nextbutton.setFont(new Font("Raleway",Font.BOLD,15));
        nextbutton.setBackground(Color.white);
        nextbutton.setForeground(Color.black);
        nextbutton.setBounds(570,640,100,30);
        nextbutton.addActionListener(this);
        add(nextbutton);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(250,200,80));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String rel = (String)cb.getSelectedItem();
        String cat =(String)cb1.getSelectedItem();
        String inc = (String)cb2.getSelectedItem();
        String edu = (String)cb3.getSelectedItem();
        String occ = (String)cb4.getSelectedItem();
        String pan = textpan.getText();
        String addhar= adno.getText();

        String scitizen = " ";
        if(b1.isSelected())
        {
            scitizen = "Yes";
        }
        else if(b2.isSelected())
        {
            scitizen = "No";
        }

        String eaccount =" ";
        if(b3.isSelected())
        {
            eaccount = "Yes";
        }
        else if(b4.isSelected())
        {
            eaccount = "No";
        }

        try
        {
            if(textpan.getText().equals("") ||adno.getText().equals(""))
            {
                JOptionPane.showMessageDialog( null , "Enter All The Fields");
            }
            else
            {
                Conn c1 = new Conn();
                String db = "insert into signupone values('"+ formno+"' , '"+ rel+"' , '"+cat+"' , '"+inc+"','"+edu+"','"+occ+"', '"+pan+"','"+addhar+"' , '"+scitizen+"' , '"+eaccount+"')";
                c1.statement.executeUpdate(db);
                new SignUp2(formno);
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
        new SignUp1("");
    }

}
