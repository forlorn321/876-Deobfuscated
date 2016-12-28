/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class87 {
	Class90[] aClass90Array871;
	static String aString872;
	Class461 aClass461_873;
	int anInt874;
	static final int anInt875 = 0;

	public boolean method1204() {
		return -1600029121 * anInt874 != -1;
	}

	Class90 method1205(int i, int i_0_, byte i_1_) {
		if (anInt874 * -1600029121 == -1)
			return new Class90(false, new Class88[0]);
		Class88 class88 = new Class88(-1600029121 * anInt874, i, i_0_);
		return new Class90(false, new Class88[] { class88 });
	}

	public Class83 method1206(int i, byte i_2_) {
		byte[] is = aClass461_873.method5556(i, 0, (byte) 1);
		Class83 class83 = new Class83();
		class83.method1175(new RSByteBuffer(is), -1829336996);
		return class83;
	}

	public Class88[] method1207(int i, int i_3_) {
		if (i < 0 || i >= aClass90Array871.length)
			return method1205(0, 0, (byte) 0).aClass88Array883;
		Class90 class90 = aClass90Array871[i];
		if (!class90.aBool882 || class90.aClass88Array883.length <= 1)
			return class90.aClass88Array883;
		int i_4_ = -1600029121 * anInt874 == -1 ? 0 : 1;
		Random random = new Random();
		Class88[] class88s = new Class88[class90.aClass88Array883.length];
		System.arraycopy(class90.aClass88Array883, 0, class88s, 0, class88s.length);
		for (int i_5_ = i_4_; i_5_ < class88s.length; i_5_++) {
			int i_6_ = (Class147.method1815(random, class88s.length - i_4_, (byte) 0) + i_4_);
			Class88 class88 = class90.aClass88Array883[i_5_];
			class88s[i_5_] = class88s[i_6_];
			class88s[i_6_] = class88;
		}
		return class88s;
	}

	public boolean method1208(int i) {
		return -1600029121 * anInt874 != -1;
	}

	public boolean method1209() {
		return -1600029121 * anInt874 != -1;
	}

	public Class87(Class670 class670, Class664 class664, Class461 class461) {
		aClass461_873 = class461;
		RSByteBuffer class536_sub33 = new RSByteBuffer(aClass461_873.method5556(0, 0, (byte) 1));
		int i = ((class536_sub33.buffer == null || class536_sub33.buffer.length < 1) ? -1 : class536_sub33.readUnsignedByte());
		if (i < 4) {
			aClass90Array871 = new Class90[0];
			anInt874 = 252218945;
		} else {
			int i_7_ = class536_sub33.readUnsignedByte();
			Class390[] class390s = Class270.method3714((byte) 30);
			boolean bool = true;
			if (i_7_ != class390s.length)
				bool = false;
			else {
				for (int i_8_ = 0; i_8_ < class390s.length; i_8_++) {
					int i_9_ = class536_sub33.readUnsignedByte();
					if (1392117351 * class390s[i_8_].anInt4055 != i_9_) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_10_ = class536_sub33.readUnsignedByte();
				int i_11_ = class536_sub33.readUnsignedByte();
				int i_12_;
				int i_13_;
				if (i > 2) {
					anInt874 = class536_sub33.readShort((byte) -30) * -252218945;
					i_12_ = class536_sub33.read24BitUnsignedInteger();
					i_13_ = class536_sub33.readUnsignedShort();
				} else {
					anInt874 = 252218945;
					i_12_ = 0;
					i_13_ = 0;
				}
				aClass90Array871 = new Class90[i_11_ + 1];
				for (int i_14_ = 0; i_14_ < i_10_; i_14_++) {
					int i_15_ = class536_sub33.readUnsignedByte();
					boolean bool_16_ = class536_sub33.readUnsignedByte() == 1;
					int i_17_ = class536_sub33.readUnsignedShort();
					Class88[] class88s;
					if (anInt874 * -1600029121 == -1) {
						class88s = new Class88[i_17_];
						for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
							int i_19_ = class536_sub33.readUnsignedShort();
							int i_20_ = class536_sub33.read24BitUnsignedInteger();
							int i_21_ = class536_sub33.readUnsignedShort();
							class88s[i_18_] = new Class88(i_19_, i_20_, i_21_);
						}
						aClass90Array871[i_15_] = new Class90(bool_16_, class88s);
					} else {
						class88s = new Class88[i_17_ + 1];
						class88s[0] = new Class88(-1600029121 * anInt874, i_12_, i_13_);
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
							int i_23_ = class536_sub33.readUnsignedShort();
							int i_24_ = class536_sub33.read24BitUnsignedInteger();
							int i_25_ = class536_sub33.readUnsignedShort();
							class88s[1 + i_22_] = new Class88(i_23_, i_24_, i_25_);
						}
					}
					aClass90Array871[i_15_] = new Class90(bool_16_, class88s);
				}
				for (int i_26_ = 0; i_26_ < i_11_ + 1; i_26_++) {
					if (aClass90Array871[i_26_] == null)
						aClass90Array871[i_26_] = method1205(i_12_, i_13_, (byte) 0);
				}
			} else {
				aClass90Array871 = new Class90[0];
				anInt874 = 252218945;
			}
		}
	}

	public boolean method1210() {
		return -1600029121 * anInt874 != -1;
	}

	public boolean method1211() {
		return -1600029121 * anInt874 != -1;
	}

	static String method1212(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		if (class536_sub18_sub9.aString11707 == null || class536_sub18_sub9.aString11707.length() == 0) {
			if (class536_sub18_sub9.aString11712 != null && class536_sub18_sub9.aString11712.length() > 0)
				return new StringBuilder().append(class536_sub18_sub9.aString11716).append(Class38.aClass38_444.method840((Class459.aClass664_5178), 1504767823)).append(class536_sub18_sub9.aString11712).toString();
			return class536_sub18_sub9.aString11716;
		}
		if (class536_sub18_sub9.aString11712 != null && class536_sub18_sub9.aString11712.length() > 0)
			return new StringBuilder().append(class536_sub18_sub9.aString11716).append(Class38.aClass38_444.method840(Class459.aClass664_5178, 1920344670)).append(class536_sub18_sub9.aString11712).append(Class38.aClass38_444.method840(Class459.aClass664_5178, 1463506862)).append(class536_sub18_sub9.aString11707).toString();
		return new StringBuilder().append(class536_sub18_sub9.aString11716).append(Class38.aClass38_444.method840(Class459.aClass664_5178, 1745349699)).append(class536_sub18_sub9.aString11707).toString();
	}
}
