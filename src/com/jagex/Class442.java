/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class442 {
	static Class442[] aClass442Array4914;
	public float aFloat4915;
	static int anInt4916;
	static int anInt4917;
	public float aFloat4918;
	public float aFloat4919;

	public final void method7136(Class442 class442_0_, float f) {
		aFloat4918 += class442_0_.aFloat4918 * f;
		aFloat4915 += class442_0_.aFloat4915 * f;
		aFloat4919 += class442_0_.aFloat4919 * f;
	}

	public static Class442 method7137() {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442();
				return class442;
			}
			aClass442Array4914[--anInt4916].method7211();
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public void method7138(float f, float f_1_, float f_2_) {
		aFloat4918 = f;
		aFloat4915 = f_1_;
		aFloat4919 = f_2_;
	}

	public static Class442 method7139(Class442 class442) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442_3_ = new Class442(class442);
				return class442_3_;
			}
			aClass442Array4914[--anInt4916].method7146(class442);
			Class442 class442_4_ = aClass442Array4914[anInt4916];
			return class442_4_;
		}
	}

	public final void method7140(Class432 class432) {
		float f = aFloat4918;
		float f_5_ = aFloat4915;
		aFloat4918 = (class432.aFloat4862 * f + class432.aFloat4856 * f_5_ + class432.aFloat4859 * aFloat4919);
		aFloat4915 = (class432.aFloat4854 * f + class432.aFloat4857 * f_5_ + class432.aFloat4861 * aFloat4919);
		aFloat4919 = (class432.aFloat4858 * f + class432.aFloat4860 * f_5_ + class432.aFloat4855 * aFloat4919);
	}

	public void method7141() {
		synchronized (aClass442Array4914) {
			if (anInt4916 < anInt4917 - 1)
				aClass442Array4914[anInt4916++] = this;
		}
	}

	public Class442() {
		/* empty */
	}

	public static Class442 method7142(RSByteBuffer class527_sub38) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442(class527_sub38);
				return class442;
			}
			aClass442Array4914[--anInt4916].method7144(class527_sub38);
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public final void method7143(Class442 class442_6_) {
		aFloat4918 += class442_6_.aFloat4918;
		aFloat4915 += class442_6_.aFloat4915;
		aFloat4919 += class442_6_.aFloat4919;
	}

	Class442(RSByteBuffer class527_sub38) {
		aFloat4918 = class527_sub38.readFloat(-1408229078);
		aFloat4915 = class527_sub38.readFloat(-1539672827);
		aFloat4919 = class527_sub38.readFloat(-407037396);
	}

	public void method7144(RSByteBuffer class527_sub38) {
		aFloat4918 = class527_sub38.readFloat(-1832148072);
		aFloat4915 = class527_sub38.readFloat(-849903887);
		aFloat4919 = class527_sub38.readFloat(-934158863);
	}

	public static final float method7145(Class442 class442, Class442 class442_7_) {
		return class442.method7212(class442_7_);
	}

	public void method7146(Class442 class442_8_) {
		method7138(class442_8_.aFloat4918, class442_8_.aFloat4915, class442_8_.aFloat4919);
	}

	public final void method7147() {
		if (aFloat4918 < 0.0F)
			aFloat4918 *= -1.0F;
		if (aFloat4915 < 0.0F)
			aFloat4915 *= -1.0F;
		if (aFloat4919 < 0.0F)
			aFloat4919 *= -1.0F;
	}

	public static final Class442 method7148(Class442 class442, Class442 class442_9_) {
		Class442 class442_10_ = method7139(class442);
		class442_10_.method7219(class442_9_);
		return class442_10_;
	}

	public final void method7149() {
		aFloat4918 = -aFloat4918;
		aFloat4915 = -aFloat4915;
		aFloat4919 = -aFloat4919;
	}

	public static final Class442 method7150(Class442 class442, Class442 class442_11_) {
		Class442 class442_12_ = method7139(class442);
		class442_12_.method7154(class442_11_);
		return class442_12_;
	}

	public final void method7151(Class432 class432) {
		float f = aFloat4918;
		float f_13_ = aFloat4915;
		aFloat4918 = (class432.aFloat4862 * f + class432.aFloat4856 * f_13_ + class432.aFloat4859 * aFloat4919 + class432.aFloat4852);
		aFloat4915 = (class432.aFloat4854 * f + class432.aFloat4857 * f_13_ + class432.aFloat4861 * aFloat4919 + class432.aFloat4863);
		aFloat4919 = (class432.aFloat4858 * f + class432.aFloat4860 * f_13_ + class432.aFloat4855 * aFloat4919 + class432.aFloat4864);
	}

	public final void method7152(Class442 class442_14_, float f) {
		aFloat4918 += class442_14_.aFloat4918 * f;
		aFloat4915 += class442_14_.aFloat4915 * f;
		aFloat4919 += class442_14_.aFloat4919 * f;
	}

	public static final Class442 method7153(Class442 class442, Class442 class442_15_) {
		Class442 class442_16_ = method7139(class442);
		class442_16_.method7219(class442_15_);
		return class442_16_;
	}

	public final void method7154(Class442 class442_17_) {
		aFloat4918 -= class442_17_.aFloat4918;
		aFloat4915 -= class442_17_.aFloat4915;
		aFloat4919 -= class442_17_.aFloat4919;
	}

	public static final Class442 method7155(Class442 class442, Class442 class442_18_) {
		Class442 class442_19_ = method7139(class442);
		class442_19_.method7154(class442_18_);
		return class442_19_;
	}

	public static void method7156(int i) {
		anInt4917 = i;
		aClass442Array4914 = new Class442[i];
		anInt4916 = 0;
	}

	public final void method7157(Class438 class438) {
		Class438 class438_20_ = Class438.method7029(aFloat4918, aFloat4915, aFloat4919, 0.0F);
		Class438 class438_21_ = Class438.method7034(class438);
		Class438 class438_22_ = Class438.method7060(class438_21_, class438_20_);
		class438_22_.method7019(class438);
		method7138(class438_22_.aFloat4883, class438_22_.aFloat4886, class438_22_.aFloat4887);
		class438_20_.method7021();
		class438_21_.method7021();
		class438_22_.method7021();
	}

	final void method7158(Class442 class442_23_) {
		method7138((aFloat4915 * class442_23_.aFloat4919 - aFloat4919 * class442_23_.aFloat4915), (aFloat4919 * class442_23_.aFloat4918 - aFloat4918 * class442_23_.aFloat4919), (aFloat4918 * class442_23_.aFloat4915 - aFloat4915 * class442_23_.aFloat4918));
	}

	public static final Class442 method7159(Class442 class442, Class442 class442_24_) {
		Class442 class442_25_ = method7139(class442);
		class442_25_.method7158(class442_24_);
		return class442_25_;
	}

	public final float method7160() {
		return (float) Math.sqrt((double) (aFloat4918 * aFloat4918 + aFloat4915 * aFloat4915 + aFloat4919 * aFloat4919));
	}

	public final void method7161() {
		float f = 1.0F / method7160();
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	public final void method7162() {
		aFloat4918 = -aFloat4918;
		aFloat4915 = -aFloat4915;
		aFloat4919 = -aFloat4919;
	}

	public static final Class442 method7163(Class442 class442, Class442 class442_26_) {
		Class442 class442_27_ = method7139(class442);
		class442_27_.method7190(class442_26_);
		return class442_27_;
	}

	public final void method7164(float f) {
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	final void method7165(Class442 class442_28_) {
		aFloat4918 /= class442_28_.aFloat4918;
		aFloat4915 /= class442_28_.aFloat4915;
		aFloat4919 /= class442_28_.aFloat4919;
	}

	public static Class442 method7166(float f, float f_29_, float f_30_) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442(f, f_29_, f_30_);
				return class442;
			}
			aClass442Array4914[--anInt4916].method7138(f, f_29_, f_30_);
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public final void method7167(float f) {
		aFloat4918 /= f;
		aFloat4915 /= f;
		aFloat4919 /= f;
	}

	public static final Class442 method7168(Class442 class442, float f) {
		Class442 class442_31_ = method7139(class442);
		class442_31_.method7164(f);
		return class442_31_;
	}

	final void method7169(Class442 class442_32_) {
		method7138((aFloat4915 * class442_32_.aFloat4919 - aFloat4919 * class442_32_.aFloat4915), (aFloat4919 * class442_32_.aFloat4918 - aFloat4918 * class442_32_.aFloat4919), (aFloat4918 * class442_32_.aFloat4915 - aFloat4915 * class442_32_.aFloat4918));
	}

	public final void method7170(Class442 class442_33_, float f) {
		aFloat4918 += class442_33_.aFloat4918 * f;
		aFloat4915 += class442_33_.aFloat4915 * f;
		aFloat4919 += class442_33_.aFloat4919 * f;
	}

	public static void method7171(int i) {
		anInt4917 = i;
		aClass442Array4914 = new Class442[i];
		anInt4916 = 0;
	}

	public final void method7172(Class442 class442_34_, float f) {
		method7164(1.0F - f);
		method7219(method7168(class442_34_, f));
	}

	public final void method7173() {
		float f = 1.0F / method7160();
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	static {
		new Class442(0.0F, 0.0F, 0.0F);
		aClass442Array4914 = new Class442[0];
	}

	public String method7174() {
		return new StringBuilder().append(aFloat4918).append(", ").append(aFloat4915).append(", ").append(aFloat4919).toString();
	}

	public static final Class442 method7175(Class442 class442, Class442 class442_35_) {
		Class442 class442_36_ = method7139(class442);
		class442_36_.method7165(class442_35_);
		return class442_36_;
	}

	public static final Class442 method7176(Class442 class442, Class442 class442_37_) {
		Class442 class442_38_ = method7139(class442);
		class442_38_.method7154(class442_37_);
		return class442_38_;
	}

	public boolean method7177(Class442 class442_39_) {
		if (aFloat4918 != class442_39_.aFloat4918 || aFloat4915 != class442_39_.aFloat4915 || aFloat4919 != class442_39_.aFloat4919)
			return false;
		return true;
	}

	public static Class442 method7178(Class442 class442) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442_40_ = new Class442(class442);
				return class442_40_;
			}
			aClass442Array4914[--anInt4916].method7146(class442);
			Class442 class442_41_ = aClass442Array4914[anInt4916];
			return class442_41_;
		}
	}

	public final void method7179() {
		if (aFloat4918 < 0.0F)
			aFloat4918 *= -1.0F;
		if (aFloat4915 < 0.0F)
			aFloat4915 *= -1.0F;
		if (aFloat4919 < 0.0F)
			aFloat4919 *= -1.0F;
	}

	public static Class442 method7180(RSByteBuffer class527_sub38) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442(class527_sub38);
				return class442;
			}
			aClass442Array4914[--anInt4916].method7144(class527_sub38);
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public static Class442 method7181(RSByteBuffer class527_sub38) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442(class527_sub38);
				return class442;
			}
			aClass442Array4914[--anInt4916].method7144(class527_sub38);
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public void method7182() {
		synchronized (aClass442Array4914) {
			if (anInt4916 < anInt4917 - 1)
				aClass442Array4914[anInt4916++] = this;
		}
	}

	public void method7183(RSByteBuffer class527_sub38) {
		aFloat4918 = class527_sub38.readFloat(-247165645);
		aFloat4915 = class527_sub38.readFloat(-1529682860);
		aFloat4919 = class527_sub38.readFloat(-2011919246);
	}

	public void method7184(RSByteBuffer class527_sub38) {
		aFloat4918 = class527_sub38.readFloat(-52812726);
		aFloat4915 = class527_sub38.readFloat(-1429169745);
		aFloat4919 = class527_sub38.readFloat(-1109066318);
	}

	public final void method7185(float f) {
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	public final void method7186() {
		aFloat4919 = 0.0F;
		aFloat4915 = 0.0F;
		aFloat4918 = 0.0F;
	}

	public final void method7187() {
		aFloat4919 = 0.0F;
		aFloat4915 = 0.0F;
		aFloat4918 = 0.0F;
	}

	public boolean method7188(Class442 class442_42_) {
		if (aFloat4918 != class442_42_.aFloat4918 || aFloat4915 != class442_42_.aFloat4915 || aFloat4919 != class442_42_.aFloat4919)
			return false;
		return true;
	}

	public static final Class442 method7189(Class442 class442, Class442 class442_43_) {
		Class442 class442_44_ = method7139(class442);
		class442_44_.method7158(class442_43_);
		return class442_44_;
	}

	final void method7190(Class442 class442_45_) {
		aFloat4918 *= class442_45_.aFloat4918;
		aFloat4915 *= class442_45_.aFloat4915;
		aFloat4919 *= class442_45_.aFloat4919;
	}

	public static final Class442 method7191(Class442 class442, Class442 class442_46_) {
		Class442 class442_47_ = method7139(class442);
		class442_47_.method7165(class442_46_);
		return class442_47_;
	}

	public static final Class442 method7192(Class442 class442, Class442 class442_48_) {
		Class442 class442_49_ = method7139(class442);
		class442_49_.method7219(class442_48_);
		return class442_49_;
	}

	public final void method7193() {
		float f = 1.0F / method7160();
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	public final void method7194() {
		float f = 1.0F / method7160();
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	public static final Class442 method7195(Class442 class442, Class442 class442_50_) {
		Class442 class442_51_ = method7139(class442);
		class442_51_.method7154(class442_50_);
		return class442_51_;
	}

	public final void method7196() {
		float f = 1.0F / method7160();
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	public final void method7197(Class432 class432) {
		float f = aFloat4918;
		float f_52_ = aFloat4915;
		aFloat4918 = (class432.aFloat4862 * f + class432.aFloat4856 * f_52_ + class432.aFloat4859 * aFloat4919 + class432.aFloat4852);
		aFloat4915 = (class432.aFloat4854 * f + class432.aFloat4857 * f_52_ + class432.aFloat4861 * aFloat4919 + class432.aFloat4863);
		aFloat4919 = (class432.aFloat4858 * f + class432.aFloat4860 * f_52_ + class432.aFloat4855 * aFloat4919 + class432.aFloat4864);
	}

	public final void method7198(Class442 class442_53_) {
		aFloat4918 += class442_53_.aFloat4918;
		aFloat4915 += class442_53_.aFloat4915;
		aFloat4919 += class442_53_.aFloat4919;
	}

	public final void method7199(Class442 class442_54_) {
		aFloat4918 += class442_54_.aFloat4918;
		aFloat4915 += class442_54_.aFloat4915;
		aFloat4919 += class442_54_.aFloat4919;
	}

	public String toString() {
		return new StringBuilder().append(aFloat4918).append(", ").append(aFloat4915).append(", ").append(aFloat4919).toString();
	}

	public final void method7200(Class432 class432) {
		float f = aFloat4918;
		float f_55_ = aFloat4915;
		aFloat4918 = (class432.aFloat4862 * f + class432.aFloat4856 * f_55_ + class432.aFloat4859 * aFloat4919);
		aFloat4915 = (class432.aFloat4854 * f + class432.aFloat4857 * f_55_ + class432.aFloat4861 * aFloat4919);
		aFloat4919 = (class432.aFloat4858 * f + class432.aFloat4860 * f_55_ + class432.aFloat4855 * aFloat4919);
	}

	public boolean method7201(Class442 class442_56_) {
		if (aFloat4918 != class442_56_.aFloat4918 || aFloat4915 != class442_56_.aFloat4915 || aFloat4919 != class442_56_.aFloat4919)
			return false;
		return true;
	}

	public static Class442 method7202(RSByteBuffer class527_sub38) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442(class527_sub38);
				return class442;
			}
			aClass442Array4914[--anInt4916].method7144(class527_sub38);
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public static final Class442 method7203(Class442 class442, Class442 class442_57_) {
		Class442 class442_58_ = method7139(class442);
		class442_58_.method7154(class442_57_);
		return class442_58_;
	}

	public boolean method7204(Class442 class442_59_) {
		if (aFloat4918 != class442_59_.aFloat4918 || aFloat4915 != class442_59_.aFloat4915 || aFloat4919 != class442_59_.aFloat4919)
			return false;
		return true;
	}

	public Class442(float f, float f_60_, float f_61_) {
		aFloat4918 = f;
		aFloat4915 = f_60_;
		aFloat4919 = f_61_;
	}

	public boolean method7205(Class442 class442_62_) {
		if (aFloat4918 != class442_62_.aFloat4918 || aFloat4915 != class442_62_.aFloat4915 || aFloat4919 != class442_62_.aFloat4919)
			return false;
		return true;
	}

	public final float method7206(Class442 class442_63_) {
		return (aFloat4918 * class442_63_.aFloat4918 + aFloat4915 * class442_63_.aFloat4915 + aFloat4919 * class442_63_.aFloat4919);
	}

	public static final float method7207(Class442 class442, Class442 class442_64_) {
		return class442.method7212(class442_64_);
	}

	public static final float method7208(Class442 class442, Class442 class442_65_) {
		return class442.method7212(class442_65_);
	}

	public static final float method7209(Class442 class442, Class442 class442_66_) {
		return class442.method7212(class442_66_);
	}

	final void method7210(Class442 class442_67_) {
		method7138((aFloat4915 * class442_67_.aFloat4919 - aFloat4919 * class442_67_.aFloat4915), (aFloat4919 * class442_67_.aFloat4918 - aFloat4918 * class442_67_.aFloat4919), (aFloat4918 * class442_67_.aFloat4915 - aFloat4915 * class442_67_.aFloat4918));
	}

	public final void method7211() {
		aFloat4919 = 0.0F;
		aFloat4915 = 0.0F;
		aFloat4918 = 0.0F;
	}

	public final float method7212(Class442 class442_68_) {
		return (aFloat4918 * class442_68_.aFloat4918 + aFloat4915 * class442_68_.aFloat4915 + aFloat4919 * class442_68_.aFloat4919);
	}

	public final float method7213() {
		return (float) Math.sqrt((double) (aFloat4918 * aFloat4918 + aFloat4915 * aFloat4915 + aFloat4919 * aFloat4919));
	}

	public final float method7214() {
		return (float) Math.sqrt((double) (aFloat4918 * aFloat4918 + aFloat4915 * aFloat4915 + aFloat4919 * aFloat4919));
	}

	public final float method7215() {
		return (float) Math.sqrt((double) (aFloat4918 * aFloat4918 + aFloat4915 * aFloat4915 + aFloat4919 * aFloat4919));
	}

	public Class442(Class442 class442_69_) {
		aFloat4918 = class442_69_.aFloat4918;
		aFloat4915 = class442_69_.aFloat4915;
		aFloat4919 = class442_69_.aFloat4919;
	}

	final void method7216(Class442 class442_70_) {
		aFloat4918 *= class442_70_.aFloat4918;
		aFloat4915 *= class442_70_.aFloat4915;
		aFloat4919 *= class442_70_.aFloat4919;
	}

	public static void method7217(int i) {
		anInt4917 = i;
		aClass442Array4914 = new Class442[i];
		anInt4916 = 0;
	}

	public static final Class442 method7218(Class442 class442, Class442 class442_71_) {
		Class442 class442_72_ = method7139(class442);
		class442_72_.method7190(class442_71_);
		return class442_72_;
	}

	public final void method7219(Class442 class442_73_) {
		aFloat4918 += class442_73_.aFloat4918;
		aFloat4915 += class442_73_.aFloat4915;
		aFloat4919 += class442_73_.aFloat4919;
	}

	public final void method7220(float f) {
		aFloat4918 *= f;
		aFloat4915 *= f;
		aFloat4919 *= f;
	}

	final void method7221(Class442 class442_74_) {
		aFloat4918 /= class442_74_.aFloat4918;
		aFloat4915 /= class442_74_.aFloat4915;
		aFloat4919 /= class442_74_.aFloat4919;
	}

	final void method7222(Class442 class442_75_) {
		aFloat4918 /= class442_75_.aFloat4918;
		aFloat4915 /= class442_75_.aFloat4915;
		aFloat4919 /= class442_75_.aFloat4919;
	}

	final void method7223(Class442 class442_76_) {
		aFloat4918 /= class442_76_.aFloat4918;
		aFloat4915 /= class442_76_.aFloat4915;
		aFloat4919 /= class442_76_.aFloat4919;
	}

	final void method7224(Class442 class442_77_) {
		aFloat4918 /= class442_77_.aFloat4918;
		aFloat4915 /= class442_77_.aFloat4915;
		aFloat4919 /= class442_77_.aFloat4919;
	}

	public void method7225(Class442 class442_78_) {
		method7138(class442_78_.aFloat4918, class442_78_.aFloat4915, class442_78_.aFloat4919);
	}

	public final void method7226(float f) {
		aFloat4918 /= f;
		aFloat4915 /= f;
		aFloat4919 /= f;
	}

	public final void method7227(float f) {
		aFloat4918 /= f;
		aFloat4915 /= f;
		aFloat4919 /= f;
	}

	public final void method7228(float f) {
		aFloat4918 /= f;
		aFloat4915 /= f;
		aFloat4919 /= f;
	}

	public static final Class442 method7229(Class442 class442, float f) {
		Class442 class442_79_ = method7139(class442);
		class442_79_.method7164(f);
		return class442_79_;
	}

	public final void method7230(Class432 class432) {
		float f = aFloat4918;
		float f_80_ = aFloat4915;
		aFloat4918 = (class432.aFloat4862 * f + class432.aFloat4856 * f_80_ + class432.aFloat4859 * aFloat4919);
		aFloat4915 = (class432.aFloat4854 * f + class432.aFloat4857 * f_80_ + class432.aFloat4861 * aFloat4919);
		aFloat4919 = (class432.aFloat4858 * f + class432.aFloat4860 * f_80_ + class432.aFloat4855 * aFloat4919);
	}

	public static final Class442 method7231(Class442 class442, Class442 class442_81_) {
		Class442 class442_82_ = method7139(class442);
		class442_82_.method7190(class442_81_);
		return class442_82_;
	}

	public final void method7232(Class432 class432) {
		float f = aFloat4918;
		float f_83_ = aFloat4915;
		aFloat4918 = (class432.aFloat4862 * f + class432.aFloat4856 * f_83_ + class432.aFloat4859 * aFloat4919);
		aFloat4915 = (class432.aFloat4854 * f + class432.aFloat4857 * f_83_ + class432.aFloat4861 * aFloat4919);
		aFloat4919 = (class432.aFloat4858 * f + class432.aFloat4860 * f_83_ + class432.aFloat4855 * aFloat4919);
	}

	public static Class442 method7233(float f, float f_84_, float f_85_) {
		synchronized (aClass442Array4914) {
			if (anInt4916 == 0) {
				Class442 class442 = new Class442(f, f_84_, f_85_);
				return class442;
			}
			aClass442Array4914[--anInt4916].method7138(f, f_84_, f_85_);
			Class442 class442 = aClass442Array4914[anInt4916];
			return class442;
		}
	}

	public final void method7234(Class442 class442_86_, float f) {
		method7164(1.0F - f);
		method7219(method7168(class442_86_, f));
	}

	public final void method7235(Class442 class442_87_, float f) {
		method7164(1.0F - f);
		method7219(method7168(class442_87_, f));
	}

	public final void method7236(Class442 class442_88_, float f) {
		method7164(1.0F - f);
		method7219(method7168(class442_88_, f));
	}
}
