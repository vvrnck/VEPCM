package com.uff.br.utils;

public class RequestStatus {
    private int status;
    private Object data;

    public RequestStatus (int code, Object data) {
            this.status = code;
            this.data = data;
    }

    public RequestStatus (int code) {
        this.status = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
