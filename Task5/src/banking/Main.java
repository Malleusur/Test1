package banking;

import banking.observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        Plans plans = new Plans();
        plans.addObserver(new Subscriber());
        plans.accountType();
        plans.addMoney(-10000);
        plans.withdraw(1000);
    }
}


