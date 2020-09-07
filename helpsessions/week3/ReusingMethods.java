public class YourProgram {
   
   public static double cmToMeters(double cm){
    return cm/100;  
   }
   
   public static double cmToMiles(double cm){
    return cmToMeters(cm) / 1609;  
   }
   
   public static void main(String[] args) {
      double centimeters = 50000;
      System.out.println("Meters: " + cmToMeters(centimeters));
      System.out.println("Miles: " + cmToMiles(centimeters));
   }
}
