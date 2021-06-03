import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends  JFrame implements ActionListener
{

    Container c;
    JLabel l1,l2;
    JTextField user;
    JPasswordField pass;
    JButton b;
    
    
    public LoginForm()
    {
        setTitle("Login Form");
        setSize(400,300);
        
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l1.setBounds(10,50,100,20);
        l2.setBounds(10,100,100,20);
        c.add(l1);
        c.add(l2);
        user =new JTextField();
        user.setBounds(120,50,70,20);
        c.add(user);
        pass=new JPasswordField();
        pass.setBounds(120,100,70,20);
        c.add(pass);
        b=new JButton("Login");
        b.setBounds(100,150,70,20);
        c.add(b);
        b.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("username"+user.getText());
        System.out.println("Password"+pass.getText());
    }
    public static void main(String[] args)
    {
        LoginForm frame=new LoginForm();
        
    }
}
