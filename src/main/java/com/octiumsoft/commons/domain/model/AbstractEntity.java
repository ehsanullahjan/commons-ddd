package com.octiumsoft.commons.domain.model;

public abstract class AbstractEntity<K> implements Entity<K> {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AbstractEntity<?>)) {
            return false;
        }

        AbstractEntity<?> other = (AbstractEntity<?>)obj;
        return getId().equals(other.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
               "id=" + getId() +
               '}';
    }
}
