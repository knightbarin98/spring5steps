package com.mrbarin.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


//Here is an example of how we would have been testing with mockito and with anotations
//For Junit5 is the way to run Mockito with annotations
//Fot Junti4 it would be
//@RunWith(MockitoJunitRunner.class)
@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    //This is the mock that we will use to test
    @Mock
    DataService dataServiceMock;

    //This is the class where all the mocks will be injected
    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void findTheGreatestFromAllData() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3});

        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(24,result);

    }

    @Test
    public void findTheGreatestFromAllData_ForOneValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});

        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(15,result);

    }

    @Test
    public void findTheGreatestFromAllData_NoValues() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[0]);

        int result = someBusiness.findTheGreatestFromAllData();
        assertEquals(15,result);

    }
}