package strategyimpl.strategies;

import strategyimpl.Strategy;

/**
 * Created by misko on 12.1.2015.
 */
public class GoodMoodBoss implements Strategy {

    @Override
    public void command() {
        System.out.println("Boss: 'Hey guys! Beer after work?' :)");
    }
}
