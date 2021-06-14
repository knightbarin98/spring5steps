package com.mrbarin.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test(){
        List listMock = mock(List.class);
        //it return the value that at last you ask for
        //for example in this test we ask for ten so how we ask for ten as the last thing it will always return 10
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
        assertEquals(10, listMock.size());
    }

    @Test
    public void testSize_multipleReturns(){
        List listMock = mock(List.class);
        //the same for here we can ask to return multiple values but if compare more times
        //than the returns that we have asked, the every last compare would be done after the last return
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(20, listMock.size());
    }

    @Test
    public void testGet(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Some string");
        //In this case with list, every time we specify to get certain index and ask for the return it will only return
        //the value for that specific index, the others would be null
        assertEquals("Some string", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGet_GenericParameter(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Some string");
        assertEquals("Some string", listMock.get(0));
        assertEquals("Some string", listMock.get(1));
    }

}
