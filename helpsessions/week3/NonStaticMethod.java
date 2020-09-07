public class YourProgram {
   public int addTen(int x){
      int res = x + 10;
      return res; // How would you do this in 1 line?
   }
   public static void main(String[] args) {
      YourProgram myProg = new YourProgram();
      int res = myProg.addTen(13);
      System.out.println(res);
   }
}
