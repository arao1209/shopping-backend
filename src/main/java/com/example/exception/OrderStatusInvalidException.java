package com.example.exception;

public class OrderStatusInvalidException extends RuntimeException{

    private final String status;
    private final String id;

    public OrderStatusInvalidException(String id, String status){
        this.id = id;
        this.status = status;
    }

   public String getStatus(){
        return status;
   }

   public String getId(){
        return id;
   }

}

