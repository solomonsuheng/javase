package DesignPattern.BusinessDelegatePattern;

/**
 * Created by Suheng on 5/9/15.
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
