package AST;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class Variableid extends AST {

    private String value;

    public Variableid(String value) {
        this.value = value;
    }

    public String getName() {
        return this.value;
    }

    @Override
    public String gen() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Variableid(" + this.value + ")";
    }
}
