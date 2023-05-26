/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coit12200.waste.management;

/**
 *
 * @author 12195928
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String mobile;
    private int serviceCounter;

    public Customer(String firstName, String lastName, String address, String email, String mobile, int serviceCounter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.serviceCounter = serviceCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getServiceCounter() {
        return serviceCounter;
    }

    public void setServiceCounter(int serviceCounter) {
        this.serviceCounter = serviceCounter;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" 
                + lastName + ", address=" + address + ", email=" + email 
                + ", mobile=" + mobile + ", serviceCounter=" + serviceCounter + '}';
    }
    
    
}
