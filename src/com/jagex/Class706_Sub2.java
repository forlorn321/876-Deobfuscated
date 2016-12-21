/* Class706_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub2 extends Class706 {
	Interface31 anInterface31_10927;
	Class436 aClass436_10928 = new Class436();
	Class436 aClass436_10929;
	Class436 aClass436_10930 = new Class436(Float.NaN, Float.NaN, Float.NaN);
	boolean aBool10931;
	Class436 aClass436_10932;

	public Class436 method8293(int i) {
		Class436 class436 = Class436.method5240(aClass436_10929);
		Class436 class436_0_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_0_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_0_);
		class436_0_.method5239();
		return class436;
	}

	public void method10255(Interface31 interface31, Class436 class436, boolean bool, int i) {
		anInterface31_10927 = interface31;
		aClass436_10928.method5272(class436);
		aBool10931 = bool;
		interface31.method190(-786642596);
	}

	public Class436 method8291() {
		Class436 class436 = Class436.method5240(aClass436_10929);
		Class436 class436_1_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_1_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_1_);
		class436_1_.method5239();
		return class436;
	}

	public void method10256() {
		if (null != anInterface31_10927)
			anInterface31_10927 = (aClass301_8821.method4080(1814987689).method205(anInterface31_10927.method192(-542468866), anInterface31_10927.method199((short) 20707), 1796388688));
	}

	public Class436 method8292() {
		Class436 class436 = Class436.method5240(aClass436_10929);
		Class436 class436_2_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_2_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_2_);
		class436_2_.method5239();
		return class436;
	}

	public void method8278(Class305 class305, Class433 class433, int i, int i_3_, float f, int i_4_) {
		Class436 class436 = Class436.method5240(aClass301_8821.method4055((byte) 5));
		class436.aFloat4850 -= (float) i;
		class436.aFloat4853 -= (float) i_3_;
		class436.aFloat4852 *= -1.0F;
		Class436 class436_5_ = method8279(459796660);
		class436_5_.aFloat4850 -= (float) i;
		class436_5_.aFloat4853 -= (float) i_3_;
		class436_5_.aFloat4852 *= -1.0F;
		class433.method5194((double) class436.aFloat4850, (double) class436.aFloat4852, (double) class436.aFloat4853, (double) class436_5_.aFloat4850, (double) class436_5_.aFloat4852, (double) class436_5_.aFloat4853, 0.0F, 1.0F, 0.0F);
		class436.method5239();
		class436_5_.method5239();
	}

	public Class436 method8279(int i) {
		Class436 class436 = Class436.method5240(aClass436_10930);
		Class436 class436_6_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_6_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_6_);
		class436_6_.method5239();
		return class436;
	}

	public void method8286(float f, int i) {
		if (null != anInterface31_10927) {
			aClass436_10929.method5272(anInterface31_10927.method190(1647445927).method9629(613515749));
			aClass301_8821.method4053(false, f, aClass436_10930, aClass301_8821.method4061(-77115883), aClass436_10929, aClass436_10932, -186929622);
		}
	}

	public Class436 method10257(int i) {
		return aClass436_10930;
	}

	public void method8277(RSByteBuffer class536_sub33, int i) {
		Class308 class308 = Class441.method5332(class536_sub33.readUnsignedByte(-148363424), (byte) 16);
		int i_7_ = class536_sub33.readUnsignedShort((short) -11960);
		anInterface31_10927 = aClass301_8821.method4080(1839776536).method205(class308, i_7_, 1782280427);
		aClass436_10928.method5242(class536_sub33);
		if (class536_sub33.readUnsignedByte(1992402473) == 1)
			aBool10931 = true;
		else
			aBool10931 = false;
	}

	public void method8283(float f) {
		if (null != anInterface31_10927) {
			aClass436_10929.method5272(anInterface31_10927.method190(1890953531).method9629(399173851));
			aClass301_8821.method4053(false, f, aClass436_10930, aClass301_8821.method4061(-77115883), aClass436_10929, aClass436_10932, -1445016909);
		}
	}

	public void method8284(float f) {
		if (null != anInterface31_10927) {
			aClass436_10929.method5272(anInterface31_10927.method190(1555895848).method9629(1486370539));
			aClass301_8821.method4053(false, f, aClass436_10930, aClass301_8821.method4061(-77115883), aClass436_10929, aClass436_10932, -1366584923);
		}
	}

	public boolean method8285() {
		return !Float.isNaN(aClass436_10930.aFloat4850);
	}

	public boolean method8282() {
		return !Float.isNaN(aClass436_10930.aFloat4850);
	}

	public void method10258(int i) {
		if (null != anInterface31_10927)
			anInterface31_10927 = (aClass301_8821.method4080(-1866078793).method205(anInterface31_10927.method192(85636983), anInterface31_10927.method199((short) 17707), 1826804686));
	}

	public Class436 method8288() {
		Class436 class436 = Class436.method5240(aClass436_10930);
		Class436 class436_8_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_8_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_8_);
		class436_8_.method5239();
		return class436;
	}

	public Class436 method8289() {
		Class436 class436 = Class436.method5240(aClass436_10930);
		Class436 class436_9_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_9_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_9_);
		class436_9_.method5239();
		return class436;
	}

	public Class436 method8281() {
		Class436 class436 = Class436.method5240(aClass436_10929);
		Class436 class436_10_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_10_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_10_);
		class436_10_.method5239();
		return class436;
	}

	public Class706_Sub2(Class301 class301) {
		super(class301);
		aClass436_10929 = new Class436(Float.NaN, Float.NaN, Float.NaN);
		aClass436_10932 = new Class436();
	}

	public void method8280(RSByteBuffer class536_sub33) {
		Class308 class308 = Class441.method5332(class536_sub33.readUnsignedByte(-1821279536), (byte) 22);
		int i = class536_sub33.readUnsignedShort((short) -16895);
		anInterface31_10927 = aClass301_8821.method4080(-1465422324).method205(class308, i, 1276646006);
		aClass436_10928.method5242(class536_sub33);
		if (class536_sub33.readUnsignedByte(-133868121) == 1)
			aBool10931 = true;
		else
			aBool10931 = false;
	}

	public void method8294(RSByteBuffer class536_sub33) {
		Class308 class308 = Class441.method5332(class536_sub33.readUnsignedByte(-866340556), (byte) 21);
		int i = class536_sub33.readUnsignedShort((short) -14486);
		anInterface31_10927 = aClass301_8821.method4080(1887999867).method205(class308, i, 1971101544);
		aClass436_10928.method5242(class536_sub33);
		if (class536_sub33.readUnsignedByte(983051549) == 1)
			aBool10931 = true;
		else
			aBool10931 = false;
	}

	public void method8287(Class305 class305, Class433 class433, int i, int i_11_, float f) {
		Class436 class436 = Class436.method5240(aClass301_8821.method4055((byte) 5));
		class436.aFloat4850 -= (float) i;
		class436.aFloat4853 -= (float) i_11_;
		class436.aFloat4852 *= -1.0F;
		Class436 class436_12_ = method8279(459796660);
		class436_12_.aFloat4850 -= (float) i;
		class436_12_.aFloat4853 -= (float) i_11_;
		class436_12_.aFloat4852 *= -1.0F;
		class433.method5194((double) class436.aFloat4850, (double) class436.aFloat4852, (double) class436.aFloat4853, (double) class436_12_.aFloat4850, (double) class436_12_.aFloat4852, (double) class436_12_.aFloat4853, 0.0F, 1.0F, 0.0F);
		class436.method5239();
		class436_12_.method5239();
	}

	public boolean method8295(byte i) {
		return !Float.isNaN(aClass436_10930.aFloat4850);
	}

	public void method10259() {
		if (null != anInterface31_10927)
			anInterface31_10927 = (aClass301_8821.method4080(-535740733).method205(anInterface31_10927.method192(396616373), anInterface31_10927.method199((short) 27042), 1528777623));
	}

	public void method10260() {
		if (null != anInterface31_10927)
			anInterface31_10927 = (aClass301_8821.method4080(-2001054924).method205(anInterface31_10927.method192(467989860), anInterface31_10927.method199((short) 29175), 1516438372));
	}

	public void method10261() {
		if (null != anInterface31_10927)
			anInterface31_10927 = (aClass301_8821.method4080(-1193921722).method205(anInterface31_10927.method192(257497459), anInterface31_10927.method199((short) 18209), 1508363202));
	}

	public Class436 method8290() {
		Class436 class436 = Class436.method5240(aClass436_10929);
		Class436 class436_13_ = Class436.method5240(aClass436_10928);
		if (aBool10931)
			class436_13_.method5263(anInterface31_10927.method193((byte) 1));
		class436.method5248(class436_13_);
		class436_13_.method5239();
		return class436;
	}

	public static void method10262(byte i) {
		Class432.method5188(-816291493);
	}
}
