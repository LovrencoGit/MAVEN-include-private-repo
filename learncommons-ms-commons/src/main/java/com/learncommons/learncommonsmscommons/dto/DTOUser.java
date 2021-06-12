package com.learncommons.learncommonsmscommons.dto;

public class DTOUser {

    private int idUser;
    private String username;
    private String genderCode;


    public DTOUser() {
    }
    public DTOUser(int idUser, String username, String genderCode) {
        this.idUser = idUser;
        this.username = username;
        this.genderCode = genderCode;
    }


    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getGenderCode() {
        return genderCode;
    }
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

}
