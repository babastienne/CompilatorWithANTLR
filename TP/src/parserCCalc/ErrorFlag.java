package parserCCalc;

/**
 * Created by bpotiron on 25/01/2017.
 */
public class ErrorFlag {
    private static boolean errorFlag = false;

    public static void setFlag() {
        errorFlag = true;
    }

    public static void resetFlag() {
        errorFlag = false;
    }

    public static boolean getErrorFlag() {
        return errorFlag;
    }
}
