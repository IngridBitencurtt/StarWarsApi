package br.com.foguete.swapi.adapter.out.dto;


import java.util.List;

public class SwapiData<T> {
    private  Integer count;
    private  String next;
    private  String previous;
    private List<T> results;



    public Integer getCount() {
        return count;
    }

    public SwapiData setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getNext() {
        return next;
    }

    public SwapiData setNext(String next) {
        this.next = next;
        return this;
    }

    public String getPrevious() {
        return previous;
    }

    public SwapiData setPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    public List<T> getResults() {
        return results;
    }

    public SwapiData<T> setResults(List<T> results) {
        this.results = results;
        return this;
    }
}


