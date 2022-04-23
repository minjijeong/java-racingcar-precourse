package racingcar.model.service;

import java.util.ArrayList;
import racingcar.model.domain.Car;

public interface RaceService {
    Car getResult(String name, int times);
    ArrayList<Car> validateCars(String names, int times);
    int validateTimes(String times);
}
