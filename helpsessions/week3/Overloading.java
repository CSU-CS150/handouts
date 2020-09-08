public class YourProgram {

   public static int multiplyNums(int x, int y){
      return x *y;
   }
   
   public static int multiplyNums(int x , int y, int z){
      return x * y* z; //can you resuse a method here?
   }
   
   
   public static void main(String[] args) {
   System.out.println(multiplyNums(2,3));
   System.out.println(multiplyNums(2,2,3));
   
   }
}
