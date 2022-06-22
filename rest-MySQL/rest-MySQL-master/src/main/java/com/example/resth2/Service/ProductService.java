package com.example.resth2.Service;

import com.example.resth2.Model.Product;
import com.example.resth2.Repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository Repo;

    public List<Product> listAll() {
        return Repo
                .findAll();
    }

    public void save(Product product) {

        Repo
                .save(product);
    }

    public Product get(Integer id) {
        return Repo
                .findById(id)
                .get();
    }

    public void delete(Integer id) {
        Repo
                .deleteById(id);
    }
}
