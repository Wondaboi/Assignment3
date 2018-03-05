package com.assignment3;

/**
 * Created by ajpGa on 2018/03/05.
 */
public abstract class Car implements CarInterface {

    private String cMake;
    private String cModel;
    private int cYear;

    public Car(String cMake, String cModel, int cYear)
    {
        this.cMake = cMake;
        this.cModel = cModel;
        this.cYear = cYear;
    }

    public void setCMake(String cMake)
    {
        this.cMake = cMake;
    }

    public void setCModel(String cModel)
    {
        this.cModel = cModel;
    }

    public void setCYear(int cYear)
    {
        this.cYear = cYear;
    }

    public String getCMake(){ return cMake; }

    public String getCModel(){ return cModel; }

    public int getCYear(){ return cYear; }

    public String toString()
    {
        return "Make: " + getCMake() + "\nModel: " + getCModel() + "\nYear: " + getCYear();
    }

}
