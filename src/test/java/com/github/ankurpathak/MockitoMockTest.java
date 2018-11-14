package com.github.ankurpathak;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

public class MockitoMockTest {

    private List<String> list;

    @Test
    @SuppressWarnings("unchecked")
    public void testDoMock(){
        list = mock(List.class);
        assertNotNull("list is not null", list);
    }


    @Test
    public void testNoDoMock(){
        assertNull("list is null", list);
    }
}
