package com.johnmcgrath.springhelloworld;

/**
 * Created by john on 4/7/17.
 */
public class Animal {

    public String name;
    public String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return type != null ? type.equals(animal.type) : animal.type == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
