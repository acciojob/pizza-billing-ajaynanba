package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isCheeseAdded;
    boolean isTakeAwayAdded;
    boolean isToppingsAdded;
    boolean isBillGenerated;

    int cheesePrice;
    int toppingPrice;
    int takeAwayPrice;
    int totalPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        this.totalPrice = price;

        this.isCheeseAdded = false;
        this.isTakeAwayAdded = false;
        this.isToppingsAdded = false;

        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.totalPrice += this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded && isVeg){
            this.totalPrice += 70;
            isToppingsAdded = true;
        }
        if(!isToppingsAdded && !isVeg){
            this.totalPrice += 120;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.totalPrice += this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            this.bill += "Base Price Of The Pizza: "+ price+ "\n";
            if(isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if(isToppingsAdded){
                if(isVeg){
                this.bill = this.bill + "Extra Toppings Added: " + 70 + "\n";
                }
                else{
                    this.bill = this.bill + "Extra Toppings Added: " + 120 + "\n";
                }
            }
            if(isTakeAwayAdded){
                this.bill = this.bill + "Paper bag Added " + this.takeAwayPrice + "\n";
            }
            this.bill += "Total Price: " + this.totalPrice + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
