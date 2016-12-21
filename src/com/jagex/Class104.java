/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class104 implements Interface22 {
	int[] anIntArray1233;
	int anInt1234;
	int anInt1235;

	public void method130() {
		/* empty */
	}

	Class104(int i, int i_0_, int[] is) {
		anInt1235 = -1455756807 * i;
		anInt1234 = i_0_ * -1349589735;
		anIntArray1233 = is;
	}

	public int method1() {
		return 853510217 * anInt1235;
	}

	public int method78() {
		return 993699625 * anInt1234;
	}

	Class104(int i, int i_1_) {
		this(i, i_1_, new int[i_1_ * i]);
	}

	public void method131() {
		/* empty */
	}

	public int method73() {
		return 853510217 * anInt1235;
	}

	public int method83() {
		return 993699625 * anInt1234;
	}

	public int method12() {
		return 853510217 * anInt1235;
	}

	public int method8() {
		return 993699625 * anInt1234;
	}

	public int method9() {
		return 993699625 * anInt1234;
	}

	public int method82() {
		return 853510217 * anInt1235;
	}

	public void method129() {
		/* empty */
	}

	static final void method1377(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class390.method4856(class251, class234, false, 2, class668, (byte) -2);
	}

	static final void method1378(Class668 class668, byte i) {
		if (Class683.aClass301_Sub1_8651.method4062(1380590483) != Class300.aClass300_3357)
			throw new RuntimeException();
		((Class706_Sub3) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10280((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]), 1867269829);
	}

	static final void method1379(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_2_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class198.method2872(class251, class234, class668, 1193761028);
	}

	static void method1380(Class167 class167, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if ((Class472.aClass143_5369 == null || Class323.aClass143_3550 == null || Class204.aClass143_2234 == null) && Class398.aClass461_4122.method5580(Class587.anInt7739 * 1037345753, -964514165) && Class398.aClass461_4122.method5580(-1147982799 * Class252.anInt2746, -964514165) && Class398.aClass461_4122.method5580(Class575.anInt7680 * -1877429477, -964514165)) {
			Class179 class179 = Class181.method2718(Class398.aClass461_4122, -1147982799 * Class252.anInt2746, 0);
			Class323.aClass143_3550 = class167.method2082(class179, true);
			class179.method2648();
			Class106.aClass143_1275 = class167.method2082(class179, true);
			Class472.aClass143_5369 = class167.method2082(Class181.method2718((Class398.aClass461_4122), (Class587.anInt7739 * 1037345753), 0), true);
			Class179 class179_8_ = Class181.method2718(Class398.aClass461_4122, Class575.anInt7680 * -1877429477, 0);
			Class204.aClass143_2234 = class167.method2082(class179_8_, true);
			class179_8_.method2648();
			Class662.aClass143_8514 = class167.method2082(class179_8_, true);
		}
		if (Class472.aClass143_5369 != null && Class323.aClass143_3550 != null && null != Class204.aClass143_2234) {
			int i_9_ = ((i_4_ - Class204.aClass143_2234.method1720() * 2) / Class472.aClass143_5369.method1720());
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				Class472.aClass143_5369.method1728((i + Class204.aClass143_2234.method1720() + i_10_ * Class472.aClass143_5369.method1720()), i_5_ + i_3_ - Class472.aClass143_5369.method1752());
			int i_11_ = ((i_5_ - i_6_ - Class204.aClass143_2234.method1752()) / Class323.aClass143_3550.method1752());
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				Class323.aClass143_3550.method1728(i, (i_3_ + i_6_ + i_12_ * Class323.aClass143_3550.method1752()));
				Class106.aClass143_1275.method1728(i_4_ + i - Class106.aClass143_1275.method1720(), (i_3_ + i_6_ + i_12_ * Class323.aClass143_3550.method1752()));
			}
			Class204.aClass143_2234.method1728(i, (i_5_ + i_3_ - Class204.aClass143_2234.method1752()));
			Class662.aClass143_8514.method1728(i + i_4_ - Class204.aClass143_2234.method1720(), i_5_ + i_3_ - Class204.aClass143_2234.method1752());
		}
	}
}
