/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class467 implements Interface76 {
	public static Class467 aClass467_5315;
	public static Class467 aClass467_5316 = new Class467(0);
	public static Class467 aClass467_5317;
	int anInt5318;
	public static Class459 aClass459_5319;

	public int method87() {
		return anInt5318 * -83304401;
	}

	public int method91() {
		return anInt5318 * -83304401;
	}

	Class467(int i) {
		anInt5318 = 226518735 * i;
	}

	public int method42() {
		return anInt5318 * -83304401;
	}

	public static Class467[] method7663() {
		return (new Class467[] { aClass467_5315, aClass467_5316, aClass467_5317 });
	}

	static {
		aClass467_5315 = new Class467(1);
		aClass467_5317 = new Class467(2);
	}

	public static Class467[] method7664() {
		return (new Class467[] { aClass467_5315, aClass467_5316, aClass467_5317 });
	}

	static final void method7665(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1963609171);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >>> 16];
		Class243 class243_1_ = Class519.method8657(class240, class243, 1848478211);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = null == class243_1_ ? -1 : -254728301 * class243_1_.anInt2504;
	}

	static final void method7666(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4418, client.aClass109_11067.aClass2_1367, (byte) 21);
		class527_sub15.buffer.writeShort(i_2_, 1404835786);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public static void method7667(int i) {
		synchronized (Class55.aClass205_709) {
			Class55.aClass205_709.method3793((byte) 74);
		}
	}

	static void method7668(int i, int i_3_, int i_4_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(15, (long) i);
		class527_sub8_sub9.method18187(186100930);
		class527_sub8_sub9.anInt11676 = -281159195 * i_3_;
	}
}
