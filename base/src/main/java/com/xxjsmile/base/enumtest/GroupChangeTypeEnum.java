package com.xxjsmile.base.enumtest;

public enum GroupChangeTypeEnum {

    CREATE("create"),
    CHANGEOWNER("changeOwner"),
    CHANGENAME("changeName"),
    CHANGENOTICE("changeNotice"),
    DISMISS("dismiss");

    private String name;


    GroupChangeTypeEnum(String name) {
        this.name = name;
    }
}
