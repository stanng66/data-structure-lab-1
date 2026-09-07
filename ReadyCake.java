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
public class ReadyCake extends Cake {
    // Lab requirement: Both classes must implement the calculatePrice() method declared in superclass Cake.
    public ReadyCake(String ParmCakeName, double ParmCakePrice) {
        super(ParmCakeName, ParmCakePrice);
    }

      @Override
    public double calculatePrice() {
        return getCakePrice();   // fixed price
    }

    @Override
    public String toString() {
        return getCakeName() + " (Ready-made) - Price: $" + getCakePrice();
    }
}
