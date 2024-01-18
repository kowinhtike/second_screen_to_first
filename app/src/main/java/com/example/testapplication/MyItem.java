package com.example.testapplication;

public class MyItem {
    private String itemName;
    private  String priceName;

    public MyItem(String itemName,String priceName) {
        this.itemName = itemName;
        this.priceName = priceName;
    }

    public String getItemName() {
        return itemName;
    }

    public  String getPriceName(){
        return  priceName;
    }
}
