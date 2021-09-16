package com.denis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DriverDoc {
    public enum Category{B, C, D, E}
    private List<Category> categoriesList = new ArrayList<>();

    private Date dateGetDoc;
    private Date validity;

    public DriverDoc() {

    }

    public DriverDoc(Date dateGetDoc, Category category, Date validity) {
        this.dateGetDoc = dateGetDoc;
        this.categoriesList.add(category);
        this.validity = validity;
    }

    public List<Category> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<Category> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public Date getDateGetDoc() {
        return dateGetDoc;
    }

    public void setDateGetDoc(Date dateGetDoc) {
        this.dateGetDoc = dateGetDoc;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "DriverDoc{" +
                "categoriesList=" + categoriesList +
                ", dateGetDoc=" + dateGetDoc +
                ", validity=" + validity +
                '}';
    }
}
