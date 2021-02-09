package org.launchcode.techjobs_oo.Main;

import java.util.Objects;

public abstract class JobField {
    public int id;
    private static int nextId = 1;
    public String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField (String value ) {
        this.value = value;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id &&
                Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode () {
        return Objects.hash(id, value);
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public static int getNextId () {
        return nextId;
    }

    public static void setNextId ( int nextId ) {
        JobField.nextId = nextId;
    }

    public String getValue () {
        return value;
    }

    public void setValue ( String value ) {
        this.value = value;
    }
}