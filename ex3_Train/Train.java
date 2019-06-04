package ex3_Train;

import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;

/**
 * Lab3Train.Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс).
 * <p>
 * Создать массив объектов. Вывести:
 * a)  список поездов, следующих до заданного пункта назначения;
 * b)  список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;
 * c)  список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
 */

public class Train {
    private int theNumberOfATrain;   // номер поезда
    private LocalTime departureTime;

    private TheNumbersOfSeatsGeneral seats;
    private Destination dest;
    private TheDepartureTime departTime;

    // конструкторы
    protected Train(Destination dest, int theNumberOfATrain, int hours, int minutes, TheNumbersOfSeatsGeneral seats) {
        this.theNumberOfATrain = theNumberOfATrain;
        this.departureTime = LocalTime.of(hours, minutes);
        this.seats = seats;
        this.dest = dest;

        // вся информация
        System.out.println("Пункт назначения: " + dest +
                " Номер поезда: " + theNumberOfATrain +
                " Время отправления: " + departureTime +
                " Место: " + seats
        );
    }

    // геттеры и сеттеры
    public int getTheNumberOfATrain() { return theNumberOfATrain; }
    public Destination getDest() { return dest; }
    public TheDepartureTime getDepartTime() { return departTime; }
    public TheNumbersOfSeatsGeneral getSeats() { return seats; }

    public void setTheNumberOfATrain(int theNumberOfATrain) { this.theNumberOfATrain = theNumberOfATrain; }
    public void setDest(Destination dest) { this.dest = dest; }
    public void setDepartTime(TheDepartureTime departTime) { this.departTime = departTime; }
    public void setSeats(TheNumbersOfSeatsGeneral seats) { this.seats = seats; }

    // переопределение метода toString();
    @Override
    public String toString() {
        return "" +
                "Пункт назначения: " + dest +
                ", Номер поезда: " + theNumberOfATrain +
                ", Время отправления: " + departureTime +
                ", Место: " + seats;
    }

    // переопределение метода hashCode();
    @Override
    public int hashCode() { return Objects.hash(theNumberOfATrain, seats, dest, departTime); }

    // main
    public static void main(String[] args) {
        Train[] t3 = new Train[6];
        t3[0] = new Train(Destination.SIMFEROPOL, 991, (int)(Math.random() * 100 % 24), (int)(Math.random() * 100 % 60), TheNumbersOfSeatsGeneral.COUPE);
        t3[1] = new Train(Destination.ALUSHTA, 992, (int)(Math.random() * 100 % 24), (int)(Math.random() * 100 % 60), TheNumbersOfSeatsGeneral.GENERAL);
        t3[2] = new Train(Destination.BAKHCHISARAI, 993, (int)(Math.random() * 100 % 24), (int)(Math.random() * 100 % 60), TheNumbersOfSeatsGeneral.GENERAL);
        t3[3] = new Train(Destination.SEVASTOPOL, 994, (int)(Math.random() * 100 % 24), (int)(Math.random() * 100 % 60), TheNumbersOfSeatsGeneral.RESERVEDSEATS);
        t3[4] = new Train(Destination.SIMFEROPOL, 995, (int)(Math.random() * 100 % 24), (int)(Math.random() * 100 % 60), TheNumbersOfSeatsGeneral.COUPE);
        t3[5] = new Train(Destination.YALTA, 996, (int)(Math.random() * 100 % 24), (int)(Math.random() * 100 % 60), TheNumbersOfSeatsGeneral.COUPE);


        //Создать массив объектов. Вывести:

        // a)
        System.out.println("\na) список поездов, следующих до заданного пункта назначения;");
        TrainToDest t4 = new TrainToDest();
        t4.getTrainByDest(t3, Destination.SIMFEROPOL);

        // c)
        System.out.println("\nc) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.");
        TrainToDest t6 = new TrainToDest();
        t4.getTrainByDestAndSeats(t3, Destination.ALUSHTA, TheNumbersOfSeatsGeneral.GENERAL);

        // b)
        System.out.println("\nb) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;");
        TrainToDest t5 = new TrainToDest();
        //t4.getTrainByDestAndTime(t3, Destination.SEVASTOPOL, TheDepartureTime.PM02_00);

        int hours = 0, minutes = 0;
        System.out.print("Введите время (чч мм): ");
        Scanner in = new Scanner(System.in);
        hours = in.nextInt();
        minutes = in.nextInt();

        LocalTime time = LocalTime.of(hours, minutes);
        for (int i = 0; i < t3.length; i++) {
            if (t3[i].getDest().equals(Destination.SIMFEROPOL) && t3[i].departureTime.compareTo(time) > 0) {
                System.out.println(t3[i]);
            }
        }
    }
}






