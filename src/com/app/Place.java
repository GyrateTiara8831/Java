package com.app;

public abstract class Place
{
    protected String place;
    protected double distance;
    protected boolean byCar;
    protected boolean byTrain;
    protected boolean byPlane;

    public abstract String getPlace();
    public abstract double getDistance();
    public abstract boolean getByCar();
    public abstract boolean getByTrain();
    public abstract boolean getByPlane();

    public abstract void setPlace(String place);
    public abstract void setDistance(double distance);
    public abstract void setByCar(boolean byCar);
    public abstract void setByTrain(boolean byTrain);
    public abstract void setByPlane(boolean byPlane);
}
