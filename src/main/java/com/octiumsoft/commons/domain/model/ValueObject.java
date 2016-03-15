package com.octiumsoft.commons.domain.model;

public interface ValueObject {
    boolean equals(Object obj);
    int hashCode();
}
