package ru.bogdaniium.xml_configuration.harry_potter;

public class Wand {

    private String spell;

    public Wand(String spell) {
        this.spell = spell;
    }

    public String applySpell() {
        return "shouted " + spell + "\n";
    }
}
