/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class90 {
	Class459 aClass459_833;
	int anInt834;
	Class75[] aClass75Array835;
	static final int anInt836 = 0;

	public Class73 method1633(int i) {
		byte[] is = aClass459_833.method7470(i, 0, (byte) -65);
		Class73 class73 = new Class73();
		class73.method1502(new RSByteBuffer(is), (byte) -100);
		return class73;
	}

	public Class73 method1634(int i) {
		byte[] is = aClass459_833.method7470(i, 0, (byte) -3);
		Class73 class73 = new Class73();
		class73.method1502(new RSByteBuffer(is), (byte) -38);
		return class73;
	}

	public Class73 method1635(int i, int i_0_) {
		byte[] is = aClass459_833.method7470(i, 0, (byte) -37);
		Class73 class73 = new Class73();
		class73.method1502(new RSByteBuffer(is), (byte) -53);
		return class73;
	}

	public Class82[] method1636(int i, byte i_1_) {
		if (i < 0 || i >= aClass75Array835.length)
			return method1638(0, 0, (byte) -87).aClass82Array794;
		Class75 class75 = aClass75Array835[i];
		if (!class75.aBool795 || class75.aClass82Array794.length <= 1)
			return class75.aClass82Array794;
		int i_2_ = -1 == anInt834 * 651245115 ? 0 : 1;
		Random random = new Random();
		Class82[] class82s = new Class82[class75.aClass82Array794.length];
		System.arraycopy(class75.aClass82Array794, 0, class82s, 0, class82s.length);
		for (int i_3_ = i_2_; i_3_ < class82s.length; i_3_++) {
			int i_4_ = (Class24_Sub10.method17391(random, class82s.length - i_2_, -637332817) + i_2_);
			Class82 class82 = class75.aClass82Array794[i_3_];
			class82s[i_3_] = class82s[i_4_];
			class82s[i_4_] = class82;
		}
		return class82s;
	}

	public boolean method1637(int i) {
		return -1 != 651245115 * anInt834;
	}

	public Class90(Class678 class678, Class671 class671, Class459 class459) {
		aClass459_833 = class459;
		RSByteBuffer class527_sub38 = new RSByteBuffer(aClass459_833.method7470(0, 0, (byte) -22));
		int i = ((null == class527_sub38.buffer || class527_sub38.buffer.length < 1) ? -1 : class527_sub38.readUnsignedByte());
		if (i < 4) {
			aClass75Array835 = new Class75[0];
			anInt834 = -156644083;
		} else {
			int i_5_ = class527_sub38.readUnsignedByte();
			Class396[] class396s = Class166.method2667(-1786353759);
			boolean bool = true;
			if (i_5_ != class396s.length)
				bool = false;
			else {
				for (int i_6_ = 0; i_6_ < class396s.length; i_6_++) {
					int i_7_ = class527_sub38.readUnsignedByte();
					if (372489173 * class396s[i_6_].anInt4118 != i_7_) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_8_ = class527_sub38.readUnsignedByte();
				int i_9_ = class527_sub38.readUnsignedByte();
				int i_10_;
				int i_11_;
				if (i > 2) {
					anInt834 = class527_sub38.readShort() * 156644083;
					i_10_ = class527_sub38.read24BitUnsignedInteger(2073575828);
					i_11_ = class527_sub38.readUnsignedShort();
				} else {
					anInt834 = -156644083;
					i_10_ = 0;
					i_11_ = 0;
				}
				aClass75Array835 = new Class75[1 + i_9_];
				for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
					int i_13_ = class527_sub38.readUnsignedByte();
					boolean bool_14_ = class527_sub38.readUnsignedByte() == 1;
					int i_15_ = class527_sub38.readUnsignedShort();
					Class82[] class82s;
					if (-1 == 651245115 * anInt834) {
						class82s = new Class82[i_15_];
						for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
							int i_17_ = class527_sub38.readUnsignedShort();
							int i_18_ = class527_sub38.read24BitUnsignedInteger(2000883961);
							int i_19_ = class527_sub38.readUnsignedShort();
							class82s[i_16_] = new Class82(i_17_, i_18_, i_19_);
						}
						aClass75Array835[i_13_] = new Class75(bool_14_, class82s);
					} else {
						class82s = new Class82[1 + i_15_];
						class82s[0] = new Class82(anInt834 * 651245115, i_10_, i_11_);
						for (int i_20_ = 0; i_20_ < i_15_; i_20_++) {
							int i_21_ = class527_sub38.readUnsignedShort();
							int i_22_ = class527_sub38.read24BitUnsignedInteger(1623352635);
							int i_23_ = class527_sub38.readUnsignedShort();
							class82s[1 + i_20_] = new Class82(i_21_, i_22_, i_23_);
						}
					}
					aClass75Array835[i_13_] = new Class75(bool_14_, class82s);
				}
				for (int i_24_ = 0; i_24_ < 1 + i_9_; i_24_++) {
					if (aClass75Array835[i_24_] == null)
						aClass75Array835[i_24_] = method1638(i_10_, i_11_, (byte) -82);
				}
			} else {
				aClass75Array835 = new Class75[0];
				anInt834 = -156644083;
			}
		}
	}

	Class75 method1638(int i, int i_25_, byte i_26_) {
		if (anInt834 * 651245115 == -1)
			return new Class75(false, new Class82[0]);
		Class82 class82 = new Class82(651245115 * anInt834, i, i_25_);
		return new Class75(false, new Class82[] { class82 });
	}

	Class75 method1639(int i, int i_27_) {
		if (anInt834 * 651245115 == -1)
			return new Class75(false, new Class82[0]);
		Class82 class82 = new Class82(651245115 * anInt834, i, i_27_);
		return new Class75(false, new Class82[] { class82 });
	}

	public Class82[] method1640(int i) {
		if (i < 0 || i >= aClass75Array835.length)
			return method1638(0, 0, (byte) -11).aClass82Array794;
		Class75 class75 = aClass75Array835[i];
		if (!class75.aBool795 || class75.aClass82Array794.length <= 1)
			return class75.aClass82Array794;
		int i_28_ = -1 == anInt834 * 651245115 ? 0 : 1;
		Random random = new Random();
		Class82[] class82s = new Class82[class75.aClass82Array794.length];
		System.arraycopy(class75.aClass82Array794, 0, class82s, 0, class82s.length);
		for (int i_29_ = i_28_; i_29_ < class82s.length; i_29_++) {
			int i_30_ = (Class24_Sub10.method17391(random, class82s.length - i_28_, -1405736824) + i_28_);
			Class82 class82 = class75.aClass82Array794[i_29_];
			class82s[i_29_] = class82s[i_30_];
			class82s[i_30_] = class82;
		}
		return class82s;
	}

	public Class82[] method1641(int i) {
		if (i < 0 || i >= aClass75Array835.length)
			return method1638(0, 0, (byte) -89).aClass82Array794;
		Class75 class75 = aClass75Array835[i];
		if (!class75.aBool795 || class75.aClass82Array794.length <= 1)
			return class75.aClass82Array794;
		int i_31_ = -1 == anInt834 * 651245115 ? 0 : 1;
		Random random = new Random();
		Class82[] class82s = new Class82[class75.aClass82Array794.length];
		System.arraycopy(class75.aClass82Array794, 0, class82s, 0, class82s.length);
		for (int i_32_ = i_31_; i_32_ < class82s.length; i_32_++) {
			int i_33_ = (Class24_Sub10.method17391(random, class82s.length - i_31_, -1485551605) + i_31_);
			Class82 class82 = class75.aClass82Array794[i_32_];
			class82s[i_32_] = class82s[i_33_];
			class82s[i_33_] = class82;
		}
		return class82s;
	}

	static void method1642(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		Class36[] class36s = Class457.method7447(2087978376);
		for (int i_34_ = 0; i_34_ < class36s.length; i_34_++) {
			Class36 class36 = class36s[i_34_];
			if (class36 != Class36.aClass36_407) {
				Class459 class459 = (Class459) Class319.aMap3538.get(class36);
				if (class459 == null)
					class527_sub38_sub2.writeInt(0, -752807827);
				else
					class527_sub38_sub2.writeInt(class459.method7472(335838185), -1174443295);
			}
		}
	}

	static final void method1643(Class665 class665, int i) {
		int i_35_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_35_, -25607261);
		Class240 class240 = Class183.aClass240Array2100[i_35_ >> 16];
		Class555.method9407(class243, class240, class665, 1604036228);
	}
}
