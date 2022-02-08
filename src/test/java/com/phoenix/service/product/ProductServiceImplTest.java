package com.phoenix.service.product;

import com.phoenix.data.models.Product;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ProductServiceImplTest {

    @Test
    void applyPatchToProductTest() {
        Product product = new Product();
        product.setName("table top");
        product.setPrice(450);
        product.setDescription("This is a table top");
        product.setQuantity(3);
    }
}