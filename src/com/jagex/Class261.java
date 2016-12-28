/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class261 implements Interface75 {
	public static Class261 aClass261_2841;
	public int anInt2842;
	static Class261 aClass261_2843;
	public static Class261 aClass261_2844 = new Class261(0, 0);
	int anInt2845;

	public int method78() {
		return -1085941481 * anInt2845;
	}

	static {
		aClass261_2841 = new Class261(1, 1);
		aClass261_2843 = new Class261(2, 2);
	}

	public int method12() {
		return -1085941481 * anInt2845;
	}

	public int method73() {
		return -1085941481 * anInt2845;
	}

	Class261(int i, int i_0_) {
		anInt2842 = 1668343763 * i;
		anInt2845 = 214232743 * i_0_;
	}

	public static void method3621(boolean bool, int i) {
		/* empty */
	}

	static final void method3622(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class186.method2774(class251, class234, class668, 1757410287);
	}

	static final void method3623(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class453.method5447(class251, class234, class668, (byte) 6);
	}

	static final void method3624(int i, int[] is, int i_1_) {
		if (Class644.method7794(i, is, 1096675058)) {
			IComponentDefinitions[] class251s = Class463.aClass234Array5227[i].aClass251Array2378;
			for (int i_2_ = 0; i_2_ < class251s.length; i_2_++) {
				IComponentDefinitions class251 = class251s[i_2_];
				if (null != class251 && class251.aClass688_2653 != null)
					class251.aClass688_2653.method8137(-19967701);
			}
		}
	}

	static final void method3625(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_3_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class98.method1322(class251, class234, class668, (byte) 0);
	}
}
