package QLsach;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utility {
    public static String convertDateToString(Date datetime) {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        
        return format.format(datetime);
    }
    
    public static Date convertStringToDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        
        try {
            return format.parse(str);
        } catch (ParseException ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
