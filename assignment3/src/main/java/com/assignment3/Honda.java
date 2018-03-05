package com.assignment3;

/**
 * Created by ajpGa on 2018/03/05.
 */
public class Honda extends Car{

    public Honda(String cMake, String cModel, int cYear)
    {
        super(cModel, cModel, cYear);
    }

    public String engine(){
        return "2.0 Vtec V8";
    }
}
