package lab3;

import java.util.Arrays;

public class Customer {
    private String firstName;
    private String lastName;

    private String socSecurityNum;

    private Address billingAddress;

    private Address shippingAddress;

    Customer(String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return  "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";

    }

    public static void main(String[] args) {
            Customer c1 = new Customer("John","Doe","13455434");
            Customer c2 = new Customer("Barn","Sine","48293");
            Customer c3 = new Customer("Tina","Dave","9484855");

            Address add1 = new Address("st.louis","Chicago","Chicago","44343");
            Address add2 = new Address("jasper","NY","New York","642244");
            Address add3 = new Address("23s","Detroit","Michigan","948474");

            c1.setBillingAddress(add1);
            c1.setShippingAddress(add1);
            c2.setBillingAddress(add2);
            c2.setShippingAddress(add2);
            c3.setBillingAddress(add2);
            c3.setShippingAddress(add2);

            Customer[] customerArray = new Customer[3];
            customerArray[0] = c1;
            customerArray[1] = c2;
            customerArray[2] = c3;


        for (Customer customer : customerArray) {
            Address billingAddress = customer.getBillingAddress();
            if (billingAddress.getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }

    }

}
