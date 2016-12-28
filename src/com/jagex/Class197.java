/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class197 implements Interface42 {
	Class211 this$0;

	public float method287() {
		return ((float) ClientSetting.aClass536_Sub40_8843.musicVolumeSetting.method10213(313112457) / 255.0F);
	}

	public float method285(int i) {
		return ((float) ClientSetting.aClass536_Sub40_8843.musicVolumeSetting.method10213(2051589686) / 255.0F);
	}

	Class197(Class211 class211) {
		this$0 = class211;
	}

	public float method288() {
		return ((float) ClientSetting.aClass536_Sub40_8843.musicVolumeSetting.method10213(1903204598) / 255.0F);
	}

	public float method286() {
		return ((float) ClientSetting.aClass536_Sub40_8843.musicVolumeSetting.method10213(-1911619333) / 255.0F);
	}

	public static void method2869(JS5ResourceProvider class461, JS5ResourceProvider class461_0_, JS5ResourceProvider class461_1_, JS5ResourceProvider class461_2_, int i) {
		Class452.aClass461_4953 = class461;
		Class537.aClass461_7152 = class461_0_;
		Class252.aClass461_2745 = class461_1_;
		Class463.aClass234Array5227 = new Class234[Class452.aClass461_4953.method5570(341174815)];
		Class684.aBoolArray8653 = new boolean[Class452.aClass461_4953.method5570(1292046356)];
	}

	static final void method2870(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i) {
		int i_3_ = (class649_sub1_sub5_sub1.anInt11923 * 1080012231 - client.cycles);
		int i_4_ = (class649_sub1_sub5_sub1.anInt11916 * -440313344 + class649_sub1_sub5_sub1.method10874() * 256);
		int i_5_ = (class649_sub1_sub5_sub1.anInt11919 * -84446720 + class649_sub1_sub5_sub1.method10874() * 256);
		int i_6_ = Class54.method944(i_4_, i_5_, (class649_sub1_sub5_sub1.anInt11921 * -1428852859), 2032484701);
		Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
		class649_sub1_sub5_sub1.method7842((float) ((i_4_ - (int) class436.aFloat4850) / i_3_ + (int) class436.aFloat4850), (float) ((int) class436.aFloat4852 + (i_6_ - (int) class436.aFloat4852) / i_3_), (float) ((i_5_ - (int) class436.aFloat4853) / i_3_ + (int) class436.aFloat4853));
		class649_sub1_sub5_sub1.anInt11915 = 0;
		class649_sub1_sub5_sub1.method10867((class649_sub1_sub5_sub1.anInt11952 * 308541641));
	}

	static final void method2871(Class668 class668, byte i) {
		if ((Class683.aClass301_Sub1_8651.method4054(-1851843307) != Class290.aClass290_3220) || (Class683.aClass301_Sub1_8651.method4062(94762380) != Class300.aClass300_3360))
			throw new RuntimeException();
		Class436 class436 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221)).method9177((byte) 8);
		Class436 class436_7_ = ((Class706_Sub2) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10257(-73725721);
		Class436 class436_8_ = Class436.method5240(class436);
		class436_8_.method5251(class436_7_);
		float f = Class205_Sub10.method9066(class436_8_.aFloat4850, class436_8_.aFloat4853, 791532731);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) ((double) f * 2607.5945876176133) & 0x3fff;
	}
}
