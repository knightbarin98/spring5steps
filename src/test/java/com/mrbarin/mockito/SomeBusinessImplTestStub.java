package com.mrbarin.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//Here is an example of how we would have been testing without mockito
//Using a stub in order to test the class with the necessary instance

class SomeBusinessImplTestStub {

    @Test
    public void findTheGreatestFromAllData() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(24,result);
    }
}


class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int [] {24,6,15};
    }
}