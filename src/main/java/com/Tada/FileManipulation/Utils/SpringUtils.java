package com.Tada.FileManipulation.Utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SpringUtils {
	public static LocalDateTime getCurrentTimeUsingDate() {
	    Date date = new Date();
	    String strDateFormat = "dd/MM/yyyy hh:mm:ss a";
	    SimpleDateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	    String formattedDate= dateFormat.format(date);
	    System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
		/*return dateFormat;*/
		Timestamp ts=new Timestamp(System.currentTimeMillis());  
		return LocalDateTime.now();
	    
	}
	
	
	
	 public static String getCurrentDateTime() {
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
	        LocalDateTime now = LocalDateTime.now();
	        return (dtf.format(now));

	    }
	
}