package strategyimpl.strategies;

import strategyimpl.Strategy;

/**
 * Created by misko on 12.1.2015.
 */
public class BossIsComing implements Strategy {

    @Override
    public void command() {
        System.out.println("Boss is coming, so pretend you're working.");
    }
}
