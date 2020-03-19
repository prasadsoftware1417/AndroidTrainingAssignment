package com.example.recycleviewimplementation;

public class ContactPOJO {
    private String mName;
    private String mNumber;
    private String mAddedOn;

    public ContactPOJO() {} //default constructor
    // Argument Constructor
    public ContactPOJO(String name, String number, String addedOn) {
        mName = name;
        mNumber = number;
        mAddedOn = addedOn;
    }

    public String getmAddedOn() {
        return mAddedOn;
    }

    public String getmName() {
        return mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmAddedOn(String mAddedOn) {
        this.mAddedOn = mAddedOn;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
