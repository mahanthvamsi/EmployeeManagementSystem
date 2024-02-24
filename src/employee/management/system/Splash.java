package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class Splash extends JFrame implements ActionListener {
    
    Splash(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(250,0,900,600);
        heading.setFont(new Font("rubic",Font.BOLD,40));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel logo1 = new JLabel("Bharat Heavy Electricals Limited ");
        logo1.setBounds(142,65,500,58);
        logo1.setFont(new Font("Formula-Serial",Font.BOLD,28));
        logo1.setForeground(Color.WHITE);
        add(logo1);
        
        JLabel logo2 = new JLabel("Powering Progress,Brightening Lives Touching Every Indian Home");
        logo2.setBounds(162,95,500,58);
        logo2.setFont(new Font("Column Sans",Font.ITALIC,13));
        logo2.setForeground(Color.WHITE);
        add(logo2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(90,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,57,120,100);
        add(image);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/front59.jpg"));
        Image i22 = i11.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i33);
        image2.setBounds(0,0,1170,650);
        add(image2);
        
        JButton clickhere = new JButton("LOGIN");
        clickhere.setBounds(960,95,120,25);
        clickhere.setBackground(Color.WHITE);
        clickhere.setFont(new Font("Raleway",Font.BOLD,20));
        clickhere.setForeground(Color.WHITE);
        clickhere.setBackground(Color.decode("#16348C"));
        clickhere.addActionListener(this);
        clickhere.setBorderPainted(false);
        clickhere.setFocusPainted(false);
        image2.add(clickhere);
   
        
        setSize(1170,650);
        setLocation(250,100);
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(0);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String args[]){
        new Splash();
    }
}
