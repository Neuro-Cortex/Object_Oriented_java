import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class fileread {
 public static void main(String[] args) {
      try
      {
            File f= new File("C://Users//User//Downloads//current 1//student.text");
      Scanner sc = new Scanner(f);
      while(sc.hasNext()){
            String s = sc.next();
            System.out.println(s);
      } sc.close();

}
catch(FileNotFoundException e ){
      System.out.println(e);
}
}


}

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/User/Downloads/current 1/student.text");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String s = sc.next();
                System.out.println(s);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
}
*/