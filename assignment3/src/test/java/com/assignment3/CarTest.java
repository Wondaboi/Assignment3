package com.assignment3;

import junit.framework.TestCase;
import java.util.*;



/**
 * Created by ajpGa on 2018/03/05.
 */
public class CarTest extends TestCase {

    List<CarInterface> carList = new ArrayList();
    Set<CarInterface> hashSet = new HashSet();
    Map<String, CarInterface> hashMap = new HashMap();

    Mini mini = new Mini("Mini", "Cooper Clubman", 2011);
    Mini mini2 = new Mini("Mini", "Cooper Convertable", 2013);
    Mini mini3 = new Mini("Mini", "Cooper Hardtop", 2015);

    Honda honda = new Honda("Honda", "Accord", 2011);

    Subaru subaru = new Subaru("Subaru", "Impreza", 2011);


    public void testListObjectNotSame() throws Exception
    {
        carList.add(0, mini);
        carList.add(1, honda);
        carList.add(2, subaru);

        assertNotSame(carList.get(0).engine(),carList.get(1).engine());
    }


    public void testHashSetOjectNotNull() throws Exception
    {
        hashSet.add(mini2);
        hashSet.add(mini3);

        assertNotNull(hashSet);
    }


    public void testHashMapObjectNull() throws Exception
    {
        hashMap.put("2", mini3);
        assertNull(hashMap.get("3"));
    }



}