package org.czw.flight.utils.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zhiwei_CHEN
 * @date 2021/10/15 15:33
 */
public class Md5Utils {
    private static final String ENCRYPT_ALGORITHM = "MD5";

    public static String getMd5(String content){
        byte[] bytes = content.getBytes();
        try {
            MessageDigest md5 = MessageDigest.getInstance(ENCRYPT_ALGORITHM);
            StringBuffer sb = new StringBuffer();
            byte[] digestBytes = md5.digest(bytes);
            for (byte digestByte : digestBytes) {
                int i = digestByte & 0xff;

                String s = Integer.toHexString(i);
                if (s.length() == 1){
                    sb.append(0);
                }
                sb.append(s);
            }
            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        return "";
    }

    /**
     * encrypt with salt
     * @param content
     * @param salt
     * @return
     */
    public static String getMd5(String content,String salt){
        content = content + "$"+ salt + "$";
        return getMd5(content);
    }
}
