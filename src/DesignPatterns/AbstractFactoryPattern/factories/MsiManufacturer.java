package DesignPatterns.AbstractFactoryPattern.factories;

import DesignPatterns.AbstractFactoryPattern.products.Gpu;
import DesignPatterns.AbstractFactoryPattern.products.Monitor;
import DesignPatterns.AbstractFactoryPattern.products.MsiGpu;
import DesignPatterns.AbstractFactoryPattern.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}
