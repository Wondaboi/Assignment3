package com.assignment3;

/**
 * Created by ajpGa on 2018/03/05.
 */
public class Mini extends Car{
    public Mini(String cMake, String cModel, int cYear)
    {
        super(cMake, cModel, cYear);
    }

    public String engine(){
        return "2.0 Cooper V8";
    }
}
