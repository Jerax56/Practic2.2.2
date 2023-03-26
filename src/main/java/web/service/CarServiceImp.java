package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private List<Car> carList;

    public CarServiceImp() {
        carList=new ArrayList<>();
        carList.add(new Car(1, "BMW", 10));
        carList.add(new Car(2, "Kia", 6));
        carList.add(new Car(3, "Lexus", 405));
        carList.add(new Car(4, "Chevrolet", 3));
        carList.add(new Car(5, "Lada", 10));
    }

    @Override
    public List<Car> getCarsForCount(int count) {
       return carList.stream().limit(count).toList();
    }
}
