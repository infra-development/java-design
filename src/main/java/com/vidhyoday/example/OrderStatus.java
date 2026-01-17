package com.vidhyoday.example;

public enum OrderStatus {
    CREATED(false) {
        public boolean something() {
            return true;
        }
    },
    PAID(false) {
        @Override
        public boolean something() {
            return false;
        }
    },
    SHIPPED(false) {
        @Override
        public boolean something() {
            return false;
        }
    },
    DELIVERED(true) {
        @Override
        public boolean something() {
            return false;
        }
    };

    private final boolean isFinal;

    OrderStatus(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public abstract boolean something();
}
