package ex3_Train;

public class TrainToDest {
    // a)  список поездов, следующих до заданного пункта назначения;
    public void getTrainByDest(Train[] t3, Destination destination) {
        for (Train train : t3) {
            if (train.getDest() == destination) {
                System.out.println(train);
            }
        }
    }

    // b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;
    public void getTrainByDestAndTime(Train[] t3, Destination destination, TheDepartureTime time) {
        for (Train train : t3) {
            if (train.getDest() == destination && train.getDepartTime() == time) {
                System.out.println(train);
            }
        }
    }

    // c) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.
    public void getTrainByDestAndSeats(Train[] t3, Destination destination, TheNumbersOfSeatsGeneral seats) {
        for (Train train : t3) {
            if (train.getDest() == destination && train.getSeats() == seats) {
                System.out.println(train);
            }
        }
    }
}
