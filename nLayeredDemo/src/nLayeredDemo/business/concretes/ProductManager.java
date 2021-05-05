package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{

	private ProductDao dao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao dao,LoggerService loggerService) {
		super();
		this.dao = dao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		
		//�� kodlar�
		
		if(product.getCategoryId() == 1) {
			
			System.out.println("Bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		this.dao.add(product);
		this.loggerService.logToSystem(" �r�n eklendi: " + product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	
	

}
