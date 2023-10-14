package com.app.fruits;

public class Apple extends Fruits{

    public Apple() {
        super();
    }

    public Apple(String apple, double weight2, String name2, boolean b) {
        super(apple,weight2,name2,b);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String taste(){
        return "sweet n sour";
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
