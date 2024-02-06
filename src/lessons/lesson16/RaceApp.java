package lessons.lesson16;

public class RaceApp {

    public static void main(String[] args) {
        // блок ввод данных

        Car car1 = new Car("Mazda", "RX-8", 250);

        Car car2 = new Car("Subaru", "Impreza", 230);

        Car car3 = new Car("Nissan", "Skyline", 260);

        Race race = new Race("StreetRace", 425);

        Car winner = race.calculateRaceResult(car1, car2, car3);

        race.showWinner(winner);


    }   }