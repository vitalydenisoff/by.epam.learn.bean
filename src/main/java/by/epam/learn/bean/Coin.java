package by.epam.learn.bean;

public class Coin {
    public double diameter;
    public double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setWeight(double value) {
        if (value > 0) {
            diameter = value;

        } else {
            diameter = 0.01;
        }
    }

    public double takeWeight() {
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }

    public void setDiameter(double v) {
    }
}
