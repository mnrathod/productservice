package demo.product.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.product.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
    List<Product> findByName(String name);
}
