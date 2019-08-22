package ru.yandex.qatools.htmlelements.model;

public class SelectValueModel {
    private String value;
    private FillStrategy strategy;


    public SelectValueModel(String value) {
        this(value, FillStrategy.VALUE);
    }

    public SelectValueModel(String value, FillStrategy strategy) {
        this.value = value;
        this.strategy = strategy;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FillStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(FillStrategy strategy) {
        this.strategy = strategy;
    }

    public enum FillStrategy {
        VALUE,
        TEXT,
        INDEX;
    }
}
