package racingcar.model.service;

import java.util.ArrayList;
import racingcar.model.domain.Car;

public interface RaceService {
    // 레이싱 결과 가져오기
    String getResult(ArrayList<Car> cars, int times);

    // 자동차 이름 유효성 체크 - 5자리 이하 문자만 가능
    ArrayList<Car> validateCars(String names);

    // 시도 회수 유효성 체크 - 숫자만 가능
    int validateTimes(String times);
    // 시도 회수 오류 안나올때까지 다시 입력 요청할 수 있도록
    //int setTimes(String times);

    Car raceStart(Car car, int times);
}
