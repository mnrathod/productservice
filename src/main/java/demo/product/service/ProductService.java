package demo.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.product.dao.ProductRepository;
import demo.product.domain.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Transactional
	public List<Product> findByName(String name) {
		return productRepository.findByName(name);
	}
	
	@Transactional
	public Product getById(Integer id) {
		return productRepository.findById(id).get();
	}
	
	@Transactional
	public boolean addProduct(Product product) {
		return productRepository.save(product)  != null;
	}

	@Transactional
	public boolean updateProduct(Product product) {
		return productRepository.save(product)  != null;
	}

	@Transactional
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

}
