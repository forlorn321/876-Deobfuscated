/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public abstract class Class567 {
	static long aLong7600;

	Class567() {
		/* empty */
	}

	public abstract boolean bitsRemaining(int i, int i_0_) throws IOException;

	public abstract int method6898(int i) throws IOException;

	public abstract int method6899(byte[] is, int i, int i_1_, int i_2_) throws IOException;

	public abstract void method6900();

	public abstract int method6901() throws IOException;

	public abstract void method6902(int i);

	public abstract boolean method6903(int i) throws IOException;

	public abstract boolean method6904(int i) throws IOException;

	public abstract void method6905();

	public abstract int method6906() throws IOException;

	public abstract int method6907(byte[] is, int i, int i_3_) throws IOException;

	public abstract int method6908(byte[] is, int i, int i_4_) throws IOException;

	public abstract void method6909(byte[] is, int i, int i_5_) throws IOException;

	public abstract void method6910();

	public abstract void method6911();

	public abstract void method6912(byte[] is, int i, int i_6_, byte i_7_) throws IOException;

	public abstract void method6913(int i);

	static boolean method6914(int i, byte i_8_) {
		return (i >= -723459231 * ObjShapes.aClass606_7888.anInt7878 && i <= -723459231 * ObjShapes.aClass606_7882.anInt7878);
	}

	static final void method6915(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -504840433) != null)
			string = string.substring(0, string.length() - 1);
		class251.onDragCompleteHook = Class33.method796(string, class668, (short) 5827);
		class251.hasComponentHook = true;
	}

	static final void method6916(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class168.method2416(class251, class234, class668, 1949225549);
	}

	static final void method6917(Class668 class668, byte i) {
		Class536_Sub30 class536_sub30 = ((Class536_Sub30) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]));
		if (Class683.aClass301_Sub1_8651.method4054(-1602500023) != Class290.aClass290_3222)
			throw new RuntimeException();
		Class333_Sub1 class333_sub1 = ((Class333_Sub1) Class683.aClass301_Sub1_8651.method4051(826143221));
		class333_sub1.method9160(class536_sub30, 1582791313);
		client.aBool11242 = true;
	}

	public static void method6918(int i) {
		Class6 class6 = Class153_Sub1.method8383("2", client.aClass670_11043.aString8573, true, 2012023174);
		ObjTypeTransformation.aClass147_Sub1_7791.method8413(class6, 14907980);
	}

	static final void method6919(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class269.method3710(string, (byte) -103);
	}

	public static void method6920(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10363.method8308(1867269829)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10363.method8311(1362053399))
			Class649_Sub1_Sub3_Sub1.method10939(class536_sub3, i, i_9_, i_10_, i_11_, 827594562);
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass708_10386.method8308(1867269829)); null != class536_sub3; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass708_10386.method8311(1178736583)) {
			int i_13_ = 1;
			BASTypeDecoder class589 = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method10877(89389799);
			int i_14_ = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass688_Sub3_11914.method8120((byte) 83);
			if (-1 == i_14_ || (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass688_Sub3_11914.aBool10975))
				i_13_ = 0;
			else if (class589.anInt7751 * -1967774449 == i_14_ || i_14_ == 1554006571 * class589.anInt7752 || i_14_ == class589.anInt7754 * -461301069 || -1062537651 * class589.anInt7741 == i_14_)
				i_13_ = 2;
			else if (i_14_ == class589.anInt7755 * 1910615395 || 183104283 * class589.anInt7766 == i_14_ || 592656773 * class589.anInt7758 == i_14_ || i_14_ == class589.anInt7757 * -1930617513)
				i_13_ = 3;
			if (class536_sub3.anInt10384 * 1130756623 != i_13_) {
				int i_15_ = (Class536_Sub20.method9567(class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378, 489137998));
				NPCDecoder class296 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aClass296_12174);
				if (null != class296.anIntArray3304)
					class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -39);
				if (null == class296 || -1 == i_15_) {
					class536_sub3.anInt10388 = 1239313553;
					class536_sub3.anInt10384 = -1384663825 * i_13_;
				} else if (i_15_ != -1095423089 * class536_sub3.anInt10388) {
					boolean bool = false;
					if (class536_sub3.aClass479_10389 != null) {
						class536_sub3.anInt10376 -= 852218368;
						if (-540425639 * class536_sub3.anInt10376 <= 0) {
							class536_sub3.aClass479_10389.method5774(100, (byte) 32);
							Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
							class536_sub3.aClass479_10389 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						class536_sub3.anInt10376 = -930050451 * class296.anInt3295;
						class536_sub3.anInt10388 = i_15_ * -1239313553;
						class536_sub3.anInt10384 = -1384663825 * i_13_;
					}
				} else {
					class536_sub3.anInt10384 = i_13_ * -1384663825;
					class536_sub3.anInt10376 = class296.anInt3295 * -930050451;
				}
			}
			Class436 class436 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method7837().aClass436_4823);
			class536_sub3.anInt10367 = (int) class436.aFloat4850 * -537587733;
			class536_sub3.anInt10370 = ((int) class436.aFloat4850 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method10874() << 8)) * -456576489;
			class536_sub3.anInt10369 = (int) class436.aFloat4853 * -1373921313;
			class536_sub3.anInt10371 = ((int) class436.aFloat4853 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.method10874() << 8)) * 1536397313;
			class536_sub3.anInt10364 = -358839083 * (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub1_10378.aByte10839);
			Class649_Sub1_Sub3_Sub1.method10939(class536_sub3, i, i_9_, i_10_, i_11_, 261069513);
		}
		for (Class536_Sub3 class536_sub3 = ((Class536_Sub3) Class536_Sub3.aClass4_10366.method562(-1366717200)); class536_sub3 != null; class536_sub3 = (Class536_Sub3) Class536_Sub3.aClass4_10366.method567(-1662169249)) {
			int i_16_ = 1;
			BASTypeDecoder class589 = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method10877(1026918936);
			int i_17_ = class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.aClass688_Sub3_11914.method8120((byte) 73);
			if (-1 == i_17_ || (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.aClass688_Sub3_11914.aBool10975))
				i_16_ = 0;
			else if (i_17_ == class589.anInt7751 * -1967774449 || 1554006571 * class589.anInt7752 == i_17_ || i_17_ == -461301069 * class589.anInt7754 || i_17_ == -1062537651 * class589.anInt7741)
				i_16_ = 2;
			else if (i_17_ == class589.anInt7755 * 1910615395 || i_17_ == class589.anInt7766 * 183104283 || class589.anInt7758 * 592656773 == i_17_ || i_17_ == -1930617513 * class589.anInt7757)
				i_16_ = 3;
			if (i_16_ != class536_sub3.anInt10384 * 1130756623) {
				int i_18_ = (Class266.method3695(class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379, -76011058));
				if (i_18_ != -1095423089 * class536_sub3.anInt10388) {
					boolean bool = false;
					if (class536_sub3.aClass479_10389 != null) {
						class536_sub3.anInt10376 -= 852218368;
						if (-540425639 * class536_sub3.anInt10376 <= 0) {
							class536_sub3.aClass479_10389.method5774(100, (byte) 32);
							Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10389, -1092963117);
							class536_sub3.aClass479_10389 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						class536_sub3.anInt10376 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.anInt12178) * -717330677;
						class536_sub3.anInt10388 = i_18_ * -1239313553;
						class536_sub3.anInt10384 = -1384663825 * i_16_;
					}
				} else {
					class536_sub3.anInt10376 = -717330677 * (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.anInt12178);
					class536_sub3.anInt10384 = i_16_ * -1384663825;
				}
			}
			Class436 class436 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method7837().aClass436_4823);
			class536_sub3.anInt10367 = -537587733 * (int) class436.aFloat4850;
			class536_sub3.anInt10370 = ((int) class436.aFloat4850 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method10874() << 8)) * -456576489;
			class536_sub3.anInt10369 = -1373921313 * (int) class436.aFloat4853;
			class536_sub3.anInt10371 = ((int) class436.aFloat4853 + (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.method10874() << 8)) * 1536397313;
			class536_sub3.anInt10364 = (class536_sub3.aClass649_Sub1_Sub5_Sub1_Sub2_10379.aByte10839 * -358839083);
			Class649_Sub1_Sub3_Sub1.method10939(class536_sub3, i, i_9_, i_10_, i_11_, 257032482);
		}
	}
}
