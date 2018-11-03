package com.github.ankurpathak;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockitoMockDI {

    @Mock
    private List<String> list;




    @Test
    public void testDoMock(){
        Assert.assertNotNull("list is not null", list);
    }
}
