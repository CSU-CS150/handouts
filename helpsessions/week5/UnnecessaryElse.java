public class YourProgram {
    public static boolean usingElse(int x) {
        if(x > 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean condensed(int x) {
        if(x > 5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(usingElse(8));
        System.out.println(usingElse(3));
        System.out.println(condensed(8));
        System.out.println(condensed(3));
    }
}