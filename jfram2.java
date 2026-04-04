import javax.swing.JFrame;

class Test extends JFrame{


Test(){
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(300,300,300,300);
      setTitle("This is first program!");
}
}

public class jfram2 {
      public static void main(String[] args) {
            Test t1 = new Test();
    
     t1.setVisible(true);



      }
      
}
