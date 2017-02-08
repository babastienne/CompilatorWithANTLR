package error;

/**
 * Created by bpotiron on 25/01/2017.
 */
public class SyntaxError extends RuntimeException {

    public SyntaxError() {

    }

    public SyntaxError(String message) {
        System.out.println("Syntax Error : " + message);
    }
}
