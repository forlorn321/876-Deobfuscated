/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class69 {
	public int anInt772;
	public int anInt773;
	public int anInt774;
	public String aString775;
	public String aString776;
	public int anInt777;
	public boolean aBool778;
	public String aString779;
	public boolean aBool780;
	public String aString781;

	Class69() {
		/* empty */
	}

	static void method1479(Class665 class665, byte i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 1] = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((1769813785 * class665.anInt8526) - 1)]), -1577099814)).method4749(Class671.aClass97_8584, (byte) 67) ? 1 : 0;
	}

	static void method1480(Class240 class240, Class243 class243, int i) {
		if (null != class243) {
			if (-927924265 * class243.anInt2675 != -1) {
				Class243 class243_0_ = (class240.aClass243Array2392[class243.anInt2536 * -1774688479 & 0xffff]);
				if (class243_0_ != null) {
					if (class243_0_.aClass243Array2666 == class243_0_.aClass243Array2665) {
						class243_0_.aClass243Array2666 = (new Class243[class243_0_.aClass243Array2665.length]);
						class243_0_.aClass243Array2666[0] = class243;
						Class692.method14028(class243_0_.aClass243Array2665, 0, class243_0_.aClass243Array2666, 1, -927924265 * class243.anInt2675);
						Class692.method14028(class243_0_.aClass243Array2665, -927924265 * class243.anInt2675 + 1, class243_0_.aClass243Array2666, 1 + class243.anInt2675 * -927924265, (class243_0_.aClass243Array2665.length - -927924265 * class243.anInt2675 - 1));
					} else {
						int i_1_ = 0;
						Class243[] class243s;
						for (class243s = class243_0_.aClass243Array2666; (i_1_ < class243s.length && class243s[i_1_] != class243); i_1_++) {
							/* empty */
						}
						if (i_1_ < class243s.length) {
							Class692.method14028(class243s, 0, class243s, 1, i_1_);
							class243s[0] = class243;
						}
					}
				}
			} else {
				Class243[] class243s = class240.method4387(-1694272756);
				int i_2_;
				for (i_2_ = 0; i_2_ < class243s.length && class243s[i_2_] != class243; i_2_++) {
					/* empty */
				}
				if (i_2_ < class243s.length) {
					Class692.method14028(class243s, 0, class243s, 1, i_2_);
					class243s[0] = class243;
				}
			}
		}
	}

	static final void method1481(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2662 * 942931881;
	}

	static final void method1482(Class665 class665, int i) {
		throw new RuntimeException("");
	}

	static final void method1483(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (client.aClass243_11201 == null ? -1 : client.aClass243_11201.anInt2504 * -254728301);
	}
}
