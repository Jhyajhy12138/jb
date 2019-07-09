package com.zte.jb.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Author:helloboy
 * Date:2019-07-08 8:50
 * Description:<描述>
 */
public class CurrentDate {
    /**
     * 获取当前系统时间
     * @return String 当前系统时间
     */
    public static String getCurrentDate(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    }
}
