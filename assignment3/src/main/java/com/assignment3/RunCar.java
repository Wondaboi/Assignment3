package com.assignment3;

import java.util.*;

/**
 * Created by ajpGa on 2018/03/05.
 */
public class RunCar {
    public static void main(String[] args)
    {
        List<CarInterface> carList = new ArrayList();
        Set<CarInterface> hashSet = new HashSet();
        Map<String, CarInterface> hashMap = new HashMap();

        Mini mini = new Mini("Mini", "Cooper Clubman", 2011);
        Mini mini2 = new Mini("Mini", "Cooper Convertable", 2013);
        Mini mini3 = new Mini("Mini", "Cooper Hardtop", 2015);

        Honda honda = new Honda("Honda", "Accord", 2011);
        Honda honda2 = new Honda("Honda", "Civic", 2013);
        Honda honda3 = new Honda("Honda", "Ballade", 2015);

        Subaru subaru = new Subaru("Subaru", "Impreza", 2011);
        Subaru subaru2 = new Subaru("Subaru", "Legacy", 2013);
        Subaru subaru3 = new Subaru("Subaru", "WRX", 2015);



        carList.add(mini);
        carList.add(mini2);
        carList.add(mini3);
        carList.add(honda);
        carList.add(honda2);
        carList.add(honda3);
        carList.add(subaru);
        carList.add(subaru2);
        carList.add(subaru3);


        hashSet.add(mini);
        hashSet.add(mini2);
        hashSet.add(mini3);
        hashSet.add(honda);
        hashSet.add(honda2);
        hashSet.add(honda3);
        hashSet.add(subaru);
        hashSet.add(subaru2);
        hashSet.add(subaru3);

        hashMap.put("1", mini);
        hashMap.put("2", honda);
        hashMap.put("3", subaru);

        for(int i=0; i<carList.size(); i++)
        {
            System.out.println(carList.get(i) + "\nengine: " + carList.get(i).engine());
        }
        System.out.println(hashSet);
        System.out.println(hashMap);

    }
}
