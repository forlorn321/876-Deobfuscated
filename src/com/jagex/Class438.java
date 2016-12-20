/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class438 {
	public float aFloat4883;
	static int anInt4884;
	static int anInt4885;
	public float aFloat4886;
	public float aFloat4887;
	static Class438[] aClass438Array4888 = new Class438[0];
	public float aFloat4889;

	public final void method7019(Class438 class438_0_) {
		method7036((class438_0_.aFloat4889 * aFloat4883 + class438_0_.aFloat4883 * aFloat4889 + class438_0_.aFloat4886 * aFloat4887 - class438_0_.aFloat4887 * aFloat4886), (class438_0_.aFloat4889 * aFloat4886 - class438_0_.aFloat4883 * aFloat4887 + class438_0_.aFloat4886 * aFloat4889 + class438_0_.aFloat4887 * aFloat4883), (class438_0_.aFloat4889 * aFloat4887 + class438_0_.aFloat4883 * aFloat4886 - class438_0_.aFloat4886 * aFloat4883 + class438_0_.aFloat4887 * aFloat4889),
				(class438_0_.aFloat4889 * aFloat4889 - class438_0_.aFloat4883 * aFloat4883 - class438_0_.aFloat4886 * aFloat4886 - class438_0_.aFloat4887 * aFloat4887));
	}

	public static Class438 method7020() {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438 = new Class438();
				return class438;
			}
			aClass438Array4888[--anInt4885].method7031();
			Class438 class438 = aClass438Array4888[anInt4885];
			return class438;
		}
	}

	public void method7021() {
		synchronized (aClass438Array4888) {
			if (anInt4885 < anInt4884 - 1)
				aClass438Array4888[anInt4885++] = this;
		}
	}

	public static Class438 method7022(Class438 class438) {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438_1_ = new Class438(class438);
				return class438_1_;
			}
			aClass438Array4888[--anInt4885].method7054(class438);
			Class438 class438_2_ = aClass438Array4888[anInt4885];
			return class438_2_;
		}
	}

	public final void method7023(Class438 class438_3_, float f) {
		if (method7037(class438_3_) < 0.0F)
			method7027();
		method7042(1.0F - f);
		Class438 class438_4_ = method7095(class438_3_, f);
		method7044(class438_4_);
		class438_4_.method7021();
		method7035();
	}

	public Class438() {
		method7031();
	}

	public Class438(float f, float f_5_, float f_6_, float f_7_) {
		method7036(f, f_5_, f_6_, f_7_);
	}

	final void method7024() {
		aFloat4887 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4883 = 0.0F;
		aFloat4889 = 1.0F;
	}

	public Class438(float f, float f_8_, float f_9_) {
		method7030(f, f_8_, f_9_);
	}

	public void method7025(RSByteBuffer class527_sub38) {
		aFloat4883 = class527_sub38.readFloat(-199492675);
		aFloat4886 = class527_sub38.readFloat(-889587070);
		aFloat4887 = class527_sub38.readFloat(-1285232696);
		aFloat4889 = class527_sub38.readFloat(-1091312958);
	}

	public void method7026(float f, float f_10_, float f_11_) {
		method7040(0.0F, 1.0F, 0.0F, f);
		Class438 class438_12_ = method7020();
		class438_12_.method7040(1.0F, 0.0F, 0.0F, f_10_);
		method7019(class438_12_);
		class438_12_.method7040(0.0F, 0.0F, 1.0F, f_11_);
		method7019(class438_12_);
		class438_12_.method7021();
	}

	final void method7027() {
		aFloat4883 = -aFloat4883;
		aFloat4886 = -aFloat4886;
		aFloat4887 = -aFloat4887;
		aFloat4889 = -aFloat4889;
	}

	public final void method7028(Class438 class438_13_, float f) {
		if (method7037(class438_13_) < 0.0F)
			method7027();
		method7042(1.0F - f);
		Class438 class438_14_ = method7095(class438_13_, f);
		method7044(class438_14_);
		class438_14_.method7021();
		method7035();
	}

	static Class438 method7029(float f, float f_15_, float f_16_, float f_17_) {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438 = new Class438(f, f_15_, f_16_, f_17_);
				return class438;
			}
			aClass438Array4888[--anInt4885].method7036(f, f_15_, f_16_, f_17_);
			Class438 class438 = aClass438Array4888[anInt4885];
			return class438;
		}
	}

	public void method7030(float f, float f_18_, float f_19_) {
		method7040(0.0F, 1.0F, 0.0F, f);
		Class438 class438_20_ = method7020();
		class438_20_.method7040(1.0F, 0.0F, 0.0F, f_18_);
		method7019(class438_20_);
		class438_20_.method7040(0.0F, 0.0F, 1.0F, f_19_);
		method7019(class438_20_);
		class438_20_.method7021();
	}

	final void method7031() {
		aFloat4887 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4883 = 0.0F;
		aFloat4889 = 1.0F;
	}

	final void method7032(Class438 class438_21_) {
		aFloat4883 += class438_21_.aFloat4883;
		aFloat4886 += class438_21_.aFloat4886;
		aFloat4887 += class438_21_.aFloat4887;
		aFloat4889 += class438_21_.aFloat4889;
	}

	public final void method7033() {
		aFloat4883 = -aFloat4883;
		aFloat4886 = -aFloat4886;
		aFloat4887 = -aFloat4887;
	}

	public static final Class438 method7034(Class438 class438) {
		Class438 class438_22_ = method7022(class438);
		class438_22_.method7033();
		return class438_22_;
	}

	public final void method7035() {
		float f = 1.0F / method7084(this);
		aFloat4883 *= f;
		aFloat4886 *= f;
		aFloat4887 *= f;
		aFloat4889 *= f;
	}

	void method7036(float f, float f_23_, float f_24_, float f_25_) {
		aFloat4883 = f;
		aFloat4886 = f_23_;
		aFloat4887 = f_24_;
		aFloat4889 = f_25_;
	}

	final float method7037(Class438 class438_26_) {
		return (aFloat4883 * class438_26_.aFloat4883 + aFloat4886 * class438_26_.aFloat4886 + aFloat4887 * class438_26_.aFloat4887 + aFloat4889 * class438_26_.aFloat4889);
	}

	static final float method7038(Class438 class438, Class438 class438_27_) {
		return class438.method7037(class438_27_);
	}

	public void method7039(Class438 class438_28_) {
		aFloat4883 = class438_28_.aFloat4883;
		aFloat4886 = class438_28_.aFloat4886;
		aFloat4887 = class438_28_.aFloat4887;
		aFloat4889 = class438_28_.aFloat4889;
	}

	public void method7040(float f, float f_29_, float f_30_, float f_31_) {
		float f_32_ = (float) Math.sin((double) (f_31_ * 0.5F));
		float f_33_ = (float) Math.cos((double) (f_31_ * 0.5F));
		aFloat4883 = f * f_32_;
		aFloat4886 = f_29_ * f_32_;
		aFloat4887 = f_30_ * f_32_;
		aFloat4889 = f_33_;
	}

	static final float method7041(Class438 class438) {
		return (float) Math.sqrt((double) method7038(class438, class438));
	}

	final void method7042(float f) {
		aFloat4883 *= f;
		aFloat4886 *= f;
		aFloat4887 *= f;
		aFloat4889 *= f;
	}

	static final float method7043(Class438 class438, Class438 class438_34_) {
		return class438.method7037(class438_34_);
	}

	final void method7044(Class438 class438_35_) {
		aFloat4883 += class438_35_.aFloat4883;
		aFloat4886 += class438_35_.aFloat4886;
		aFloat4887 += class438_35_.aFloat4887;
		aFloat4889 += class438_35_.aFloat4889;
	}

	public String toString() {
		return new StringBuilder().append(aFloat4883).append(",").append(aFloat4886).append(",").append(aFloat4887).append(",").append(aFloat4889).toString();
	}

	static {
		new Class438();
	}

	public String method7045() {
		return new StringBuilder().append(aFloat4883).append(",").append(aFloat4886).append(",").append(aFloat4887).append(",").append(aFloat4889).toString();
	}

	public static Class438 method7046() {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438 = new Class438();
				return class438;
			}
			aClass438Array4888[--anInt4885].method7031();
			Class438 class438 = aClass438Array4888[anInt4885];
			return class438;
		}
	}

	public static Class438 method7047() {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438 = new Class438();
				return class438;
			}
			aClass438Array4888[--anInt4885].method7031();
			Class438 class438 = aClass438Array4888[anInt4885];
			return class438;
		}
	}

	public static Class438 method7048(Class438 class438) {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438_36_ = new Class438(class438);
				return class438_36_;
			}
			aClass438Array4888[--anInt4885].method7054(class438);
			Class438 class438_37_ = aClass438Array4888[anInt4885];
			return class438_37_;
		}
	}

	public static Class438 method7049(Class438 class438) {
		synchronized (aClass438Array4888) {
			if (anInt4885 == 0) {
				Class438 class438_38_ = new Class438(class438);
				return class438_38_;
			}
			aClass438Array4888[--anInt4885].method7054(class438);
			Class438 class438_39_ = aClass438Array4888[anInt4885];
			return class438_39_;
		}
	}

	public void method7050() {
		synchronized (aClass438Array4888) {
			if (anInt4885 < anInt4884 - 1)
				aClass438Array4888[anInt4885++] = this;
		}
	}

	void method7051(float f, float f_40_, float f_41_, float f_42_) {
		aFloat4883 = f;
		aFloat4886 = f_40_;
		aFloat4887 = f_41_;
		aFloat4889 = f_42_;
	}

	void method7052(float f, float f_43_, float f_44_, float f_45_) {
		aFloat4883 = f;
		aFloat4886 = f_43_;
		aFloat4887 = f_44_;
		aFloat4889 = f_45_;
	}

	final void method7053() {
		aFloat4883 = -aFloat4883;
		aFloat4886 = -aFloat4886;
		aFloat4887 = -aFloat4887;
		aFloat4889 = -aFloat4889;
	}

	public void method7054(Class438 class438_46_) {
		aFloat4883 = class438_46_.aFloat4883;
		aFloat4886 = class438_46_.aFloat4886;
		aFloat4887 = class438_46_.aFloat4887;
		aFloat4889 = class438_46_.aFloat4889;
	}

	final void method7055(Class438 class438_47_) {
		aFloat4883 += class438_47_.aFloat4883;
		aFloat4886 += class438_47_.aFloat4886;
		aFloat4887 += class438_47_.aFloat4887;
		aFloat4889 += class438_47_.aFloat4889;
	}

	public void method7056(Class438 class438_48_) {
		aFloat4883 = class438_48_.aFloat4883;
		aFloat4886 = class438_48_.aFloat4886;
		aFloat4887 = class438_48_.aFloat4887;
		aFloat4889 = class438_48_.aFloat4889;
	}

	public void method7057(Class442 class442, float f) {
		method7040(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919, f);
	}

	public void method7058(Class442 class442, float f) {
		method7040(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919, f);
	}

	public void method7059(Class442 class442, float f) {
		method7040(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919, f);
	}

	static final Class438 method7060(Class438 class438, Class438 class438_49_) {
		Class438 class438_50_ = method7022(class438);
		class438_50_.method7019(class438_49_);
		return class438_50_;
	}

	public void method7061(float f, float f_51_, float f_52_, float f_53_) {
		float f_54_ = (float) Math.sin((double) (f_53_ * 0.5F));
		float f_55_ = (float) Math.cos((double) (f_53_ * 0.5F));
		aFloat4883 = f * f_54_;
		aFloat4886 = f_51_ * f_54_;
		aFloat4887 = f_52_ * f_54_;
		aFloat4889 = f_55_;
	}

	public void method7062(float f, float f_56_, float f_57_) {
		method7040(0.0F, 1.0F, 0.0F, f);
		Class438 class438_58_ = method7020();
		class438_58_.method7040(1.0F, 0.0F, 0.0F, f_56_);
		method7019(class438_58_);
		class438_58_.method7040(0.0F, 0.0F, 1.0F, f_57_);
		method7019(class438_58_);
		class438_58_.method7021();
	}

	public void method7063(float f, float f_59_, float f_60_) {
		method7040(0.0F, 1.0F, 0.0F, f);
		Class438 class438_61_ = method7020();
		class438_61_.method7040(1.0F, 0.0F, 0.0F, f_59_);
		method7019(class438_61_);
		class438_61_.method7040(0.0F, 0.0F, 1.0F, f_60_);
		method7019(class438_61_);
		class438_61_.method7021();
	}

	public final void method7064(Class438 class438_62_) {
		method7036((class438_62_.aFloat4889 * aFloat4883 + class438_62_.aFloat4883 * aFloat4889 + class438_62_.aFloat4886 * aFloat4887 - class438_62_.aFloat4887 * aFloat4886), (class438_62_.aFloat4889 * aFloat4886 - class438_62_.aFloat4883 * aFloat4887 + class438_62_.aFloat4886 * aFloat4889 + class438_62_.aFloat4887 * aFloat4883), (class438_62_.aFloat4889 * aFloat4887 + class438_62_.aFloat4883 * aFloat4886 - class438_62_.aFloat4886 * aFloat4883 + class438_62_.aFloat4887 * aFloat4889),
				(class438_62_.aFloat4889 * aFloat4889 - class438_62_.aFloat4883 * aFloat4883 - class438_62_.aFloat4886 * aFloat4886 - class438_62_.aFloat4887 * aFloat4887));
	}

	public static void method7065(int i) {
		anInt4884 = i;
		aClass438Array4888 = new Class438[i];
		anInt4885 = 0;
	}

	public void method7066(Class438 class438_63_) {
		aFloat4883 = class438_63_.aFloat4883;
		aFloat4886 = class438_63_.aFloat4886;
		aFloat4887 = class438_63_.aFloat4887;
		aFloat4889 = class438_63_.aFloat4889;
	}

	final void method7067() {
		aFloat4887 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4883 = 0.0F;
		aFloat4889 = 1.0F;
	}

	final void method7068() {
		aFloat4887 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4883 = 0.0F;
		aFloat4889 = 1.0F;
	}

	static final float method7069(Class438 class438) {
		return (float) Math.sqrt((double) method7038(class438, class438));
	}

	final void method7070() {
		aFloat4883 = -aFloat4883;
		aFloat4886 = -aFloat4886;
		aFloat4887 = -aFloat4887;
		aFloat4889 = -aFloat4889;
	}

	final void method7071() {
		aFloat4883 = -aFloat4883;
		aFloat4886 = -aFloat4886;
		aFloat4887 = -aFloat4887;
		aFloat4889 = -aFloat4889;
	}

	final void method7072() {
		aFloat4883 = -aFloat4883;
		aFloat4886 = -aFloat4886;
		aFloat4887 = -aFloat4887;
		aFloat4889 = -aFloat4889;
	}

	public static final Class438 method7073(Class438 class438) {
		Class438 class438_64_ = method7022(class438);
		class438_64_.method7033();
		return class438_64_;
	}

	public static final Class438 method7074(Class438 class438) {
		Class438 class438_65_ = method7022(class438);
		class438_65_.method7033();
		return class438_65_;
	}

	public final void method7075() {
		float f = 1.0F / method7084(this);
		aFloat4883 *= f;
		aFloat4886 *= f;
		aFloat4887 *= f;
		aFloat4889 *= f;
	}

	public final void method7076() {
		float f = 1.0F / method7084(this);
		aFloat4883 *= f;
		aFloat4886 *= f;
		aFloat4887 *= f;
		aFloat4889 *= f;
	}

	public void method7077(float f, float f_66_, float f_67_, float f_68_) {
		float f_69_ = (float) Math.sin((double) (f_68_ * 0.5F));
		float f_70_ = (float) Math.cos((double) (f_68_ * 0.5F));
		aFloat4883 = f * f_69_;
		aFloat4886 = f_66_ * f_69_;
		aFloat4887 = f_67_ * f_69_;
		aFloat4889 = f_70_;
	}

	static final Class438 method7078(Class438 class438, float f) {
		Class438 class438_71_ = method7022(class438);
		class438_71_.method7042(f);
		return class438_71_;
	}

	void method7079(float f, float f_72_, float f_73_, float f_74_) {
		aFloat4883 = f;
		aFloat4886 = f_72_;
		aFloat4887 = f_73_;
		aFloat4889 = f_74_;
	}

	final float method7080(Class438 class438_75_) {
		return (aFloat4883 * class438_75_.aFloat4883 + aFloat4886 * class438_75_.aFloat4886 + aFloat4887 * class438_75_.aFloat4887 + aFloat4889 * class438_75_.aFloat4889);
	}

	static final float method7081(Class438 class438, Class438 class438_76_) {
		return class438.method7037(class438_76_);
	}

	public final void method7082() {
		float f = 1.0F / method7084(this);
		aFloat4883 *= f;
		aFloat4886 *= f;
		aFloat4887 *= f;
		aFloat4889 *= f;
	}

	static final float method7083(Class438 class438, Class438 class438_77_) {
		return class438.method7037(class438_77_);
	}

	static final float method7084(Class438 class438) {
		return (float) Math.sqrt((double) method7038(class438, class438));
	}

	public Class438(Class438 class438_78_) {
		method7054(class438_78_);
	}

	static final float method7085(Class438 class438) {
		return (float) Math.sqrt((double) method7038(class438, class438));
	}

	static final float method7086(Class438 class438) {
		return (float) Math.sqrt((double) method7038(class438, class438));
	}

	final void method7087() {
		aFloat4887 = 0.0F;
		aFloat4886 = 0.0F;
		aFloat4883 = 0.0F;
		aFloat4889 = 1.0F;
	}

	static final Class438 method7088(Class438 class438, Class438 class438_79_) {
		Class438 class438_80_ = method7022(class438);
		class438_80_.method7019(class438_79_);
		return class438_80_;
	}

	static final Class438 method7089(Class438 class438, Class438 class438_81_) {
		Class438 class438_82_ = method7022(class438);
		class438_82_.method7019(class438_81_);
		return class438_82_;
	}

	static final Class438 method7090(Class438 class438, Class438 class438_83_) {
		Class438 class438_84_ = method7022(class438);
		class438_84_.method7019(class438_83_);
		return class438_84_;
	}

	public void method7091(Class442 class442, float f) {
		method7040(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919, f);
	}

	static final Class438 method7092(Class438 class438, float f) {
		Class438 class438_85_ = method7022(class438);
		class438_85_.method7042(f);
		return class438_85_;
	}

	static final Class438 method7093(Class438 class438, float f) {
		Class438 class438_86_ = method7022(class438);
		class438_86_.method7042(f);
		return class438_86_;
	}

	public final void method7094(Class438 class438_87_, float f) {
		if (method7037(class438_87_) < 0.0F)
			method7027();
		method7042(1.0F - f);
		Class438 class438_88_ = method7095(class438_87_, f);
		method7044(class438_88_);
		class438_88_.method7021();
		method7035();
	}

	static final Class438 method7095(Class438 class438, float f) {
		Class438 class438_89_ = method7022(class438);
		class438_89_.method7042(f);
		return class438_89_;
	}

	public final void method7096(Class438 class438_90_, float f) {
		if (method7037(class438_90_) < 0.0F)
			method7027();
		method7042(1.0F - f);
		Class438 class438_91_ = method7095(class438_90_, f);
		method7044(class438_91_);
		class438_91_.method7021();
		method7035();
	}
}
