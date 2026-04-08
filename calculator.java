/*
import javax.swing.*;
import java.awt.*;




public class calculator extends JFrame {
      JButton btad,btsub,btdiv,btmult,btclr,btdel,btequ,btdot;
      JButton Numbt[];
      JTextField out;
      String previous, current,operator;

 calculator(){
      super("calculator ");
         
     
      JPanel mainPanel = new JPanel();


      JPanel row1 = JPanel();
      
      JPanel row2 = JPanel();
      
      JPanel row3 = JPanel();
      
      
      JPanel row4 = JPanel();
      
      JPanel row5 = JPanel();


  out = new JTextField(16);
               btad= new JButton("+");
               btsub=new JButton("-");
               btdiv= new JButton("/");                  btmult=  new JButton("*");
               btdot=new JButton(".");
               btequ= new JButton("=");
               btclr=new JButton("c");
               btdel=new JButton("D");


             Numbt= new JButton[11];
            
             Numbt[10]=btdot;
            
             for(int count 0; count<Numbt.length-1; count++){
                  Numbt[count]=new jBUtton(String.valueof(count));
                  Numbt[count].setFont(new Font("Monospacex", Font.BOLD, 22));}
             }  

btad.setFont(new Font("Monospaced", Font.BOLD, 22));
btsub.setFont(new Font("Monospaced", Font.BOLD, 22));
btmult.setFont(new Font("Monospaced", Font.BOLD, 22));
btdiv.setFont(new Font("Monospaced", Font.BOLD, 22));
btdel.setFont(new Font("Monospaced", Font.BOLD, 22));
btclr.setFont(new Font("Monospaced", Font.BOLD, 22));
btequ.setFont(new Font("Monospaced", Font.BOLD, 22));
btdot.setFont(new Font("Monospaced", Font.BOLD, 22));




https://www.section.io/engineering-education/how-to-build-a-java-gui-calculator-from-scratch-using-box-layout/#prerequisites
       








 }


            
      

      private JPanel JPanel() {
      return null;
}





      public static void main(String[] args) {
            
      new calculator();
      
      
      
      
      
      
      
      
      
      }}
*/