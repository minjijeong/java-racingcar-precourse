package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.controller.RaceController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

            RaceController race = new RaceController();
            race.start();
        /*
        String[] returns = {"-",""};
        args = new String[2];

        args[0] = Console.readLine();
        String[] names = args[0].split(",");
        System.out.print(args[0]);
        System.out.println(names[0] + " : -");
        System.out.println(names[1] + " : ");

            try {
                args[1] = Console.readLine();
                if(args[1] == null) {
                    throw new Exception("[ERROR] 에러발생");
                }
            } catch (Exception e) {
                throw new RuntimeException("[ERROR] 에러발생");
            }
        //System.out.print(args[1]);
        System.out.println("최종 우승자: pobi");
         */
    }
}
