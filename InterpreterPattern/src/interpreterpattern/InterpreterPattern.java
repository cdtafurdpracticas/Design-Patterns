/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreterpattern;

/**
 *
 * @author cristian
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class InterpreterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ){
 
    System.out.println("Please select the Date Format: 'MM-DD-YYYY' or 'YYYY-MM-DD' or 'DD-MM-YYYY' ");
    Scanner scanner = new Scanner(System.in);
    String inputDate = scanner.next();
 
    Format format = new Format();
    format.setFormat(format);
    format.setDate(new Date());
 
    ArrayList formatOrderList = getFormatOrder(format);
 
    System.out.println("Input : " + format.getFormat() + " : " + new Date());
 
    for( AbstractFormat abstractFormat : formatOrderList )
    {
      abstractFormat.execute(format);
      System.out.println(abstractFormat.getClass().getName() + " 
      Executed: " + format.getFormat());
 
    }
 
    System.out.println("Output : " + format.getFormat());
  }
 
  private static ArrayList getFormatOrder( Format format)
  {
    ArrayList formatOrderList = new
    ArrayList();
    String[] strArray = format.getFormat().split("-");
    for( String string : strArray )
    {
      if( string.equalsIgnoreCase("MM") )
      {
        formatOrderList.add(new MonthFormat());
      }
      else if( string.equalsIgnoreCase("DD") )
      {
        formatOrderList.add(new DayFormat());
      }
      else
      {
        formatOrderList.add(new YearFormat());
      }
 
    }
    return formatOrderList;
  }
    
}
