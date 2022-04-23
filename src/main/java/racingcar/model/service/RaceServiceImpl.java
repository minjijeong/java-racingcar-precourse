package racingcar.model.service;

import java.util.ArrayList;
import org.assertj.core.util.Strings;
import racingcar.model.domain.Car;

public class RaceServiceImpl implements RaceService{
    @Override
    public Car getResult(String name, int times) {
        return null;
    }

    @Override
    public ArrayList<Car> validateCars(String names, int times) {
        String[] carArr = names.split(",");
        ArrayList<Car> cars = new ArrayList<>();
        for(String carName : carArr){
            if(Strings.isNullOrEmpty(carName)){
                throw new IllegalArgumentException("[ERROR] 잘못된 값이 입력되었습니다.");
            }

            if(carName.length() > 5){
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하여야 합니다.");
            }

            Car car = new Car(carName,times);
            cars.add(car);
        }
        return cars;
    }

    @Override
    public int validateTimes(String times) {
        int num = 0;
        try {
            num = Integer.parseInt(times);
        }catch(Exception e){
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        return num;
    }
}
