package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
			//Spring IoC ile çözülecek
			ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
			Product product1 = new Product(1,2,"Laptop",3,4);
			productService.add(product1);
	}

}
