package racingcar.model.domain;

public class Car {
    private String name;
    private int distance;

    public Car(String name){
        this.name = name;
        this.distance = 0;
    }

    public Car(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addDistance(int distance){
        this.distance += distance;
    }

    public int getDistance(){
        return this.distance;
    }

}
