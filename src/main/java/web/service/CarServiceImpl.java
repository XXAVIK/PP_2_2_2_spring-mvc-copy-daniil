package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    Car car = new Car("Ford", "Focus", 2014, ++CARS_COUNT);     //3. Создайте список из 5 машин.
    Car car1 = new Car("Audi", "R8", 2001, ++CARS_COUNT);
    Car car2 = new Car("BMW", "X3", 2018, ++CARS_COUNT);
    Car car3 = new Car("Tesla", "X", 2020, ++CARS_COUNT);
    Car car4 = new Car("Toyota", "Prius", 2011, ++CARS_COUNT);
    List<Car> cars = new ArrayList<>();

    {
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
    }

    @Override
    public List<Car> showCar(int id) {      //4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
        if (id > 5) {
            return cars;
        } else {
            return cars.stream().
                    filter(car -> car.getId() <= id).toList();
        }

    }

    @Override
    public List<Car> showAllCars() {
        return cars;
    }
}
