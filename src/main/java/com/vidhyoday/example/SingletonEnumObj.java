package com.vidhyoday.example;

public enum SingletonEnumObj {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Singleton Enum!");
    }
}
