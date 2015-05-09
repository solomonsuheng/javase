package DesignPattern.BusinessDelegatePattern;

/**
 * Created by Suheng on 5/9/15.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
