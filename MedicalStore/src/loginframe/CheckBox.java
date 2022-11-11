
package loginframe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckBox extends JFrame {
    
private Container c;  
 private JTextField tf;
 private ButtonGroup grp;
 private Font f;
 private JRadioButton bKashButton, DebitCardButton;
  private JLabel aLabel, bLabel, cLabel, dLabel, eLabel, fLabel, gLabel,hLabel, imgLabel;
  private JCheckBox aCheckBox, bCheckBox, cCheckBox,
dCheckBox, eCheckBox, fCheckBox, gCheckBox, hCheckBox, iCheckBox, jCheckBox;      
private JButton nextButton;
private ImageIcon img,ico;
private Cursor cursor;
private JComboBox a,b,co,d,e;
private String [] quantity = {"0","1","2","3","4","5"};


 
CheckBox(){
    initComponents();
    
}
    public void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,700,600);
        this.setTitle("Choose your medicines");
    
        ico = new ImageIcon(getClass().getResource("medipic.jpg"));
         this.setIconImage(ico.getImage());
      
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        a = new JComboBox(quantity);
        a.setBounds(310,100,40,30);
        a.setEditable(true);
        c.add(a);
        
        b = new JComboBox(quantity);
        b.setBounds(310,150,40,30);
        b.setEditable(true);
        c.add(b);
        
        co = new JComboBox(quantity);
        co.setBounds(310,200,40,30);
        co.setEditable(true);
        c.add(co);
        
        d = new JComboBox(quantity);
        d.setBounds(310,250,40,30);
        d.setEditable(true);
        c.add(d);
        
        e = new JComboBox(quantity);
        e.setBounds(310,300,40,30);
        e.setEditable(true);
        c.add(e);
        
        
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
       
        img = new ImageIcon(getClass().getResource("medipic.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(400,360,260,130);
                
                
	aLabel = new JLabel ("Please choose your medicines from below: ");
        aLabel.setBounds(50,20,250,50);
        
        bLabel = new JLabel ("Select payment method from below: ");
        bLabel.setBounds(50,350,250,50);
        
        cLabel = new JLabel ("Pin");
        cLabel.setBounds(50,480,160,50);
        
        dLabel = new JLabel ("Price");
        dLabel.setBounds(170,50,250,50);
        
         eLabel = new JLabel ("Price");
         eLabel.setBounds(600,50,250,50);
         
         fLabel = new JLabel ("Product Name");
         fLabel.setBounds(30,50,250,50);
        
        gLabel = new JLabel ("Product Name");
        gLabel.setBounds(410,50,250,50);
        
        hLabel = new JLabel ("Quantity");
        hLabel.setBounds(310,50,250,50);
        
        c.add(aLabel);
        c.add(bLabel);
        c.add(cLabel);
        c.add(dLabel);
        c.add(eLabel);
        c.add(fLabel);
        c.add(gLabel);
        c.add(hLabel);
        c.add(imgLabel);

        aCheckBox = new JCheckBox("NAPA (100mg)                   BDT125.51Tk");
        aCheckBox.setBounds(10,100,280,30);
        aCheckBox.setBackground(Color.PINK);
        aCheckBox.setCursor(cursor);
        c.add(aCheckBox);
        
        bCheckBox = new JCheckBox("Omiplazol (50mg)                        BDT718.49Tk");
        bCheckBox.setBounds(390,100,300,30);
        bCheckBox.setBackground(Color.PINK);
        bCheckBox.setCursor(cursor);
        c.add(bCheckBox);
        
        cCheckBox = new JCheckBox("Parapyrol (100mg)           BDT50.02Tk");
        cCheckBox.setBounds(10,150,280,30);
        cCheckBox.setBackground(Color.PINK);
        cCheckBox.setCursor(cursor);
        c.add(cCheckBox);
        
        dCheckBox = new JCheckBox("Histasin (50mg)                            BDT35.09Tk");
        dCheckBox.setBounds(390,150,300,30);
        dCheckBox.setBackground(Color.PINK);
        dCheckBox.setCursor(cursor);
        c.add(dCheckBox);
        
        eCheckBox = new JCheckBox("Tylenol (100mg)                BDT340.70Tk");
        eCheckBox.setBounds(10,200,280,30);
        eCheckBox.setBackground(Color.PINK);
        eCheckBox.setCursor(cursor);
        c.add(eCheckBox);
        
        fCheckBox = new JCheckBox("Ibuprofen (150mg)                       BDT1329.78Tk");
        fCheckBox.setBounds(390,200,300,30);
        fCheckBox.setBackground(Color.PINK);
        fCheckBox.setCursor(cursor);
        c.add(fCheckBox);
        
        gCheckBox = new JCheckBox("Tums (100mg)                   BDT213.67Tk");
        gCheckBox.setBounds(10,250,280,30);
        gCheckBox.setBackground(Color.PINK);
        gCheckBox.setCursor(cursor);
        c.add(gCheckBox);
        
        hCheckBox = new JCheckBox("Peptopis (80mg)                          BDT415.00Tk");
        hCheckBox.setBounds(390,250,300,30);
        hCheckBox.setBackground(Color.PINK);
        hCheckBox.setCursor(cursor);
        c.add(hCheckBox);
        
        iCheckBox = new JCheckBox("Seclo (500mg)                   BDT489.13Tk");
        iCheckBox.setBounds(10,310,280,30);
        iCheckBox.setBackground(Color.PINK);
        iCheckBox.setCursor(cursor);
        c.add(iCheckBox);
        
        jCheckBox = new JCheckBox("Tylace (90mg)                              BDT148.23Tk");
        jCheckBox.setBounds(390,310,300,30);
        jCheckBox.setBackground(Color.PINK);
        jCheckBox.setCursor(cursor);
        c.add(jCheckBox);
        
        nextButton = new JButton("Next");
        nextButton.setBounds(450,510,180,40);
        nextButton.setCursor(cursor);
        c.add(nextButton);
        
      
       
        f = new Font("Arial",Font.BOLD,18);


grp = new ButtonGroup();


bKashButton = new JRadioButton("bKash");
bKashButton.setBounds(50,400,100,50);
bKashButton.setBackground(Color.RED);
bKashButton.setFont(f);
bKashButton.setCursor(cursor);
c.add(bKashButton);

DebitCardButton = new JRadioButton("DebitCard");
DebitCardButton.setBounds(160,400,160,50);
DebitCardButton.setBackground(Color.YELLOW);
DebitCardButton.setFont(f);
DebitCardButton.setCursor(cursor);
c.add(DebitCardButton);

grp.add(bKashButton);
grp.add(DebitCardButton);


tf = new JTextField();
tf.setBounds(150,480,160,50);
c.add(tf);


nextButton.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
               String Pin = tf.getText();
               
                 if (Pin.equals("0") || Pin.equals("1") || Pin.equals("2") || Pin.equals("3") || Pin.equals ("4") || Pin.equals ("5") || Pin.equals ("6") || Pin.equals ("7") ||Pin.equals ("8") ||Pin.equals ("9") ){
                   
                   JOptionPane.showMessageDialog(null,"Thank you for buying medicines from us.\nYour will receive your medicines soon. ","Thank You",1);
                     dispose();
                 
               }
                 else{
                   JOptionPane.showMessageDialog(null,"Please select a single valid pin number to buy medicines","Something went wrong",2);
                 }
            }





});
        
        
      
}
    public static void main(String[] args) {
        CheckBox frame = new CheckBox();
         frame.setVisible(true);
    }
} 
    
  
