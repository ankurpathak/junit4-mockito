package com.github.ankurpathak;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDI {

    @Mock
    private List<String> list;

    @InjectMocks
    private DemoServiceConstructor demoServiceConstructor;


    @InjectMocks
    private DemoServiceField demoServiceField;


    @Test
    public void tesDiConstructor(){
        assertNotNull(list);
        assertNotNull(demoServiceConstructor);
        doReturn(5).when(list).size();
        assertEquals(5, demoServiceConstructor.getList().size());
    }

    @Test
    public void tesDiField(){
        assertNotNull(list);
        assertNotNull(demoServiceField);
        doReturn(10).when(list).size();
        assertEquals(10, demoServiceField.getList().size());
    }
}
