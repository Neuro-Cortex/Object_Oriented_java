      import java.util.*;




public class hss11{
      
      
      public static void main(String args[])throws InterruptedException{
      HashSet<String> str =new HashSet<>();
      str.add("one");
      str.add("two");
      str.add("three");
      str.add("Four");
      str.add("Five");
      Iterator<String> i= str.iterator();


           while(i.hasNext()){
                   //String element=i.next();

                      System.out.println(i.next());
                        
                      Thread.sleep(100);
                                                  }
      

}   }


















/*import java.util.*;

public class hss11 {

    public static void main(String args[]) throws InterruptedException {
        HashSet<String> str = new HashSet<>();
        str.add("one");
        str.add("two");
        str.add("three");
        str.add("Four");
        str.add("Five");
        Iterator<String> i = str.iterator();
        
        while (i.hasNext()) {
            String element = i.next(); // Get the next element
            System.out.println(element); // Print the element
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        }
    }
}*/
