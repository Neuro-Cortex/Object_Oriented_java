public class Main1 {
    
            public static void main(String[] args) {
              String name="TTT";
      
              try{
                          int a=Integer.parseInt(name);
                          System.out.println(a);
              }
      
      
                catch(ArithmeticException e){
                              System.out.println("Sttring     "+name+"   Catched");
                          }
      
      
                      System.out.println("\n This is from main.");    
             
              
            }
  
              
}
