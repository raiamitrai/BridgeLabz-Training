package annotation.customannotation.logexecutiontime;

public class Service {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000; i++) {
            // light work
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 10_000_000; i++) {
            // heavy work
        }
    }

    public void helperMethod() {
        // normal method (no annotation)
    }
}
