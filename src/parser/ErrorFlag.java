package parser;

/**
 * Created by bpotiron on 16/01/2017.
 */
public class ErrorFlag {
    private static boolean errorFlag = false;

    public static void setFlag() {
        errorFlag = true;
    }

    public static void reset() {
        errorFlag = false;
    }

    public static boolean getErrorFlag() {
        return errorFlag;
    }
}
