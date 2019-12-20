package com.example.creativelistview.data;

import java.util.List;

public class SimpleData {
    private String partyName, dishNumebr, itemNumber;
    private List<String> thumbnails;

    public SimpleData(String partyName, String dishNumebr, String itemNumber, List<String> thumbnails) {
        this.partyName = partyName;
        this.dishNumebr = dishNumebr;
        this.itemNumber = itemNumber;
        this.thumbnails = thumbnails;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getDishNumebr() {
        return dishNumebr;
    }

    public void setDishNumebr(String dishNumebr) {
        this.dishNumebr = dishNumebr;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public List<String> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<String> thumbnails) {
        this.thumbnails = thumbnails;
    }
}
