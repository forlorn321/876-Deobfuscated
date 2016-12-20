/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEvent;

public class Class390 {
	static Class390 aClass390_4000;
	public static Class390 aClass390_4001 = new Class390(8);
	public static Class390 aClass390_4002;
	public static Class390 aClass390_4003;
	public static Class390 aClass390_4004 = new Class390(16);
	public int anInt4005;

	static {
		aClass390_4002 = new Class390(8);
		aClass390_4003 = new Class390(16);
		aClass390_4000 = new Class390(32);
	}

	Class390(int i) {
		anInt4005 = i * -1942649477;
	}

	public static void method6467(int i, TwitchEvent twitchevent, int i_0_) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = Class373.method6376(Class579.aClass579_7660, i, -1, -357767199);
		if (class527_sub8_sub10 != null) {
			Class665 class665 = Class383.method6409((byte) -66);
			if (0 != -1600507105 * class527_sub8_sub10.anInt11721)
				class665.aLongArray8547 = new long[class527_sub8_sub10.anInt11721 * -1600507105];
			if (-1228779449 * class527_sub8_sub10.anInt11726 != 0)
				class665.anIntArray8546 = new int[-1228779449 * class527_sub8_sub10.anInt11726];
			if (0 != 1563313657 * class527_sub8_sub10.anInt11727)
				class665.anObjectArray8524 = new String[class527_sub8_sub10.anInt11727 * 1563313657];
			twitchevent.method6560(class665.anIntArray8546, class665.aLongArray8547, class665.anObjectArray8524);
			Class208_Sub17.method15631(class527_sub8_sub10, 500000, class665, -1227458658);
		}
	}

	static final void method6468(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class402.method6538(class243, class240, class665, -386857613);
	}

	static final void method6469(Class665 class665, byte i) {
		Class29.method868(((String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261])), false, false, 281747348);
	}

	static final void method6470(Class665 class665, int i) throws Exception_Sub6 {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		float f = ((float) (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]) / 1000.0F);
		Class208_Sub10.aClass296_Sub1_9923.method5437(i_1_, f, 1804239471);
	}

	static final void method6471(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method6472(Class665 class665, short i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_2_, -580656344).method4074(-1943086793);
	}

	public static Class383 method6473(RSByteBuffer class527_sub38, byte i) {
		Class383 class383 = Class235.method4357(class527_sub38, (byte) 17);
		int i_3_ = class527_sub38.method16581(-770947857);
		return new Class383_Sub1(-1301345907 * class383.anInt3946, class383.aClass400_3943, class383.aClass384_3944, class383.anInt3945 * 1877641641, class383.anInt3942 * 162660109, i_3_);
	}
}
