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
// Lab requirement: Define two subclasses CustomCake and ReadyCake.
public class CustomCake extends Cake{
    // Lab requirement: CustomCake should have additional fields to hold the weight and fee.
    private double cakeWeight;
    private double customCakeFee;

    public CustomCake(String ParmCakeName, double ParmCakePrice, double ParmCakeWeight, double ParmCustomCakeFee) {
        super(ParmCakeName, ParmCakePrice);
        this.cakeWeight = ParmCakeWeight;
        this.customCakeFee = ParmCustomCakeFee;
    }

    public double getCakeWeight() {
        return cakeWeight;
    }

    public double getCustomCakeFee() {
        return customCakeFee;
    }
    
    // Lab requirement: Both classes must implement the calculatePrice() method declared in superclass Cake.
    @Override
    public double calculatePrice() {
        return getCakePrice() * cakeWeight + customCakeFee;
    }

    @Override
    public String toString() {
       return getCakeName() 
        + " (Custom Cake) - Price: $" + getCakePrice()
        + ", Weight: " + cakeWeight + "kg"
        + ", Fee: $" + customCakeFee;
    }
}
