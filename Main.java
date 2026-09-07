// ====================
// Lab 1
// Stanley Nguyen (N01570766)
// Humber College 
// CPAN-211-RNA 
// Mehrnaz Zhian
// September 14, 2026
// --------------------
// This program Practice inheritance and polymorphism
// ====================
public class Main {
  // Lab requirement: Write an application that will perform the following:
  public static void main(String[] args) {
    // Lab requirement: Create an array of 20 polymorphic objects of type Cake to hold different types of cakes, each specifying a cake name, price, as well as weight and custom fee if required (for custom orders).
    Cake [] cakeObj = new Cake[20];

    // Lab requirement: Record data for cake objects and store them into the array (can be hardcoded, i.e. no input from stdin)
    cakeObj[0] = new ReadyCake("Chocolate Cake", 22.99);
    cakeObj[1]= new ReadyCake("Red Velvet Cake", 24.99);
    cakeObj[2] = new ReadyCake("Black Forest Cake", 27);
    cakeObj[3] = new ReadyCake("Coffee Cake", 19.99);
    cakeObj[4] = new ReadyCake("Pound Cake", 15.99);
    cakeObj[5] = new ReadyCake("Genoise Sponge Cake", 19.99);
    cakeObj[6] = new ReadyCake("Opera Cake", 29.99);
    cakeObj[7] = new ReadyCake("Cheesecake", 19.99);
    cakeObj[8] = new ReadyCake("Bundt Cake", 16.99);
    cakeObj[9] = new ReadyCake("Japanese Castella Cake", 18.99);
    cakeObj[10] = new CustomCake("Vanilla Cake", 18.99, 1.5, 5);
    cakeObj[11] = new CustomCake("Pineapple upside-down Cake", 20.99, 2, 7);
    cakeObj[12] = new CustomCake("Cupcakes", 7.99, 0.25, 2);
    cakeObj[13] = new CustomCake("Devil's Food Cake", 25.99, 2.5, 9);
    cakeObj[14] = new CustomCake("Sponge Cake", 19.99, 1.75, 6.99);
    cakeObj[15] = new CustomCake("Carrot Cake", 21.99, 2, 7);
    cakeObj[16] = new CustomCake("Pancake", 12.99, 0.75, 1.25);
    cakeObj[17] = new CustomCake("Strawberry Shortcake", 22, 1.5, 5.5);
    cakeObj[18] = new CustomCake("Ice Cream Cake", 24.99, 2.25, 8);
    cakeObj[19] = new CustomCake("Fruit Cake", 16.99, 3, 10);

    // Lab requirement: Display the total price for all types of cakes
    double calculateTotalPrice = 0.0;
    for (Cake cake : cakeObj) {
      if (cake != null) {
        System.out.println(cake.toString());
        calculateTotalPrice += cake.calculatePrice();
      }
    }

    System.out.println("====================");
    System.out.println("Total price of all cakes: $" + String.format("%.2f", calculateTotalPrice));
  }
}
