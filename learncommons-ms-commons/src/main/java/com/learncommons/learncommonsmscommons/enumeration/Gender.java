package com.learncommons.learncommonsmscommons.enumeration;

public enum Gender {

    FEMALE  (0, "F"),
    MALE    (1, "M");


    public int id;
    public String code;

    Gender(int id, String code) {
        this.id = id;
        this.code = code;
    }
}
