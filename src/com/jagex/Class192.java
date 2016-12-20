/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class192 {
	static Class192 aClass192_2139;
	static Class192 aClass192_2140 = new Class192();
	static Class192 aClass192_2141 = new Class192();

	Class192() {
		/* empty */
	}

	static {
		aClass192_2139 = new Class192();
	}

	static final void method3690(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		client.anInt11265 = (class665.anIntArray8525[1769813785 * class665.anInt8526] * -184283011);
		Class265.aClass711_2876 = Class321.method5703((class665.anIntArray8525[1769813785 * class665.anInt8526 + 1]), (byte) 1);
		if (null == Class265.aClass711_2876)
			Class265.aClass711_2876 = Class711.aClass711_8852;
		client.anInt11223 = (-2115812591 * class665.anIntArray8525[2 + class665.anInt8526 * 1769813785]);
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4468, class109.aClass2_1367, (byte) -1);
		class527_sub15.buffer.writeByte(-604903211 * client.anInt11265, 1961024752);
		class527_sub15.buffer.writeByte(-143370735 * Class265.aClass711_2876.anInt8855, 713874072);
		class527_sub15.buffer.writeByte(1480986097 * client.anInt11223, 335918389);
		class109.method1969(class527_sub15, (byte) 1);
	}

	static final void method3691(Class665 class665, int i) {
		/* empty */
	}

	static final void method3692(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 339844852);
		Class45.method1216(class243, class665, 1776794927);
	}

	static final void method3693(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_1_, -2086281623);
		Class219.method4067(class243, class665, 1213296661);
	}
}
