/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class190 {
	int anInt2146;
	Class606 aClass606_2147;
	int anInt2148;
	int anInt2149;
	int anInt2150;
	int anInt2151;

	void method2816(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		ChunkSceneSubPackets.method4972(i, i_0_, i_1_, 476778909 * aClass606_2147.anInt7897, -376823457 * anInt2151, -723459231 * aClass606_2147.anInt7878, i_2_, (byte) 87);
		anInt2148 = i * -1728913933;
		anInt2146 = -1773546337 * i_0_;
		anInt2149 = -1164899093 * i_1_;
		anInt2150 = i_2_ * -327647997;
	}

	void method2817() {
		ChunkSceneSubPackets.method4972(-1658911941 * anInt2148, 1780369247 * anInt2146, anInt2149 * 442186691, aClass606_2147.anInt7897 * 476778909, -1, -723459231 * aClass606_2147.anInt7878, 1143723435 * anInt2150, (byte) 2);
	}

	void method2818(byte i) {
		ChunkSceneSubPackets.method4972(-1658911941 * anInt2148, 1780369247 * anInt2146, anInt2149 * 442186691, aClass606_2147.anInt7897 * 476778909, -1, -723459231 * aClass606_2147.anInt7878, 1143723435 * anInt2150, (byte) 14);
	}

	boolean method2819(int i) {
		if (-376823457 * anInt2151 >= 0) {
			Class612 class612 = ((Class612) Class48.aClass34_Sub17_579.method70(-376823457 * anInt2151, (byte) -120));
			boolean bool = class612.method7286(aClass606_2147.anInt7878 * -723459231, -1065371880);
			int[] is = class612.method7295(-1922318465);
			if (null != is) {
				int[] is_4_ = is;
				for (int i_5_ = 0; i_5_ < is_4_.length; i_5_++) {
					int i_6_ = is_4_[i_5_];
					bool &= ((Class191) Class45.aClass34_Sub11_529.method70(i_6_, (byte) 85)).method2836(1266633654);
				}
			}
			return bool;
		}
		return true;
	}

	void method2820() {
		ChunkSceneSubPackets.method4972(-1658911941 * anInt2148, 1780369247 * anInt2146, anInt2149 * 442186691, aClass606_2147.anInt7897 * 476778909, -1, -723459231 * aClass606_2147.anInt7878, 1143723435 * anInt2150, (byte) 123);
	}

	void method2821() {
		ChunkSceneSubPackets.method4972(-1658911941 * anInt2148, 1780369247 * anInt2146, anInt2149 * 442186691, aClass606_2147.anInt7897 * 476778909, -1, -723459231 * aClass606_2147.anInt7878, 1143723435 * anInt2150, (byte) 83);
	}

	Class190(RSByteBuffer class536_sub33) {
		anInt2151 = class536_sub33.readBigSmart((byte) 1) * -1653441889;
		aClass606_2147 = ((Class606) Class682.method8091(Class145.method1800((byte) 41), class536_sub33.readUnsignedByte(), 1858049507));
	}

	void method2822() {
		ChunkSceneSubPackets.method4972(-1658911941 * anInt2148, 1780369247 * anInt2146, anInt2149 * 442186691, aClass606_2147.anInt7897 * 476778909, -1, -723459231 * aClass606_2147.anInt7878, 1143723435 * anInt2150, (byte) 112);
	}

	boolean method2823() {
		if (-376823457 * anInt2151 >= 0) {
			Class612 class612 = ((Class612) Class48.aClass34_Sub17_579.method70(-376823457 * anInt2151, (byte) -28));
			boolean bool = class612.method7286(aClass606_2147.anInt7878 * -723459231, 1001699716);
			int[] is = class612.method7295(-1919596937);
			if (null != is) {
				int[] is_7_ = is;
				for (int i = 0; i < is_7_.length; i++) {
					int i_8_ = is_7_[i];
					bool &= ((Class191) Class45.aClass34_Sub11_529.method70(i_8_, (byte) -34)).method2836(2079757227);
				}
			}
			return bool;
		}
		return true;
	}

	public static int method2824(int i) {
		return Class262.anInt2849 * -1940636747 - 1;
	}

	public static void method2825(int i) {
		Class575.anInt7673 = 1660262091;
	}

	static final void method2826(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1833712604) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2661 = Class33.method796(string, class668, (short) 19626);
		class251.aBool2666 = true;
	}

	static final String method2827(int i, int i_9_) {
		String string = Integer.toString(i);
		for (int i_10_ = string.length() - 3; i_10_ > 0; i_10_ -= 3)
			string = new StringBuilder().append(string.substring(0, i_10_)).append(Class40.aString491).append(string.substring(i_10_)).toString();
		if (string.length() > 9)
			return new StringBuilder().append(" ").append(Class264.method3680(65408, -1318647965)).append(string.substring(0, string.length() - 8)).append(Class38.aClass38_445.method840(Class459.aClass664_5178, 1743394720)).append(" (").append(string).append(")").append(Class40.aString497).toString();
		if (string.length() > 6)
			return new StringBuilder().append(" ").append(Class264.method3680(16777215, -1879569384)).append(string.substring(0, string.length() - 4)).append(Class38.aClass38_447.method840(Class459.aClass664_5178, 1328863648)).append(" (").append(string).append(")").append(Class40.aString497).toString();
		return new StringBuilder().append(" ").append(Class264.method3680(16776960, -1775699338)).append(string).append(Class40.aString497).toString();
	}

	public static void method2828(byte i) {
		Class71.aClass708_794 = new Class708();
	}
}
