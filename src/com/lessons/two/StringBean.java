package com.lessons.two;

/**
 * Date: 05/09/15
 *
 * @author keith
 */
public class StringBean {
    private final String name;
    private final boolean person;

    //public StringBean() {}
    public StringBean(String name, boolean person) {
        this.name = name;
        this.person = person;
    }

    public String getName() { return name; }
    //public void setName(String name) { this.name = name; }

    public boolean isPerson() { return person; }
    //public void setPerson(boolean person) { this.person = person; }


}
