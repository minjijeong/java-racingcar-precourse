package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import racingcar.AppConfig;
import racingcar.model.domain.Car;
import racingcar.model.service.RaceService;
import racingcar.view.InputView;

public class RaceController {

    private RaceService service;
    private ArrayList<Car> carList;

    public RaceController() {
        initConfig();
    }

    private void initConfig() {
        AppConfig appConfig = new AppConfig();
        service = appConfig.raceService();
    }

    public void start(){
        // 자동차 입력
        InputView.inputCars();
        String cars = Console.readLine();
        // 시도횟수 입력
        InputView.inputRaceTimes();
        String times = Console.readLine();

        System.out.println("무슨일이지???");
        // 자동차, 시도회수 set
        carList = service.validateCars(cars, service.validateTimes(times));
        System.out.println(carList);

        // 경기실행

        // 종료

        // 우승자 출력
    }
}
