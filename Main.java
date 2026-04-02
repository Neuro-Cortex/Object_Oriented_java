public class Main{
      public static void main(String[] args) {
        String name="TTT";

        try{
                    int a=Integer.parseInt(name);
                    System.out.println(a);
        }


          catch(NumberFormatException e){
                        System.out.println("Sttring     "+name+"   Catched");
                    }


                System.out.println("\n This is from main.");    
       
        
      }
}
  