/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class254 implements Interface27 {
	Class213 this$0;
	static Class702 aClass702_2755;

	public void method154(Class226 class226, short i) {
		class226.method3238(-1316197454);
	}

	Class254(Class213 class213) {
		this$0 = class213;
	}

	public void method153(Class226 class226) {
		class226.method3238(2146013138);
	}

	public void method155(Class226 class226) {
		class226.method3238(1504266656);
	}

	static Class583[] method3536(byte i) {
		return (new Class583[] { Class583.aClass583_7701, Class583.aClass583_7704, Class583.aClass583_7703 });
	}

	public static short method3537(int i, int i_0_) {
		int i_1_ = i >> 10 & 0x3f;
		int i_2_ = i >> 3 & 0x70;
		int i_3_ = i & 0x7f;
		i_2_ = i_3_ <= 64 ? i_3_ * i_2_ >> 7 : (127 - i_3_) * i_2_ >> 7;
		int i_4_ = i_3_ + i_2_;
		int i_5_;
		if (i_4_ != 0)
			i_5_ = (i_2_ << 8) / i_4_;
		else
			i_5_ = i_2_ << 1;
		int i_6_ = i_4_;
		return (short) (i_1_ << 10 | i_5_ >> 4 << 7 | i_6_);
	}

	static final void method3538(Class251 class251, Class668 class668, int i) {
		if (943429543 * class668.anInt8559 >= 10)
			throw new RuntimeException();
		if (null != class251.anObjectArray2706) {
			Class536_Sub42 class536_sub42 = new Class536_Sub42();
			class536_sub42.aClass251_10804 = class251;
			class536_sub42.anObjectArray10802 = class251.anObjectArray2706;
			class536_sub42.anInt10810 = class668.anInt8559 * -500518129 + 1737782873;
			client.aClass708_11077.method8335(class536_sub42, -1099410433);
		}
	}

	static final void method3539(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_7_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_8_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class273.method3730(1, i_7_, i_8_, "", -1728121879);
	}
}
