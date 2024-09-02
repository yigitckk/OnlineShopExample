/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshop;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YiğitÇELİK
 */
public class ShoppingCart {
    Map<String, Item> cart;
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        Item item = new Item(product, 1, price);
        
        for(Item it : cart.values()){
            if(it.equals(item)){
                it.increaseQuantity();
                return;
            }
        }
        cart.put(product, item);
        
    }
    public int price(){
        int total = 0;
        for(Item item : cart.values()){
            total += item.price();
        }
        return total;
    }
    
    public void print(){
        for(Item item : cart.values()){
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }
    
}
