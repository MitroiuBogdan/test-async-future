package com.example.async.rest;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProviderRepo {

    private final List<String> list = new ArrayList<>();

    public void ProviderRepo() {

    }

    public void add(String s) {
        list.add(s);
    }

    public List<String> getList() {
        return list;
    }
}
