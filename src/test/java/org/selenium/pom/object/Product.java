package org.selenium.pom.object;

import org.selenium.pom.utils.JacksonUtils;

import java.io.IOException;

public class Product {
    private Integer id;
    private String name;

    public Product(){}

    public Product(int id) throws IOException {
        Product[] products = JacksonUtils.deserializeJson("products.json",Product[].class);
        for(Product product: products){
            if(product.getId() == id){
                this.id = id;
                this.name = product.getName();
            }
        }
    }
    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Método estático para obtener un producto por ID desde una lista de productos
    public static Product getProductById(Integer id) throws IOException {
        Product[] products = JacksonUtils.deserializeJson("products.json", Product[].class);
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null; // Si no se encuentra el producto con el ID dado, devolver null
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
