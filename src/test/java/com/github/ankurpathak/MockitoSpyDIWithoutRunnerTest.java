package com.github.ankurpathak;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

public class MockitoSpyDIWithoutRunnerTest {

    @Spy
    private List<String> list = new ArrayList<>();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoSpa(){
        assertNotNull("list is mot null", list);
        assertThat(list, empty());
        assertEquals("list must have expected size of 0",0,list.size());
        doReturn(5).when(list).size();
        assertEquals("list must have expected size of 5",5,list.size());
    }
}
