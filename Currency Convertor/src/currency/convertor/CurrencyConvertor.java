
package currency.convertor;

import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class CurrencyConvertor {

  public static void main(String[] args){
    double Yen = 0.0;
    double Result = 0.0;
    
    Scanner ScanTheObject = new Scanner(System.in);
    
    System.out.println("Please Enter The Amount Of Yen You Would Like To Convert To GBP");
    Yen = ScanTheObject.nextInt();
    
    Result = Yen / 142.67;
    
    
    System.out.println("The Amount Of GBP Is: "+Result);
    
  }
  
  
}