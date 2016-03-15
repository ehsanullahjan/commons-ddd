package com.octiumsoft.commons.domain.model;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Optional;

public interface Repository<K, E extends AggregateRoot<K>> {
    @NotNull
    Optional<E> find(@NotNull K id);

    @NotNull
    @Valid
    PagedResult<E> list(@Min(0) int pageNumber, @Min(1) int pageSize);
}
