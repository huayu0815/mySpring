package com.huayu.study.main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhaohuayu on 17/3/31.
 */
/*@Aspect
@Component*/
public class TimeInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(TimeInterceptor.class);

    public static final String POINT = "execution (* com.xiaoju.ecom.ugcui.core.service.impl.*.*(..))";


    @Around(POINT)
    public Object timeAround(ProceedingJoinPoint  joinPoint) {
        Object[] args = joinPoint.getArgs();
        Object returnObj = null;
        long beginTime = System.currentTimeMillis();
        try{
            returnObj = joinPoint.proceed(args);
        } catch (Throwable e) {
            logger.error("timeAround error:", e);
        }
        long endTime = System.currentTimeMillis();

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        logger.info("timeAround,class:{},method:{},time:{}", joinPoint.getTarget().getClass(), signature.getDeclaringTypeName(),endTime - beginTime);
        return returnObj;
    }
}
