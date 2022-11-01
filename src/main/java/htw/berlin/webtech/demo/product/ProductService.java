package htw.berlin.webtech.demo.product;

import htw.berlin.webtech.demo.user.User;
import htw.berlin.webtech.demo.user.UserCreateOrUpdateRequest;
import htw.berlin.webtech.demo.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Product> findAll(){
        List<ProductEntity> products = (List<ProductEntity>) repo.findAll();
        return products.stream().map(this::transformEntity).collect(Collectors.toList());
    }

    public Product update(Long id, ProductCreateOrUpdateRequest request){
        
        var productEntityOptional = repo.findById(id);
        if (productEntityOptional.isEmpty()){
            return null;
        }

        var productEntity = productEntityOptional.get();
        productEntity.setName(request.getName());
        productEntity.setKcal(request.getKcal());
        productEntity = repo.save(productEntity);

        return transformEntity(productEntity);
    }

    private Product transformEntity(ProductEntity productEntity){
        return new Product(productEntity.getId(),
                productEntity.getName(), productEntity.getKcal());
    }

    public boolean deleteById(Long id) {
        if(!repo.existsById(id)){
            return false;
        }
        repo.deleteById(id);
        return true;
    }
}
