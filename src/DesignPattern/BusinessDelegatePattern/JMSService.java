package DesignPattern.BusinessDelegatePattern;

/**
 * Created by Suheng on 5/9/15.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
