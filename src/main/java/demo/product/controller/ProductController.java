package demo.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.product.domain.Product;
import demo.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService; 
	
	@PostMapping("/addProduct")
	public String addProduct (@RequestBody Product product) {
		boolean status = productService.addProduct(product);
		return "success";
	}

	@PostMapping("/updateProduct")
	@ResponseBody 
	public HttpStatus updateProduct (@RequestBody Product product) {
		return productService.updateProduct(product)? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@GetMapping("/product/{id}")
	public @ResponseBody Product getProduct(@PathVariable Integer id) {
		return productService.getById(id);
	}

	@GetMapping("/ProductByName/{name}")
	public List<Product> getProductByName(@PathVariable String name) {
		return productService.findByName(name);
	}

	@GetMapping("/products")
	public List<Product> getAll() {
		return productService.getAllProducts();
	}

}
