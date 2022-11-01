package htw.berlin.webtech.demo.product;

import htw.berlin.webtech.demo.user.User;
import htw.berlin.webtech.demo.user.UserCreateOrUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> fetchProducts(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/products")
    public ProductEntity createProduct(@RequestBody ProductEntity product){
        return service.save(product);
    }

    @GetMapping("/products/{id}")
    public ProductEntity getProduct(@PathVariable String id){
        Long productId = Long.parseLong(id);
        return service.get(productId);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody ProductCreateOrUpdateRequest request ){
        var product = service.update(id, request);
        return  product != null? ResponseEntity.ok(product): ResponseEntity.notFound().build();
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        boolean successful = service.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
