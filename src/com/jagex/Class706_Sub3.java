/* Class706_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub3 extends Class706 {
	static int anInt10941;
	Class425 aClass425_10942;
	static int anInt10943;
	static float aFloat10944;
	static int anInt10945 = 0;
	static int anInt10946;
	static float aFloat10947;
	static float aFloat10948;
	Class425 aClass425_10949 = new Class425();
	static float aFloat10950;
	static float aFloat10951;
	static float aFloat10952;

	public void method8286(float f, int i) {
		Class425 class425 = method10288(-284925774);
		if (1199196245 * anInt10945 != 0 || 0 != anInt10941 * 589954905) {
			Class425 class425_0_ = Class425.method5081();
			class425_0_.method5090(1.0F, 0.0F, 0.0F, ((float) ((double) (anInt10945 * 1199196245) * 3.141592653589793 * 2.0) / 16384.0F));
			class425.method5096(class425_0_);
			Class436 class436 = Class436.method5257(0.0F, 1.0F, 0.0F);
			class436.method5263(class425);
			Class425 class425_1_ = Class425.method5081();
			class436.method5247();
			class425_1_.method5115(class436, ((float) ((double) (anInt10941 * 589954905) * 3.141592653589793 * 2.0) / 16384.0F));
			class425.method5096(class425_1_);
			method10279(class425, 1872770809);
			anInt10945 = 0;
			anInt10941 = 0;
		}
		if (aClass301_8821.method4054(2028450217) == Class290.aClass290_3222 && (0 != anInt10943 * 1186491859 || 1840417463 * anInt10946 != 0)) {
			class425.method5091();
			Class333_Sub1 class333_sub1 = (Class333_Sub1) aClass301_8821.method4051(826143221);
			Class536_Sub30 class536_sub30 = class333_sub1.method4353(-2001435189);
			Class436 class436 = class536_sub30.method9629(-965238377);
			Class436 class436_2_ = Class436.method5257(0.0F, 0.0F, (float) (anInt10946 * 1840417463));
			class436_2_.method5263(class425);
			class436_2_.aFloat4852 *= -1.0F;
			class436.method5248(class436_2_);
			Class436 class436_3_ = Class436.method5257((float) (anInt10943 * 1186491859), 0.0F, 0.0F);
			class436_3_.method5263(class425);
			class436_3_.aFloat4852 *= -1.0F;
			class436.method5248(class436_3_);
			method10297(class436, -910853859);
			class333_sub1.method9160(new Class536_Sub30(700896725 * class536_sub30.anInt10565, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853), -225966028);
			anInt10943 = 0;
			anInt10946 = 0;
		}
	}

	public void method10279(Class425 class425, int i) {
		aClass425_10942.aFloat4796 = class425.aFloat4796;
		aClass425_10942.aFloat4793 = class425.aFloat4793;
		aClass425_10942.aFloat4798 = class425.aFloat4798;
		aClass425_10942.aFloat4799 = class425.aFloat4799;
		aClass425_10949.method5087(aClass425_10942);
	}

	public Class436 method8281() {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10942));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public void method10280(int i, int i_4_) {
		anInt10941 = i * 654334185;
	}

	public void method10281(int i, int i_5_) {
		anInt10946 = 480408327 * i;
	}

	public Class436 method8279(int i) {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10949));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public void method10282(int i, int i_6_, int i_7_, byte i_8_) {
		Class433 class433 = new Class433();
		class433.method5194(0.0, 0.0, 0.0, (double) i, (double) -i_6_, (double) i_7_, 0.0F, 1.0F, 0.0F);
		Class424 class424 = new Class424();
		class433.method5201(class424.aFloatArray4792);
		Class425 class425 = class424.method5077();
		class425.method5091();
		aClass425_10949.method5087(class425);
	}

	public void method10283(int i) {
		anInt10943 = -1414303141 * i;
	}

	public Class436 method8289() {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10949));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public void method10284(Class436 class436, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, short i_14_) {
		aFloat10947 = -1 == i ? -1.0F : class436.aFloat4850 - (float) (512 * i);
		aFloat10948 = i_9_ == -1 ? -1.0F : (float) (512 * i_9_) + class436.aFloat4850;
		aFloat10944 = -1 == i_12_ ? -1.0F : -class436.aFloat4852 - (float) (512 * i_12_);
		aFloat10950 = -1 == i_13_ ? -1.0F : -class436.aFloat4852 + (float) (512 * i_13_);
		aFloat10951 = i_10_ == -1 ? -1.0F : class436.aFloat4853 - (float) (512 * i_10_);
		aFloat10952 = (i_11_ == -1 ? -1.0F : (float) (512 * i_11_) + class436.aFloat4853);
	}

	public boolean method8295(byte i) {
		return (!Float.isNaN(aClass425_10949.aFloat4796) && aClass301_8821.method4055((byte) 5) != null);
	}

	public Class706_Sub3(Class301 class301) {
		super(class301);
		aClass425_10942 = new Class425(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
	}

	public void method8278(Class305 class305, Class433 class433, int i, int i_15_, float f, int i_16_) {
		Class436 class436 = Class436.method5240(aClass301_8821.method4055((byte) 5));
		class436.aFloat4850 -= (float) i;
		class436.aFloat4853 -= (float) i_15_;
		class436.aFloat4852 *= -1.0F;
		class433.method5198(Class425.method5120(aClass425_10949));
		class433.method5222(class436);
		class433.method5209();
		class436.method5239();
	}

	public void method8277(RSByteBuffer class536_sub33, int i) {
		aClass425_10949.method5085(class536_sub33);
	}

	static {
		anInt10941 = 0;
		anInt10943 = 0;
		anInt10946 = 0;
		aFloat10947 = -1.0F;
		aFloat10948 = -1.0F;
		aFloat10944 = -1.0F;
		aFloat10950 = -1.0F;
		aFloat10951 = -1.0F;
		aFloat10952 = -1.0F;
	}

	public void method8283(float f) {
		Class425 class425 = method10288(-1185278220);
		if (1199196245 * anInt10945 != 0 || 0 != anInt10941 * 589954905) {
			Class425 class425_17_ = Class425.method5081();
			class425_17_.method5090(1.0F, 0.0F, 0.0F, (float) ((double) (anInt10945 * 1199196245) * 3.141592653589793 * 2.0) / 16384.0F);
			class425.method5096(class425_17_);
			Class436 class436 = Class436.method5257(0.0F, 1.0F, 0.0F);
			class436.method5263(class425);
			Class425 class425_18_ = Class425.method5081();
			class436.method5247();
			class425_18_.method5115(class436, ((float) ((double) (anInt10941 * 589954905) * 3.141592653589793 * 2.0) / 16384.0F));
			class425.method5096(class425_18_);
			method10279(class425, 1529467658);
			anInt10945 = 0;
			anInt10941 = 0;
		}
		if (aClass301_8821.method4054(-1248899825) == Class290.aClass290_3222 && (0 != anInt10943 * 1186491859 || 1840417463 * anInt10946 != 0)) {
			class425.method5091();
			Class333_Sub1 class333_sub1 = (Class333_Sub1) aClass301_8821.method4051(826143221);
			Class536_Sub30 class536_sub30 = class333_sub1.method4353(-1855938437);
			Class436 class436 = class536_sub30.method9629(937893631);
			Class436 class436_19_ = Class436.method5257(0.0F, 0.0F, (float) (anInt10946 * 1840417463));
			class436_19_.method5263(class425);
			class436_19_.aFloat4852 *= -1.0F;
			class436.method5248(class436_19_);
			Class436 class436_20_ = Class436.method5257((float) (anInt10943 * 1186491859), 0.0F, 0.0F);
			class436_20_.method5263(class425);
			class436_20_.aFloat4852 *= -1.0F;
			class436.method5248(class436_20_);
			method10297(class436, -910853859);
			class333_sub1.method9160(new Class536_Sub30(700896725 * class536_sub30.anInt10565, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853), 2030807592);
			anInt10943 = 0;
			anInt10946 = 0;
		}
	}

	public void method8284(float f) {
		Class425 class425 = method10288(-1893134874);
		if (1199196245 * anInt10945 != 0 || 0 != anInt10941 * 589954905) {
			Class425 class425_21_ = Class425.method5081();
			class425_21_.method5090(1.0F, 0.0F, 0.0F, (float) ((double) (anInt10945 * 1199196245) * 3.141592653589793 * 2.0) / 16384.0F);
			class425.method5096(class425_21_);
			Class436 class436 = Class436.method5257(0.0F, 1.0F, 0.0F);
			class436.method5263(class425);
			Class425 class425_22_ = Class425.method5081();
			class436.method5247();
			class425_22_.method5115(class436, ((float) ((double) (anInt10941 * 589954905) * 3.141592653589793 * 2.0) / 16384.0F));
			class425.method5096(class425_22_);
			method10279(class425, 1341462656);
			anInt10945 = 0;
			anInt10941 = 0;
		}
		if (aClass301_8821.method4054(-1881324084) == Class290.aClass290_3222 && (0 != anInt10943 * 1186491859 || 1840417463 * anInt10946 != 0)) {
			class425.method5091();
			Class333_Sub1 class333_sub1 = (Class333_Sub1) aClass301_8821.method4051(826143221);
			Class536_Sub30 class536_sub30 = class333_sub1.method4353(-1469214444);
			Class436 class436 = class536_sub30.method9629(-16319180);
			Class436 class436_23_ = Class436.method5257(0.0F, 0.0F, (float) (anInt10946 * 1840417463));
			class436_23_.method5263(class425);
			class436_23_.aFloat4852 *= -1.0F;
			class436.method5248(class436_23_);
			Class436 class436_24_ = Class436.method5257((float) (anInt10943 * 1186491859), 0.0F, 0.0F);
			class436_24_.method5263(class425);
			class436_24_.aFloat4852 *= -1.0F;
			class436.method5248(class436_24_);
			method10297(class436, -910853859);
			class333_sub1.method9160(new Class536_Sub30(700896725 * class536_sub30.anInt10565, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853), -161531700);
			anInt10943 = 0;
			anInt10946 = 0;
		}
	}

	public boolean method8285() {
		return (!Float.isNaN(aClass425_10949.aFloat4796) && aClass301_8821.method4055((byte) 5) != null);
	}

	public boolean method8282() {
		return (!Float.isNaN(aClass425_10949.aFloat4796) && aClass301_8821.method4055((byte) 5) != null);
	}

	public void method8287(Class305 class305, Class433 class433, int i, int i_25_, float f) {
		Class436 class436 = Class436.method5240(aClass301_8821.method4055((byte) 5));
		class436.aFloat4850 -= (float) i;
		class436.aFloat4853 -= (float) i_25_;
		class436.aFloat4852 *= -1.0F;
		class433.method5198(Class425.method5120(aClass425_10949));
		class433.method5222(class436);
		class433.method5209();
		class436.method5239();
	}

	public Class436 method8288() {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10949));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public void method10285(int i, int i_26_) {
		anInt10945 = i * 98596093;
	}

	public Class436 method8290() {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10942));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public Class436 method8291() {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10942));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public Class436 method8292() {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10942));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public void method10286(int i, int i_27_, int i_28_) {
		Class433 class433 = new Class433();
		class433.method5194(0.0, 0.0, 0.0, (double) i, (double) -i_27_, (double) i_28_, 0.0F, 1.0F, 0.0F);
		Class424 class424 = new Class424();
		class433.method5201(class424.aFloatArray4792);
		Class425 class425 = class424.method5077();
		class425.method5091();
		aClass425_10949.method5087(class425);
	}

	public void method10287(Class425 class425) {
		aClass425_10942.aFloat4796 = class425.aFloat4796;
		aClass425_10942.aFloat4793 = class425.aFloat4793;
		aClass425_10942.aFloat4798 = class425.aFloat4798;
		aClass425_10942.aFloat4799 = class425.aFloat4799;
		aClass425_10949.method5087(aClass425_10942);
	}

	public void method8280(RSByteBuffer class536_sub33) {
		aClass425_10949.method5085(class536_sub33);
	}

	public Class425 method10288(int i) {
		return new Class425(aClass425_10949);
	}

	public void method8294(RSByteBuffer class536_sub33) {
		aClass425_10949.method5085(class536_sub33);
	}

	public Class436 method8293(int i) {
		Class436 class436 = new Class436(0.0F, 0.0F, 1000.0F);
		class436.method5263(Class425.method5120(aClass425_10942));
		class436.aFloat4852 *= -1.0F;
		class436.method5248(aClass301_8821.method4055((byte) 5));
		return class436;
	}

	public void method10289(int i) {
		anInt10941 = i * 654334185;
	}

	public void method10290(int i, int i_29_) {
		anInt10943 = -1414303141 * i;
	}

	public void method10291(int i) {
		anInt10941 = i * 654334185;
	}

	public void method10292(int i, int i_30_, int i_31_) {
		Class433 class433 = new Class433();
		class433.method5194(0.0, 0.0, 0.0, (double) i, (double) -i_30_, (double) i_31_, 0.0F, 1.0F, 0.0F);
		Class424 class424 = new Class424();
		class433.method5201(class424.aFloatArray4792);
		Class425 class425 = class424.method5077();
		class425.method5091();
		aClass425_10949.method5087(class425);
	}

	public void method10293(int i, int i_32_, int i_33_) {
		Class433 class433 = new Class433();
		class433.method5194(0.0, 0.0, 0.0, (double) i, (double) -i_32_, (double) i_33_, 0.0F, 1.0F, 0.0F);
		Class424 class424 = new Class424();
		class433.method5201(class424.aFloatArray4792);
		Class425 class425 = class424.method5077();
		class425.method5091();
		aClass425_10949.method5087(class425);
	}

	public void method10294(int i) {
		anInt10943 = -1414303141 * i;
	}

	public void method10295(int i) {
		anInt10941 = i * 654334185;
	}

	public void method10296(int i) {
		anInt10945 = i * 98596093;
	}

	void method10297(Class436 class436, int i) {
		if (aFloat10947 != -1.0F && class436.aFloat4850 < aFloat10947)
			class436.aFloat4850 = aFloat10947;
		if (-1.0F != aFloat10948 && class436.aFloat4850 > aFloat10948)
			class436.aFloat4850 = aFloat10948;
		if (aFloat10944 != -1.0F && class436.aFloat4852 < aFloat10944)
			class436.aFloat4852 = aFloat10944;
		if (aFloat10950 != -1.0F && class436.aFloat4852 > aFloat10950)
			class436.aFloat4852 = aFloat10950;
		if (-1.0F != aFloat10951 && class436.aFloat4853 < aFloat10951)
			class436.aFloat4853 = aFloat10951;
		if (-1.0F != aFloat10952 && class436.aFloat4853 > aFloat10952)
			class436.aFloat4853 = aFloat10952;
	}
}
