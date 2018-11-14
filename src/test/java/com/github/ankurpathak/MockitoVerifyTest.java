package com.github.ankurpathak;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoVerifyTest {

    @Mock
    private List<String> list;

    @Test
    public void testDoVerify(){
        doReturn(4, 5).when(list).size();
        verifyZeroInteractions(list);
        assertEquals(4, list.size());
        assertEquals(5, list.size());
        verify(list, times(2)).size();
        verify(list, never()).clear();
        verifyNoMoreInteractions(list);
    }

}
