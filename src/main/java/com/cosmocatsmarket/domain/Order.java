package com.cosmocatsmarket.domain;

import java.util.Date;
import java.util.List;

public class Order {
    Integer Id;
    Integer Sum;
    List<Product> Products;
    Date OrderDate;
}
