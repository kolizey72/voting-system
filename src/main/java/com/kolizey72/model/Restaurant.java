package com.kolizey72.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Restaurant {

    private Long id;

    private String name;

    private List<Meal> menu;

    public Restaurant() {
    }

    public Restaurant(Long id, String name, List<Meal> menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }

    public Restaurant(String name, List<Meal> menu) {
        this(null, name, menu);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Meal> getMenu() {
        return List.copyOf(menu);
    }

    public void setMenu(Collection<Meal> menu) {
        this.menu = new ArrayList<>(menu);
    }
}
