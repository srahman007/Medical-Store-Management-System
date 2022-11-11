
package loginframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class LoginFrame extends JFrame{

     private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Container c;
    private Font f;
    private Cursor cursor;
    private ImageIcon ico;
         
    
    LoginFrame(){
          
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,420,350);
        this.setTitle("GOMTI MEDICAL STORE");
        
          ico = new ImageIcon(getClass().getResource("medipic.jpg"));
         this.setIconImage(ico.getImage());
         
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
    cursor = new Cursor(Cursor.HAND_CURSOR);
    
   
    
 
userLabel = new JLabel("UserName : ");
userLabel.setBounds(50,50,150,50);
userLabel.setFont(f);
c.add(userLabel);


tf = new JTextField();
tf.setFont(f);
tf.setBounds(170,50,200,50);
c.add(tf);


passLabel = new JLabel("Password : ");
passLabel.setBounds(50,120,150,50);
passLabel.setFont(f);
c.add(passLabel);


pf = new JPasswordField();
pf.setFont(f);
pf.setBounds(170,120,200,50);
c.add(pf);


loginButton = new JButton ("Login");
loginButton.setBounds(170,190,90,50);
loginButton.setFont(f);
loginButton.setCursor(cursor);
c.add(loginButton);

clearButton = new JButton ("Clear");
clearButton.setBounds(280,190,90,50);
clearButton.setFont(f);
clearButton.setCursor(cursor);
c.add(clearButton);

clearButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText("");
                pf.setText("");
            }



});

loginButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
               String userName = tf.getText();
               String password = pf.getText();
               
               if(userName.equals("user") && password.equals("123")){
                   
                   JOptionPane.showMessageDialog(null,"Welcome to GOMTI MEDICAL SHOP...You logged in Successfully...!!!","Login Successful...!!!",-1);
                     dispose();
                 CheckBox frame = new CheckBox();
    frame.setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Invalid username or password","Wrong userName or password...!!!",0);
               }
            
            
            
            }



});


    }

  
    public static void main(String[] args) {
       
          LoginFrame frame = new LoginFrame();
       frame.setVisible(true);
    }
    
}
