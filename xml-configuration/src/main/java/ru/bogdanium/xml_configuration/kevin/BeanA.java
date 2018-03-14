package ru.bogdanium.xml_configuration.kevin;

public class BeanA {
    private BeanB beanB;
    private BeanC beanC;

    public BeanA(BeanB beanB, BeanC beanC) {
        System.out.println("In BeanA constructor!");
        this.beanB = beanB;
        this.beanC = beanC;
    }
}
