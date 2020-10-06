public class YourProgram {
   public static int getHour(String time) {
      int start = 0;
      int end = time.indexOf(":");
      String hour = time.substring(start, end);
      return Integer.parseInt(hour);
   }
   
   public static int getMinute(String time) {
      int start = time.indexOf(":") + 1;
      int end = time.lastIndexOf(":");
      String minute = time.substring(start, end);
      return Integer.parseInt(minute);
   }
   
   public static int getSecond(String time) {
      int start = time.lastIndexOf(":") + 1;
      int end = time.indexOf(" ");
      String second = time.substring(start, end);
      return Integer.parseInt(second);
   }
   
   // Note that this method does not do padding for simplicity
   public static String toMilitary(String time) {
      int hour = getHour(time);
      
      // Midnight and noon get set to 0
      if(hour == 12) {
         hour = 0;
      }
      
      // Second to last character will be 'A' or 'P'
      char period = time.charAt(time.length() - 2);
      
      // Add 12 if PM
      if(period == 'P') {
         hour += 12;
      }
      
      // Get minutes and seconds
      int start = time.indexOf(":");
      int end = time.indexOf(" ");
      String restOfTime = time.substring(start, end);
      
      return hour + restOfTime;
   }
   
   public static void main(String[] args) {
      String breakfast = "10:13:48 AM";
      
      System.out.println("Breakfast time: " + breakfast);
      System.out.println("Breakfast hour: " + getHour(breakfast));
      System.out.println("Breakfast minute: " + getMinute(breakfast));
      System.out.println("Breakfast second: " + getSecond(breakfast));
      System.out.println("Breakfast military: " + toMilitary(breakfast));
      System.out.println();
      
      String dinner = "6:36:8 PM";
      
      System.out.println("Dinner time: " + dinner);
      System.out.println("Dinner hour: " + getHour(dinner));
      System.out.println("Dinner minute: " + getMinute(dinner));
      System.out.println("Dinner second: " + getSecond(dinner));
      System.out.println("Dinner military: " + toMilitary(dinner));

   }
}
