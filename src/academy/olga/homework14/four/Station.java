package academy.olga.homework14.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Station {

    private List<Train> trains = new ArrayList();

    public Station() {

    }

    public void add(Train train) {
        trains.add(train);
    }

    @Override
    public String toString() {
        return "Station{" +
                "trains=" + trains +
                '}';
    }

    public boolean sortByNum() {
        boolean check = false;
        for (int i = 0; i < trains.size(); i++) {
            Train current = trains.get(i);
            int index = i;

            for (int j = i + 1; j < trains.size(); j++) {
                int num1 = current.getTrainNum();
                int num2 = trains.get(j).getTrainNum();
                if (num2 < num1) {
                    current = trains.get(j);
                    index = j;
                }
            }
            trains.set(index, trains.get(i));
            trains.set(i, current);
            check = true;

        }
        return check;
    }
    public void getTrainInfo(){
        boolean check = false;
        System.out.println("Введите номер поезда: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getTrainNum() == num){
                System.out.println("Информация о поезде: " + trains.get(i).getTrainDestination()+ " " +
                        trains.get(i).getStartTimeHour()+":"+trains.get(i).getStartTimeMinutes());
                check = true;
            }
        }
        if (!check){
            System.out.println("Поездов с таким номером нету.");
        }
    }
    public boolean sortByName() {
        boolean check = false;
        for (int i = 0; i < trains.size(); i++) {
            Train current = trains.get(i);
            int index = i;

            for (int j = i + 1; j < trains.size(); j++) {
                String name1 = current.getTrainDestination();
                String name2 = trains.get(j).getTrainDestination();
                if (name2.compareTo(name1) < 0) {
                    current = trains.get(j);
                    index = j;
                }
            }
            trains.set(index, trains.get(i));
            trains.set(i, current);
            check = true;

        }
//        for (int i = 0; i < trains.size(); i++) {
//            int index = i;
//            Train current = trains.get(i);
//            for (int j = i+1; j < trains.size(); j++) {
//                if (current.getTrainDestination().equals(trains.get(j).getTrainDestination())){
//                    if (current.getStartTimeHour() > trains.get(j).getStartTimeHour()){
//                        current = trains.get(j);
//                        index = j;
//                    }
//                }
//            }
//            trains.get(index).setStartTimeHour(index,trains.get(i).getStartTimeHour());
//            trains.set(i, current);
//        }
        return check;
    }

}
