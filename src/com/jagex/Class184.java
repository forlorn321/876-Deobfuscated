/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public class Class184 {
	static Class184 aClass184_2101;
	static Class184 aClass184_2102;
	public int anInt2103;
	public static Class184 aClass184_2104;
	static Class184 aClass184_2105 = new Class184(6, 1);
	public static Class184 aClass184_2106;
	public static Class184 aClass184_2107;
	public static Class184 aClass184_2108;
	public static Class184 aClass184_2109;
	public static Class184 aClass184_2110;
	public int anInt2111;

	Class184(int i, int i_0_) {
		anInt2103 = i * 1071149529;
		anInt2111 = i_0_ * 725672205;
	}

	static {
		aClass184_2102 = new Class184(2, 2);
		aClass184_2101 = new Class184(7, 4);
		aClass184_2104 = new Class184(3, 1);
		aClass184_2110 = new Class184(4, 2);
		aClass184_2106 = new Class184(5, 3);
		aClass184_2107 = new Class184(1, 4);
		aClass184_2108 = new Class184(0, 2);
		aClass184_2109 = new Class184(8, 4);
	}

	static final void method3563(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4386, class109.aClass2_1367, (byte) 45);
		class527_sub15.buffer.writeByte(i_1_, 1127540094);
		class109.method1969(class527_sub15, (byte) 1);
	}

	public static void method3564(Class709 class709, Frame frame, int i) {
		class709.method14384(1188545495);
		frame.setVisible(false);
		frame.dispose();
	}

	public static int method3565(int i, int i_2_, int i_3_, int i_4_) {
		if (Class529_Sub1.anInt10773 * -1639647951 < 100)
			return -2;
		int i_5_ = -2;
		int i_6_ = 2147483647;
		int i_7_ = i_2_ - Class529_Sub1.anInt7137;
		int i_8_ = i_3_ - Class529_Sub1.anInt7138;
		for (Class527_Sub30 class527_sub30 = ((Class527_Sub30) Class529_Sub1.aClass694_7147.method14081((short) -4089)); class527_sub30 != null; class527_sub30 = (Class527_Sub30) Class529_Sub1.aClass694_7147.method14086(-65534)) {
			if (class527_sub30.anInt10567 * -558184067 == i) {
				int i_9_ = class527_sub30.anInt10568 * 208579007;
				int i_10_ = -1499963557 * class527_sub30.anInt10565;
				int i_11_ = (i_9_ + Class529_Sub1.anInt7137 << 14 | Class529_Sub1.anInt7138 + i_10_);
				int i_12_ = ((i_7_ - i_9_) * (i_7_ - i_9_) + (i_8_ - i_10_) * (i_8_ - i_10_));
				if (i_5_ < 0 || i_12_ < i_6_) {
					i_5_ = i_11_;
					i_6_ = i_12_;
				}
			}
		}
		return i_5_;
	}
}
