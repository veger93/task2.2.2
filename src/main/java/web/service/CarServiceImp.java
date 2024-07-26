package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car(1, "Lada", 2007));
        carList.add(new Car(2, "VW", 2016));
        carList.add(new Car(3, "Mazda", 2022));
        carList.add(new Car(4, "Honda", 2007));
        carList.add(new Car(5, "Renault", 2000));
        carList.add(new Car(6, "Kia", 2024));
    }


    @Override
    public List<Car> carsquantity(int num) {
        List<Car> firstNumCars;
        if (num < 5) {
            firstNumCars = carList.subList(0, num);
        } else {
            firstNumCars = carList;
        }
        return firstNumCars;
    }
}
