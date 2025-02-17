package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return i -> i.stream().map(n -> n/divider).collect(Collectors.toList());
    }
}
