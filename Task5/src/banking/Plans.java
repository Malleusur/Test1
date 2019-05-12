package banking;

import banking.observer.Observable;
import banking.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plans extends Account implements Observable {
    private static final String DEBIT = "Debit";
    private static final String CREDIT = "Credit";
    private static final String ERROR_ENOUGH_MONEY = "Not enough money";
    private String type;
    private double totalAmount = 100000;
    private double creditLine = 30000;
    private List<Observer> observers = new ArrayList<>();


    public void accountType() {
        System.out.println("Enter 1 for debit type or 2 for credit type account");

        Scanner sc = new Scanner(System.in);


        switch (sc.nextInt()) {
            case 1:
                type = DEBIT;
                break;

            case 2:
                type = CREDIT;
                break;

            default:
                System.out.println("This is not a range number please try again");
                accountType();
                break;
        }
    }

    public void addMoney(double amountAdd) {
        if (amountAdd < 0) {
            try {
                throw new RuntimeException();

            } catch (RuntimeException neg) {
                System.out.println("Add amount must be positive!");
            }
        }
        totalAmount = totalAmount + amountAdd;
        notifyObserver();
    }

    public void withdraw(double amountWithdraw) {
        if (type.equals(DEBIT)) {
            debitOperation(amountWithdraw);
        }
        if (type.equals(CREDIT)) {
            creditOperation(amountWithdraw);
        }
    }

    private void debitOperation(double amountWithdraw) {
        if (amountWithdraw <= totalAmount) {
            totalAmount -= amountWithdraw - getFee();
            notifyObserver();
        } else {
            System.out.println(ERROR_ENOUGH_MONEY);
        }
    }

    private void creditOperation(double amountWithdraw) {
        if (amountWithdraw <= (totalAmount + creditLine)) {
            totalAmount -= amountWithdraw - getFee();
            notifyObserver();
        } else {
            System.out.println(ERROR_ENOUGH_MONEY);
        }
    }

    private double getFee() {

        double fee;
        if (totalAmount >= 0) {
            fee = totalAmount / 100;
        } else {
            fee = totalAmount / 20;
        }
        return fee;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.handlerEvent(totalAmount);
        }
    }
}