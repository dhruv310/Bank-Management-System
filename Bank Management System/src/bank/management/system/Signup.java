package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton button1,button2 , ms1 , ms2 , ms3;
    JButton next;

    JDateChooser datechooser;
    JTextField textName , textFatherName , textemail, textadd , textCity , textPinCode , textState;
    Random r = new Random();
    long first=(r.nextLong()%9000L)+1000l;
    String f = " " +Math.abs(first);
    Signup()
    {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel jlabel1 =  new JLabel("Application Form No:" + f);
        jlabel1.setBounds(160,20,600,40);
        jlabel1.setFont(new Font("Raleway",Font.BOLD,38));
        add(jlabel1);

        JLabel jlabel2 = new JLabel("Page 1");
        jlabel2.setFont(new Font("Raleway",Font.BOLD,20));
        jlabel2.setBounds(330,70,600,30);
        add(jlabel2);

        JLabel jlabel3 = new JLabel("Personal Details");
        jlabel3.setFont(new Font("Raleway" ,Font.BOLD,20));
        jlabel3.setBounds(290,90,600,30);
        add(jlabel3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,15));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfathername = new JLabel("Father Name :");
        labelfathername.setFont(new Font("Raleway",Font.BOLD,20));
        labelfathername.setBounds(100,240,200,30);
        add(labelfathername);

        textFatherName = new JTextField();
        textFatherName.setFont(new Font("Raleway",Font.BOLD,15));
        textFatherName.setBounds(300,240,400,30);
        add(textFatherName);


        JLabel dateofbirth = new JLabel("Date of Birth :");
        dateofbirth.setFont(new Font("Raleway",Font.BOLD,20));
        dateofbirth.setBounds(100,340,200,30);
        add(dateofbirth);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        JLabel l1= new JLabel("Gender :");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(100,290,200,30);
        add(l1);

        button1 = new JRadioButton("Male");
        button1.setBackground(new Color(222,255,200));
        button1.setFont(new Font("Raleway",Font.BOLD,15));
        button1.setBounds(300,290,60,30);
        add(button1);

        button2 = new JRadioButton("Female");
        button2.setBackground(new Color(222,255,200));
        button2.setFont(new Font("Raleway",Font.BOLD,15));
        button2.setBounds(450,290,90,30);
        add(button2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);

        JLabel labelemail = new JLabel("Email Address :");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,15));
        textemail.setBounds(300,390,400,30);
        add(textemail);

        JLabel labelms = new JLabel("Maritial Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,440,200,30);
        add(labelms);

        ms1 = new JRadioButton("Married");
        ms1.setBackground(new Color(222,255,200));
        ms1.setBounds(300,440,100,30);
        add(ms1);

        ms2 = new JRadioButton("Unmarried");
        ms2.setBackground(new Color(222,255,200));
        ms2.setBounds(450,440,100,30);
        add(ms2);

        ms3 = new JRadioButton("Other");
        ms3.setBackground(new Color(222,255,200));
        ms3.setBounds(635,440,100,30);
        add(ms3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(ms1);
        buttonGroup1.add(ms2);
        buttonGroup1.add(ms3);



        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,15));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,15));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelpincode = new JLabel("Pin code :");
        labelpincode.setFont(new Font("Raleway",Font.BOLD,20));
        labelpincode.setBounds(100,590,200,30);
        add(labelpincode);

        textPinCode = new JTextField();
        textPinCode.setFont(new Font("Raleway",Font.BOLD,15));
        textPinCode.setBounds(300,590,400,30);
        add(textPinCode);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,15));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,15));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,680,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,200));
        setLayout(null);
        setVisible(true);
        setSize(850,800);
        setLocation(360,40);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = f;
        String name = textName.getText();
        String fname = textFatherName.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(button1.isSelected())
        {
            gender = "Male";
        }
        else {
            gender = "Female";
        }
        String email =  textemail.getText();
        String marital = null;
        if(ms1.isSelected())
        {
            marital="Married";

        }
        else if(ms2.isSelected())
        {
            marital = "Unmarried";
        }
        else {
            marital = "Other";
        }
        String address = textadd.getText();
        String city = textCity.getText();
        String pincode =textPinCode.getText();
        String state = textState.getText();

        try
        {
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null , "Fill all the fields");
            }
            else
            {
                Conn con1 = new Conn();
                String s="insert into signup values('"+formno+"' , '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' , '"+email+"' , '"+marital+"' , '"+address+"' , '"+city+"' , '"+pincode+"' , '"+state+"')";
                con1.statement.executeUpdate(s);
                new SignUp1(formno);
                setVisible(false);
            }
        }
        catch(Exception E)
        {
            E.getStackTrace();
        }

    }
    public static void main(String[] args)
    {
        new Signup();
    }


}
