package strategyimpl.strategies;

import strategyimpl.Strategy;

/**
 * Created by misko on 12.1.2015.
 */
public class NoBoss implements Strategy {

    @Override
    public void command() {
        System.out.println("No boss today. Beer?");
    }
}
