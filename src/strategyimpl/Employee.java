package strategyimpl;

/**
 * Created by misko on 12.1.2015.
 */
public class Employee {

    private Strategy strategy;
    private String name;

    public Employee(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void work() {
        strategy.command();
    }

    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
