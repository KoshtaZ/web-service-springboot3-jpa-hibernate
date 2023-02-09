package com.educandoweb.course.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1, "Waiting payment"),
    PAID(2, "Paid"),
    SHIPPED(3, "Shipped"),
    DELIVERED(4, "Delivered"),
    CANCELAD(5, "Cancelad");

    private Integer code;
    private String descrition;

    OrderStatus(Integer code, String descrition) {
        this.code = code;
        this.descrition = descrition;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescrition() {
        return descrition;
    }

    public static OrderStatus toEnum(Integer code){
        if (code == null){
            return  null;
        }

        for (OrderStatus value: OrderStatus.values()){
            if (code.equals(value.getCode())){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code: " + code);
    }
}
