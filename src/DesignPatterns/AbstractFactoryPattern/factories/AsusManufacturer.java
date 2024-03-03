package DesignPatterns.AbstractFactoryPattern.factories;

import DesignPatterns.AbstractFactoryPattern.products.AsusGpu;
import DesignPatterns.AbstractFactoryPattern.products.AsusMonitor;
import DesignPatterns.AbstractFactoryPattern.products.Gpu;
import DesignPatterns.AbstractFactoryPattern.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
