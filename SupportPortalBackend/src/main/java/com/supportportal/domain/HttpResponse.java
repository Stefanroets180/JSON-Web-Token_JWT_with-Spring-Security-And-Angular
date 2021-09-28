package com.supportportal.domain;

import org.springframework.http.HttpStatus;

public class HttpResponse {
    private int httpStatusCode; // example 200 rance successful,400 error on your part,500 server error
    private HttpStatus httpStatus;
    private String reason;
    private String messages;

    public HttpResponse() {}

    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String messages) {
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.messages = messages;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
