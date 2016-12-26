/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class199 {
	Interface25 anInterface25_2217;
	int anInt2218;
	Class4 aClass4_2219;
	Class700 aClass700_2220 = new Class700();
	int anInt2221;
	static short aShort2222;

	public void method2877() {
		aClass700_2220.method8238(-2108468062);
		aClass4_2219.method561(-2117553523);
		anInt2218 = anInt2221 * 1823903091;
	}

	public int method2878() {
		int i = 0;
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8248(-778359739)); class536_sub18_sub11 != null; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(282252370))) {
			if (!class536_sub18_sub11.method10734((short) 255))
				i++;
		}
		return i;
	}

	public void method2879(long l) {
		Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass4_2219.method556(l);
		method2880(class536_sub18_sub11, 1236677150);
	}

	void method2880(Class536_Sub18_Sub11 class536_sub18_sub11, int i) {
		if (class536_sub18_sub11 != null) {
			class536_sub18_sub11.method6484(721361169);
			class536_sub18_sub11.method9521(-485877898);
			anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
		}
	}

	public void method2881(Object object, long l) {
		method2882(object, l, 1, (byte) 50);
	}

	public void method2882(Object object, long l, int i, byte i_0_) {
		if (i > anInt2221 * 434295327)
			throw new IllegalStateException();
		method2879(l);
		anInt2218 -= -1927241171 * i;
		while (-334103131 * anInt2218 < 0) {
			Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass700_2220.method8237(690664224);
			if (null == class536_sub18_sub11)
				throw new RuntimeException("");
			if (class536_sub18_sub11.method10734((short) 255)) {
				/* empty */
			}
			method2880(class536_sub18_sub11, 627183162);
			if (null != anInterface25_2217)
				anInterface25_2217.method151(class536_sub18_sub11.method10733((byte) -19), -1842631033);
		}
		Class536_Sub18_Sub11_Sub1 class536_sub18_sub11_sub1 = new Class536_Sub18_Sub11_Sub1(object, i);
		aClass4_2219.method560(class536_sub18_sub11_sub1, l);
		aClass700_2220.method8239(class536_sub18_sub11_sub1, (byte) 53);
		class536_sub18_sub11_sub1.aLong10507 = 0L;
	}

	public void method2883(int i, int i_1_) {
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass700_2220.method8248(60251438); class536_sub18_sub11 != null; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(-1147444764))) {
			if (class536_sub18_sub11.method10734((short) 255)) {
				if (class536_sub18_sub11.method10733((byte) -119) == null) {
					class536_sub18_sub11.method6484(-1051057205);
					class536_sub18_sub11.method9521(-1016168651);
					anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
				}
			} else if ((class536_sub18_sub11.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub11_Sub2 class536_sub18_sub11_sub2 = (new Class536_Sub18_Sub11_Sub2(class536_sub18_sub11.method10733((byte) 101), class536_sub18_sub11.anInt11726 * -305300681));
				aClass4_2219.method560(class536_sub18_sub11_sub2, (-6909195213925454795L * class536_sub18_sub11.aLong7133));
				Class38.method841(class536_sub18_sub11_sub2, class536_sub18_sub11, 1285724811);
				class536_sub18_sub11.method6484(2083430235);
				class536_sub18_sub11.method9521(-2066829153);
			}
		}
	}

	public void method2884(byte i) {
		aClass700_2220.method8238(-2135085791);
		aClass4_2219.method561(-2117553523);
		anInt2218 = anInt2221 * 1823903091;
	}

	public int method2885(int i) {
		return -334103131 * anInt2218;
	}

	public Object method2886(long l) {
		Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass4_2219.method556(l);
		if (class536_sub18_sub11 == null)
			return null;
		Object object = class536_sub18_sub11.method10733((byte) 15);
		if (object == null) {
			class536_sub18_sub11.method6484(857542782);
			class536_sub18_sub11.method9521(-2070933213);
			anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
			return null;
		}
		if (class536_sub18_sub11.method10734((short) 255)) {
			Class536_Sub18_Sub11_Sub1 class536_sub18_sub11_sub1 = new Class536_Sub18_Sub11_Sub1(object, (-305300681 * (class536_sub18_sub11.anInt11726)));
			aClass4_2219.method560(class536_sub18_sub11_sub1, (-6909195213925454795L * class536_sub18_sub11.aLong7133));
			aClass700_2220.method8239(class536_sub18_sub11_sub1, (byte) -19);
			class536_sub18_sub11_sub1.aLong10507 = 0L;
			class536_sub18_sub11.method6484(-224160905);
			class536_sub18_sub11.method9521(-1338786414);
		} else {
			aClass700_2220.method8239(class536_sub18_sub11, (byte) -11);
			class536_sub18_sub11.aLong10507 = 0L;
		}
		return object;
	}

	public int method2887(int i) {
		int i_2_ = 0;
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8248(-950551381)); class536_sub18_sub11 != null; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(457468052))) {
			if (!class536_sub18_sub11.method10734((short) 255))
				i_2_++;
		}
		return i_2_;
	}

	public Class199(int i, int i_3_) {
		anInt2221 = 263989727 * i;
		anInt2218 = -1927241171 * i;
		int i_4_;
		for (i_4_ = 1; i_4_ + i_4_ < i && i_4_ < i_3_; i_4_ += i_4_) {
			/* empty */
		}
		aClass4_2219 = new Class4(i_4_);
	}

	public Object method2888(int i) {
		Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass4_2219.method562(-1036606850);
		while (null != class536_sub18_sub11) {
			Object object = class536_sub18_sub11.method10733((byte) -86);
			if (null == object) {
				Class536_Sub18_Sub11 class536_sub18_sub11_5_ = class536_sub18_sub11;
				class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass4_2219.method567(1173104901));
				class536_sub18_sub11_5_.method6484(514603506);
				class536_sub18_sub11_5_.method9521(-1086335272);
				anInt2218 += class536_sub18_sub11_5_.anInt11726 * -2030602581;
			} else
				return object;
		}
		return null;
	}

	public Object method2889(byte i) {
		Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass4_2219.method567(-338607158);
		while (null != class536_sub18_sub11) {
			Object object = class536_sub18_sub11.method10733((byte) 40);
			if (null == object) {
				Class536_Sub18_Sub11 class536_sub18_sub11_6_ = class536_sub18_sub11;
				class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass4_2219.method567(749872210);
				class536_sub18_sub11_6_.method6484(-895505614);
				class536_sub18_sub11_6_.method9521(-1384765113);
				anInt2218 += -2030602581 * class536_sub18_sub11_6_.anInt11726;
			} else
				return object;
		}
		return null;
	}

	public void method2890(Interface25 interface25, byte i) {
		anInterface25_2217 = interface25;
	}

	public int method2891(int i) {
		return anInt2221 * 434295327;
	}

	public void method2892(int i) {
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass700_2220.method8248(-63911744); null != class536_sub18_sub11; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(-1628765607))) {
			if (class536_sub18_sub11.method10734((short) 255)) {
				class536_sub18_sub11.method6484(1503662810);
				class536_sub18_sub11.method9521(-1429579206);
				anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
			}
		}
	}

	public void method2893(int i) {
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8248(-1089832103)); class536_sub18_sub11 != null; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(-610421321))) {
			if (class536_sub18_sub11.method10734((short) 255)) {
				if (class536_sub18_sub11.method10733((byte) 69) == null) {
					class536_sub18_sub11.method6484(749666132);
					class536_sub18_sub11.method9521(-843954758);
					anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
				}
			} else if ((class536_sub18_sub11.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub11_Sub2 class536_sub18_sub11_sub2 = (new Class536_Sub18_Sub11_Sub2(class536_sub18_sub11.method10733((byte) -110), class536_sub18_sub11.anInt11726 * -305300681));
				aClass4_2219.method560(class536_sub18_sub11_sub2, (-6909195213925454795L * class536_sub18_sub11.aLong7133));
				Class38.method841(class536_sub18_sub11_sub2, class536_sub18_sub11, 985396881);
				class536_sub18_sub11.method6484(376622643);
				class536_sub18_sub11.method9521(-1414160722);
			}
		}
	}

	public void method2894(int i) {
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8248(-1860540653)); class536_sub18_sub11 != null; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(1277139662))) {
			if (class536_sub18_sub11.method10734((short) 255)) {
				if (class536_sub18_sub11.method10733((byte) -89) == null) {
					class536_sub18_sub11.method6484(-735556222);
					class536_sub18_sub11.method9521(-1471947722);
					anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
				}
			} else if ((class536_sub18_sub11.aLong10507 += 2122374251850846107L) * 4749301371101216403L > (long) i) {
				Class536_Sub18_Sub11_Sub2 class536_sub18_sub11_sub2 = (new Class536_Sub18_Sub11_Sub2(class536_sub18_sub11.method10733((byte) -46), class536_sub18_sub11.anInt11726 * -305300681));
				aClass4_2219.method560(class536_sub18_sub11_sub2, (-6909195213925454795L * class536_sub18_sub11.aLong7133));
				Class38.method841(class536_sub18_sub11_sub2, class536_sub18_sub11, 1272643254);
				class536_sub18_sub11.method6484(1301476654);
				class536_sub18_sub11.method9521(-1922800505);
			}
		}
	}

	public void method2895() {
		aClass700_2220.method8238(-2095652854);
		aClass4_2219.method561(-2117553523);
		anInt2218 = anInt2221 * 1823903091;
	}

	public Class199(int i) {
		this(i, i);
	}

	public void method2896() {
		aClass700_2220.method8238(-2126185968);
		aClass4_2219.method561(-2117553523);
		anInt2218 = anInt2221 * 1823903091;
	}

	public void method2897() {
		aClass700_2220.method8238(-2075208808);
		aClass4_2219.method561(-2117553523);
		anInt2218 = anInt2221 * 1823903091;
	}

	public int method2898() {
		return anInt2221 * 434295327;
	}

	public int method2899() {
		return anInt2221 * 434295327;
	}

	public int method2900() {
		return -334103131 * anInt2218;
	}

	public int method2901() {
		return -334103131 * anInt2218;
	}

	public int method2902() {
		return -334103131 * anInt2218;
	}

	public int method2903() {
		return -334103131 * anInt2218;
	}

	public int method2904() {
		int i = 0;
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass700_2220.method8248(772698910); class536_sub18_sub11 != null; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(-660498234))) {
			if (!class536_sub18_sub11.method10734((short) 255))
				i++;
		}
		return i;
	}

	public void method2905() {
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = (Class536_Sub18_Sub11) aClass700_2220.method8248(137691940); null != class536_sub18_sub11; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(1797195615))) {
			if (class536_sub18_sub11.method10734((short) 255)) {
				class536_sub18_sub11.method6484(1305086436);
				class536_sub18_sub11.method9521(-1192319909);
				anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
			}
		}
	}

	public void method2906() {
		for (Class536_Sub18_Sub11 class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8248(-987177817)); null != class536_sub18_sub11; class536_sub18_sub11 = ((Class536_Sub18_Sub11) aClass700_2220.method8241(1918732066))) {
			if (class536_sub18_sub11.method10734((short) 255)) {
				class536_sub18_sub11.method6484(1782263524);
				class536_sub18_sub11.method9521(-882038466);
				anInt2218 += -2030602581 * class536_sub18_sub11.anInt11726;
			}
		}
	}

	public static boolean method2907(int i, byte i_7_) {
		return (i >= Class606.aClass606_7883.anInt7878 * -723459231 && i <= Class606.aClass606_7877.anInt7878 * -723459231);
	}

	public static void method2908(Class167 class167, int i) {
		Class18.aClass184_190 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, (-219992997 * Class35.anInt295), true, true, (byte) 1));
		Class556.aClass2_7510 = Class196.aClass410_2202.method4981(client.anInterface51_11196, -219992997 * Class35.anInt295, 1446493303);
		Class536_Sub15.aClass184_10488 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, (1743452435 * Class35.anInt298), true, true, (byte) -78));
		Class223.aClass2_2338 = Class196.aClass410_2202.method4981(client.anInterface51_11196, Class35.anInt298 * 1743452435, 1528507160);
		Class26.aClass184_248 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, (Class35.anInt294 * 1622294095), true, true, (byte) -42));
		Class260.aClass2_2840 = Class196.aClass410_2202.method4981(client.anInterface51_11196, 1622294095 * Class35.anInt294, -1803730983);
	}

	static void method2909(int i) {
		if (Class639.anIntArray8308 == null)
			Class639.anIntArray8308 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < 512; i_9_++) {
			float f = 360.0F * (0.0078125F + (float) (i_9_ >> 3) / 64.0F);
			float f_10_ = (float) (i_9_ & 0x7) / 8.0F + 0.0625F;
			for (int i_11_ = 0; i_11_ < 128; i_11_++) {
				float f_12_ = (float) i_11_ / 128.0F;
				float f_13_ = 0.0F;
				float f_14_ = 0.0F;
				float f_15_ = 0.0F;
				float f_16_ = f / 60.0F;
				int i_17_ = (int) f_16_;
				int i_18_ = i_17_ % 6;
				float f_19_ = f_16_ - (float) i_17_;
				float f_20_ = (1.0F - f_10_) * f_12_;
				float f_21_ = (1.0F - f_10_ * f_19_) * f_12_;
				float f_22_ = (1.0F - f_10_ * (1.0F - f_19_)) * f_12_;
				if (i_18_ == 0) {
					f_13_ = f_12_;
					f_14_ = f_22_;
					f_15_ = f_20_;
				} else if (1 == i_18_) {
					f_13_ = f_21_;
					f_14_ = f_12_;
					f_15_ = f_20_;
				} else if (2 == i_18_) {
					f_13_ = f_20_;
					f_14_ = f_12_;
					f_15_ = f_22_;
				} else if (i_18_ == 3) {
					f_13_ = f_20_;
					f_14_ = f_21_;
					f_15_ = f_12_;
				} else if (4 == i_18_) {
					f_13_ = f_22_;
					f_14_ = f_20_;
					f_15_ = f_12_;
				} else if (5 == i_18_) {
					f_13_ = f_12_;
					f_14_ = f_20_;
					f_15_ = f_21_;
				}
				f_13_ = (float) Math.pow((double) f_13_, d);
				f_14_ = (float) Math.pow((double) f_14_, d);
				f_15_ = (float) Math.pow((double) f_15_, d);
				int i_23_ = (int) (256.0F * f_13_);
				int i_24_ = (int) (f_14_ * 256.0F);
				int i_25_ = (int) (f_15_ * 256.0F);
				int i_26_ = i_25_ + ((i_24_ << 8) + (-16777216 + (i_23_ << 16)));
				Class639.anIntArray8308[i_8_++] = i_26_;
			}
		}
	}

	static final void method2910(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class42.method878(class251, class234, class668, 339311983);
	}

	static final void method2911(Class668 class668, int i) {
		Class603_Sub1 class603_sub1 = Class674.method8027(-1488069988);
		if (null != class603_sub1) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1812485199 * class603_sub1.anInt10557;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class603_sub1.worldFlags * -1176655995;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.worldActivity;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class603_sub1.method9615((byte) -1);
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.method9616((byte) -124);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1880579507 * class603_sub1.online;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2023817915 * class603_sub1.anInt10558;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.worldIp;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		}
	}

	static final void method2912(int i, int i_27_, int i_28_, int i_29_, byte i_30_) {
		Class22.method716(Class677.aClass167_8609, -2131423477);
		Class648.method7833(i, i_27_, i_28_, i_29_, 256, 256, (byte) 127);
		Class184.method2767(i, i_27_, i_28_, i_29_, 256, 256, 1645574689);
		Class232.method3325(i, i_27_, i_28_, i_29_, 256, 256, -631686314);
		Class591.method7111(i, i_27_, i_28_, i_29_, -744312771);
	}

	static final void method2913(int i, int i_31_) {
		if (Class644.method7794(i, null, 679868352))
			Class549_Sub1.method9674((Class463.aClass234Array5227[i].aClass251Array2378), -1, 1983741393);
	}
}
