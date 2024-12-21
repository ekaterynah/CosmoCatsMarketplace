package com.cosmocatsmarket.domain;

import lombok.Value;

@Value
public class Product {
    String Id;
    String Name;
    Integer Price;
    Category Category;

}
