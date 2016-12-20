/* Class640_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class640_Sub1 extends Class640 {
	public byte aByte10862;
	public Class169[] aClass169Array10863;
	public byte aByte10864;
	Class640_Sub1 aClass640_Sub1_10865;
	int anInt10866;
	public Class555 aClass555_10867;

	Class640_Sub1(Class555 class555) {
		aClass555_10867 = class555;
	}

	abstract boolean method17033(Class180 class180, int i, int i_0_, byte i_1_);

	public boolean method17034() {
		return true;
	}

	public int method17035() {
		return -method17047(1004008254);
	}

	int method17036() {
		return 0;
	}

	abstract boolean method17037(int i);

	abstract void method17038(Class180 class180, Class640_Sub1 class640_sub1_2_, int i, int i_3_, int i_4_, boolean bool, int i_5_);

	abstract void method17039(int i);

	abstract Class558 method17040(Class180 class180, byte i);

	abstract void method17041(Class180 class180, Class640_Sub1 class640_sub1_6_, int i, int i_7_, int i_8_, boolean bool);

	public abstract Class549 method17042(Class180 class180, int i);

	abstract int method17043(Class527_Sub16[] class527_sub16s, int i);

	abstract boolean method17044(Class180 class180, int i);

	abstract boolean method17045();

	int method17046(int i) {
		return 0;
	}

	public abstract int method17047(int i);

	abstract boolean method17048();

	public int method17049(byte i) {
		return -method17047(1004008254);
	}

	void method17050(int i, short i_9_) {
		aClass169Array10863 = new Class169[i];
		for (int i_10_ = 0; i_10_ < aClass169Array10863.length; i_10_++)
			aClass169Array10863[i_10_] = new Class169();
	}

	abstract boolean method17051();

	abstract boolean method17052();

	abstract boolean method17053();

	int method17054(int i, int i_11_, Class527_Sub16[] class527_sub16s, byte i_12_) {
		long l = aClass555_10867.aLongArrayArrayArray7475[aByte10864][i][i_11_];
		long l_13_ = 0L;
		int i_14_ = 0;
		for (/**/; l_13_ <= 48L; l_13_ += 16L) {
			int i_15_ = (int) (l >> (int) l_13_ & 0xffffL);
			if (i_15_ <= 0)
				break;
			class527_sub16s[i_14_++] = (aClass555_10867.aClass556Array7476[i_15_ - 1].aClass527_Sub16_7495);
		}
		for (int i_16_ = i_14_; i_16_ < 4; i_16_++)
			class527_sub16s[i_16_] = null;
		return i_14_;
	}

	abstract boolean method17055();

	abstract void method17056(Class180 class180);

	public abstract Class549 method17057(Class180 class180);

	public abstract Class549 method17058(Class180 class180);

	public int method17059() {
		return -method17047(1004008254);
	}

	public boolean method17060(byte i) {
		return true;
	}

	public int method17061() {
		return -method17047(1004008254);
	}

	abstract void method17062(Class180 class180, Class640_Sub1 class640_sub1_17_, int i, int i_18_, int i_19_, boolean bool);

	abstract Class558 method17063(Class180 class180);

	public abstract Class549 method17064(Class180 class180);

	static void method17065(Class549 class549, int i, int i_20_, int i_21_, Class176 class176) {
		if (null != class176)
			class549.method9095(i, i_20_, i_21_, class176.method2865(), class176.method2894(), class176.method2939(), class176.method2896(), class176.method2897(), class176.method2898(), class176.method2890());
	}

	abstract boolean method17066(Class180 class180, int i, int i_22_);

	abstract boolean method17067();

	abstract boolean method17068();

	abstract boolean method17069(int i);

	abstract Class558 method17070(Class180 class180);

	abstract void method17071(Class180 class180);

	abstract boolean method17072(int i);

	abstract void method17073(Class180 class180, Class640_Sub1 class640_sub1_23_, int i, int i_24_, int i_25_, boolean bool);

	abstract void method17074();

	abstract void method17075();

	public abstract int method17076();

	abstract boolean method17077(byte i);

	abstract void method17078(Class180 class180, Class640_Sub1 class640_sub1_26_, int i, int i_27_, int i_28_, boolean bool);

	int method17079() {
		return 0;
	}

	public boolean method17080() {
		return true;
	}

	abstract void method17081(Class180 class180, int i);

	public boolean method17082() {
		return true;
	}

	abstract int method17083(Class527_Sub16[] class527_sub16s);

	abstract boolean method17084(Class180 class180);

	public abstract Class549 method17085(Class180 class180);

	abstract boolean method17086();

	int method17087() {
		return 0;
	}

	static void method17088(Class549 class549, int i, int i_29_, int i_30_, Class176 class176) {
		if (null != class176)
			class549.method9095(i, i_29_, i_30_, class176.method2865(), class176.method2894(), class176.method2939(), class176.method2896(), class176.method2897(), class176.method2898(), class176.method2890());
	}

	abstract boolean method17089();

	void method17090(int i) {
		aClass169Array10863 = new Class169[i];
		for (int i_31_ = 0; i_31_ < aClass169Array10863.length; i_31_++)
			aClass169Array10863[i_31_] = new Class169();
	}

	void method17091(int i) {
		aClass169Array10863 = new Class169[i];
		for (int i_32_ = 0; i_32_ < aClass169Array10863.length; i_32_++)
			aClass169Array10863[i_32_] = new Class169();
	}

	void method17092(int i) {
		aClass169Array10863 = new Class169[i];
		for (int i_33_ = 0; i_33_ < aClass169Array10863.length; i_33_++)
			aClass169Array10863[i_33_] = new Class169();
	}

	public static void method17093(int i, int i_34_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(15, (long) i);
		class527_sub8_sub9.method18186(2017533465);
	}
}
