package com.app.fruits;

public class Orange extends Fruits{
    public Orange() {
        super();
    }

    public Orange(String orange, double weight1, String name1, boolean b) {
        super(orange,weight1,name1,b);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String taste(){
        return "sour";
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public void setFresh(boolean fresh) {
        super.setFresh(fresh);
    }
}
