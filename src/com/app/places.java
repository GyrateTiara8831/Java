package com.app;

public class places extends Place
{

    @Override
    public String getPlace() {
        return place;
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public boolean getByCar() {
        return byCar;
    }

    @Override
    public boolean getByTrain() {
        return byTrain;
    }

    @Override
    public boolean getByPlane() {
        return byPlane;
    }

    @Override
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void setByCar(boolean byCar) {
        this.byCar = byCar;
    }

    @Override
    public void setByTrain(boolean byTrain) {
        this.byTrain = byTrain;
    }

    @Override
    public void setByPlane(boolean byPlane) {
        this.byPlane = byPlane;
    }
}
