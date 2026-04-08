import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class file {
      public static void main(String[] args) {
            












            try{Formatter mat = new Formatter("C:/Users/User/Downloads/current 1/student.text");
           System.out.println("How many student your have:?");
           Scanner sc = new Scanner(System.in); 
           int ss=sc.nextInt();






            for(int i=0; i<ss; i++){ 

              int Id;
           System.out.println("enter student id :");
           Id = sc.nextInt();
          
           String Name;
              System.out.println("enter your name:");
          Name=sc.next();
           
          
          

                 
            
           /* for (int i = 0; i < ss; i++) {
              System.out.print("Enter student ID for student " + (i + 1) + ": ");
              int Id = sc.nextInt();
              System.out.print("Enter student name for student " + (i + 1) + ": ");
              String Name = sc.next();*/
          mat.format("%d %s %n", Id, Name);
            }

           mat.close();
           sc.close();


          System.out.println("Data is Writing to the file.");
            }
             
         
           























            
      catch(FileNotFoundException e){
              System.out.println(e);}
                        
            
       
      }
      }
