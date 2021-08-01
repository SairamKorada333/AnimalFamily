package com.singtel.animal.model;

public interface Animal {
    default String getName() {
        return this.getClass().getSimpleName();
    }
}
