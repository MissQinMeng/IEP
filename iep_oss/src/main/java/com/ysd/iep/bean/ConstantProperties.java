package com.ysd.iep.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConstantProperties{
    public static String SPRING_OSS_ENDPOINT="oss-cn-beijing.aliyuncs.com";
    public static String SPRING_OSS_ACCESS_KEY_ID="";
    public static String SPRING_OSS_ACCESS_KEY_SECRET="";
    public static String SPRING_OSS_BUCKET_NAME="iep-oss";
    public static String PATH_PREFIX="http://iep-oss.oss-cn-beijing.aliyuncs.com/";
}
