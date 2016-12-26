/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class449 {
	int anInt4926;
	static final int anInt4927 = 10000;
	int anInt4928;
	String aString4929;
	volatile int anInt4930 = 0;
	boolean aBool4931;
	ExecutorService anExecutorService4932 = Executors.newFixedThreadPool(2);
	long aLong4933;
	static final int anInt4934 = 2;
	static final int anInt4935 = 10000;
	static final int anInt4936 = 60000;
	static final int anInt4937 = 10;

	void method5403(boolean bool) {
		aBool4931 = bool;
	}

	public Class449(String string, int i, int i_0_) {
		aBool4931 = false;
		aString4929 = string;
		anInt4926 = i * 69163375;
		anInt4928 = -990263303 * i_0_;
	}

	Class536_Sub18_Sub15_Sub3 method5404(int i) {
		return method5413(255, 255, (byte) 0, true, 0, 0, -1666968727);
	}

	void method5405(boolean bool, byte i) {
		aBool4931 = bool;
	}

	boolean method5406(byte i) {
		return anInt4930 * 1793168591 >= 10;
	}

	void method5407(int i) {
		anInt4930 -= 1844900399;
	}

	void method5408(boolean bool) {
		aBool4931 = bool;
	}

	void method5409() {
		anInt4930 -= 1844900399;
	}

	void method5410() {
		anInt4930 -= 1844900399;
	}

	void method5411() {
		anInt4930 -= 1844900399;
	}

	public void method5412() {
		anExecutorService4932.shutdown();
	}

	Class536_Sub18_Sub15_Sub3 method5413(int i, int i_1_, byte i_2_, boolean bool, int i_3_, int i_4_, int i_5_) {
		if (i < 0 || i_1_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_1_).toString());
		if (method5406((byte) -1))
			return null;
		boolean bool_6_ = 255 == i && 255 == i_1_;
		if (!aBool4931 && !bool_6_)
			return null;
		if (10000L + aLong4933 * 2613627722053356173L >= Class249.method3450(1687561120))
			return null;
		Object object = null;
		String string;
		if (bool_6_)
			string = new StringBuilder().append("&cb=").append(Class249.method3450(1267454360)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_3_).append("&v=").append(i_4_).toString();
		URL url;
		try {
			url = new URL("http", aString4929, anInt4926 * -1771035249, new StringBuilder().append("/ms?m=").append(-1766307255 * anInt4928).append("&a=").append(i).append("&g=").append(i_1_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class536_Sub18_Sub15_Sub3 class536_sub18_sub15_sub3 = new Class536_Sub18_Sub15_Sub3(i_2_);
		class536_sub18_sub15_sub3.aBool11778 = bool;
		anInt4930 += 1844900399;
		Future future = anExecutorService4932.submit(new Class462(this, url, class536_sub18_sub15_sub3));
		class536_sub18_sub15_sub3.method11063(future, 65536);
		return class536_sub18_sub15_sub3;
	}

	void method5414(boolean bool) {
		aBool4931 = bool;
	}

	public void method5415(byte i) {
		anExecutorService4932.shutdown();
	}

	static int method5416(int i, byte i_7_) {
		if (16711935 == i)
			return -1;
		return Class330.method4319(i, 1033814571);
	}

	static final void method5417(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aByte3706;
	}

	static final void method5418(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class246.anInt2474 * 155362615 == 2 ? 1 : 0;
	}

	static final void method5419(Class668 class668, int i) {
		Class154.method1875((byte) 16);
		Class608.method7261((byte) 0);
		client.aClass515_11066.method6319(-791329293);
		Class27.method763(1882156114);
		client.aBool11015 = false;
	}

	public static Map method5420(Class98_Sub1[] class98_sub1s, byte i) {
		if (class98_sub1s == null || 0 == class98_sub1s.length)
			return null;
		HashMap hashmap = new HashMap();
		Class98_Sub1[] class98_sub1s_8_ = class98_sub1s;
		for (int i_9_ = 0; i_9_ < class98_sub1s_8_.length; i_9_++) {
			Class98_Sub1 class98_sub1 = class98_sub1s_8_[i_9_];
			hashmap.put(class98_sub1.aClass458_8868, class98_sub1);
		}
		return hashmap;
	}

	static final void method5421(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_10_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2003514143 * class251.anInt2636;
	}

	public static byte[] method5422(Object object, int i, int i_11_, int i_12_) {
		if (object == null)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i + i_11_);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_11_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_11_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static Class504 method5423(int i) {
		Class504_Sub2 class504_sub2;
		try {
			class504_sub2 = new Class504_Sub2();
		} catch (Throwable throwable) {
			return new Class504_Sub1();
		}
		return class504_sub2;
	}
}
