public class ArraySearch {
    public static void main(String args[]) {
        String[] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation"};
        System.out.println(searchArray("polymorphism", concepts));
        System.out.println(searchArray("inheritance", concepts));

        String[] pasttimes = {"long walks", "sunrises", "sunsets", "skipping rocks"};

        System.out.println(searchArray("sunsets", pasttimes));
        System.out.println(searchArray("breakdancing", pasttimes));

    }

    public static boolean searchArray(String target, String[] array) {
        boolean result = false;
        for (String element : array) {
            if ((element != null) && (element.equals(target))) {
                result = true;
                break;
            }
        }
        return result;
    }
        
    public static boolean searchArray(int target, int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }
    
}