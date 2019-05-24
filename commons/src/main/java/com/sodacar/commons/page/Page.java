package com.sodacar.commons.page;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bosong
 */
public class Page<T> {

    @JsonProperty("page")
    private long page;

    @JsonProperty("per_page")
    private long perPage;

    @JsonProperty("entries")
    private List<T> entries;

    @JsonProperty("total_count")
    private long totalEntriesCount;

    @JsonProperty("total_page")
    private long totalPage;

    public Page(long totalEntriesCount, long page, long perPage, List<T> entries) {
        this.totalEntriesCount = totalEntriesCount;
        this.page = page;
        this.perPage = perPage;
        this.entries = entries;
        this.totalPage = totalPage();
    }

    public long getPage() {
        return page;
    }

    public long totalPage() {
        long round = totalEntriesCount / perPage;
        long residual = totalEntriesCount % perPage;
        return totalEntriesCount > 0 ? residual > 0 ? round + 1 : round : 0;
    }

    public long getTotalEntriesCount() {
        return totalEntriesCount;
    }

    public long getPerPage() {
        return perPage;
    }

    public List<T> getEntries() {
        return entries;
    }

    public long getTotalPage() {
        return totalPage;
    }
}