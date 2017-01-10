/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class323 implements Runnable {
	volatile boolean aBool3547;
	Thread aThread3548;
	Class314[] aClass314Array3549;
	public static NativeSprite aClass143_3550;

	public void method4253() {
		try {
			int i = Class597.method7139(Class47.aClass678_578, Class665.aClass665_8531, (1318197187 * Class23.aClass5_222.anInt111), 828493388);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class23.aClass5_222.aString112).append(":").append(i).append("/news.ws?game=").append(client.aClass670_11043.anInt8567 * 273023065).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; null != string; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			aClass314Array3549 = new Class314[strings.length / 3];
			for (int i_0_ = 0; i_0_ < strings.length; i_0_ += 3)
				aClass314Array3549[i_0_ / 3] = new Class314(strings[i_0_], strings[i_0_ + 1], strings[2 + i_0_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3547 = true;
	}

	boolean method4254() {
		if (aBool3547)
			return true;
		if (aThread3548 == null) {
			aThread3548 = new Thread(this);
			aThread3548.start();
		}
		return aBool3547;
	}

	boolean method4255(byte i) {
		if (aBool3547)
			return true;
		if (aThread3548 == null) {
			aThread3548 = new Thread(this);
			aThread3548.start();
		}
		return aBool3547;
	}

	public void run() {
		try {
			int i = Class597.method7139(Class47.aClass678_578, Class665.aClass665_8531, (1318197187 * Class23.aClass5_222.anInt111), 828493388);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class23.aClass5_222.aString112).append(":").append(i).append("/news.ws?game=").append(client.aClass670_11043.anInt8567 * 273023065).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; null != string; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			aClass314Array3549 = new Class314[strings.length / 3];
			for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
				aClass314Array3549[i_1_ / 3] = new Class314(strings[i_1_], strings[i_1_ + 1], strings[2 + i_1_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		aBool3547 = true;
	}

	Class314 method4256(int i, int i_2_) {
		if (null == aClass314Array3549 || i < 0 || i >= aClass314Array3549.length)
			return null;
		return aClass314Array3549[i];
	}

	Class323() {
		/* empty */
	}

	public static String unpackHuffmanString(RSByteBuffer buffer) {
		return Class660.unpackHuffmanString(buffer, 32767);
	}

	static final void method4258(Class668 class668, int i) {
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class682.method8090(532675698);
		if (class536_sub18_sub14 != null) {
			boolean bool = (class536_sub18_sub14.method10769(Class552.anInt7416 * 804924017 + Class542.anInt7185, Class391.anInt4063 * 2122662073 + Class542.anInt7186, Class685.anIntArray8657, -1100148889));
			if (bool) {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anIntArray8657[1];
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anIntArray8657[2];
			} else {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			}
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		}
	}

	static final void method4259(Class536_Sub2 class536_sub2, boolean bool, byte i) {
		if (class536_sub2.aBool10319) {
			if (class536_sub2.anInt10311 * 466531913 < 0 || Class551.method6686(client.aClass515_11066.method6280(-1073841494), 466531913 * class536_sub2.anInt10311, 1346298053 * class536_sub2.anInt10307, -1514332701)) {
				if (!bool)
					Class510.method6187(class536_sub2.anInt10310 * -1676454841, 702777497 * class536_sub2.anInt10308, class536_sub2.anInt10309 * 848380705, -499217723 * class536_sub2.anInt10312, class536_sub2.anInt10311 * 466531913, 9068075 * class536_sub2.anInt10322, class536_sub2.anInt10307 * 1346298053, -1, 0, -279793543);
				else
					Class455.method5479(-1676454841 * class536_sub2.anInt10310, 702777497 * class536_sub2.anInt10308, 848380705 * class536_sub2.anInt10309, -499217723 * class536_sub2.anInt10312, null, 611603948);
				class536_sub2.method6484();
			}
		} else if (class536_sub2.aBool10318 && 848380705 * class536_sub2.anInt10309 >= 1 && -499217723 * class536_sub2.anInt10312 >= 1 && (848380705 * class536_sub2.anInt10309 <= client.aClass515_11066.method6321((byte) 21) - 2) && (-499217723 * class536_sub2.anInt10312 <= client.aClass515_11066.method6243(177401017) - 2)
				&& (744541999 * class536_sub2.anInt10314 < 0 || Class551.method6686(client.aClass515_11066.method6280(-1073841494), (744541999 * class536_sub2.anInt10314), (1818098737 * class536_sub2.anInt10313), -1906625320))) {
			if (!bool)
				Class510.method6187(class536_sub2.anInt10310 * -1676454841, class536_sub2.anInt10308 * 702777497, 848380705 * class536_sub2.anInt10309, class536_sub2.anInt10312 * -499217723, 744541999 * class536_sub2.anInt10314, class536_sub2.anInt10315 * -190376161, 1818098737 * class536_sub2.anInt10313, -1, 0, -279793543);
			else
				Class455.method5479(-1676454841 * class536_sub2.anInt10310, 702777497 * class536_sub2.anInt10308, 848380705 * class536_sub2.anInt10309, -499217723 * class536_sub2.anInt10312, class536_sub2.aClass590_10317, 960923834);
			class536_sub2.aBool10318 = false;
			if (!bool && (466531913 * class536_sub2.anInt10311 == class536_sub2.anInt10314 * 744541999) && -1 == class536_sub2.anInt10311 * 466531913)
				class536_sub2.method6484();
			else if (!bool && (466531913 * class536_sub2.anInt10311 == 744541999 * class536_sub2.anInt10314) && (class536_sub2.anInt10322 * 9068075 == class536_sub2.anInt10315 * -190376161) && (1346298053 * class536_sub2.anInt10307 == class536_sub2.anInt10313 * 1818098737))
				class536_sub2.method6484();
		}
	}

	static final int method4260(int i, int i_3_) {
		return i < 7 ? 7 : 10;
	}
}
