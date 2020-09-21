public class YourProgram {
    public static boolean multipleIfs(int x) {
        if(x == 5) {
            return true;
        }
        if(x == 8) {
            return true;
        }
        return false;
    }

    public static boolean condensed(int x) {
        if(x == 5 || x == 8) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(multipleIfs(5));
        System.out.println(multipleIfs(6));
        System.out.println(condensed(5));
        System.out.println(condensed(6));
    }
}