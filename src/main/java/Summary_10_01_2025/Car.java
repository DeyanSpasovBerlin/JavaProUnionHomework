package Summary_10_01_2025;

import java.util.ArrayList;

public class Car {
private CarBody body;
ArrayList<Wheel> listWheel = new ArrayList<Wheel>(4);

    public Car(CarBody body, ArrayList<Wheel> listWheel) {
        this.body = body;
        this.listWheel = listWheel;
    }

    public CarBody getBody() {
        return body;
    }

    public ArrayList<Wheel> getListWheel() {
        return listWheel;
    }

    public void setBody(CarBody body) {
        this.body = body;
    }

    public void setListWheel(ArrayList<Wheel> listWheel) {
        this.listWheel = listWheel;
    }
}
/*
1. Реализовать модель конвейера
первый поток производит корпус автомобиля ----> класс CarBody
второй поток производит колеса ----> класс Wheel
третий поток собирает из 4 колес и одного корпуса автомобиля готовый автомобиль ----> класс Car
2. Имеется список. Один поток проходит итератором по списку и печатает его значения,
второй поток в это же время меняет значение / удаляет элемент из списка.
Продемонстрировать, что будет, если список:
- ArrayList,
- SynchronizedList,
- ConcurrentLinkedQueue,
- CopyOnWriteArrayList


 */
