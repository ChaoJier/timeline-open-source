package NovClient.CrashGG;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.main.Main;

public class CrashGG {

	public static boolean CheckRunCase() 
	{
		if(!Main.auto.contains("true"))Minecraft.getMinecraft().shutdownMinecraftApplet();
		String md5 = MD5(Main.Pass);
		String Cass = Main.Cass;
		if(md5 == null || Cass == null)return false;
//		System.out.println(md5.toUpperCase() +" " + Cass.toUpperCase());
		if(md5.toUpperCase().contains(Cass.toUpperCase()) || Cass.toUpperCase().contains(md5.toUpperCase())) {
			return true;
		}else {
			return false;
		}

		
	}
	public static String MD5(String key) {

	    char hexDigits[] = {
	            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
	    };
	    try {
	        byte[] btInput = key.getBytes();
	        // 获得MD5摘要算法的 MessageDigest 对象
	        MessageDigest mdInst = MessageDigest.getInstance("MD5");
	        // 使用指定的字节更新摘要
	        mdInst.update(btInput);
	        // 获得密文
	        byte[] md = mdInst.digest();
	        // 把密文转换成十六进制的字符串形式
	        int j = md.length;
	        char str[] = new char[j * 2];
	        int k = 0;
	        for (int i = 0; i < j; i++) {
	            byte byte0 = md[i];
	            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
	            str[k++] = hexDigits[byte0 & 0xf];
	        }
	        return new String(str);
	    } catch (Exception e) {
	        return null;
	    }
	}
	
}
