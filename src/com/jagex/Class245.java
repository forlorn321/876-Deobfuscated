/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

class Class245 implements Iterator {
	Class95_Sub1_Sub1 this$0;
	int anInt2697;
	public static Class226 aClass226_2698;

	public Object method4617() {
		int i = (anInt2697 += -1037509385) * 994223303 - 1;
		Class160_Sub1 class160_sub1 = (Class160_Sub1) this$0.aClass205_11330.method3787((long) i);
		if (null != class160_sub1)
			return class160_sub1;
		return this$0.method17859(i, (byte) 117);
	}

	public boolean hasNext() {
		return anInt2697 * 994223303 < this$0.method77(1181590849);
	}

	Class245(Class95_Sub1_Sub1 class95_sub1_sub1) {
		this$0 = class95_sub1_sub1;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean method4618() {
		return anInt2697 * 994223303 < this$0.method77(1351233337);
	}

	public Object method4619() {
		int i = (anInt2697 += -1037509385) * 994223303 - 1;
		Class160_Sub1 class160_sub1 = (Class160_Sub1) this$0.aClass205_11330.method3787((long) i);
		if (null != class160_sub1)
			return class160_sub1;
		return this$0.method17859(i, (byte) 81);
	}

	public Object next() {
		int i = (anInt2697 += -1037509385) * 994223303 - 1;
		Class160_Sub1 class160_sub1 = (Class160_Sub1) this$0.aClass205_11330.method3787((long) i);
		if (null != class160_sub1)
			return class160_sub1;
		return this$0.method17859(i, (byte) 97);
	}

	public void method4620() {
		throw new UnsupportedOperationException();
	}

	public static String method4621(RSByteBuffer class527_sub38, int i) {
		return Class174_Sub1.method14595(class527_sub38, 32767, 1666350543);
	}

	static final int method4622(Class180 class180, Class660 class660, int i) {
		if (-1 != -742413183 * class660.anInt8505)
			return -742413183 * class660.anInt8505;
		if (class660.anInt8501 * 482678519 != -1) {
			Class163 class163 = class180.aClass181_2059.method3544(class660.anInt8501 * 482678519, (byte) -53);
			if (!class163.aBool1806)
				return class163.aShort1810;
		}
		return class660.anInt8498 * 335838185;
	}

	public static void method4623(boolean bool, int i) {
		/* empty */
	}

	static final void method4624(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 2035497486);
		int i_1_ = -1;
		int i_2_ = -1;
		Class248 class248 = class243.method4524(Class402.aClass180_4150, 708326095);
		if (class248 != null) {
			i_1_ = class248.anInt2726 * 2146202801;
			i_2_ = 718383107 * class248.anInt2729;
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_1_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_2_;
	}

	static final void method4625(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(97607127);
	}

	public static void method4626(float f, Class442 class442, Class438 class438, Class442 class442_3_, Class442 class442_4_, Class442 class442_5_, Class442 class442_6_, float f_7_, float f_8_, float f_9_, float f_10_, int i) {
		if (!class442_3_.method7177(class442)) {
			Class442 class442_11_ = Class442.method7166(0.0F, 0.0F, 0.0F);
			Class442 class442_12_ = Class442.method7139(Class442.method7155(class442_3_, class442));
			class442_12_.method7157(class438);
			Class442 class442_13_ = Class442.method7155(class442_12_, class442_11_);
			float f_14_ = class442_13_.method7160();
			if (f_7_ > 0.0F) {
				class442_5_ = Class442.method7139(class442_5_);
				class442_5_.method7164(f_14_ / f_7_ * f_8_);
			}
			if (Float.POSITIVE_INFINITY == class442_5_.aFloat4918 || Float.isNaN(class442.aFloat4918) || f_14_ > f_9_ || f_14_ < f_10_) {
				class442.method7146(class442_3_);
				class442_4_.method7211();
			} else {
				class438.method7033();
				Class442 class442_15_ = Class442.method7166(1.0F, 0.0F, 0.0F);
				Class442 class442_16_ = Class442.method7166(0.0F, 1.0F, 0.0F);
				Class442 class442_17_ = Class442.method7166(0.0F, 0.0F, 1.0F);
				class442_15_.method7157(class438);
				class442_16_.method7157(class438);
				class442_17_.method7157(class438);
				Class442 class442_18_ = Class442.method7166(Class442.method7145(class442_15_, class442_4_), Class442.method7145(class442_16_, class442_4_), Class442.method7145(class442_17_, class442_4_));
				Class442 class442_19_ = Class442.method7139(class442_18_);
				class442_19_.method7147();
				Class442 class442_20_ = Class442.method7191(Class442.method7163(class442_19_, class442_19_), Class442.method7168(class442_5_, 2.0F));
				Class442 class442_21_ = Class442.method7139(class442_13_);
				class442_21_.method7147();
				Class442 class442_22_ = Class442.method7139(class442_18_);
				if (class442_20_.aFloat4918 > class442_21_.aFloat4918) {
					if (class442_13_.aFloat4918 < 0.0F) {
						class442_22_.aFloat4918 += f * class442_5_.aFloat4918;
						if (class442_22_.aFloat4918 > 0.0F)
							class442_22_.aFloat4918 = 0.0F;
					} else {
						class442_22_.aFloat4918 -= f * class442_5_.aFloat4918;
						if (class442_22_.aFloat4918 < 0.0F)
							class442_22_.aFloat4918 = 0.0F;
					}
				} else if (class442_19_.aFloat4918 < class442_6_.aFloat4918) {
					if (class442_13_.aFloat4918 < 0.0F) {
						class442_22_.aFloat4918 -= f * class442_5_.aFloat4918;
						if (class442_22_.aFloat4918 < -class442_6_.aFloat4918)
							class442_22_.aFloat4918 = -class442_6_.aFloat4918;
					} else {
						class442_22_.aFloat4918 += f * class442_5_.aFloat4918;
						if (class442_22_.aFloat4918 > class442_6_.aFloat4918)
							class442_22_.aFloat4918 = class442_6_.aFloat4918;
					}
				}
				if (class442_20_.aFloat4915 > class442_21_.aFloat4915) {
					if (class442_13_.aFloat4915 < 0.0F) {
						class442_22_.aFloat4915 += class442_5_.aFloat4915 * f;
						if (class442_22_.aFloat4915 > 0.0F)
							class442_22_.aFloat4915 = 0.0F;
					} else {
						class442_22_.aFloat4915 -= f * class442_5_.aFloat4915;
						if (class442_22_.aFloat4915 < 0.0F)
							class442_22_.aFloat4915 = 0.0F;
					}
				} else if (class442_19_.aFloat4915 < class442_6_.aFloat4915) {
					if (class442_13_.aFloat4915 < 0.0F) {
						class442_22_.aFloat4915 -= class442_5_.aFloat4915 * f;
						if (class442_22_.aFloat4915 < -class442_6_.aFloat4915)
							class442_22_.aFloat4915 = -class442_6_.aFloat4915;
					} else {
						class442_22_.aFloat4915 += class442_5_.aFloat4915 * f;
						if (class442_22_.aFloat4915 > class442_6_.aFloat4915)
							class442_22_.aFloat4915 = class442_6_.aFloat4915;
					}
				}
				if (class442_20_.aFloat4919 > class442_21_.aFloat4919) {
					if (class442_13_.aFloat4919 < 0.0F) {
						class442_22_.aFloat4919 += f * class442_5_.aFloat4919;
						if (class442_22_.aFloat4919 > 0.0F)
							class442_22_.aFloat4919 = 0.0F;
					} else {
						class442_22_.aFloat4919 -= class442_5_.aFloat4919 * f;
						if (class442_22_.aFloat4919 < 0.0F)
							class442_22_.aFloat4919 = 0.0F;
					}
				} else if (class442_19_.aFloat4919 < class442_6_.aFloat4919) {
					if (class442_13_.aFloat4919 < 0.0F) {
						class442_22_.aFloat4919 -= class442_5_.aFloat4919 * f;
						if (class442_22_.aFloat4919 < -class442_6_.aFloat4919)
							class442_22_.aFloat4919 = -class442_6_.aFloat4919;
					} else {
						class442_22_.aFloat4919 += class442_5_.aFloat4919 * f;
						if (class442_22_.aFloat4919 > class442_6_.aFloat4919)
							class442_22_.aFloat4919 = class442_6_.aFloat4919;
					}
				}
				Class442 class442_23_ = Class442.method7168(class442_15_, class442_22_.aFloat4918);
				class442_23_.method7152(class442_16_, class442_22_.aFloat4915);
				class442_23_.method7152(class442_17_, class442_22_.aFloat4919);
				class442_4_.method7172(class442_23_, 0.8F);
				class442.method7219(Class442.method7168(class442_4_, f));
				class442_19_.method7141();
				class442_22_.method7141();
				class442_21_.method7141();
			}
		}
	}

	public static int method4627(int i, int i_24_) {
		return i & 0xff;
	}

	static boolean method4628(Interface62 interface62, byte i) {
		Class602 class602 = ((Class602) client.aClass509_11072.method8310(-806872213).method81(interface62.method64(-2027167313), -1924566273));
		if (class602.anInt7909 * 624402131 == -1)
			return true;
		Class54 class54 = ((Class54) Class346.aClass24_Sub8_3731.method81(class602.anInt7909 * 624402131, 399387192));
		if (1725725845 * class54.anInt705 == -1)
			return true;
		return class54.method1297(368858204);
	}
}
