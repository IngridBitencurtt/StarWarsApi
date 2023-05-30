package br.com.foguete.swapi.adapter.out.dto;


import java.util.List;

public class SwapiData2 {
    private  Integer count;
    private  String next;
    private  String previous;
    private List<PlanetsDto> results;



    public Integer getCount() {
        return count;
    }

    public SwapiData2 setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getNext() {
        return next;
    }

    public SwapiData2 setNext(String next) {
        this.next = next;
        return this;
    }

    public String getPrevious() {
        return previous;
    }

    public SwapiData2 setPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    public List<PlanetsDto> getResults() {
        return results;
    }

    public SwapiData2 setResults(List<PlanetsDto> results) {
        this.results = results;
        return this;
    }
}


