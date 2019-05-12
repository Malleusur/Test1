package banking.observer;



public class Subscriber implements Observer {
    private static final String TOTAL_AMOUNT = "Total amount: ";

    @Override
    public void handlerEvent(double totalAmount) {
        System.out.println(TOTAL_AMOUNT + totalAmount);
    }
}
