/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class221 implements Interface27 {
	Class213 this$0;
	int anInt2311;
	public static String aString2312;

	Class221(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2311 = class536_sub33.readUnsignedShort((short) 28083) * 375634855;
	}

	public void method153(Class226 class226) {
		class226.method3235(-1604764649 * anInt2311, -964103516);
		class226.method3227(anInt2311 * -1604764649, -781094290);
	}

	public void method154(Class226 class226, short i) {
		class226.method3235(-1604764649 * anInt2311, -607666776);
		class226.method3227(anInt2311 * -1604764649, -781094290);
	}

	public void method155(Class226 class226) {
		class226.method3235(-1604764649 * anInt2311, 1333868543);
		class226.method3227(anInt2311 * -1604764649, -781094290);
	}

	static Class536_Sub18_Sub16 method3108(Class570 class570, int i, int i_0_, byte i_1_) {
		int i_2_ = class570.anInt7614 * 544286521 | i << 10;
		Class536_Sub18_Sub16 class536_sub18_sub16 = ((Class536_Sub18_Sub16) Class652.aClass195_8488.method2859((long) i_2_ << 16));
		if (null != class536_sub18_sub16)
			return class536_sub18_sub16;
		byte[] is = (Class649_Sub1_Sub4_Sub2.aClass461_12021.method5595(Class649_Sub1_Sub4_Sub2.aClass461_12021.method5572(i_2_, -748358457), -1209054904));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class536_sub18_sub16 = Class205_Sub14.method9076(is, -658088465);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class536_sub18_sub16.aClass570_11800 = class570;
			Class652.aClass195_8488.method2856(class536_sub18_sub16, (long) i_2_ << 16);
			return class536_sub18_sub16;
		}
		i_2_ = class570.anInt7614 * 544286521 | 65536 + i_0_ << 10;
		class536_sub18_sub16 = ((Class536_Sub18_Sub16) Class652.aClass195_8488.method2859((long) i_2_ << 16));
		if (null != class536_sub18_sub16)
			return class536_sub18_sub16;
		is = (Class649_Sub1_Sub4_Sub2.aClass461_12021.method5595(Class649_Sub1_Sub4_Sub2.aClass461_12021.method5572(i_2_, -748358457), -1259847933));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class536_sub18_sub16 = Class205_Sub14.method9076(is, -658088465);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class536_sub18_sub16.aClass570_11800 = class570;
			Class652.aClass195_8488.method2856(class536_sub18_sub16, (long) i_2_ << 16);
			return class536_sub18_sub16;
		}
		i_2_ = 544286521 * class570.anInt7614 | 0x3fffc00;
		class536_sub18_sub16 = ((Class536_Sub18_Sub16) Class652.aClass195_8488.method2859((long) i_2_ << 16));
		if (class536_sub18_sub16 != null)
			return class536_sub18_sub16;
		is = (Class649_Sub1_Sub4_Sub2.aClass461_12021.method5595(Class649_Sub1_Sub4_Sub2.aClass461_12021.method5572(i_2_, -748358457), -2007960527));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class536_sub18_sub16 = Class205_Sub14.method9076(is, -658088465);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class536_sub18_sub16.aClass570_11800 = class570;
			Class652.aClass195_8488.method2856(class536_sub18_sub16, (long) i_2_ << 16);
			return class536_sub18_sub16;
		}
		return null;
	}

	static final void method3109(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_3_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class675.method8037(class251, class234, class668, 2141266766);
	}

	static final void method3110(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class700.method8251(class251, class234, class668, -693578313);
	}

	static final void method3111(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(809894116);
	}

	static final void method3112(Class668 class668, int i) {
		Class50.anInt586 = 0;
	}
}
