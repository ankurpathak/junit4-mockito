package com.github.ankurpathak;

import java.util.List;

public class DemoServiceConstructor {
    private final List<String> list;

    public DemoServiceConstructor(List<String> list) {
        this.list = list;
    }


    public List<String> getList() {
        return list;
    }
}
