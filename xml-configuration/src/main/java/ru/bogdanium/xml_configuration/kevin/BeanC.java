package ru.bogdanium.xml_configuration.kevin;

public class BeanC {

    private BeanD beanD;

    public BeanC(BeanD beanD) {
        System.out.println("In BeanC constructor");
        this.beanD = beanD;
    }
}
