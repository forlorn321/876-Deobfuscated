/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class468 {
	static final int anInt5320 = 10000;
	int anInt5321;
	String aString5322;
	static final int anInt5323 = 10;
	volatile int anInt5324 = 0;
	static final int anInt5325 = 2;
	ExecutorService anExecutorService5326 = Executors.newFixedThreadPool(2);
	int anInt5327;
	static final int anInt5328 = 10000;
	static final int anInt5329 = 60000;
	boolean aBool5330 = false;
	long aLong5331;

	public Class468(String string, int i, int i_0_) {
		aString5322 = string;
		anInt5321 = 2122286481 * i;
		anInt5327 = i_0_ * 706931865;
	}

	boolean method7669(int i) {
		return anInt5324 * 45210781 >= 10;
	}

	Class527_Sub8_Sub13_Sub2 method7670(int i, int i_1_, byte i_2_, boolean bool, int i_3_, int i_4_) {
		if (i < 0 || i_1_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_1_).toString());
		if (method7669(-1071588102))
			return null;
		boolean bool_5_ = i == 255 && 255 == i_1_;
		if (!aBool5330 && !bool_5_)
			return null;
		if (-7575851931636460331L * aLong5331 + 10000L >= Class234.method4347(-1408626088))
			return null;
		Object object = null;
		String string;
		if (bool_5_)
			string = new StringBuilder().append("&cb=").append(Class234.method4347(-1408626088)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_3_).append("&v=").append(i_4_).toString();
		URL url;
		try {
			url = new URL("http", aString5322, anInt5321 * -2050761871, new StringBuilder().append("/ms?m=").append(anInt5327 * 833267625).append("&a=").append(i).append("&g=").append(i_1_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = new Class527_Sub8_Sub13_Sub2(i_2_);
		class527_sub8_sub13_sub2.aBool11767 = bool;
		anInt5324 += 87787957;
		Future future = anExecutorService5326.submit(new Class455(this, url, class527_sub8_sub13_sub2));
		class527_sub8_sub13_sub2.method18783(future, (byte) -103);
		return class527_sub8_sub13_sub2;
	}

	void method7671(byte i) {
		anInt5324 -= 87787957;
	}

	public void method7672() {
		anExecutorService5326.shutdown();
	}

	Class527_Sub8_Sub13_Sub2 method7673(int i, int i_6_, byte i_7_, boolean bool, int i_8_, int i_9_) {
		if (i < 0 || i_6_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_6_).toString());
		if (method7669(-1943498207))
			return null;
		boolean bool_10_ = i == 255 && 255 == i_6_;
		if (!aBool5330 && !bool_10_)
			return null;
		if (-7575851931636460331L * aLong5331 + 10000L >= Class234.method4347(-1408626088))
			return null;
		Object object = null;
		String string;
		if (bool_10_)
			string = new StringBuilder().append("&cb=").append(Class234.method4347(-1408626088)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_8_).append("&v=").append(i_9_).toString();
		URL url;
		try {
			url = new URL("http", aString5322, anInt5321 * -2050761871, new StringBuilder().append("/ms?m=").append(anInt5327 * 833267625).append("&a=").append(i).append("&g=").append(i_6_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = new Class527_Sub8_Sub13_Sub2(i_7_);
		class527_sub8_sub13_sub2.aBool11767 = bool;
		anInt5324 += 87787957;
		Future future = anExecutorService5326.submit(new Class455(this, url, class527_sub8_sub13_sub2));
		class527_sub8_sub13_sub2.method18783(future, (byte) -99);
		return class527_sub8_sub13_sub2;
	}

	void method7674(boolean bool, int i) {
		aBool5330 = bool;
	}

	boolean method7675() {
		return anInt5324 * 45210781 >= 10;
	}

	public void method7676(byte i) {
		anExecutorService5326.shutdown();
	}

	Class527_Sub8_Sub13_Sub2 method7677(short i) {
		return method7687(255, 255, (byte) 0, true, 0, 0, (byte) 0);
	}

	Class527_Sub8_Sub13_Sub2 method7678() {
		return method7687(255, 255, (byte) 0, true, 0, 0, (byte) 0);
	}

	void method7679() {
		anInt5324 -= 87787957;
	}

	void method7680() {
		anInt5324 -= 87787957;
	}

	void method7681() {
		anInt5324 -= 87787957;
	}

	public void method7682() {
		anExecutorService5326.shutdown();
	}

	void method7683(boolean bool) {
		aBool5330 = bool;
	}

	void method7684(boolean bool) {
		aBool5330 = bool;
	}

	void method7685(boolean bool) {
		aBool5330 = bool;
	}

	void method7686(boolean bool) {
		aBool5330 = bool;
	}

	Class527_Sub8_Sub13_Sub2 method7687(int i, int i_11_, byte i_12_, boolean bool, int i_13_, int i_14_, byte i_15_) {
		if (i < 0 || i_11_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_11_).toString());
		if (method7669(-1532355194))
			return null;
		boolean bool_16_ = i == 255 && 255 == i_11_;
		if (!aBool5330 && !bool_16_)
			return null;
		if (-7575851931636460331L * aLong5331 + 10000L >= Class234.method4347(-1408626088))
			return null;
		Object object = null;
		String string;
		if (bool_16_)
			string = new StringBuilder().append("&cb=").append(Class234.method4347(-1408626088)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_13_).append("&v=").append(i_14_).toString();
		URL url;
		try {
			url = new URL("http", aString5322, anInt5321 * -2050761871, new StringBuilder().append("/ms?m=").append(anInt5327 * 833267625).append("&a=").append(i).append("&g=").append(i_11_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2 = new Class527_Sub8_Sub13_Sub2(i_12_);
		class527_sub8_sub13_sub2.aBool11767 = bool;
		anInt5324 += 87787957;
		Future future = anExecutorService5326.submit(new Class455(this, url, class527_sub8_sub13_sub2));
		class527_sub8_sub13_sub2.method18783(future, (byte) -4);
		return class527_sub8_sub13_sub2;
	}

	static final void method7688(Class243 class243, Class240 class240, Class665 class665, int i) {
		int i_17_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_17_ != class243.anInt2663 * -19060959) {
			if (-1 != i_17_) {
				if (class243.aClass695_2664 == null)
					class243.aClass695_2664 = new Class695_Sub1();
				class243.aClass695_2664.method14165(i_17_, (byte) 22);
			} else
				class243.aClass695_2664 = null;
			class243.anInt2663 = i_17_ * -113697567;
			Class430.method6876(class243, (byte) 113);
		}
		if (-1 == -927924265 * class243.anInt2675 && !class240.aBool2394)
			Class104.method1809(class243.anInt2504 * -254728301, (byte) -1);
	}

	static final void method7689(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -996619716) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2605 = Class103.method1800(string, class665, (byte) -119);
		class243.aBool2606 = true;
	}

	static final void method7690(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class56.method1332(string, bool, -1391993326);
	}
}
