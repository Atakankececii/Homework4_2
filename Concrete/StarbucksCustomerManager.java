package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private ICustomerCheckService customerCheckService;
	 
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }
	    
	
	@Override
	public void Save(Customer customer) {
		  if (customerCheckService.CheckIfRealPerson(customer)) {
	            super.Save(customer);
	        }else {
	            try {
	                throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
	            }
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	}

	
}
