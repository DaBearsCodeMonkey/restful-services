package com.carlos.weightlossprogram.weightloss.mifflintdee;

class MifflinTdeePayload {
    private int heightFeet;
    private int heightInches;
    private int weight;
    private int age;
    private char gender;

    public MifflinTdeePayload() {
    }

    public MifflinTdeePayload(int heightFeet, int heightInches, int weight, int age, char gender) {
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
