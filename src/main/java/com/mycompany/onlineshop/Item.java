/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlineshop;

/**
 *
 * @author YiğitÇELİK
 */
public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
        
    }
    
    public int price(){
        int price = (this.qty)*(this.unitPrice);
        return price;
    }
    
    public String getProduct() {
		return product;
	}
    
    public int getQty() {
		return qty;
	}
    
    public void increaseQuantity(){
       this.qty +=1;
    }
    
    public String toString(){
        return this.product + ":" + this.qty;
    }
    
}
