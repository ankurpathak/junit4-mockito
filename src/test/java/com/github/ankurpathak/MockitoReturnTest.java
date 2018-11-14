package com.github.ankurpathak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MockitoReturnTest {

    @Mock
    private List<String> list;

    @Test
    public void testDoReturnFirstStyle() {
        when(list.size()).thenReturn(4);
        assertEquals(4, list.size());
    }


    @Test
    public void testDoReturnSecondStyle() {
        doReturn(5).when(list).size();
        assertEquals(5, list.size());
    }

    @Test
    public void testDoReturnMultipleSecondStyle1() {
        doReturn(4,5).when(list).size();
        assertEquals(4, list.size());
        assertEquals(5, list.size());
    }

    @Test
    public void testDoReturnMultipleSecondStyle2() {
        doReturn(4 ).doReturn(5).when(list).size();
        assertEquals(4, list.size());
        assertEquals(5, list.size());
    }


    @Test
    public void testDoReturnMultipleFirstStyle1() {
        when(list.size()).thenReturn(4).thenReturn(5);
        assertEquals(4, list.size());
        assertEquals(5, list.size());
    }

    @Test
    public void testDoReturnMultipleFirstStyle2() {
        when(list.size()).thenReturn(4, 5);
        assertEquals(4, list.size());
        assertEquals(5, list.size());
    }

}
