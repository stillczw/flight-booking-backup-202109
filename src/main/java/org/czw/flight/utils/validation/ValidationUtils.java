package org.czw.flight.utils.validation;

/**
 * <li>此类负责数据验证，验证数据类型包括：int、string、double、date</li>
 */
public class ValidationUtils {
    /**
     * 字符串验证
     * @param str 表示要执行验证的字符串
     * @return
     */
    public static boolean isString(String str){
        if(str == null || "".equals(str)){
            return false;
        }
        return true;
    }

    /**
     * 数字验证
     * @param str 表示要执行验证的数字
     * @return
     */
    public static boolean isInt(String str){
        if(isString(str)){
            return str.matches("\\d+");
        }
        return false;
    }
    /**
     * 小数验证
     * @param str 表示要执行验证的数字
     * @return
     */
    public static boolean isDouble(String str){
        if(isString(str)){
            return str.matches("\\d+(\\.+\\d+)?");
        }
        return false;
    }

    /**
     * 对日期进行验证操作
     * @param str 表示要执行验证的日期字符串
     * @return
     */
    public static boolean isDate(String str){
        if(isString(str)){
           if(str.matches("\\d{4}-\\d{2}-\\d{2}")) {
               return true;
           }else{
               return str.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
           }
        }
        return false;
    }
}
