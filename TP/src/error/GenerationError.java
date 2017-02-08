package error;

/**
 * Created by bpotiron on 25/01/2017.
 */
public class GenerationError extends RuntimeException {
    public GenerationError(String s) {
        System.err.println("Generation Error : " + s);
        printStackTrace();
    }
}
