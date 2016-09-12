package cn.yh.log;

import org.apache.commons.lang.time.FastDateFormat;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class WriteLog {
  
    static  int count = 0 ;
    /** 
     * @param args 
     * @throws InterruptedException  
     */  
    public static void main(String[] args) throws InterruptedException {  
    	
    	 System.out.println("雅莉姿新款女靴韩版英伦马丁靴中跟女鞋复古短靴女及踝靴潮雅莉姿新款女靴韩版英伦马丁靴中跟女鞋复古短靴女及踝靴潮雅莉姿新款".length());
         ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
			final boolean[] flag = {true};
        	executor.submit(new Runnable() {
                public void run() {
                	LogBean log = new LogBean();
                	log.setBrowser("gg");
                	log.setEventType("商品修改");
                	log.setLogType("2");
                	log.setRequestUri("product/update.do");
                	log.setUserId("2256");
                	log.setLogBody("We are Chinese, Taiwan is China.");
                	FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                	log.setTimestamp(format.format(new Date()));
                	log.setTimeConsuming(String.valueOf(new Random().nextInt(23456)));
                	while (flag[0]) {
//						flag[0] = false;
//                		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>"+Thread.currentThread().getName());
                		Random ra =new Random();
                	        //每隔两秒log输出一下当前系统时间戳  
//                				ThlogClient.info(log);
                		LogClient.info("product/update.do", "2000支付配送方式修改", String.valueOf(ra.nextInt(10000)), "ie", Thread.currentThread().getName()+"修改成功",String.valueOf(ra.nextInt(1000)));
//                	            Thread.sleep(50);
                	            count ++ ;
                	            try {
									Thread.sleep(ra.nextInt(50));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                	        } 
                }
            });
		} 
        
        
       
    }  
}  