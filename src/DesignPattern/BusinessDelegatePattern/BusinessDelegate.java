package DesignPattern.BusinessDelegatePattern;

/**
 * Created by Suheng on 5/9/15.
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;


    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        this.businessService = this.lookupService.getBusinessService(this.serviceType);
        this.businessService.doProcessing();
    }
}
