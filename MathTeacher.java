package com.company;

public class MathTeacher extends Teacher {
    protected int math_skills;

    public MathTeacher(String name, int id_number, int math_skills) {
        super(name, id_number);
        this.math_skills = math_skills;
    }
}
