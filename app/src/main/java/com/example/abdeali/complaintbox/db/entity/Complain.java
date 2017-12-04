package com.example.abdeali.complaintbox.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

import java.util.Date;

/**
 * Created by Abdeali on 04-12-2017.
 */

@Entity(foreignKeys = @ForeignKey(entity = Login.class,
        parentColumns = "Id",
        childColumns = "UserId"))
public class Complain {
    private int Id;
    private int UserId;
    private String ComplainText;
    private String Category;
    private String Description;
    private Boolean IsAnonymous;
    private double Latitude;
    private double Longitude;
    private Date CreatedDate;
    //{Pending = 0, Approved = 1, Rejected = 2}
    private int ComplainStatus;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] Image;

}
