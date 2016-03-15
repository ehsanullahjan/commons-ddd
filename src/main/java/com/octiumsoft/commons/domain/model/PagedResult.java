package com.octiumsoft.commons.domain.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

public class PagedResult<E> {
    private final int pageNumber;
    private final int pageSize;
    private final long pageCount;
    private List<E> entities;

    public PagedResult(@Min(0) int pageNumber,
                       @Min(1) int pageSize,
                       @Min(0) long pageCount,
                       @NotNull List<E> entities) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.entities = Collections.unmodifiableList(entities);
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
    public List<E> getEntities() {
        return entities;
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
