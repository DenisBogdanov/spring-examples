package ru.bogdanium.xml_configuration.harry_potter;

public class HogwartsBattle implements Battle {
    private Wizard first;
    private Wizard second;

    public Wizard getFirst() {
        return first;
    }

    public void setFirst(Wizard first) {
        this.first = first;
    }

    public Wizard getSecond() {
        return second;
    }

    public void setSecond(Wizard second) {
        this.second = second;
    }

    @Override
    public void start() {
        first.performMagic();
        second.performMagic();
    }

    @Override
    public void postInit() {
        System.out.println("==========");
        System.out.println("Everyone is watching...");
    }

    @Override
    public void preDestroy() {
        System.out.println("Everyone is happy!!!");
        System.out.println("==========");
    }
}
