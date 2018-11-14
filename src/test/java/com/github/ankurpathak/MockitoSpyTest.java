package com.github.ankurpathak;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class MockitoSpyTest {

    private List<String> list = new ArrayList<>();

    @Test
    public void testDoSpa(){
        assertNotNull("list is mot null", list);
        assertThat(list, empty());
        list = spy(list);
        assertEquals("list must have expected size of 0",0,list.size());
        doReturn(5).when(list).size();
        assertEquals("list must have expected size of 5",5,list.size());
    }
}
