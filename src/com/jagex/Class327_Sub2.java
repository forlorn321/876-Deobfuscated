/* Class327_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class327_Sub2 extends Class327 {
	Class442 aClass442_10042;
	Class442 aClass442_10043 = new Class442();
	public Class438 aClass438_10044 = new Class438();
	Interface32 anInterface32_10045;
	int anInt10046 = 1281546840;
	int anInt10047;
	Class442 aClass442_10048 = new Class442(Float.NaN, Float.NaN, Float.NaN);
	Class442 aClass442_10049 = new Class442(Float.NaN, Float.NaN, Float.NaN);
	boolean aBool10050;
	Class438 aClass438_10051;
	public static Class147 aClass147_10052;

	public void method5800(RSByteBuffer class527_sub38) {
		Class289 class289 = Class37.method1143(class527_sub38.readUnsignedByte(), -1324001523);
		int i = class527_sub38.readUnsignedShort();
		aClass442_10043.method7144(class527_sub38);
		aClass438_10044.method7025(class527_sub38);
		if (class527_sub38.readUnsignedByte() == 1)
			aBool10050 = true;
		else
			aBool10050 = false;
		anInt10046 = class527_sub38.readUnsignedShort() * -315714813;
		anInterface32_10045 = aClass296_3600.method5374(758620947).method173(class289, i, 1024704256);
	}

	public void method15728(Interface32 interface32, Class442 class442, Class438 class438, boolean bool, int i, int[][][] is, Class470 class470, int i_0_, int i_1_, byte i_2_) {
		anInterface32_10045 = interface32;
		aClass442_10043.method7146(class442);
		aClass438_10044.method7054(class438);
		aBool10050 = bool;
		anInt10046 = i * -315714813;
		anInt10047 = anInterface32_10045.method189((byte) 0).anInt10673 * -980207447;
		method15730(is, class470, i_0_, i_1_, (byte) 119);
	}

	public void method15729(byte i) {
		if (null != anInterface32_10045)
			anInterface32_10045 = (aClass296_3600.method5374(-1704555134).method173(anInterface32_10045.method202((short) 1661), anInterface32_10045.method200((byte) -77), -521463128));
	}

	public void method5798(float f, int[][][] is, Class470 class470, int i, int i_3_, int i_4_) {
		if (anInterface32_10045 != null) {
			method15730(is, class470, i, i_3_, (byte) 16);
			Class438 class438 = method15739((byte) -92);
			aClass438_10051.method7023(class438, aClass296_3600.method5354(-527715119));
			if (Float.isNaN(aClass438_10051.aFloat4883))
				aClass438_10051.method7054(class438);
			class438.method7021();
			aClass442_10049.method7146(anInterface32_10045.method189((byte) 0).method16385(-1909487955));
			aClass296_3600.method5344(true, f, aClass442_10048, aClass296_3600.method5384(1204629488), aClass442_10049, aClass442_10042, 2036886700);
		}
	}

	public Class527_Sub36 method5796() {
		Class442 class442 = method5781(-68386486);
		Class527_Sub36 class527_sub36 = new Class527_Sub36(anInt10047 * -51748047, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
		class442.method7141();
		return class527_sub36;
	}

	void method15730(int[][][] is, Class470 class470, int i, int i_5_, byte i_6_) {
		if (method5780((short) 30317) && (aClass296_3600.method5371(-1558198477) || aClass296_3600.method5455(633240664))) {
			Class527_Sub36 class527_sub36 = anInterface32_10045.method189((byte) 0);
			anInt10047 = class527_sub36.anInt10673 * -980207447;
			int i_7_ = -51748047 * anInt10047;
			boolean bool = true;
			if (3 == -51748047 * anInt10047)
				bool = false;
			else if (class470 != null && (class470.method7706(class527_sub36.anInt10676 * 1445023519 - i >> 9, -424734829 * class527_sub36.anInt10675 - i_5_ >> 9, (short) 3860))) {
				i_7_ = -51748047 * anInt10047 + 1;
				bool = false;
			}
			if (aClass296_3600.method5455(-1337103198) && null != is) {
				float f = method15741(is, class470, i, i_5_, i_7_, bool, -547666300);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_8_ = 3.1415927F;
						Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
						class442.method7157(aClass438_10044);
						Class442 class442_9_ = Class442.method7166(class442.aFloat4918, 0.0F, class442.aFloat4919);
						class442_9_.method7173();
						float f_10_ = Class442.method7145(class442, class442_9_);
						for (int i_11_ = 0; i_11_ < 10; i_11_++) {
							float f_12_ = (f_10_ + f_8_) / 2.0F - f_10_;
							float f_13_ = f_12_;
							if (f > 0.0F)
								f_13_ *= -1.0F;
							Class442 class442_14_ = Class442.method7166(1.0F, 0.0F, 0.0F);
							class442_14_.method7157(aClass438_10044);
							Class438 class438 = Class438.method7020();
							class438.method7091(class442_14_, f_13_);
							aClass438_10044.method7019(class438);
							aClass438_10044.method7035();
							class442_14_.method7141();
							class438.method7021();
							f = method15741(is, class470, i, i_5_, i_7_, bool, -114976024);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_10_ += f_12_;
							else
								f_8_ -= f_12_;
						}
					}
				}
			}
		}
	}

	public boolean method5790() {
		return !Float.isNaN(aClass442_10048.aFloat4918);
	}

	Class442 method15731(Class438 class438, int i) {
		Class442 class442 = Class442.method7139(aClass442_10043);
		class442.method7157(class438);
		Class442 class442_15_ = Class442.method7153(aClass442_10049, class442);
		class442.method7141();
		return class442_15_;
	}

	public boolean method5780(short i) {
		return !Float.isNaN(aClass442_10048.aFloat4918);
	}

	public Class442 method5781(int i) {
		Class442 class442 = Class442.method7139(aClass442_10043);
		class442.method7157(aClass438_10051);
		Class442 class442_16_ = Class442.method7153(aClass442_10048, class442);
		class442.method7141();
		return class442_16_;
	}

	public double[] method5782(int i) {
		double[] ds = new double[3];
		Class442 class442 = method5781(1832664268);
		ds[0] = (double) class442.aFloat4918;
		ds[1] = (double) class442.aFloat4915;
		ds[2] = (double) class442.aFloat4919;
		return ds;
	}

	public void method5779(float f, int[][][] is, Class470 class470, int i, int i_17_) {
		if (anInterface32_10045 != null) {
			method15730(is, class470, i, i_17_, (byte) 78);
			Class438 class438 = method15739((byte) -28);
			aClass438_10051.method7023(class438, aClass296_3600.method5354(-527715119));
			if (Float.isNaN(aClass438_10051.aFloat4883))
				aClass438_10051.method7054(class438);
			class438.method7021();
			aClass442_10049.method7146(anInterface32_10045.method189((byte) 0).method16385(-1014706623));
			aClass296_3600.method5344(true, f, aClass442_10048, aClass296_3600.method5384(1204629488), aClass442_10049, aClass442_10042, 1797366957);
		}
	}

	public Class442 method15732(byte i) {
		return aClass442_10048;
	}

	float method15733(int[][][] is, Class470 class470, int i, int i_18_, int i_19_, boolean bool) {
		Class438 class438 = method15739((byte) -98);
		Class442 class442 = method15731(class438, -1698146480);
		class438.method7021();
		int i_20_ = (int) class442.aFloat4918 - i >> 9;
		int i_21_ = (int) class442.aFloat4919 - i_18_ >> 9;
		if (i_20_ >= 0 && i_21_ >= 0 && i_20_ + 1 < is[0].length && i_21_ + 1 < is[0][0].length) {
			int i_22_ = i_19_;
			if (bool && class470.method7706(i_20_, i_21_, (short) -1408))
				i_22_ = i_19_ + 1;
			long l = (long) class442.aFloat4918 % 512L;
			long l_23_ = (long) class442.aFloat4919 % 512L;
			long l_24_ = (512L - l) * (long) is[i_22_][i_20_][i_21_] * (512L - l_23_);
			l_24_ += (long) is[i_22_][i_20_ + 1][i_21_] * l * (512L - l_23_);
			l_24_ += l_23_ * ((512L - l) * (long) is[i_22_][i_20_][i_21_ + 1]);
			l_24_ += (long) is[i_22_][1 + i_20_][i_21_ + 1] * l * l_23_;
			l_24_ /= 262144L;
			l_24_ -= 1024L;
			float f = (float) -l_24_ - class442.aFloat4915;
			class442.method7141();
			return f;
		}
		class442.method7141();
		return Float.NaN;
	}

	public float method15734(byte i) {
		return Class420.method6711(aClass438_10044, -1076945387);
	}

	void method15735(int[][][] is, Class470 class470, int i, int i_25_) {
		if (method5780((short) 9403) && (aClass296_3600.method5371(2095762042) || aClass296_3600.method5455(-1066808593))) {
			Class527_Sub36 class527_sub36 = anInterface32_10045.method189((byte) 0);
			anInt10047 = class527_sub36.anInt10673 * -980207447;
			int i_26_ = -51748047 * anInt10047;
			boolean bool = true;
			if (3 == -51748047 * anInt10047)
				bool = false;
			else if (class470 != null && (class470.method7706(class527_sub36.anInt10676 * 1445023519 - i >> 9, -424734829 * class527_sub36.anInt10675 - i_25_ >> 9, (short) -6120))) {
				i_26_ = -51748047 * anInt10047 + 1;
				bool = false;
			}
			if (aClass296_3600.method5455(238551008) && null != is) {
				float f = method15741(is, class470, i, i_25_, i_26_, bool, -1493793972);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_27_ = 3.1415927F;
						Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
						class442.method7157(aClass438_10044);
						Class442 class442_28_ = Class442.method7166(class442.aFloat4918, 0.0F, class442.aFloat4919);
						class442_28_.method7173();
						float f_29_ = Class442.method7145(class442, class442_28_);
						for (int i_30_ = 0; i_30_ < 10; i_30_++) {
							float f_31_ = (f_29_ + f_27_) / 2.0F - f_29_;
							float f_32_ = f_31_;
							if (f > 0.0F)
								f_32_ *= -1.0F;
							Class442 class442_33_ = Class442.method7166(1.0F, 0.0F, 0.0F);
							class442_33_.method7157(aClass438_10044);
							Class438 class438 = Class438.method7020();
							class438.method7091(class442_33_, f_32_);
							aClass438_10044.method7019(class438);
							aClass438_10044.method7035();
							class442_33_.method7141();
							class438.method7021();
							f = method15741(is, class470, i, i_25_, i_26_, bool, -1592221318);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_29_ += f_31_;
							else
								f_27_ -= f_31_;
						}
					}
				}
			}
		}
	}

	public float method5797(byte i) {
		return 0.0F;
	}

	public void method15736() {
		if (null != anInterface32_10045)
			anInterface32_10045 = (aClass296_3600.method5374(-852417282).method173(anInterface32_10045.method202((short) 4173), anInterface32_10045.method200((byte) -83), 1649832709));
	}

	public void method5786(RSByteBuffer class527_sub38, int i) {
		Class289 class289 = Class37.method1143(class527_sub38.readUnsignedByte(), -1324001523);
		int i_34_ = class527_sub38.readUnsignedShort();
		aClass442_10043.method7144(class527_sub38);
		aClass438_10044.method7025(class527_sub38);
		if (class527_sub38.readUnsignedByte() == 1)
			aBool10050 = true;
		else
			aBool10050 = false;
		anInt10046 = class527_sub38.readUnsignedShort() * -315714813;
		anInterface32_10045 = aClass296_3600.method5374(-1770051609).method173(class289, i_34_, 824617702);
	}

	public void method5787(float f, int[][][] is, Class470 class470, int i, int i_35_) {
		if (anInterface32_10045 != null) {
			method15730(is, class470, i, i_35_, (byte) 46);
			Class438 class438 = method15739((byte) -78);
			aClass438_10051.method7023(class438, aClass296_3600.method5354(-527715119));
			if (Float.isNaN(aClass438_10051.aFloat4883))
				aClass438_10051.method7054(class438);
			class438.method7021();
			aClass442_10049.method7146(anInterface32_10045.method189((byte) 0).method16385(1217535206));
			aClass296_3600.method5344(true, f, aClass442_10048, aClass296_3600.method5384(1204629488), aClass442_10049, aClass442_10042, 2035657084);
		}
	}

	float method15737(int[][][] is, Class470 class470, int i, int i_36_, int i_37_, boolean bool) {
		Class438 class438 = method15739((byte) -71);
		Class442 class442 = method15731(class438, -583483013);
		class438.method7021();
		int i_38_ = (int) class442.aFloat4918 - i >> 9;
		int i_39_ = (int) class442.aFloat4919 - i_36_ >> 9;
		if (i_38_ >= 0 && i_39_ >= 0 && i_38_ + 1 < is[0].length && i_39_ + 1 < is[0][0].length) {
			int i_40_ = i_37_;
			if (bool && class470.method7706(i_38_, i_39_, (short) 12620))
				i_40_ = i_37_ + 1;
			long l = (long) class442.aFloat4918 % 512L;
			long l_41_ = (long) class442.aFloat4919 % 512L;
			long l_42_ = (512L - l) * (long) is[i_40_][i_38_][i_39_] * (512L - l_41_);
			l_42_ += (long) is[i_40_][i_38_ + 1][i_39_] * l * (512L - l_41_);
			l_42_ += l_41_ * ((512L - l) * (long) is[i_40_][i_38_][i_39_ + 1]);
			l_42_ += (long) is[i_40_][1 + i_38_][i_39_ + 1] * l * l_41_;
			l_42_ /= 262144L;
			l_42_ -= 1024L;
			float f = (float) -l_42_ - class442.aFloat4915;
			class442.method7141();
			return f;
		}
		class442.method7141();
		return Float.NaN;
	}

	public Class442 method15738(int i) {
		return aClass442_10043;
	}

	public void method5785(Class302 class302, int i, int i_43_, byte i_44_) {
		Class442 class442 = method5781(-991553401);
		class302.anInt3420 = -2028651513 * ((int) class442.aFloat4918 - i);
		class302.anInt3419 = 184714985 * (int) -class442.aFloat4915;
		class302.anInt3421 = -1971897151 * ((int) class442.aFloat4919 - i_43_);
		class442.method7141();
	}

	public boolean method5784() {
		return !Float.isNaN(aClass442_10048.aFloat4918);
	}

	public boolean method5789() {
		return !Float.isNaN(aClass442_10048.aFloat4918);
	}

	public boolean method5793() {
		return !Float.isNaN(aClass442_10048.aFloat4918);
	}

	public Class442 method5794() {
		Class442 class442 = Class442.method7139(aClass442_10043);
		class442.method7157(aClass438_10051);
		Class442 class442_45_ = Class442.method7153(aClass442_10048, class442);
		class442.method7141();
		return class442_45_;
	}

	public double[] method5792() {
		double[] ds = new double[3];
		Class442 class442 = method5781(-651074260);
		ds[0] = (double) class442.aFloat4918;
		ds[1] = (double) class442.aFloat4915;
		ds[2] = (double) class442.aFloat4919;
		return ds;
	}

	Class438 method15739(byte i) {
		Class438 class438 = Class438.method7022(aClass438_10044);
		if (aBool10050) {
			Class442 class442 = anInterface32_10045.method190((short) 2592);
			if (class442.method7160() < (float) (anInt10046 * 999092139)) {
				class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
				Class438 class438_46_ = anInterface32_10045.method195(1652676897);
				class442.method7157(class438_46_);
			}
			class442.aFloat4915 = 0.0F;
			float f = (float) Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
			class442.method7141();
			Class438 class438_47_ = new Class438();
			class438_47_.method7040(0.0F, 1.0F, 0.0F, f);
			class438.method7019(class438_47_);
		}
		return class438;
	}

	void method15740(int[][][] is, Class470 class470, int i, int i_48_) {
		if (method5780((short) 32003) && (aClass296_3600.method5371(688958610) || aClass296_3600.method5455(544949516))) {
			Class527_Sub36 class527_sub36 = anInterface32_10045.method189((byte) 0);
			anInt10047 = class527_sub36.anInt10673 * -980207447;
			int i_49_ = -51748047 * anInt10047;
			boolean bool = true;
			if (3 == -51748047 * anInt10047)
				bool = false;
			else if (class470 != null && (class470.method7706(class527_sub36.anInt10676 * 1445023519 - i >> 9, -424734829 * class527_sub36.anInt10675 - i_48_ >> 9, (short) -16054))) {
				i_49_ = -51748047 * anInt10047 + 1;
				bool = false;
			}
			if (aClass296_3600.method5455(-129295285) && null != is) {
				float f = method15741(is, class470, i, i_48_, i_49_, bool, -120205695);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_50_ = 3.1415927F;
						Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
						class442.method7157(aClass438_10044);
						Class442 class442_51_ = Class442.method7166(class442.aFloat4918, 0.0F, class442.aFloat4919);
						class442_51_.method7173();
						float f_52_ = Class442.method7145(class442, class442_51_);
						for (int i_53_ = 0; i_53_ < 10; i_53_++) {
							float f_54_ = (f_52_ + f_50_) / 2.0F - f_52_;
							float f_55_ = f_54_;
							if (f > 0.0F)
								f_55_ *= -1.0F;
							Class442 class442_56_ = Class442.method7166(1.0F, 0.0F, 0.0F);
							class442_56_.method7157(aClass438_10044);
							Class438 class438 = Class438.method7020();
							class438.method7091(class442_56_, f_55_);
							aClass438_10044.method7019(class438);
							aClass438_10044.method7035();
							class442_56_.method7141();
							class438.method7021();
							f = method15741(is, class470, i, i_48_, i_49_, bool, -1098549803);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_52_ += f_54_;
							else
								f_50_ -= f_54_;
						}
					}
				}
			}
		}
	}

	public float method5791() {
		return 0.0F;
	}

	public float method5778() {
		return 0.0F;
	}

	public void method5799(Class302 class302, int i, int i_57_) {
		Class442 class442 = method5781(-667372958);
		class302.anInt3420 = -2028651513 * ((int) class442.aFloat4918 - i);
		class302.anInt3419 = 184714985 * (int) -class442.aFloat4915;
		class302.anInt3421 = -1971897151 * ((int) class442.aFloat4919 - i_57_);
		class442.method7141();
	}

	float method15741(int[][][] is, Class470 class470, int i, int i_58_, int i_59_, boolean bool, int i_60_) {
		Class438 class438 = method15739((byte) -8);
		Class442 class442 = method15731(class438, 713167967);
		class438.method7021();
		int i_61_ = (int) class442.aFloat4918 - i >> 9;
		int i_62_ = (int) class442.aFloat4919 - i_58_ >> 9;
		if (i_61_ >= 0 && i_62_ >= 0 && i_61_ + 1 < is[0].length && i_62_ + 1 < is[0][0].length) {
			int i_63_ = i_59_;
			if (bool && class470.method7706(i_61_, i_62_, (short) 9450))
				i_63_ = i_59_ + 1;
			long l = (long) class442.aFloat4918 % 512L;
			long l_64_ = (long) class442.aFloat4919 % 512L;
			long l_65_ = (512L - l) * (long) is[i_63_][i_61_][i_62_] * (512L - l_64_);
			l_65_ += (long) is[i_63_][i_61_ + 1][i_62_] * l * (512L - l_64_);
			l_65_ += l_64_ * ((512L - l) * (long) is[i_63_][i_61_][i_62_ + 1]);
			l_65_ += (long) is[i_63_][1 + i_61_][i_62_ + 1] * l * l_64_;
			l_65_ /= 262144L;
			l_65_ -= 1024L;
			float f = (float) -l_65_ - class442.aFloat4915;
			class442.method7141();
			return f;
		}
		class442.method7141();
		return Float.NaN;
	}

	public Class327_Sub2(Class296 class296) {
		super(class296);
		aClass442_10042 = new Class442();
		aClass438_10051 = new Class438();
	}

	Class438 method15742() {
		Class438 class438 = Class438.method7022(aClass438_10044);
		if (aBool10050) {
			Class442 class442 = anInterface32_10045.method190((short) -6582);
			if (class442.method7160() < (float) (anInt10046 * 999092139)) {
				class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
				Class438 class438_66_ = anInterface32_10045.method195(1652676897);
				class442.method7157(class438_66_);
			}
			class442.aFloat4915 = 0.0F;
			float f = (float) Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
			class442.method7141();
			Class438 class438_67_ = new Class438();
			class438_67_.method7040(0.0F, 1.0F, 0.0F, f);
			class438.method7019(class438_67_);
		}
		return class438;
	}

	Class438 method15743() {
		Class438 class438 = Class438.method7022(aClass438_10044);
		if (aBool10050) {
			Class442 class442 = anInterface32_10045.method190((short) 8758);
			if (class442.method7160() < (float) (anInt10046 * 999092139)) {
				class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
				Class438 class438_68_ = anInterface32_10045.method195(1652676897);
				class442.method7157(class438_68_);
			}
			class442.aFloat4915 = 0.0F;
			float f = (float) Math.atan2((double) class442.aFloat4918, (double) class442.aFloat4919);
			class442.method7141();
			Class438 class438_69_ = new Class438();
			class438_69_.method7040(0.0F, 1.0F, 0.0F, f);
			class438.method7019(class438_69_);
		}
		return class438;
	}

	void method15744(int[][][] is, Class470 class470, int i, int i_70_) {
		if (method5780((short) 27716) && (aClass296_3600.method5371(-1550230421) || aClass296_3600.method5455(-1392765817))) {
			Class527_Sub36 class527_sub36 = anInterface32_10045.method189((byte) 0);
			anInt10047 = class527_sub36.anInt10673 * -980207447;
			int i_71_ = -51748047 * anInt10047;
			boolean bool = true;
			if (3 == -51748047 * anInt10047)
				bool = false;
			else if (class470 != null && (class470.method7706(class527_sub36.anInt10676 * 1445023519 - i >> 9, -424734829 * class527_sub36.anInt10675 - i_70_ >> 9, (short) 10768))) {
				i_71_ = -51748047 * anInt10047 + 1;
				bool = false;
			}
			if (aClass296_3600.method5455(-1385287509) && null != is) {
				float f = method15741(is, class470, i, i_70_, i_71_, bool, -1176586906);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_72_ = 3.1415927F;
						Class442 class442 = Class442.method7166(0.0F, 0.0F, 1.0F);
						class442.method7157(aClass438_10044);
						Class442 class442_73_ = Class442.method7166(class442.aFloat4918, 0.0F, class442.aFloat4919);
						class442_73_.method7173();
						float f_74_ = Class442.method7145(class442, class442_73_);
						for (int i_75_ = 0; i_75_ < 10; i_75_++) {
							float f_76_ = (f_74_ + f_72_) / 2.0F - f_74_;
							float f_77_ = f_76_;
							if (f > 0.0F)
								f_77_ *= -1.0F;
							Class442 class442_78_ = Class442.method7166(1.0F, 0.0F, 0.0F);
							class442_78_.method7157(aClass438_10044);
							Class438 class438 = Class438.method7020();
							class438.method7091(class442_78_, f_77_);
							aClass438_10044.method7019(class438);
							aClass438_10044.method7035();
							class442_78_.method7141();
							class438.method7021();
							f = method15741(is, class470, i, i_70_, i_71_, bool, -657967286);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_74_ += f_76_;
							else
								f_72_ -= f_76_;
						}
					}
				}
			}
		}
	}

	public void method5788(float f, int[][][] is, Class470 class470, int i, int i_79_) {
		if (anInterface32_10045 != null) {
			method15730(is, class470, i, i_79_, (byte) 106);
			Class438 class438 = method15739((byte) -94);
			aClass438_10051.method7023(class438, aClass296_3600.method5354(-527715119));
			if (Float.isNaN(aClass438_10051.aFloat4883))
				aClass438_10051.method7054(class438);
			class438.method7021();
			aClass442_10049.method7146(anInterface32_10045.method189((byte) 0).method16385(-262304996));
			aClass296_3600.method5344(true, f, aClass442_10048, aClass296_3600.method5384(1204629488), aClass442_10049, aClass442_10042, 1899597190);
		}
	}

	public Class527_Sub36 method5795() {
		Class442 class442 = method5781(-1696708741);
		Class527_Sub36 class527_sub36 = new Class527_Sub36(anInt10047 * -51748047, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
		class442.method7141();
		return class527_sub36;
	}

	float method15745(int[][][] is, Class470 class470, int i, int i_80_, int i_81_, boolean bool) {
		Class438 class438 = method15739((byte) -70);
		Class442 class442 = method15731(class438, -1973444465);
		class438.method7021();
		int i_82_ = (int) class442.aFloat4918 - i >> 9;
		int i_83_ = (int) class442.aFloat4919 - i_80_ >> 9;
		if (i_82_ >= 0 && i_83_ >= 0 && i_82_ + 1 < is[0].length && i_83_ + 1 < is[0][0].length) {
			int i_84_ = i_81_;
			if (bool && class470.method7706(i_82_, i_83_, (short) 9402))
				i_84_ = i_81_ + 1;
			long l = (long) class442.aFloat4918 % 512L;
			long l_85_ = (long) class442.aFloat4919 % 512L;
			long l_86_ = (512L - l) * (long) is[i_84_][i_82_][i_83_] * (512L - l_85_);
			l_86_ += (long) is[i_84_][i_82_ + 1][i_83_] * l * (512L - l_85_);
			l_86_ += l_85_ * ((512L - l) * (long) is[i_84_][i_82_][i_83_ + 1]);
			l_86_ += (long) is[i_84_][1 + i_82_][i_83_ + 1] * l * l_85_;
			l_86_ /= 262144L;
			l_86_ -= 1024L;
			float f = (float) -l_86_ - class442.aFloat4915;
			class442.method7141();
			return f;
		}
		class442.method7141();
		return Float.NaN;
	}

	public Class527_Sub36 method5783(int i) {
		Class442 class442 = method5781(-1437655500);
		Class527_Sub36 class527_sub36 = new Class527_Sub36(anInt10047 * -51748047, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
		class442.method7141();
		return class527_sub36;
	}

	float method15746(int[][][] is, Class470 class470, int i, int i_87_, int i_88_, boolean bool) {
		Class438 class438 = method15739((byte) -36);
		Class442 class442 = method15731(class438, -661498882);
		class438.method7021();
		int i_89_ = (int) class442.aFloat4918 - i >> 9;
		int i_90_ = (int) class442.aFloat4919 - i_87_ >> 9;
		if (i_89_ >= 0 && i_90_ >= 0 && i_89_ + 1 < is[0].length && i_90_ + 1 < is[0][0].length) {
			int i_91_ = i_88_;
			if (bool && class470.method7706(i_89_, i_90_, (short) -18129))
				i_91_ = i_88_ + 1;
			long l = (long) class442.aFloat4918 % 512L;
			long l_92_ = (long) class442.aFloat4919 % 512L;
			long l_93_ = (512L - l) * (long) is[i_91_][i_89_][i_90_] * (512L - l_92_);
			l_93_ += (long) is[i_91_][i_89_ + 1][i_90_] * l * (512L - l_92_);
			l_93_ += l_92_ * ((512L - l) * (long) is[i_91_][i_89_][i_90_ + 1]);
			l_93_ += (long) is[i_91_][1 + i_89_][i_90_ + 1] * l * l_92_;
			l_93_ /= 262144L;
			l_93_ -= 1024L;
			float f = (float) -l_93_ - class442.aFloat4915;
			class442.method7141();
			return f;
		}
		class442.method7141();
		return Float.NaN;
	}

	public float method15747(int i) {
		return Class45.method1212(aClass438_10044, (byte) -94);
	}

	float method15748(int[][][] is, Class470 class470, int i, int i_94_, int i_95_, boolean bool) {
		Class438 class438 = method15739((byte) -119);
		Class442 class442 = method15731(class438, -1170632143);
		class438.method7021();
		int i_96_ = (int) class442.aFloat4918 - i >> 9;
		int i_97_ = (int) class442.aFloat4919 - i_94_ >> 9;
		if (i_96_ >= 0 && i_97_ >= 0 && i_96_ + 1 < is[0].length && i_97_ + 1 < is[0][0].length) {
			int i_98_ = i_95_;
			if (bool && class470.method7706(i_96_, i_97_, (short) -4033))
				i_98_ = i_95_ + 1;
			long l = (long) class442.aFloat4918 % 512L;
			long l_99_ = (long) class442.aFloat4919 % 512L;
			long l_100_ = (512L - l) * (long) is[i_98_][i_96_][i_97_] * (512L - l_99_);
			l_100_ += (long) is[i_98_][i_96_ + 1][i_97_] * l * (512L - l_99_);
			l_100_ += l_99_ * ((512L - l) * (long) is[i_98_][i_96_][i_97_ + 1]);
			l_100_ += (long) is[i_98_][1 + i_96_][i_97_ + 1] * l * l_99_;
			l_100_ /= 262144L;
			l_100_ -= 1024L;
			float f = (float) -l_100_ - class442.aFloat4915;
			class442.method7141();
			return f;
		}
		class442.method7141();
		return Float.NaN;
	}

	public Class442 method15749() {
		return aClass442_10048;
	}

	public Class442 method15750() {
		return aClass442_10043;
	}

	public float method15751() {
		return Class420.method6711(aClass438_10044, 1319501764);
	}

	public float method15752() {
		return Class420.method6711(aClass438_10044, -1241867000);
	}

	public float method15753() {
		return Class45.method1212(aClass438_10044, (byte) -67);
	}

	public static void method15754(int i, int i_101_, int i_102_) {
		Class529_Sub1.anInt10779 = 1449615877 * (i - Class529_Sub1.anInt7137);
		Class529_Sub1.anInt10772 = 1784395681 * (i_101_ - Class529_Sub1.anInt7138);
	}
}
