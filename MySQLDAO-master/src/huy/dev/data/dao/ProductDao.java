package huy.dev.data.dao;

import huy.dev.data.model.Product;

public interface ProductDao {

	public boolean insert(Product product);
	public boolean update(Product product);
	public boolean delete(int id);
	
}
