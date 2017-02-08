package AST;

/**
 * Created by bpotiron on 06/02/2017.
 */
public class Function extends AST {

    private Head head;
    private Body body;

    public Function(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String gen() {
        return new StringBuilder("int " + this.head.gen() + " {\n" + this.body.gen() + "\n}\n").toString();

    }

    @Override
    public String toString() {
        return "Function(" + head + ", " + body + ")";
    }
}
