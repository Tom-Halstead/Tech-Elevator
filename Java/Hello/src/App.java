// import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("I am enjoying learning the ins and outs of Java");
        String result = addExclamationPoint("Hello");
        System.out.println(result);
        Integer average = returnAverage(61, 22, 322);
        System.out.println(average);

        // AppExtra test = new AppExtra();
        String intro = AppExtra.introString();
        System.out.println(intro);
        String introAndExcla = addExclamationPoint(intro);
        System.out.println(introAndExcla);

        int intArray[];
        intArray = new int[2];
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray.length);

    }




    public static String addExclamationPoint(String s) {
        return s + "!";
    }

    public static int returnAverage(int i, int x, int z) {
        return (i + x + z) / 3;
    }


}

