package notebooks;

import java.util.*;

public class Notebooks {

    private String brand;
    private String model;
    private String operationSystem;
    private int price;
    private int RAM;
    private int batteryPower;

    public Notebooks(String brand, String model, String operationSystem, int RAM, int price, int batteryPower) {
        this.brand = brand;
        this.model = model;
        this.operationSystem = operationSystem;
        this.RAM = RAM;
        this.price = price;
        this.batteryPower = batteryPower;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("RAM");
        list.add("operatingSystem");
        list.add("price");
        list.add("brand");
        list.add("model");
        list.add("batteryPower");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + brand + "): " +
                "количество опретивной памяти:" + RAM +
                ", операционная система: " + operationSystem + '\'' +
                ", цена: " + price +
                ", время автономной работы: " + batteryPower +
                ", модель: " + model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmountRAM() {
        return RAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.RAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operationSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operationSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


