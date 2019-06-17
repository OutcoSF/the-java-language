package com.company.functional_programming;

class TeamMember {
    private String name;
    private int age;

    public TeamMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final static String stringing(Concat c, String s1, String s2) {
        return c.upperAndConcat(s1, s2);
    }

    @Override
    public String toString() {
        return name;
    }
}
