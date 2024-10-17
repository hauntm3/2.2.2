package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 1999, "yellow"));
        cars.add(new Car("Toyota", 1976, "white"));
        cars.add(new Car("Mazda", 2015, "black"));
        cars.add(new Car("BMW", 1999, "white"));
        cars.add(new Car("Lada", 2000, "red"));

        return cars;
    }
}
