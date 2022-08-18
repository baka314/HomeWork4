import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = Math.random() * 500;
        double distanceJump = Math.random() * 3;
        double distanceSwim = Math.random() * 0;
        Cat cat = new Cat(distanceRun, distanceJump, distanceSwim);

        distanceRun = Math.random()*2000;
        distanceJump = Math.random()*2;
        distanceSwim = Math.random()*100;
        Animal dog = new Dog(distanceRun, distanceJump, distanceSwim);


        System.out.println("Cat can to run: " + cat.getAnimalDistanceRun() +
                " м. \nDog can run: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Write a distance:");
        double distance = scanner.nextDouble();

        System.out.println("Cat want to run(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Dog want run(" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n****************\n");

        System.out.println("Cat can jump: " + cat.getAnimalDistanceJump() +
                " м. \nDog can jump: " + dog.getAnimalDistanceJump() + " м.");

        System.out.println("Write length of obstacle:");
        distance = scanner.nextDouble();

        System.out.println("Cat want to jump(" + distance + "). Результат: " + cat.jump(distance));
        System.out.println("Dog want to jump(" + distance + "). Результат: " + dog.jump(distance));
        System.out.println("\n****************\n");

        System.out.println("Cat can to swim: " + cat.getAnimalDistanceSwim() +
                " m. \nDog can to swim: " + dog.getAnimalDistanceSwim() + " m.");

        System.out.println("Write distant to swim:");
        distance = scanner.nextDouble();

        System.out.println("Cat want to swim(" + distance + "). result: " + cat.swim(distance));
        System.out.println("Dog want to swim(" + distance + "). result: " + dog.swim(distance));

    }


}