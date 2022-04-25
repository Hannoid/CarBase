package Student;

public class Car {
    private final String model;
    private final double volume;
    private final double fuelUsage;

    String getModel() {
        return model;
    }

    Car(String model, double volume, double fuelUsage) {
        this.model = model;
        this.volume = volume;
        this.fuelUsage = fuelUsage;
    }

    @Override
    public String toString() {
        return String.format("%s v%.1f; expense: %.2f", this.model, this.volume, this.fuelUsage);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW", 3.0, 9.8),
                new Car("Opel", 1.8, 6.2),
                new Car("Renault", 1.6, 5.8),
                new Car("Lada", 1.4, 15.0)
        };

        //выводим весь массив
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();

        //ищем ладу
        Car search = null;
        String model = "Lada";
        for (Car car : cars) {
            if (car != null && car.getModel() != null && car.getModel().toLowerCase().equals(model.toLowerCase())) {
                search = car;
                break;
            }
        }

        System.out.println("Search: " + search);
    }
}
