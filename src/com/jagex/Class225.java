/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class225 implements Interface26 {
	Class224 aClass224_2340;
	Class213 this$0;

	public void method154(Class226 class226, short i) {
		class226.method3231(aClass224_2340, (byte) -46);
	}

	public void method155(Class226 class226) {
		class226.method3231(aClass224_2340, (byte) -35);
	}

	Class225(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		boolean bool = class536_sub33.readUnsignedByte() != 255;
		if (bool)
			class536_sub33.off -= 516175515;
		aClass224_2340 = new Class224(class536_sub33, bool, true);
	}

	public void method153(Class226 class226) {
		class226.method3231(aClass224_2340, (byte) -92);
	}

	public static Class563 method3212(boolean bool, int i) {
		synchronized (Class563.aStack7580) {
			Class563 class563;
			if (Class563.aStack7580.isEmpty())
				class563 = new Class563();
			else
				class563 = (Class563) Class563.aStack7580.pop();
			class563.aBool7581 = bool;
			Class563 class563_0_ = class563;
			return class563_0_;
		}
	}

	static final void method3213(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class478.method5758(class251, class234, class668, 893006056);
	}

	static final void method3214(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class198.method2873(class251, class234, class668, Class233.aClass233_2374, (byte) -60);
	}

	static final void method3215(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.zan2d * 1533121603;
	}

	static final void method3216(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class459.CLIENT_PARAMS.method78();
	}

	static String getColorFormatString(int color) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(color)).append(">").toString();
	}

	public static boolean method3218(int i) {
		do {
			boolean bool;
			try {
				if (IcmpService_Sub1.available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (IcmpService_Sub1.anIcmpService_Sub1_10855 != null)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_10855 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class640());
		thread.setDaemon(true);
		thread.start();
		return true;
	}
}
