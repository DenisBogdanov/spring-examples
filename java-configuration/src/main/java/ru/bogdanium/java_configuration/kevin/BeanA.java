package ru.bogdanium.java_configuration.kevin;

public class BeanA {

    private BeanB beanB;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    public void execute() {
        System.out.println(beanB.getMessage());
    }
}
