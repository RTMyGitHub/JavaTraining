package com.eshop.dao;

import java.util.List;

public interface ProductsDAO {
	
	List<Product> getByOrderId(int orderId);
}
