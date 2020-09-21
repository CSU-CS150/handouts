public class YourProgram {
    public static boolean nestedIf(int x) {
        if(x > 5) {
            if (x < 10) {
                return true;
            }
        }
        return false;
    }

    public static boolean condensed(int x) {
        if(x > 5 && x < 10) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nestedIf(8));
        System.out.println(nestedIf(3));
        System.out.println(condensed(8));
        System.out.println(condensed(3));
    }
}