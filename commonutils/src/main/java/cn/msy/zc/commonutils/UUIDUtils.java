package cn.msy.zc.commonutils;

import java.util.UUID;

/**
 * Created by hxy on 2016/9/20 0020.
 * description : uuid唯一标志码生成工具
 */

public class UUIDUtils {
    public static String[] chars = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"};

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 获取8位的uuid
     *
     * @return
     */
    public static String getShortUuid() {
        StringBuffer stringBuffer = new StringBuffer();
        String uuid = getUUID();
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int strInteger = Integer.parseInt(str, 16);//把uuid每4位一组,转为16进制数
            stringBuffer.append(chars[strInteger % 0x3E]);//0X 表示16进制  代表模以62
        }
        return stringBuffer.toString();
    }

}
