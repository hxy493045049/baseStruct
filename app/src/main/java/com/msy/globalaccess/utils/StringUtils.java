package com.msy.globalaccess.utils;

/**
 * Created by WuDebin on 2017/4/10.
 */

public class StringUtils {

    static String[] units = { "", "十", "百", "千", "万", "十万", "百万", "千万", "亿",
            "十亿", "百亿", "千亿", "万亿" };
    static char[] numArray = { '零', '一', '二', '三', '四', '五', '六', '七', '八', '九' };

    /**
     *
     * 数字转汉字
     * @param num
     * @return
     */
    public static String toHanzi(int num) {
        char[] val = String.valueOf(num).toCharArray();
        int len = val.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String m = val[i] + "";
            int n = Integer.valueOf(m);
            boolean isZero = n == 0;
            String unit = units[(len - 1) - i];
            if (isZero) {
                if ('0' == val[i - 1]) {
                    // not need process if the last digital bits is 0
                    continue;
                } else {
                    // no unit for 0
                    if(i!=len-1) {
                        sb.append(numArray[n]);
                    }
                }
            } else {
                if(n!=1||i!=0||len!=2) {
                    sb.append(numArray[n]);
                }
                sb.append(unit);
            }
        }
        return sb.toString();
    }
}
