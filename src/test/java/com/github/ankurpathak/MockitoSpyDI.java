package com.github.ankurpathak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class MockitoSpyDI {

    @Spy
    private List<String> list = new ArrayList<>();

    @Test
    public void testDoSpa(){
        assertNotNull("list is mot null", list);
        assertThat(list, empty());
        assertEquals("list must have expected size of 0",0,list.size());
        doReturn(5).when(list).size();
        assertEquals("list must have expected size of 5",5,list.size());
    }
}
