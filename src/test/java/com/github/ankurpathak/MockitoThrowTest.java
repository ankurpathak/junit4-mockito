package com.github.ankurpathak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoThrowTest {

    @Mock
    private List<String> list;

    @Test(expected = RuntimeException.class)
    public void testDoThrowFirstStyle(){
        when(list.size()).thenThrow();
        list.size();
    }


    @Test(expected = RuntimeException.class)
    public void testDoThrowSecondStyle(){
        doThrow(RuntimeException.class).when(list).size();
        list.size();
    }
}
