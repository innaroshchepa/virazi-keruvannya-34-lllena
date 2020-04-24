package domain;

/**
 * Main class
 * @author admin
 */

public class Exercise {
 /**
  * Main method for cheking if a given number is Armstrong`s number
  * @param Number
  * @return 
  */   
public static boolean Calculate(int Number) {
    int count=0;              //variable for the number of digits
    int num=Number;           //variable that store copies of the Number
    int Arm=0;                //variable to check for Armstrong number
    //create an array for 9 element
    int[] digits = new int[9];
    
    //fill the array and counting the number of digits in a number
    while(Number>0){
         digits[count]=Number%10;
         Number=Number/10;
         count++;
     }
    
    //we carry out mathematical operations
    for(int i=0;i<count;i++){
        Arm+=Math.pow(digits[i], count);
    }
    
    //check to belonging to Armstrong and return the result
    return num==Arm;
}
//end of method Calculate()

}
