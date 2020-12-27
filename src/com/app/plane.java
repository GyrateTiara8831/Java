package com.app;

public class plane extends PassengerСarrier
{
    @Override
    public double getTraveldistance()
    {
        return traveldistance;
    }

    @Override
    public void setTravelDistance(double traveldistance)
    {
        this.traveldistance = traveldistance;
    }
}
