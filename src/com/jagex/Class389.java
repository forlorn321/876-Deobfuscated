/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class389 implements Interface47 {
	public Class400 aClass400_3991;
	public int anInt3992;
	public int anInt3993;
	public Class384 aClass384_3994;
	public int anInt3995;
	public int anInt3996;
	public int anInt3997;
	public int anInt3998;
	public int anInt3999;

	Class389(Class400 class400, Class384 class384, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass400_3991 = class400;
		aClass384_3994 = class384;
		anInt3993 = 1243949599 * i;
		anInt3992 = 669841615 * i_0_;
		anInt3995 = i_1_ * -197240563;
		anInt3996 = 7511297 * i_2_;
		anInt3997 = 569036331 * i_3_;
		anInt3998 = i_4_ * -1017286191;
		anInt3999 = i_5_ * 2130951063;
	}

	public Class396 method334(int i) {
		return null;
	}

	public Class396 method333() {
		return null;
	}

	static Class389 method6459(RSByteBuffer class527_sub38) {
		Class400 class400 = (Class183.method3556(-1556085260)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i = class527_sub38.readShort();
		int i_6_ = class527_sub38.readShort();
		int i_7_ = class527_sub38.readUnsignedShort();
		int i_8_ = class527_sub38.readUnsignedShort();
		int i_9_ = class527_sub38.readShort();
		int i_10_ = class527_sub38.method16466(-1664291571);
		int i_11_ = class527_sub38.readInt();
		return new Class389(class400, class384, i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
	}

	public static Class699 method6460(int i) {
		if (null == Class63.aClass699_733)
			return Class699.aClass699_8771;
		return Class63.aClass699_733;
	}

	static final void method6461(Class665 class665, int i) {
		int i_12_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_12_, -1344515802);
		Class240 class240 = Class183.aClass240Array2100[i_12_ >> 16];
		Class407.method6556(class243, class240, class665, 1747766438);
	}

	static final void method6462(Class665 class665, int i) {
		if (null != Class208_Sub8.aClass346_9916) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
			class665.aClass346_8532 = Class208_Sub8.aClass346_9916;
			class665.aMap8523.put(Class465.aClass465_5308, Class187.method3659(class665.aClass346_8532, (byte) -115));
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static void method6463(Class558 class558, int i) {
		class558.aClass640_Sub1_7532 = null;
		synchronized (Class558.aStack7531) {
			if (Class558.aStack7531.size() < 200)
				Class558.aStack7531.push(class558);
		}
	}

	public static byte[] method6464(File file, int i) {
		return Class407.method6558(file, (int) file.length(), -1953240208);
	}

	public static void method6465(int i) {
		Class243.aClass205_2492.method3820(1675683440);
		Class243.aClass205_2497.method3820(816561530);
		Class243.aClass205_2493.method3820(-59907879);
		Class243.aClass205_2477.method3820(-717526927);
	}

	static int method6466(Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2, byte i) {
		int i_13_ = -1614266203 * class640_sub1_sub2_sub1_sub2.anInt12195;
		Class587 class587 = class640_sub1_sub2_sub1_sub2.method18542(-1411334181);
		int i_14_ = class640_sub1_sub2_sub1_sub2.aClass695_Sub2_11913.method14164(-484441210);
		if (-1 == i_14_ || class640_sub1_sub2_sub1_sub2.aClass695_Sub2_11913.aBool10970)
			i_13_ = class640_sub1_sub2_sub1_sub2.anInt12193 * -1970690963;
		else if (class587.anInt7755 * 298811127 == i_14_ || class587.anInt7727 * -1566427073 == i_14_ || i_14_ == class587.anInt7729 * -1620298651 || class587.anInt7728 * 1429573541 == i_14_)
			i_13_ = -1251313557 * class640_sub1_sub2_sub1_sub2.anInt12187;
		else if (class587.anInt7721 * -1585256987 == i_14_ || 755159797 * class587.anInt7731 == i_14_ || i_14_ == -553713681 * class587.anInt7733 || class587.anInt7732 * -2115193861 == i_14_)
			i_13_ = -834256763 * class640_sub1_sub2_sub1_sub2.anInt12194;
		return i_13_;
	}
}
