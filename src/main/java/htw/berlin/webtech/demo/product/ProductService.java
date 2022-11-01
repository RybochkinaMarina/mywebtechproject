package htw.berlin.webtech.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public ProductEntity save(ProductEntity product){
        return repo.save(product);
    }
    
    public ProductEntity get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }
}
