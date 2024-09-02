/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlineshop;

import java.util.Scanner;

/**
 *
 * @author YiğitÇELİK
 */
public class OnlineShop {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
    warehouse.addProduct("coffee", 5, 10);
    warehouse.addProduct("milk", 3, 20);
    warehouse.addProduct("cream", 2, 55);
    warehouse.addProduct("bread", 7, 8);

    Scanner scanner = new Scanner(System.in);

    Store store = new Store(warehouse, scanner);
    store.shop("John");
        
    }
}
