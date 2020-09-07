public class YourProgram {

   public static void printText(String text, int num, double x){
    System.out.println(text + num + " or " + x + "?");  
   }
   
   public static void main(String[] args) {
   String str = "Is the Ultimate Answer to Life, the Universe, and Everthing ";
   int ans = 42;
   double ans1 = 42;
   printText(str, ans, ans1);
   }
}
