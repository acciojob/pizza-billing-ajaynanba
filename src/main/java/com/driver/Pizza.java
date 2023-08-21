package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isCheeseAdded;
    boolean isTakeAwayAdded;
    boolean isToppingsAdded;

    int cheesePrice;
    int toppingPrice;
    int takeAwayPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 120;
        this.takeAwayPrice = 20;

        if(isVeg == true){
            this.price = 300;
            this.toppingPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isTakeAwayAdded = false;
        this.isToppingsAdded = false;

        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            this.price = this.price + this.toppingPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
