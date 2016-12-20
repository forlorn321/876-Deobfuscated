/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class545 {
	public static final int anInt7257 = 16384;
	static final int anInt7258 = 2048;
	static final int anInt7259 = 2048;
	public static final int anInt7260 = 16384;

	Class545() throws Throwable {
		throw new Error();
	}

	static final void method9045(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class245.aClass226_2698.method4217(i_0_, i_1_, -2044300794);
	}

	static final void method9046(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub41_10626, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) != 0 ? 1 : 0, 718299289);
		Class631.method10465(-838276347);
	}

	static final void method9047(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4500, class109.aClass2_1367, (byte) -56);
		class527_sub15.buffer.writeByte(0, -12607375);
		int i_3_ = (class527_sub15.buffer.anInt10689 * -441238943);
		class527_sub15.buffer.writeByte(i_2_, 914291652);
		class527_sub15.buffer.writeShort(class665.aClass382_8535.anInt3939 * -1237622773, 1404835786);
		class665.aClass382_8535.aClass527_Sub8_Sub17_3940.method18403(class527_sub15.buffer, class665.aClass382_8535.anIntArray3941, -1813140673);
		class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943 - i_3_), 264937345);
		class109.method1969(class527_sub15, (byte) 1);
	}

	public static int method9048(int i, int i_4_, int i_5_, int i_6_) {
		i_5_ &= 0x3;
		if (0 == i_5_)
			return i_4_;
		if (i_5_ == 1)
			return 4095 - i;
		if (2 == i_5_)
			return 4095 - i_4_;
		return i;
	}

	public static Class527_Sub36 method9049(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		synchronized (Class527_Sub36.aClass527_Sub36Array10674) {
			if (Class527_Sub36.anInt10672 * -706191715 == 0) {
				Class527_Sub36 class527_sub36 = new Class527_Sub36(i, i_7_, i_8_, i_9_);
				return class527_sub36;
			}
			Class527_Sub36.aClass527_Sub36Array10674[(Class527_Sub36.anInt10672 -= -1300686923) * -706191715].method16383(i, i_7_, i_8_, i_9_, 1734238846);
			Class527_Sub36 class527_sub36 = (Class527_Sub36.aClass527_Sub36Array10674[-706191715 * Class527_Sub36.anInt10672]);
			return class527_sub36;
		}
	}

	public static void method9050(int i, int i_11_, short i_12_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(17, (long) i_11_ << 32 | (long) i);
		class527_sub8_sub9.method18186(-461247728);
	}
}
