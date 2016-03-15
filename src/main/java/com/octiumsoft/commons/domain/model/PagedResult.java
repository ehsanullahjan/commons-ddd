package com.octiumsoft.commons.domain.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;

public class PagedResult<E> {
    private final int pageNumber;
    private final int pageSize;
    private final int pageCount;
    private Collection<E> items;

    public PagedResult(@Min(0) int pageNumber,
                       @Min(1) int pageSize,
                       @Min(0) int pageCount,
                       @NotNull Collection<E> items) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.items = Collections.unmodifiableCollection(items);
    }

    @Min(0)
    public int getPageNumber() {
        return pageNumber;
    }

    @Min(1)
    public int getPageSize() {
        return pageSize;
    }

    @Min(0)
    public long getPageCount() {
        return pageCount;
    }

    @NotNull
    public Collection<E> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "PagedResult{" +
               "pageNumber=" + pageNumber +
               ", pageSize=" + pageSize +
               ", pageCount=" + pageCount +
               '}';
    }
}
