package ee.taltech.itcolledge.cars;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CarPicker {

    public static void main(String[] args) {
        //todo 3 simulate picking a car

        List<Car> garage = Arrays.asList(
                buildCar("Lamborgini Avendator", 2000000, false, 10.0),
                buildCar("Tesla Roadster", 100000, true, 9.0),
                buildCar("Toyota Prius", 20000, false, 5.0),
                buildCar("Lada", 5000, false, 2.0),
                buildCar("Bicycle", 100, false, 0.5)
        );
        System.out.println("Garage contains: \n" + garage);
        //todo 3.1 what does garage print? Can you make it print something prettier?

        //todo 3.2 Ask user how much money do they have and pick them a car or cars based on cars you have in garage
        // uncomment following lines for reading input example
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        String input = scanner.nextLine();
        System.out.println("Your input: " + input);
        int money = Integer.parseInt(input);

        System.out.println("What rating do you want? 0-10");
        String input2 = scanner.nextLine();
        System.out.println("Your input: " + input2);
        int rating = Integer.parseInt(input2);

        Optional<Car> recommendedCar = garage.stream()
                .filter(car -> car.getCost() <= money)
                .filter(car -> car.getUserRating() >= rating)
                .findFirst();

        System.out.println("\n");
        if (recommendedCar.isPresent()) {
            System.out.println("Shop recommends you: " + recommendedCar.get());
        } else {
            System.out.println("No car for you");
        }

        //todo ADVANCED
        // ask user 2nd question (+rating)

        //todo ADVANCED
        // ask user 3rd question (+electric)
    }

    private static Car buildCar(String name, int cost, boolean electric, double userRating) {
        Car car = new Car();
        car.setModel(name);
        car.setCost(cost);
        car.setElectric(electric);
        car.setUserRating(userRating);
        return car;
    }
}