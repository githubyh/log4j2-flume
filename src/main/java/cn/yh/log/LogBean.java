package cn.yh.log;

import java.io.Serializable;


public class LogBean implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String userId;
    private String hostName;
    private String eventType;
    private String logType; //1、后台功能日志 2、同步日志 3、接口日志
    private String logSource;
    private String logBody;
    private String level;
    private String timestamp;
    private String remoteAddr;
    private String requestBody;
    private String browser;
    private String responseBody;
    private String timeConsuming;
    private String requestUri;
    private String status;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogSource() {
        return logSource;
    }

    public void setLogSource(String logSource) {
        this.logSource = logSource;
    }

    public String getLogBody() {
        return logBody;
    }

    public void setLogBody(String logBody) {
        this.logBody = logBody;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public LogBean() {
    }

    public LogBean(String userId, String eventType, String logType,
                   String logSource, String logBody, String level, String timestamp,
                   String remoteAddr, String requestBody, String browser,
                   String responseBody, String timeConsuming, String requestUri,
                   String status) {
        super();
        this.userId = userId;
        this.eventType = eventType;
        this.logType = logType;
        this.logSource = logSource;
        this.logBody = logBody;
        this.level = level;
        this.timestamp = timestamp;
        this.remoteAddr = remoteAddr;
        this.requestBody = requestBody;
        this.browser = browser;
        this.responseBody = responseBody;
        this.timeConsuming = timeConsuming;
        this.requestUri = requestUri;
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("{\"userId\":\"").append(userId == null ? "" : userId)
                .append("\",\"eventType\":\"").append(eventType == null ? "" : eventType)
                .append("\",\"logType\":\"").append(logType == null ? "" : logType)
                .append("\",\"logSource\":\"").append(logSource == null ? "" : logSource)
                .append("\",\"logBody\":\"").append(logBody == null ? "" : logBody)
                .append("\",\"level\":\"").append(level == null ? "" : level)
                .append("\",\"timestamp\":\"").append(timestamp == null ? "" : timestamp)
                .append("\",\"remoteAddr\":\"").append(remoteAddr == null ? "" : remoteAddr)
                .append("\",\"requestBody\":\"").append(requestBody == null ? "" : requestBody)
                .append("\",\"browser\":\"").append(browser == null ? "" : browser)
                .append("\",\"responseBody\":\"").append(responseBody == null ? "" : responseBody)
                .append("\",\"timeConsuming\":\"").append(timeConsuming == null ? "" : timeConsuming)
                .append("\",\"requestUri\":\"").append(requestUri == null ? "" : requestUri)
                .append("\",\"status\":\"").append(status == null ? "" : status).append("\"}");
        return str.toString();
    }


}
