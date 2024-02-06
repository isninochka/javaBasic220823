package lessons.lesson16;

public class Race {
    private String raceName;
    private double distance;

    public Race (String raceName, double distance) {
        this.raceName = raceName;
        this.distance = distance;
    }

    public double raceResultCalculator (Car ourCar) {
        double raceResult = distance / ourCar.getMaxSpeed();
        return raceResult;
    }
    public Car calculateRaceResult(Car car1, Car car2, Car car3){
        double resultCar1 = raceResultCalculator(car1);
        double resultCar2 = raceResultCalculator(car2);
        double resultCar3 = raceResultCalculator(car3);

        if (resultCar1 < resultCar2 && resultCar1 < resultCar3) {
            return car1;
        } else if (resultCar2 < resultCar1 && resultCar2 < resultCar3) {
            return car2;
        }  else {
            return car3;
        }
    }



    public void showWinner(Car carWinner){
        System.out.println("Победил автомобиль " + carWinner.getMarka()+carWinner.getModel());
    }

}