// ====================
// Lab 1
// Stanley Nguyen (N01570766)
// Humber College
// CPAN-211-RNA
// Mehrnaz Zhian
// September 14, 2026
// --------------------
// This program practices inheritance and polymorphism
// ====================
// Lab requirement: Define an abstract class Cake that will hold the following information: name and price
public abstract class Cake {
    private String cakeName;
    private double cakePrice;

    public Cake(String ParmCakeName, double ParmCakePrice) {
        this.cakeName = ParmCakeName;
        this.cakePrice = ParmCakePrice;
    }

    public String getCakeName() {
        return cakeName;
    }

    public double getCakePrice() {
        return cakePrice;
    }

    public abstract double calculatePrice();
}
