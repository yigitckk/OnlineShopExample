/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author YiğitÇELİK
 */
public class Warehouse {
    Map<String, Integer> products;
    Map<String, Integer> stocks;
    
    public Warehouse(){
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if(!this.products.containsKey(product)){
            return this.products.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(this.products.containsKey(product)){
             return this.stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(this.stocks.containsKey(product) && this.stocks.get(product) > 0){
            this.stocks.put(product, this.stocks.get(product) -1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<>();
        
        for(Object item : this.stocks.keySet()){
            set.add((String) item);
        }
        return set;
    }
}
