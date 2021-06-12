package com.learncommons.learncommonsmscommons.model;

import com.learncommons.learncommonsmscommons.dto.DTOUser;
import com.learncommons.learncommonsmscommons.enumeration.Gender;
import org.springframework.beans.BeanUtils;

public class User {

    private int idUser;
    private String username;
    private String password;
    private Gender gender;


    public User() {
    }
    public User(int idUser, String username, String password, Gender gender) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.gender = gender;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    /*******************************************************************/


    public DTOUser toDTOUser(){
        DTOUser output = new DTOUser();
        BeanUtils.copyProperties(this, output);
        output.setGenderCode( this.gender.code );
        return output;
    }

}
