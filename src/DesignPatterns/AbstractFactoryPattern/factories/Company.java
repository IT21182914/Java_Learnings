package DesignPatterns.AbstractFactoryPattern.factories;

import DesignPatterns.AbstractFactoryPattern.products.Gpu;
import DesignPatterns.AbstractFactoryPattern.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
