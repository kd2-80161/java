package com.app.fruits.tester;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Fruits fruit = new Fruits();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the basket size");
        int n = Sc.nextInt();

        Fruits[] basket = new Fruits[n];
        int counter = -1;
        int choice;
        do {
            System.out.println("0.Exit");
            System.out.println("1.Add Mango");
            System.out.println("2.Add Orange");
            System.out.println("3.Add Apple");
            System.out.println("4.Display names of all fruits in the basket ");
            System.out.println("5. All fresh fruits , in the basket.");
            System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
            System.out.println("7. Mark a fruit as stale by index");
            System.out.println("8. Mark all sour fruits stale");
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    Sc.nextLine();
                    System.out.println("Enter name");
                    String name = Sc.nextLine();
                    System.out.println("Enter the weight");
                    double weight = Sc.nextDouble();
                    counter += 1;
                    basket[counter] = new Mango("Yellow", weight, name, true);
                    break;
                case 2:
                    Sc.nextLine();
                    System.out.println("name of Orange");
                    String name1 = Sc.nextLine();
                    System.out.println("Enter the weight ");
                    double weight1 = Sc.nextDouble();

                    counter += 1;
                    basket[counter] = new Orange("Orange", weight1, name1, true);
                    break;
                case 3:
                    Sc.nextLine();
                    System.out.println("Enter the name");
                    String name2 = Sc.nextLine();
                    System.out.println("Enter the weight ");
                    double weight2 = Sc.nextDouble();

                    counter += 1;
                    basket[counter] = new Apple("Apple", weight2, name2, true);
                    break;
                case 4:
                    if (counter != -1)
                    {
                        for (Fruits fruits :
                                basket) {
                            if (fruits != null)
//                                writing it inside for loop not checking it outside because
//                                if basket[counter] is checked outside
                                System.out.println("fruits.getName() = " + fruits.getName());
                        }
                    }

                    break;
                case 5:
                    if (counter != -1) {
                        for (Fruits fruits :
                                basket) {
                            if (fruits != null) {
                                System.out.println("All fruits: " + fruits);
                                System.out.println("Taste: " + fruits.taste());
                                System.out.println("Is Fresh: \n" + fruits.isFresh());
                            }
                        }
                    }
                    break;
                case 6:
                    if (counter != -1 && basket[counter] != null) {
                        for (int i = 0; i < basket.length; i++) {
                            if (basket[i] != null) {
                                if (!basket[i].isFresh())
                                    System.out.println(basket[i]);
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter the index");
                    int index = Sc.nextInt();
                    if (index >= 0 && index < basket.length) {
                        basket[index].setFresh(false);
                        System.out.println(basket[index] + " is marked as stale");
                    } else
                        System.out.println("Invalid Index");
                    break;
                case 8:
                    /*
                there is one more approach that
                if we check that basket[(basket.length -1)] ! =null i.e last index not null
                then we don't even enter inside the loop*/

                    if (counter != -1) {
                        for (Fruits fruits :
                                basket) {
                            if (fruits != null) {
                                String taste = fruits.taste();
                                if (taste.equals("sour")) {
                                    fruits.setFresh(false);
                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        } while (choice != 0);

    }
}
