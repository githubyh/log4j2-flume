/*
 * 天虹商场股份有限公司版权所有
 */
package cn.yh.log;

import org.apache.commons.lang.time.FastDateFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Random;

/**
 * 日志采集客户端
 *
 */
public class LogClient {


	static Logger logger = LogManager.getLogger(LogClient.class.getName());
    

    /**
     * 警告日志
     *
     * @param header
     * @param body
     */
    public static void warn(String requestUri, String eventType , String userId, String browser,String body, String timeConsuming) {
    	LogBean log = new LogBean();
    	log.setBrowser(browser);
    	log.setLevel("warn");
    	log.setEventType(eventType);
//    	log.setLogType("2");
    	log.setRequestUri(requestUri);
    	log.setUserId(userId);
    	log.setLogBody(body);
    	log.setTimeConsuming(timeConsuming);
    	FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    	log.setTimestamp(format.format(new Date()));
    	log.setTimeConsuming(String.valueOf(new Random().nextInt(23456)));
    	logger.warn(log.toString());
    }
    
    /**
     * 警告日志
     *
     * @param header
     * @param body
     */
    public static void warn(String requestUri, String requestBody, String eventType ,String responseBody, String remoteAddr,String timeConsuming, String status) {
    	LogBean log = new LogBean();
    	log.setLevel("warn");
    	log.setEventType(eventType);
//    	log.setLogType("2");
    	log.setRequestUri(requestUri);
    	log.setRequestBody(requestBody);
    	log.setRemoteAddr(remoteAddr);
    	log.setStatus(status);
    	log.setResponseBody(responseBody);
    	log.setTimeConsuming(timeConsuming);
    	FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    	log.setTimestamp(format.format(new Date()));
    	log.setTimeConsuming(String.valueOf(new Random().nextInt(23456)));
    	logger.info(log.toString());
    }
    
    /**
     * 警告日志
     *
     * @param header
     * @param body
     */
    public static void warn(LogBean logbean) {
    	logger.warn(logbean.toString());
    }

    /**
     * 错误日志
     *
     * @param header
     * @param body
     */
    public static void error(LogBean logbean) {
    	logger.error(logbean.toString());
    }
    /**
     * 警告日志
     *
     * @param header
     * @param body
     */
    public static void info(String requestUri, String requestBody, String eventType ,String responseBody, String remoteAddr,String timeConsuming, String status) {
    	LogBean log = new LogBean();
    	log.setLevel("info");
    	log.setEventType(eventType);
//    	log.setLogType("2");
    	log.setRequestUri(requestUri);
    	log.setRequestBody(requestBody);
    	log.setRemoteAddr(remoteAddr);
    	log.setStatus(status);
    	log.setResponseBody(responseBody);
    	log.setTimeConsuming(timeConsuming);
    	FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    	log.setTimestamp(format.format(new Date()));
    	log.setTimeConsuming(String.valueOf(new Random().nextInt(23456)));
    	logger.info(log.toString());
    }
    /**
     * 警告日志
     *
     * @param header
     * @param body
     */
    public static void info(String requestUri, String eventType , String userId, String browser,String body,String timeConsuming) {
    	LogBean log = new LogBean();
    	log.setBrowser(browser);
    	log.setLevel("info");
    	log.setEventType(eventType);
//    	log.setLogType("2");
    	log.setRequestUri(requestUri);
    	log.setUserId(userId);
    	log.setLogBody(body);
    	log.setTimeConsuming(timeConsuming);
		FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS+08:00");
		log.setTimestamp(format.format(new Date()));
    	log.setTimeConsuming(String.valueOf(new Random().nextInt(23456)));
    	logger.info(log.toString());
    }
    /**
     * 信息日志
     * 
     * @param event
     * @param body 
     */
    public static void info(LogBean logbean) {
    	logger.info(logbean.toString());
    }
    
    /**
     * 信息日志
     * 
     * @param event
     * @param body 
     */
    public static void debug(LogBean logbean) {
    	logger.debug(logbean.toString());
    }

    /**
     * 获取主机地址信息
     *
     * @return
     */
    private static String getHostAddress() {
        String hostAddress;
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getLocalHost();
            hostAddress = inetAddress.getHostName() + "/" + inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            hostAddress = "unknown";
        }
        return hostAddress;
    }
    
}
