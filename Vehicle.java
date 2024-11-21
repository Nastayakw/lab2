import java.util.ArrayList;
public class Vehicle {
    private String type;
    private String color;
    private double speed;
    private boolean hasEngine;
    private String engineType;
    private double price;
    private ArrayList<String> owners;

    // Конструктор
    public Vehicle(String type, String color, double speed, boolean hasEngine, String engineType, double price) {
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.hasEngine = hasEngine;
        this.engineType = engineType;
        this.price = price;
        this.owners = new ArrayList<>();
    }

    // Геттры сеттры
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

    public void addOwner(String owner) {
        owners.add(owner);
    }

    // метод для ускорения
    public void accelerate(double acceleration) {
        speed += acceleration;
    }

    // метод для замедления
    public void decelerate(double deceleration) {
        speed -= deceleration;
        if (speed < 0) {
            speed = 0;
        }
    }

    // метод для расчета дистации
    public double calculateDistance(double time) {
        return speed * time;
    }

    // метод езды
    public void gas() {
        for (int i = 0; i < 10; i++) {
            accelerate(1);
            System.out.println("Speed: " + speed + " km/h");
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Vehicle BMW = new Vehicle ("Машина","Белая",150,true,"Электро -Двигатель",10000000);
        BMW.addOwner("Анастасия");
        System.out.println(BMW.toString());
//        BMW.gas();
        System.out.println("Километров пройдено " + BMW.calculateDistance(100000));
        BMW.decelerate(2);
        System.out.println(BMW.getSpeed());



    }

    public String toString() {
        return "Транспорт{" +
                "Тип='" + type + '\'' +
                ", Цвет='" + color + '\'' +
                ", скорость=" + speed +
                ", Если ли двигатель=" + hasEngine +
                ", Тип двигателя='" + engineType + '\'' +
                ", Стоимость=" + price +
                ", Владельцы=" + owners +
                '}';
    }
}
