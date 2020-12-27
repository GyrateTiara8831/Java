package com.app;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        plane plane = new plane();
        train train = new train();
        car car = new car();

        car.setTravelDistance(10);
        train.setTravelDistance(50);
        plane.setTravelDistance(100);

        places p = new places();
        p.setPlace("Work");
        p.setDistance(5);
        p.setByCar(true);
        p.setByTrain(true);
        p.setByPlane(false);

        places p1 = new places();
        p1.setPlace("Country");
        p1.setDistance(30);
        p1.setByCar(true);
        p1.setByTrain(true);
        p1.setByPlane(false);

        places p2 = new places();
        p2.setPlace("England");
        p2.setDistance(100);
        p2.setByCar(true);
        p2.setByTrain(true);
        p2.setByPlane(true);

        if(p.getByCar() & p.getDistance() <= car.getTraveldistance())
        {
            System.out.println(p.getPlace() + " " + p.getDistance() + " You can travel by Car");
            if(p.getByTrain() & p.getDistance() <= train.getTraveldistance())
            {
                System.out.println(p.getPlace() + " " + p.getDistance() + " You can travel by Train");
                if(p.getByPlane() & p.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p.getPlace() + " "+ p.getDistance() + " You can travel by Plane");
                }
            }
            else
            {
                if(p.getByPlane() & p.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p.getPlace() + " "+ p.getDistance() + " You can travel by Plane");
                }
            }
        }
        else
        {
            if(p.getByTrain() & p.getDistance() <= train.getTraveldistance())
            {
                System.out.println(p.getPlace() + " " + p.getDistance() + " You can travel by Train");
                if(p.getByPlane() & p.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p.getPlace() + " "+ p.getDistance() + " You can travel by Plane");
                }
            }
            else
            {
                if(p.getByPlane() & p.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p.getPlace() + " "+ p.getDistance() + " You can travel by Plane");
                }
            }
        }

        if(p1.getByCar() & p1.getDistance() <= car.getTraveldistance())
        {
            System.out.println(p1.getPlace() + " " + p1.getDistance() + " You can travel by Car");
            if(p1.getByTrain() & p1.getDistance() <= train.getTraveldistance())
            {
                System.out.println(p1.getPlace() + " " + p1.getDistance() + " You can travel by Train");
                if(p1.getByPlane() & p1.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p1.getPlace() + " "+ p1.getDistance() + " You can travel by Plane");
                }
            }
            else
            {
                if(p1.getByPlane() & p1.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p1.getPlace() + " "+ p1.getDistance() + " You can travel by Plane");
                }
            }
        }
        else
        {
            if(p1.getByTrain() & p1.getDistance() <= train.getTraveldistance())
            {
                System.out.println(p1.getPlace() + " " + p1.getDistance() + " You can travel by Train");
                if(p1.getByPlane() & p1.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p1.getPlace() + " "+ p1.getDistance() + " You can travel by Plane");
                }
            }
            else
            {
                if(p1.getByPlane() & p1.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p1.getPlace() + " "+ p1.getDistance() + " You can travel by Plane");
                }
            }
        }

        if(p2.getByCar() & p2.getDistance() <= car.getTraveldistance())
        {
            System.out.println(p2.getPlace() + " " + p2.getDistance() + " You can travel by Car");
            if(p2.getByTrain() & p2.getDistance() <= train.getTraveldistance())
            {
                System.out.println(p2.getPlace() + " " + p2.getDistance() + " You can travel by Train");
                if(p2.getByPlane() & p2.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p2.getPlace() + " "+ p2.getDistance() + " You can travel by Plane");
                }
            }
            else
            {
                if(p2.getByPlane() & p2.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p2.getPlace() + " "+ p2.getDistance() + " You can travel by Plane");
                }
            }
        }
        else
        {
            if(p2.getByTrain() & p2.getDistance() <= train.getTraveldistance())
            {
                System.out.println(p2.getPlace() + " " + p2.getDistance() + " You can travel by Train");
                if(p2.getByPlane() & p2.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p2.getPlace() + " "+ p2.getDistance() + " You can travel by Plane");
                }
            }
            else
            {
                if(p2.getByPlane() & p2.getDistance() <= plane.getTraveldistance())
                {
                    System.out.println(p2.getPlace() + " "+ p2.getDistance() + " You can travel by Plane");
                }
            }
        }
    }
}
