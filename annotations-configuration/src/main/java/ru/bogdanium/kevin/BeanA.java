package ru.bogdanium.kevin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private BeanB beanB;

    public BeanB getBeanB() {
        return beanB;
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
