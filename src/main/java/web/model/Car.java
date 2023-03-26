package web.model;

import java.util.Objects;

public class Car {
    private int index;
    private String model;
    private int series;

    public Car(int index, String model, int series) {
        this.index = index;
        this.model = model;
        this.series = series;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return index == car.index && series == car.series && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, model, series);
    }
}
