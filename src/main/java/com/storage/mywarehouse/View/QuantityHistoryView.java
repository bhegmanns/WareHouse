package com.storage.mywarehouse.View;
// Generated Oct 14, 2018 9:02:23 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * QuantityHistoryView generated by hbm2java
 */
public class QuantityHistoryView  implements java.io.Serializable {


     private int id;
     private String warehouse;
     private String brand;
     private String type;
     private int quantity;
     private Date date;

    public QuantityHistoryView() {
    }

	
    public QuantityHistoryView(int id, String warehouse, String brand, String type) {
        this.id = id;
        this.warehouse = warehouse;
        this.brand = brand;
        this.type = type;
    }
    public QuantityHistoryView(int id, String warehouse, String brand, String type, int quantity, Date date) {
       this.id = id;
       this.warehouse = warehouse;
       this.brand = brand;
       this.type = type;
       this.quantity = quantity;
       this.date = date;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getWarehouse() {
        return this.warehouse;
    }
    
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public String toString(){
        return warehouse+"\t"+brand+"\t"+type+"\t"+date+"\t"+quantity;
    }



}


