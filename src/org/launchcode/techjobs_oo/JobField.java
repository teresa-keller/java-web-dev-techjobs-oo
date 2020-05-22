package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value = "Data not available";

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public String toString() {
        if (value.equals("")) {
            return "Data not available";
        } else {
            return value;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
