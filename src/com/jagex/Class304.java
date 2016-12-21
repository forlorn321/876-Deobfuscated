/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class304 implements Interface20 {
	static int localY;

	public Class160 method125(Class465 class465, int i, int i_0_) {
		return (Class160) ((Interface13) Class104.aMap1293.get(class465)).method81(i, -611605015);
	}

	public Class160 method126(Class465 class465, int i) {
		return (Class160) ((Interface13) Class104.aMap1293.get(class465)).method81(i, 867875686);
	}

	public Class333 method123(int i, int i_1_) {
		return (Class333) Class51.aClass24_Sub16_522.method81(i, -288735335);
	}

	public Class160 method124(Class465 class465, int i) {
		return (Class160) ((Interface13) Class104.aMap1293.get(class465)).method81(i, 1921076800);
	}

	public Class333 method128(int i) {
		return (Class333) Class51.aClass24_Sub16_522.method81(i, 558832018);
	}

	public Class333 method127(int i) {
		return (Class333) Class51.aClass24_Sub16_522.method81(i, 1234896883);
	}

	static final void method5586(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class529_Sub1.aBool10770 ? 1 : 0;
	}

	static final void method5587(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4417, class109.aClass2_1367, (byte) -57);
		class527_sub15.buffer.writeByte(0, -200449522);
		int i_2_ = (class527_sub15.buffer.anInt10689 * -441238943);
		class527_sub15.buffer.writeString(string, 455709475);
		class527_sub15.buffer.writeShort(class665.aClass382_8535.anInt3939 * -1237622773, 1404835786);
		class665.aClass382_8535.aClass527_Sub8_Sub17_3940.method18403(class527_sub15.buffer, class665.aClass382_8535.anIntArray3941, 1085513034);
		class527_sub15.buffer.method16534((-441238943 * class527_sub15.buffer.anInt10689 - i_2_), 781923323);
		class109.method1969(class527_sub15, (byte) 1);
	}
}
