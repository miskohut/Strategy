package strategyimpl;

import strategyimpl.strategies.BossIsComing;
import strategyimpl.strategies.GoodMoodBoss;
import strategyimpl.strategies.NoBoss;

/**
 * Created by misko on 12.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Employee miso = new Employee("miso", new NoBoss());
        Employee jacob = new Employee("jacob", new NoBoss());

        miso.work();
        jacob.work();

        System.out.println("Secretary: 'BOSS!!!'");

        miso.changeStrategy(new BossIsComing());
        jacob.changeStrategy(new GoodMoodBoss());

        miso.work();
        jacob.work();
    }
}
