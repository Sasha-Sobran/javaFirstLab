package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Laptop {
    private String model = "UNKNOWN";
    private float screenSize = 15.6f;
    private int ram = 8;
    private int storage = 256;
    private int batteryLife = 5;
    private int batteryChargeInPercent = 17;

    private static Laptop instance;

    public static Laptop getInstance() {
        if (instance == null) {
            instance = new Laptop();
        }
        return instance;
    }

    public void addRam(int value) {
        this.ram += value;
    }

    public void addStorage(int value) {
        this.storage += value;
    }

    public void charge() {
        System.out.println("Charging our battery");
        this.batteryChargeInPercent = 100;
        this.batteryLife = 5;
        System.out.println("done" + ". Its already: " + this.batteryChargeInPercent + "%");
    }

    public static void main(String... args) {
        Laptop[] laptops = {new Laptop(),
                new Laptop("Victus", 17.3f, 16, 128, 2, 1),
                Laptop.getInstance(),
                Laptop.getInstance()
        };

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}
