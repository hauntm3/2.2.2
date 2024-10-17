package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(Integer carsQuantity) {
        List<Car> cars = carDao.findAll();

        if (carsQuantity == null || carsQuantity >= cars.size()) {
            return cars;
        } else {
            List<Car> carsList = new ArrayList<>();
            for (int i = 0; i < carsQuantity; i++) {
                carsList.add(cars.get(i));
            }
            return carsList;
        }
    }
}