package com.pluralsight.decorator;

public class DressingDecorator extends SandwichDecorator{

    //adds functionality through composition
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }
    private String addDressing() {
        return " + mustard";
    }
}
