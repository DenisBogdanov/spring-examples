package ru.bogdaniium.xml_configuration.harry_potter;

public class Wizard {
    private String name;
    private Wand wand;

    public Wizard() {
    }

    public Wizard(Wand wand) {
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void performMagic() {
        System.out.print(name + " " + wand.applySpell());
    }
}
