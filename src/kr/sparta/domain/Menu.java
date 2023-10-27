package kr.sparta.domain;

public class Menu {
    private String name;
    private String desciption;

    public Menu(String name, String desciption) {
        this.name = name;
        this.desciption = desciption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", desciption='" + desciption + '\'' +
                '}';
    }
}
