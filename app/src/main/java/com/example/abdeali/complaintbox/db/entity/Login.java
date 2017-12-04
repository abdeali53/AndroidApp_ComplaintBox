package com.example.abdeali.complaintbox.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Abdeali on 04-12-2017.
 */

@Entity
public class Login {

    @PrimaryKey(autoGenerate = true)
    private  int Id;
    private String EmailId;
    private  String FullName;
    private String Password;
    private Boolean IsLoginType;

    //private Date CreatedDate;

    public Login(int id, String emailId, String fullName, String password, Boolean isLoginType){
        Id = id;
        EmailId = emailId;
        FullName = fullName;
        Password = password;
        IsLoginType = isLoginType;
    }



}
