import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Atakan","Keçeci","1234567890",LocalDate.of(1999,1,18));
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.Save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.Save(customer1);

	}

}
