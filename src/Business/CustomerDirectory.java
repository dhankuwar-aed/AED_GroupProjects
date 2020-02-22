/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Girija Dhawale
 */
public class CustomerDirectory {
      private ArrayList<Customer> customerDirect;

    public ArrayList<Customer> getCustomerDirect() {
        return customerDirect;
    }

    public void setCustomerDirect(ArrayList<Customer> customerDirect) {
        this.customerDirect = customerDirect;
    }
      
      public CustomerDirectory(){
         customerDirect = new ArrayList<Customer>();
         
}
      
      public Customer addCustomer(){
          Customer c = new Customer();
          customerDirect.add(c);
       return c;
      }
      
      public void removeCustomer(Customer c){
      customerDirect.remove(c);
      }
}
