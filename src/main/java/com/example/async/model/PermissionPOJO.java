package com.example.async.model;

public class PermissionPOJO {

    private String id;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PermissionPOJO(String id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return "PermissionPOJO{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
