import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;





public class gui4 extends JFrame{
      private JTextField tf;
      private JTextField tr;
      private Container d ;
      
      private JLabel l;
gui4(){
      yyy();
}
public void yyy(){
      d=this.getContentPane();
      d.setLayout(null);
      d.setBackground(Color.BLACK);

      l=new JLabel();
      l.setBackground(Color.WHITE);
      l.setBounds(100,140,140,130);
      l.setText("what is on your mind.");
      d.add(l);


      tf=new JTextField();
      tr=new JTextField();
      tr.setBackground(Color.RED);
      tf.setBackground(Color.WHITE);
      tf.setBounds(100,100,100,30);
     tr.setBounds(100,200,100,30);
      d.add(tf);
      d.add(tr);



  tf.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
         
            String s= tf.getText();
            tr.setText(s);
      
      }}); }
   
      


public static void main(String[] args) {
      gui4 w= new gui4();
      w.setVisible(true);
      w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      w.setBounds(600,600,600,600);
           w.setTitle("kire");
}
            
}
