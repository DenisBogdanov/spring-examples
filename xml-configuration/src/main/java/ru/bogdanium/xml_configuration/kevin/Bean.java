package ru.bogdanium.xml_configuration.kevin;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bean {

    private List<String> list;

    private Map<String, String> map;

    private Set<String> set;

    public Bean() {
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}
