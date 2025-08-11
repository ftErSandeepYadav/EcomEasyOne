//package com.product.productcatalog.config;
//
//import com.product.productcatalog.entity.Category;
//import com.product.productcatalog.entity.Product;
//import com.product.productcatalog.repository.CategoryRepository;
//import com.product.productcatalog.repository.ProductRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class DataSeeder implements CommandLineRunner {
//
//    private final ProductRepository productRepository ;
//    private final CategoryRepository categoryRepository ;
//
//    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository){
//        this.categoryRepository = categoryRepository ;
//        this.productRepository = productRepository ;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        //Clearing all existing data
//
//        // Creating categories
//        Category electronics = new Category();
//        electronics.setName("Electronics");
//
//        Category clothing = new Category();
//        clothing.setName("Clothing");
//
//        Category books = new Category();
//        books.setName("Books");
//
//        // Saving categories
//        categoryRepository.saveAll(Arrays.asList(electronics, clothing, books));
//
//        // Creating products
//        Product phone = new Product();
//        phone.setName("Smartphone");
//        phone.setDescription("Latest model smartphone with advanced features.");
//        phone.setImageUrl("https://placehold.co/600x400");
//        phone.setPrice(699.99);
//        phone.setCategory(electronics);
//
//
//        Product laptop = new Product();
//        laptop.setName("Laptop");
//        laptop.setDescription("High-performance laptop for work and gaming.");
//        laptop.setImageUrl("https://placehold.co/600x400");
//        laptop.setPrice(999.99);
//        laptop.setCategory(electronics);
//
//        Product tshirt = new Product();
//        tshirt.setName("T-Shirt");
//        tshirt.setDescription("Comfortable cotton t-shirt.");
//        tshirt.setImageUrl("https://placehold.co/600x400");
//        tshirt.setPrice(19.99);
//        tshirt.setCategory(clothing);
//
//        Product novel = new Product();
//        novel.setName("Novel");
//        novel.setDescription("A thrilling mystery novel.");
//        novel.setImageUrl("https://placehold.co/600x400");
//        novel.setPrice(14.99);
//        novel.setCategory(books);
//
//        productRepository.saveAll(Arrays.asList(phone, laptop, tshirt, novel)) ;
//
//    }
//}
