package com.example.moandroidapps.customlistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataProvider {

    public static List<Product> productList = new ArrayList<>();
    public static Map<String, Product> productMap = new HashMap<>();

    static {
        addProduct("image_1.jpg",
                "Computer Science",
                "",
                280.98);
        addProduct("image_2.jpg",
                "History",
                "Computer Science",
                280.98);
        addProduct("image_3.jpg",
                "Geography",
                "Computer Science",
                280.98);
        addProduct("image_4.png",
                "Mathematics",
                "Computer Science",
                280.98);
        addProduct("image_5.jpg",
                "Chemistry",
                "Computer Science",
                280.98);
        addProduct("image_6.png",
                "Science",
                "Computer Science",
                280.98);
        addProduct("image_7.jpg",
                "Fiction",
                "Computer Science",
                280.98);
        addProduct("image_8.jpg",
                "Drama",
                "Computer Science",
                280.98);
        addProduct("image_9.jpg",
                "Comics",
                "Computer Science",
                280.98);
        addProduct("image_10.png",
                "Islamic",
                "Computer Science",
                280.98);
        addProduct("image_11.png",
                "Physics",
                "Computer Science",
                280.98);
        addProduct("image_12.jpg",
                "Arabic",
                "Computer Science",
                280.98);
        addProduct("image_13.jpg",
                "Motivational",
                "Computer Science",
                280.98);
        addProduct("image_14.gif",
                "Ergonomics",
                "Computer Science",
                280.98);
        addProduct("image_15.jpg",
                "Human Computer Interaction",
                "Computer Science",
                280.98);
        addProduct("image_16.jpg",
                "Digital Logic Design",
                "Computer Science",
                280.98);
        addProduct("image_17.jpg",
                "Discrete Mathematics",
                "Computer Science",
                280.98);
    }//end static{}

    private static void addProduct(String itemID, String name, String description, double price){
        Product item = new Product(itemID, name, description, price);
        productList.add(item);
        productMap.put(itemID, item);

    }//end addProduct()
}//end DataProvider{}
