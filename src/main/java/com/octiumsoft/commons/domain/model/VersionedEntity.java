package com.octiumsoft.commons.domain.model;

import javax.validation.constraints.Min;

public abstract class VersionedEntity<T> extends AbstractEntity<T> {
    private int version;

    public VersionedEntity() {
        this.version = 0;
    }

    @Min(0)
    public int getVersion() {
        return version;
    }

    protected void setVersion(int version) {
        assert version >= 0;
        this.version = version;
    }
}
