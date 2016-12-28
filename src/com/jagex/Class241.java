/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class241 implements Interface26 {
	Class213 this$0;
	Class222 aClass222_2455;
	public static String osName;

	public void method155(Class226 class226) {
		class226.method3229(aClass222_2455, (byte) -123);
	}

	public void method154(Class226 class226, short i) {
		class226.method3229(aClass222_2455, (byte) -102);
	}

	public void method153(Class226 class226) {
		class226.method3229(aClass222_2455, (byte) -6);
	}

	Class241(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		boolean bool = class536_sub33.readUnsignedByte() != 255;
		if (bool)
			class536_sub33.off -= 516175515;
		aClass222_2455 = new Class222(class536_sub33, bool, true, class213.anInterface28_2296);
	}

	static final void method3384(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class520.method6351(class251, class234, class668, 2019922746);
	}

	static final void method3385(IComponentDefinitions class251, Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_1_ = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) - 1);
		int i_2_ = i_1_;
		if (6 != class251.modelType * 1939619399 && class251.modelType * 1939619399 != 2)
			throw new RuntimeException("");
		NPCDecoder class296 = ((NPCDecoder) Class172.aClass34_Sub7_1922.method70(-2011124813 * class251.modelId, (byte) 30));
		if (class251.aClass304_2583 == null)
			class251.aClass304_2583 = new NPCCustomization(class296, 1939619399 * class251.modelType == 6);
		class251.aClass304_2583.aLong3434 = Class584.method7047(999292582) * 1195640203384682761L;
		if (null != class296.aByteArray3283) {
			if (i_1_ < 0 || i_1_ >= class296.aByteArray3283.length)
				throw new RuntimeException("");
			i_2_ = class296.aByteArray3283[i_1_];
		}
		if (class296.aShortArray3281 == null || i_2_ < 0 || i_2_ >= class296.aShortArray3281.length)
			throw new RuntimeException("");
		class251.aClass304_2583.aShortArray3439[i_2_] = (short) i_0_;
		Class668.method8011(class251, 263642117);
	}

	static final void method3386(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_3_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.parentLayer * -1940204141;
	}

	static final void method3387(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_4_ >> 28;
	}

	public static Class604[] method3388(byte i) {
		return (new Class604[] { Class604.aClass604_7865, Class604.aClass604_7866, Class604.aClass604_7868 });
	}
}
