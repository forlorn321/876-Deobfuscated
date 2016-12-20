/* Class604 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class604 {
	static final int anInt7961 = 1;
	public int anInt7962;
	static final int anInt7963 = 4;
	static final int anInt7964 = 8;
	static final int anInt7965 = 2;
	int anInt7966;
	public int anInt7967;

	public boolean method10025(int i) {
		return 0 != (anInt7962 * -909883667 & 0x1);
	}

	public boolean method10026(int i) {
		return (anInt7962 * -909883667 & 0x8) != 0;
	}

	public boolean method10027(int i) {
		return 0 != (anInt7962 * -909883667 & 0x2);
	}

	public boolean method10028(byte i) {
		return 0 != (anInt7962 * -909883667 & 0x4);
	}

	public boolean method10029() {
		return 0 != (anInt7962 * -909883667 & 0x1);
	}

	public boolean method10030() {
		return (anInt7962 * -909883667 & 0x8) != 0;
	}

	public boolean method10031() {
		return 0 != (anInt7962 * -909883667 & 0x2);
	}

	public boolean method10032() {
		return 0 != (anInt7962 * -909883667 & 0x2);
	}

	public boolean method10033() {
		return 0 != (anInt7962 * -909883667 & 0x4);
	}

	public boolean method10034() {
		return (anInt7962 * -909883667 & 0x8) != 0;
	}

	public boolean method10035() {
		return 0 != (anInt7962 * -909883667 & 0x4);
	}

	Class604() {
		/* empty */
	}

	public boolean method10036() {
		return (anInt7962 * -909883667 & 0x8) != 0;
	}

	public boolean method10037() {
		return (anInt7962 * -909883667 & 0x8) != 0;
	}

	public boolean method10038() {
		return (anInt7962 * -909883667 & 0x8) != 0;
	}

	static void method10039(int i, int i_0_, boolean bool, int i_1_) {
		Class682.aBoolArrayArray8647[i][i_0_] = bool;
	}

	static final void method10040(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, -2018387139);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class101.method1787(class243, class240, class665, 276836831);
	}

	static final void method10041(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, -853785945);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class110.method2010(class243, class240, class665, (byte) 121);
	}

	static final void method10042(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4498, client.aClass109_11067.aClass2_1367, (byte) -2);
		class527_sub15.buffer.writeByte(string.length() + 1, 1115345382);
		class527_sub15.buffer.writeString(string, -1212735223);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}
}
