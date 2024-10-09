package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.factories.AsusManufacturer;
import DesignPatterns.AbstractFactoryPattern.factories.Company;
import DesignPatterns.AbstractFactoryPattern.factories.MsiManufacturer;

public class Main {
    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();


//        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
//                .forEach(Product::assemble);

    }
}
