package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JTextField tfusername;
    JPasswordField tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("USERNAME");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("PASSWORD");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.decode("#16348C"));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         setSize(600,300);
         setLocation(450,200);
         setVisible(true);
         
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            String username = tfusername.getText();
            char[] password = tfpassword.getPassword();
            String str = String.copyValueOf(password);
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+str+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                setVisible(true);
                tfpassword.setText("");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
         new Login();
     }
    
}
