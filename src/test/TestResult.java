package test;
import static domain.Exercise.Calculate;

/**
 * test class
 * @author admin
 */
public class TestResult {
  public static void main(String[] args) {
     int number = 145236987;
     if(Calculate(number)){
         System.out.println("Число "+number+" є числом Армстронга");
     }  
     else{
         System.out.println("Число "+number+" не є числом Армстронга");
     }  
}
}
