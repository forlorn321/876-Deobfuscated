/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class181 {
	Class163[] aClass163Array2091;
	int anInt2092;
	public static Class208[] aClass208Array2093;

	public Class163 method3543(int i) {
		return aClass163Array2091[i];
	}

	public Class163 method3544(int i, byte i_0_) {
		return aClass163Array2091[i];
	}

	public Class163 method3545(int i) {
		return aClass163Array2091[i];
	}

	public Class181(Class459 class459) {
		anInt2092 = class459.method7504(0, 1433064582) * -659182815;
		aClass163Array2091 = new Class163[anInt2092 * -459695903];
		for (int i = 0; i < -459695903 * anInt2092; i++) {
			RSByteBuffer class527_sub38 = new RSByteBuffer(class459.method7470(0, i, (byte) -125));
			if (null == class527_sub38.buffer)
				aClass163Array2091[i] = null;
			else {
				try {
					Class163 class163 = new Class163();
					class163.method2648(i, class527_sub38, -2078286187);
					aClass163Array2091[i] = class163;
				} catch (Exception exception) {
					aClass163Array2091[i] = null;
				}
			}
		}
	}

	public Class163 method3546(int i) {
		return aClass163Array2091[i];
	}

	public Class163 method3547(int i) {
		return aClass163Array2091[i];
	}

	public static Class449[] method3548(int i) {
		return (new Class449[] { Class449.aClass449_4931, Class449.aClass449_4933, Class449.aClass449_4932 });
	}

	static final void method3549(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_1_, -367321072);
		Class240 class240 = Class183.aClass240Array2100[i_1_ >> 16];
		Class398.method6515(class243, class240, class665, 1799622004);
	}

	static final void method3550(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, 1842657473);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class289.method5229(class243, class240, class665, (byte) -1);
	}

	static final void method3551(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, -400405049);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class254.method4700(class243, class240, class665, -189043830);
	}

	public static final int method3552(String string, int i) {
		if (string == null)
			return -1;
		for (int i_4_ = 0; i_4_ < -67152419 * client.anInt11261; i_4_++) {
			if (string.equalsIgnoreCase(client.aClass69Array11297[i_4_].aString776))
				return i_4_;
		}
		return -1;
	}
}
