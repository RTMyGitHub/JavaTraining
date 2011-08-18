/*
 *    Copyright &copy; Flagstar Bank 2011.
 *
 *    Copyright in the application source code, and in the information and
 *    material therein and in their arrangement, is owned by Flagstar Bank, FSB
 *    unless otherwise indicated.
 *
 *    You shall not remove or obscure any copyright, trademark or other notices.
 *    You may not copy, republish, redistribute, transmit, participate in the
 *    transmission of, create derivatives of, alter edit or exploit in any
 *    manner any material including by storage on retrieval systems, without the
 *    express written permission of Flagstar Bank.
 */

package com.training.java.core.inheritance;

/**
 * Car.
 *
 * @author  Venkata Hari
 */

public class Car
{
    private static int maximumSpeed = 140;
    private int currentSpeed;
    private boolean started;
    
    public void start()
    {
        System.out.println("Car is starting");
        started = true;
    }

    public void stop()
    {
        System.out.println("Car is stopping");
        started = false;
    }
    
    public void accelerate(int increment)
    {
        System.out.println("Car is accelerating");
        currentSpeed += increment;
    }
    
    public void applyBrakes(int decrement)
    {
        System.out.println("Applying brakes for Car");
        currentSpeed -= decrement;
    }
    
    public void printInformation()
    {
        System.out.println("started == " + started);
        System.out.println("currentSpeed == " + currentSpeed);
    }
}
