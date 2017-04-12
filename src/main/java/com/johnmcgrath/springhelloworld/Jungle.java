package com.johnmcgrath.springhelloworld;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by john on 4/7/17.
 */
public class Jungle {

   private Map<String,String> foods = new HashMap<String, String >();
   private Map<String, Animal> animals = new HashMap<String, Animal>();

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "foods=" + foods +
                ", animals=" + animals +
                '}';
    }
}
