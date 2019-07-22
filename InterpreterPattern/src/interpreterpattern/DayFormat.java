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
 
public class DayFormat extends AbstractFormat
{
 
  @Override
  public void execute( Format format )
  {
    String format1 = format.getFormat();
    Date date = format.getDate();
    Integer day = new Integer(date.getDate());
    String tempFormat = format1.replaceAll("DD", day.toString());
    format.setFormat(tempFormat);
  }
} 