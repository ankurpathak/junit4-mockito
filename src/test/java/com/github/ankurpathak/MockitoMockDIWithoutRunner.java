package com.github.ankurpathak;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class MockitoMockDIWithoutRunner {

    @Mock
    private List<String> list;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }




    @Test
    public void testDoMock(){
        Assert.assertNotNull("list is not null", list);
    }
}
