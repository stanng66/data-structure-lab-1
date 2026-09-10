// ====================
// Lab 1 - Polymorphism
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
    // Lab requirement: Create an array of 20 polymorphic objects of type Cake to hold different types of cakes, each specifying a cake name, price, as well as weight and custom fee if required
    Object[][] cakeData = {
      {"Chocolate Cake", 22.99, null, null},
      {"Red Velvet Cake", 24.99, null, null},
      {"Black Forest Cake", 27.00, null, null},
      {"Coffee Cake", 19.99, null, null},
      {"Pound Cake", 15.99, null, null},
      {"Genoise Sponge Cake", 19.99, null, null},
      {"Opera Cake", 29.99, null, null},
      {"Cheesecake", 19.99, null, null},
      {"Bundt Cake", 16.99, null, null},
      {"Japanese Castella Cake", 18.99, null, null},

      {"Vanilla Cake", 18.99, 1.5, 5.0},
      {"Pineapple upside-down Cake", 20.99, 2.0, 7.0},
      {"Cupcakes", 7.99, 0.25, 2.0},
      {"Devil's Food Cake", 25.99, 2.5, 9.0},
      {"Sponge Cake", 19.99, 1.75, 6.99},
      {"Carrot Cake", 21.99, 2.0, 7.0},
      {"Pancake", 12.99, 0.75, 1.25},
      {"Strawberry Shortcake", 22.00, 1.5, 5.5},
      {"Ice Cream Cake", 24.99, 2.25, 8.0},
      {"Fruit Cake", 16.99, 3.0, 10.0}
    };

    Cake [] cakeObj = new Cake[cakeData.length];
    for (int i = 0; i < cakeData.length; i++) {
      String name = (String) cakeData[i][0];
      double price = (double) cakeData[i][1];
      Double weight = (Double) cakeData[i][2];
      Double fee = (Double) cakeData[i][3];

      if (weight == null) {
        cakeObj[i] = new ReadyCake(name, price);
      } else {
        cakeObj[i] = new CustomCake(name, price, weight, fee);
      }
    }

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
