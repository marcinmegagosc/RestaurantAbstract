package pl.gornik;

import pl.gornik.dish.dish;
import pl.gornik.dish.meatDish;
import pl.gornik.dish.vegetarianDish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        List<dish> dishList = new ArrayList<>();
        List<dish> koszyk = new ArrayList<>();
        dish meatDish1 = new meatDish("Czeburek","15","mięso,cebula,przyprawy,zioła","wołowina");
        dish meatDish2 = new meatDish("Burger","20","mięso,ser,sałata,pomidor,ogórek","wołowina");
        dish vegetarianDish1 = new vegetarianDish("Falafel","15","ciecierzyca,fasola,zioła,przyprawy,sałata");
        dish vegetarianDish2 = new vegetarianDish("Sałatka","9","kuskus,pieczarki,kukurydza,suszony pomidor");
        dishList.add(meatDish1);
        dishList.add(meatDish2);
        dishList.add(vegetarianDish1);
        dishList.add(vegetarianDish2);

        System.out.println("Menu");
        for(dish dish : dishList) dish.displayInfo();


        String choice;
        boolean isFind = false;





        do{


            System.out.println("podaj nazwę dania");
            String name = scanner.next();
            for (dish dish : dishList) {
                if (dish.getName().equalsIgnoreCase(name.toLowerCase())) {
                    koszyk.add(dish);
                }
            }


            System.out.println("podaj składniki");
            String components = scanner.next();
            for(dish zmien : koszyk){
                zmien.changeComponents(components);
            }
            System.out.println("zmieniono składniki na: " + components);
            isFind = true;
            if(isFind)
                System.out.println("czy chcesz dodać kolejny produkt T/N");
            choice = scanner.next();

        }while(choice.equalsIgnoreCase("t"));


        for (dish wypiszKoszyk : koszyk) {
            wypiszKoszyk.displayInfo();
        }
    }

    }


