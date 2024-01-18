import java.text.SimpleDateFormat;
import java.util.Date;
public class date {
    public static void main(String[] args){
        SimpleDateFormat s=new SimpleDateFormat("dd/mm/yy hh:mm:ss");
        Date date=new Date();
        System.out.println(s.format(date));
    }
}
public class Main {
  public static void main(String[] args) {
    System.out.println(java.time.LocalDate.now());
  }
}
public class Main {
  public static void main(String[] args) {
    System.out.println(java.time.LocalTime.now());
  }
}
public class Main {
   public static void main(String[] String) {  
   
    SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    s.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
    
    System.out.println(s.format(System.currentTimeMillis()));
 }
}