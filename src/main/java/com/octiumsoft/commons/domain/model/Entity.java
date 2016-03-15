package com.octiumsoft.commons.domain.model;

import javax.validation.constraints.NotNull;

public interface Entity<K> {
    @NotNull
    K getId();

    boolean equals(Object obj);
    int hashCode();
}
