/* Class583 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class583 implements Interface67 {
	Class41 aClass41_7679;

	Class583(Class41 class41) {
		aClass41_7679 = class41;
	}

	public void method421(int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4461, client.aClass109_11067.aClass2_1367, (byte) -68);
		class527_sub15.buffer.method16586(aClass41_7679.method87(), 1496149364);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public void method285() {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4461, client.aClass109_11067.aClass2_1367, (byte) -50);
		class527_sub15.buffer.method16586(aClass41_7679.method87(), -7612805);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public static void method9673(int i, int i_0_) {
		Class243.aClass205_2492.method3792(i, (byte) 76);
		Class243.aClass205_2497.method3792(i, (byte) -11);
		Class243.aClass205_2493.method3792(i, (byte) 32);
		Class243.aClass205_2477.method3792(i, (byte) 43);
	}

	static final void method9674(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class650.method10863(class243, class240, class665, -670299961);
	}

	static void method9675(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(4, (long) i);
		class527_sub8_sub9.method18187(-453206883);
		class527_sub8_sub9.anInt11676 = i_1_ * -281159195;
		class527_sub8_sub9.anInt11667 = i_2_ * -164049787;
		class527_sub8_sub9.anInt11678 = 1405416095 * i_3_;
	}

	static final void method9676(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class671.method13782(class243, class240, class665, 1887457017);
	}
}
