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
import java.util.Date;
 
public class YearFormat extends AbstractFormat
{
 
  @Override
  public void execute( Format format )
  {
    String format1 = format.getFormat();
    Date date = format.getDate();
    Integer year = new Integer(date.getYear() + 2000);
    String tempFormat = format1.replaceAll("YYYY", year.toString());
    format.setFormat(tempFormat);
  }
} 