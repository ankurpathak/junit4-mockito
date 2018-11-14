package com.github.ankurpathak;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoArgumentCaptorTest {

    @Mock
    private List<String> list;

    private ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
    private ArgumentCaptor<Integer> captorInt = ArgumentCaptor.forClass(int.class);


    @Test
    @Ignore
    public void testArgumentCaptor(){
        doNothing().doNothing().when(list).add(anyInt(), anyString());
        list.add(1, "Ankur");
        list.add(1, "Pathak");
        verify(list).add(captorInt.capture(), captor.capture());
        assertThat(captorInt.getAllValues(), hasItems(1,1));
        assertThat(captor.getAllValues(), hasItems("Ankur", "Pathak"));
    }
}
