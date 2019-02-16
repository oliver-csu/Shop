package ren.oliver.shop.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import ren.oliver.shop.domain.Category;
import ren.oliver.shop.domain.Order;
import ren.oliver.shop.domain.Product;

public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

}
