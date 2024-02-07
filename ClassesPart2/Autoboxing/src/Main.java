import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);
        Integer deprecatedBoxing = new Integer(15);
        int unboxedInt = boxedInt.intValue();

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDouble();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new  Integer[5];
        wrapperArray[0] = 50;
        wrapperArray[1] = 20;
        wrapperArray[2] = 70;
        wrapperArray[3] = 10;
        wrapperArray[4] = 60;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[3].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(characterArray));


    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);

    }
    private static double getLiteralDouble(){
        return 100.0;
    }
}