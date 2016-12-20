/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class335 implements Runnable {
	Class320[] aClass320Array3639;
	Thread aThread3640;
	volatile boolean aBool3641;
	public static int anInt3642;

	public void run() {
		try {
			int i = Class284.method5202(Class73.aClass677_790, Class682.aClass682_8648, Class3.aClass13_39.anInt181 * 44791937, (byte) 15);
			BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class3.aClass13_39.aString178).append(":").append(i).append("/news.ws?game=").append((client.aClass678_11259.anInt8610) * -1907167873).toString()).openStream())));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			aClass320Array3639 = new Class320[strings.length / 3];
			for (int i_0_ = 0; i_0_ < strings.length; i_0_ += 3)
				aClass320Array3639[i_0_ / 3] = new Class320(strings[i_0_], strings[i_0_ + 1], strings[i_0_ + 2]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3641 = true;
	}

	Class320 method5860(int i, byte i_1_) {
		if (aClass320Array3639 == null || i < 0 || i >= aClass320Array3639.length)
			return null;
		return aClass320Array3639[i];
	}

	boolean method5861(byte i) {
		if (aBool3641)
			return true;
		if (null == aThread3640) {
			aThread3640 = new Thread(this);
			aThread3640.start();
		}
		return aBool3641;
	}

	Class335() {
		/* empty */
	}

	public void method5862() {
		try {
			int i = Class284.method5202(Class73.aClass677_790, Class682.aClass682_8648, Class3.aClass13_39.anInt181 * 44791937, (byte) 26);
			BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class3.aClass13_39.aString178).append(":").append(i).append("/news.ws?game=").append((client.aClass678_11259.anInt8610) * -1907167873).toString()).openStream())));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			aClass320Array3639 = new Class320[strings.length / 3];
			for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
				aClass320Array3639[i_2_ / 3] = new Class320(strings[i_2_], strings[i_2_ + 1], strings[i_2_ + 2]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3641 = true;
	}

	boolean method5863() {
		if (aBool3641)
			return true;
		if (null == aThread3640) {
			aThread3640 = new Thread(this);
			aThread3640.start();
		}
		return aBool3641;
	}

	Class320 method5864(int i) {
		if (aClass320Array3639 == null || i < 0 || i >= aClass320Array3639.length)
			return null;
		return aClass320Array3639[i];
	}

	Class320 method5865(int i) {
		if (aClass320Array3639 == null || i < 0 || i >= aClass320Array3639.length)
			return null;
		return aClass320Array3639[i];
	}

	Class320 method5866(int i) {
		if (aClass320Array3639 == null || i < 0 || i >= aClass320Array3639.length)
			return null;
		return aClass320Array3639[i];
	}

	Class320 method5867(int i) {
		if (aClass320Array3639 == null || i < 0 || i >= aClass320Array3639.length)
			return null;
		return aClass320Array3639[i];
	}

	Class320 method5868(int i) {
		if (aClass320Array3639 == null || i < 0 || i >= aClass320Array3639.length)
			return null;
		return aClass320Array3639[i];
	}

	boolean method5869() {
		if (aBool3641)
			return true;
		if (null == aThread3640) {
			aThread3640 = new Thread(this);
			aThread3640.start();
		}
		return aBool3641;
	}

	public void method5870() {
		try {
			int i = Class284.method5202(Class73.aClass677_790, Class682.aClass682_8648, Class3.aClass13_39.anInt181 * 44791937, (byte) -3);
			BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class3.aClass13_39.aString178).append(":").append(i).append("/news.ws?game=").append((client.aClass678_11259.anInt8610) * -1907167873).toString()).openStream())));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			aClass320Array3639 = new Class320[strings.length / 3];
			for (int i_3_ = 0; i_3_ < strings.length; i_3_ += 3)
				aClass320Array3639[i_3_ / 3] = new Class320(strings[i_3_], strings[i_3_ + 1], strings[i_3_ + 2]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3641 = true;
	}

	boolean method5871() {
		if (aBool3641)
			return true;
		if (null == aThread3640) {
			aThread3640 = new Thread(this);
			aThread3640.start();
		}
		return aBool3641;
	}

	static void method5872(int i) {
		Class19 class19 = Class32.method944("2", client.aClass678_11259.aString8616, false, (byte) 97);
		Class598.aClass144_Sub1_7852.method14500(class19, -1012922902);
	}

	static void method5873(Class665 class665, byte i) {
		int i_4_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i_4_, (byte) -90);
		if (twitchwebcamdevice == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.method1693();
	}

	static final void method5874(Class243 class243, Class665 class665, int i) {
		int i_5_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_6_ = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) - 1);
		int i_7_ = i_6_;
		if (6 != class243.anInt2541 * -1260029751 && class243.anInt2541 * -1260029751 != 2)
			throw new RuntimeException("");
		Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(class243.anInt2542 * 1538136819, -1560399223));
		if (class243.aClass308_2513 == null)
			class243.aClass308_2513 = new Class308(class295, 6 == class243.anInt2541 * -1260029751);
		class243.aClass308_2513.aLong3450 = Class235.method4355(530461659) * -1114685536257316839L;
		if (null != class295.aByteArray3300) {
			if (i_6_ < 0 || i_6_ >= class295.aByteArray3300.length)
				throw new RuntimeException("");
			i_7_ = class295.aByteArray3300[i_6_];
		}
		if (class295.aShortArray3286 == null || i_7_ < 0 || i_7_ >= class295.aShortArray3286.length)
			throw new RuntimeException("");
		class243.aClass308_2513.aShortArray3454[i_7_] = (short) i_5_;
		Class430.method6876(class243, (byte) 66);
	}

	static final void method5875(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_8_ == -1)
			throw new RuntimeException("");
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = new StringBuilder().append(string).append((char) i_8_).toString();
	}

	static final void method5876(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	static final void method5877(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (class665.aClass527_Sub21_8537.aClass345Array10485[i_9_].aByte3699);
	}

	static final void method5878(int i, byte i_10_) {
		client.anInt11064 = 0;
		client.anInt11061 = 0;
		client.anInt11063 += -95273505;
		Class305.method5599(1420162705);
		Class450.method7286(i, (byte) 101);
		Class208_Sub21.method15635(1046502950);
		boolean bool = false;
		for (int i_11_ = 0; i_11_ < client.anInt11064 * -2086779331; i_11_++) {
			int i_12_ = client.anIntArray11065[i_11_];
			Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_12_));
			Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = (Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522;
			if (532790815 * client.anInt11063 != class640_sub1_sub2_sub1_sub1.anInt11933 * 327924567) {
				if (Class35.aBool338 && Class352.method6214(i_12_, -733978003))
					Exception_Sub7.method17974(106882555);
				if (class640_sub1_sub2_sub1_sub1.aClass295_12168.method5309(1012985280))
					Class48.method1245(class640_sub1_sub2_sub1_sub1, (byte) -51);
				class640_sub1_sub2_sub1_sub1.method18832(null, 2145069098);
				class527_sub26.method8735(-1889161967);
				bool = true;
			}
		}
		if (bool) {
			int i_13_ = 152738023 * client.anInt11030;
			client.anInt11030 = client.aClass14_10989.method711(-1640567209) * -1326908713;
			int i_14_ = 0;
			Iterator iterator = client.aClass14_10989.iterator();
			while (iterator.hasNext()) {
				Class527_Sub26 class527_sub26 = (Class527_Sub26) iterator.next();
				client.aClass527_Sub26Array11313[i_14_++] = class527_sub26;
			}
			for (int i_15_ = client.anInt11030 * 152738023; i_15_ < i_13_; i_15_++)
				client.aClass527_Sub26Array11313[i_15_] = null;
			Class301 class301 = Class208_Sub10.aClass296_Sub1_9923.method5376((byte) -2);
			if (class301 == Class301.aClass301_3418) {
				Class327_Sub2 class327_sub2 = (Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0);
				class327_sub2.method15729((byte) 10);
			}
			Class309 class309 = Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -94);
			if (Class309.aClass309_3455 == class309) {
				Class696_Sub3 class696_sub3 = (Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(941931561);
				class696_sub3.method17233(1522019265);
			}
		}
		if ((-441238943 * client.aClass109_11067.aClass527_Sub38_Sub2_1364.anInt10689) != 1011661087 * client.aClass109_11067.anInt1359)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (client.aClass109_11067.aClass527_Sub38_Sub2_1364.anInt10689)).append(" ").append(client.aClass109_11067.anInt1359 * 1011661087).toString());
		for (int i_16_ = 0; i_16_ < -1599561389 * client.anInt11059; i_16_++) {
			if (client.aClass14_10989.method709((long) client.anIntArray11021[i_16_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_16_).append(" ").append(-1599561389 * client.anInt11059).toString());
		}
		if (0 != client.anInt11030 * 152738023 - client.anInt11059 * -1599561389)
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt11030 * 152738023 - -1599561389 * client.anInt11059).toString());
		for (int i_17_ = 0; i_17_ < client.anInt11030 * 152738023; i_17_++) {
			if (532790815 * client.anInt11063 != (((Class640_Sub1_Sub2_Sub1) client.aClass527_Sub26Array11313[i_17_].anObject10522).anInt11933) * 327924567)
				throw new RuntimeException(new StringBuilder().append("").append((((Class640_Sub1_Sub2_Sub1) (client.aClass527_Sub26Array11313[i_17_].anObject10522)).anInt11955) * -541403241).toString());
		}
	}

	public static int method5879(int i, int i_18_, boolean bool, int i_19_) {
		int i_20_ = 0;
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 13);
		if (class527_sub1 == null)
			return 0;
		for (int i_21_ = 0; i_21_ < class527_sub1.anIntArray10332.length; i_21_++) {
			if (class527_sub1.anIntArray10332[i_21_] >= 0 && ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class527_sub1.anIntArray10332[i_21_], 1801691174))).anInt82 * 1242789509 == i_18_)
				i_20_ += Class73.method1511(i, i_21_, bool, -1949299003);
		}
		return i_20_;
	}

	static final void method5880(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class160.method2581(class243, class240, class665, 135107445);
	}
}
