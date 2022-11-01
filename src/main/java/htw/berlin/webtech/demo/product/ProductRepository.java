package htw.berlin.webtech.demo.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository <ProductEntity, Long> {
}
