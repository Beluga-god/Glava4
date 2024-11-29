package org.example;

import java.util.ArrayList;
import java.util.List;

class State {
    private String name;
    private City capital;
    private List<Region> regions;

    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public int getRegionCount() {
        return regions.size();
    }

    public double getTotalArea() {
        return regions.stream().mapToDouble(Region::getArea).sum();
    }

    public void printRegionalCenters() {
        System.out.println("Областные центры:");
        for (Region region : regions) {
            System.out.println(region.getRegionalCenter().getName());
        }
    }

    public void printCapital() {
        System.out.println("Столица: " + capital.getName());
    }

    @Override
    public String toString() {
        return "Государство: " + name + ", Столица: " + capital.getName();
    }
}

class Region {
    private String name;
    private City regionalCenter;
    private double area;

    public Region(String name, City regionalCenter, double area) {
        this.name = name;
        this.regionalCenter = regionalCenter;
        this.area = area;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name + " (Областной центр: " + regionalCenter.getName() + ", Площадь: " + area + ")";
    }
}

class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
