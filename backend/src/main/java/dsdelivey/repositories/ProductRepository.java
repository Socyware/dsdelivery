package dsdelivey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dsdelivey.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long > {

}
