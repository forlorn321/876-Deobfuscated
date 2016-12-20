/* Class171_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class171_Sub1 extends Class171 {
	Class171_Sub1() {
		/* empty */
	}

	public abstract int method14726();

	public abstract int method14727(int i, int i_0_);

	abstract void method14728(int i, int i_1_);

	abstract void method14729(int i, int i_2_);

	abstract void method14730(int i, int i_3_);

	public abstract int method14731();

	public abstract int method14732();

	public abstract int method14733(int i, int i_4_);

	static void method14734(Class240 class240, Class243 class243, byte i) {
		if (class243 != null) {
			if (-927924265 * class243.anInt2675 != -1) {
				Class243 class243_5_ = class240.method4386(-1774688479 * class243.anInt2536, -128454903);
				if (null != class243_5_) {
					if (class243_5_.aClass243Array2666 == class243_5_.aClass243Array2665) {
						class243_5_.aClass243Array2666 = (new Class243[class243_5_.aClass243Array2665.length]);
						class243_5_.aClass243Array2666[class243_5_.aClass243Array2666.length - 1] = class243;
						Class692.method14028(class243_5_.aClass243Array2665, 0, class243_5_.aClass243Array2666, 0, class243.anInt2675 * -927924265);
						Class692.method14028(class243_5_.aClass243Array2665, (-927924265 * class243.anInt2675 + 1), class243_5_.aClass243Array2666, -927924265 * class243.anInt2675, ((class243_5_.aClass243Array2665).length - -927924265 * class243.anInt2675 - 1));
					} else {
						int i_6_ = 0;
						Class243[] class243s;
						for (class243s = class243_5_.aClass243Array2666; (i_6_ < class243s.length && class243s[i_6_] != class243); i_6_++) {
							/* empty */
						}
						if (i_6_ < class243s.length) {
							Class692.method14028(class243s, i_6_ + 1, class243s, i_6_, class243s.length - i_6_ - 1);
							class243s[(class243_5_.aClass243Array2666.length - 1)] = class243;
						}
					}
				}
			} else {
				Class243[] class243s = class240.method4387(-1694272756);
				int i_7_;
				for (i_7_ = 0; i_7_ < class243s.length && class243s[i_7_] != class243; i_7_++) {
					/* empty */
				}
				if (i_7_ < class243s.length) {
					Class692.method14028(class243s, i_7_ + 1, class243s, i_7_, class243s.length - i_7_ - 1);
					class243s[class243s.length - 1] = class243;
				}
			}
		}
	}

	static final void method14735(Class665 class665, int i) throws Exception_Sub6 {
		class665.anInt8526 -= 409523364;
		int i_8_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_9_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_10_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		int i_11_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 3];
		Class442 class442 = Class442.method7166((float) i_8_, (float) i_9_, (float) i_10_);
		if (-1.0F == class442.aFloat4918)
			class442.aFloat4918 = Float.POSITIVE_INFINITY;
		if (class442.aFloat4915 == -1.0F)
			class442.aFloat4915 = Float.POSITIVE_INFINITY;
		if (-1.0F == class442.aFloat4919)
			class442.aFloat4919 = Float.POSITIVE_INFINITY;
		Class208_Sub10.aClass296_Sub1_9923.method5352(class442, 245838033);
		Class208_Sub10.aClass296_Sub1_9923.method5349((float) i_11_ / 1000.0F, (byte) -32);
		class442.method7141();
	}

	public static Class558 method14736(boolean bool, int i) {
		synchronized (Class558.aStack7531) {
			Class558 class558;
			if (Class558.aStack7531.isEmpty())
				class558 = new Class558();
			else
				class558 = (Class558) Class558.aStack7531.pop();
			class558.aBool7530 = bool;
			Class558 class558_12_ = class558;
			return class558_12_;
		}
	}
}
