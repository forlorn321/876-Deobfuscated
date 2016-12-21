/* Class585 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class585 implements Interface68 {
	int anInt7707;

	Class585(int i) {
		anInt7707 = i * -1819767427;
	}

	public void method296() {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4437, client.aClass106_11322.aClass15_1258, 1584643573);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(anInt7707 * -838200363, (byte) 0);
		client.aClass106_11322.method1409(class536_sub23, 587312823);
	}

	public void method206(int i) {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4437, client.aClass106_11322.aClass15_1258, 1109648525);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(anInt7707 * -838200363, (byte) 0);
		client.aClass106_11322.method1409(class536_sub23, 1552353646);
	}

	public void method131() {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4437, client.aClass106_11322.aClass15_1258, 1829232360);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(anInt7707 * -838200363, (byte) 0);
		client.aClass106_11322.method1409(class536_sub23, 2138462249);
	}

	public static int[] method7048(int i, int i_0_) {
		int[] is = new int[3];
		Class164.method1972(Class588.method7085(i, (short) 21750));
		is[0] = Class81.aCalendar859.get(5);
		is[1] = Class81.aCalendar859.get(2);
		is[2] = Class81.aCalendar859.get(1);
		return is;
	}

	static final int method7049(int i, int i_1_, int i_2_) {
		int i_3_ = i + 57 * i_1_;
		i_3_ = i_3_ << 13 ^ i_3_;
		int i_4_ = (1376312589 + (789221 + 15731 * (i_3_ * i_3_)) * i_3_ & 0x7fffffff);
		return i_4_ >> 19 & 0xff;
	}

	public static final boolean method7050(char c, byte i) {
		return (c >= '!' && c < '0' || c >= ':' && c <= '@' && '<' != c || c >= '[' && c <= '_' || c >= '{');
	}

	static final void method7051(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class604.method7206((char) i_5_, (byte) -79) ? 1 : 0;
	}
}
