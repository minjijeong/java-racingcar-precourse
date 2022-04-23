package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import racingcar.appconfig.AppConfig;
import racingcar.model.domain.Car;
import racingcar.model.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceController {

    private RaceService service;
    private ArrayList<Car> carList;

    public RaceController() {
        initConfig();
    }

    private void initConfig() {
        // RaceService 자동 객체 생성을 위해 AppConfig 구현
        AppConfig appConfig = new AppConfig();
        service = appConfig.raceService();
    }

    public void start(){
        // 자동차 입력
        InputView.inputCars();
        String cars = Console.readLine();
        carList = service.validateCars(cars);

        // 시도횟수 입력
        InputView.inputRaceTimes();
        String timeStr = Console.readLine();
        int times = service.validateTimes(timeStr);

        // 경기실행
        String result = service.getResult(carList, times);

        // 종료 & 우승자 출력
        OutputView.printWinners(result.toString());
    }
}
