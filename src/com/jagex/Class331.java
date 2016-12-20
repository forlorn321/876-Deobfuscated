/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class331 implements Interface33 {
	Class459 aClass459_3610;
	Class459 aClass459_3611;
	Class389 aClass389_3612;
	long aLong3613;
	int anInt3614;
	Class174 aClass174_3615;

	public void method205(byte i) {
		Class22 class22 = Class581.method9666(aClass459_3611, aClass389_3612.anInt3998 * -1063745743, Class211.aClass420_2256, (byte) -34);
		aClass174_3615 = (Class402.aClass180_4150.method3170(class22, Class165.method2656(aClass459_3610, -1063745743 * aClass389_3612.anInt3998), true));
	}

	public void method203(boolean bool, int i) {
		int i_0_ = ((aClass389_3612.aClass400_3991.method6525(aClass389_3612.anInt3995 * -236249659, -1844600635 * client.anInt11158, -1173855569)) + -1339829793 * aClass389_3612.anInt3993);
		int i_1_ = ((aClass389_3612.aClass384_3994.method6413(aClass389_3612.anInt3996 * 1859543809, client.anInt11058 * 1254981347, -643016298)) + aClass389_3612.anInt3992 * -827519441);
		method5819(bool, i_0_, i_1_, -670899495);
		method5822(bool, i_0_, i_1_, (short) 1259);
		String string = Class290.aClass300_3229.method5532(-1343555547);
		if ((Class234.method4347(-1408626088) - -8802697667658423339L * aLong3613) > 10000L)
			string = new StringBuilder().append(string).append(" (").append((Class290.aClass300_3229.method5535(-1354656333).anInt3485) * -1481142029).append(")").toString();
		aClass174_3615.method2745(string, i_0_ + -236249659 * aClass389_3612.anInt3995 / 2, (4 + (1859543809 * aClass389_3612.anInt3996 / 2 + i_1_) + 449413251 * aClass389_3612.anInt3997), aClass389_3612.anInt3999 * 1002599463, -1, 1348145444);
	}

	abstract void method5819(boolean bool, int i, int i_2_, int i_3_);

	public boolean method204(int i) {
		boolean bool = true;
		if (!aClass459_3610.method7480(-1063745743 * aClass389_3612.anInt3998, 1278031255))
			bool = false;
		if (!aClass459_3611.method7480(aClass389_3612.anInt3998 * -1063745743, -1538557494))
			bool = false;
		return bool;
	}

	abstract void method5820(boolean bool, int i, int i_4_);

	Class331(Class459 class459, Class459 class459_5_, Class389 class389) {
		aClass459_3610 = class459;
		aClass459_3611 = class459_5_;
		aClass389_3612 = class389;
	}

	int method5821(byte i) {
		int i_6_ = Class290.aClass300_3229.method5541(49672619);
		int i_7_ = i_6_ * 100;
		if (i_6_ == anInt3614 * 32487551 && i_6_ != 0) {
			int i_8_ = Class290.aClass300_3229.method5530(1343445419);
			if (i_8_ > i_6_) {
				long l = (-8802697667658423339L * aLong3613 - Class290.aClass300_3229.method5557((short) -17491));
				if (l > 0L) {
					long l_9_ = (long) (i_8_ - i_6_) * (l * 10000L / (long) i_6_);
					long l_10_ = ((Class234.method4347(-1408626088) - -8802697667658423339L * aLong3613) * 10000L);
					if (l_10_ < l_9_)
						i_7_ = (int) ((long) (i_8_ - i_6_) * l_10_ * 100L / l_9_ + (long) (100 * i_6_));
					else
						i_7_ = 100 * i_8_;
				}
			}
		} else {
			anInt3614 = i_6_ * -1074264193;
			aLong3613 = Class234.method4347(-1408626088) * 2326375269531172221L;
		}
		return i_7_;
	}

	public void method206(boolean bool) {
		int i = ((aClass389_3612.aClass400_3991.method6525(aClass389_3612.anInt3995 * -236249659, -1844600635 * client.anInt11158, -1173855569)) + -1339829793 * aClass389_3612.anInt3993);
		int i_11_ = ((aClass389_3612.aClass384_3994.method6413(aClass389_3612.anInt3996 * 1859543809, client.anInt11058 * 1254981347, 452166009)) + aClass389_3612.anInt3992 * -827519441);
		method5819(bool, i, i_11_, 1604549341);
		method5822(bool, i, i_11_, (short) 1259);
		String string = Class290.aClass300_3229.method5532(-524651761);
		if ((Class234.method4347(-1408626088) - -8802697667658423339L * aLong3613) > 10000L)
			string = new StringBuilder().append(string).append(" (").append((Class290.aClass300_3229.method5535(-1354656333).anInt3485) * -1481142029).append(")").toString();
		aClass174_3615.method2745(string, i + -236249659 * aClass389_3612.anInt3995 / 2, (4 + (1859543809 * aClass389_3612.anInt3996 / 2 + i_11_) + 449413251 * aClass389_3612.anInt3997), aClass389_3612.anInt3999 * 1002599463, -1, 1348145444);
	}

	public void method85() {
		Class22 class22 = Class581.method9666(aClass459_3611, aClass389_3612.anInt3998 * -1063745743, Class211.aClass420_2256, (byte) 39);
		aClass174_3615 = (Class402.aClass180_4150.method3170(class22, Class165.method2656(aClass459_3610, -1063745743 * aClass389_3612.anInt3998), true));
	}

	abstract void method5822(boolean bool, int i, int i_12_, short i_13_);

	public boolean method208() {
		boolean bool = true;
		if (!aClass459_3610.method7480(-1063745743 * aClass389_3612.anInt3998, -824113721))
			bool = false;
		if (!aClass459_3611.method7480(aClass389_3612.anInt3998 * -1063745743, -1635885412))
			bool = false;
		return bool;
	}

	public boolean method207() {
		boolean bool = true;
		if (!aClass459_3610.method7480(-1063745743 * aClass389_3612.anInt3998, 187336309))
			bool = false;
		if (!aClass459_3611.method7480(aClass389_3612.anInt3998 * -1063745743, -1070179395))
			bool = false;
		return bool;
	}

	abstract void method5823(boolean bool, int i, int i_14_);

	abstract void method5824(boolean bool, int i, int i_15_);

	abstract void method5825(boolean bool, int i, int i_16_);

	abstract void method5826(boolean bool, int i, int i_17_);

	int method5827() {
		int i = Class290.aClass300_3229.method5541(49672619);
		int i_18_ = i * 100;
		if (i == anInt3614 * 32487551 && i != 0) {
			int i_19_ = Class290.aClass300_3229.method5530(747540225);
			if (i_19_ > i) {
				long l = (-8802697667658423339L * aLong3613 - Class290.aClass300_3229.method5557((short) -20537));
				if (l > 0L) {
					long l_20_ = (long) (i_19_ - i) * (l * 10000L / (long) i);
					long l_21_ = ((Class234.method4347(-1408626088) - -8802697667658423339L * aLong3613) * 10000L);
					if (l_21_ < l_20_)
						i_18_ = (int) ((long) (i_19_ - i) * l_21_ * 100L / l_20_ + (long) (100 * i));
					else
						i_18_ = 100 * i_19_;
				}
			}
		} else {
			anInt3614 = i * -1074264193;
			aLong3613 = Class234.method4347(-1408626088) * 2326375269531172221L;
		}
		return i_18_;
	}

	int method5828() {
		int i = Class290.aClass300_3229.method5541(49672619);
		int i_22_ = i * 100;
		if (i == anInt3614 * 32487551 && i != 0) {
			int i_23_ = Class290.aClass300_3229.method5530(-1071906120);
			if (i_23_ > i) {
				long l = (-8802697667658423339L * aLong3613 - Class290.aClass300_3229.method5557((short) -5108));
				if (l > 0L) {
					long l_24_ = (long) (i_23_ - i) * (l * 10000L / (long) i);
					long l_25_ = ((Class234.method4347(-1408626088) - -8802697667658423339L * aLong3613) * 10000L);
					if (l_25_ < l_24_)
						i_22_ = (int) ((long) (i_23_ - i) * l_25_ * 100L / l_24_ + (long) (100 * i));
					else
						i_22_ = 100 * i_23_;
				}
			}
		} else {
			anInt3614 = i * -1074264193;
			aLong3613 = Class234.method4347(-1408626088) * 2326375269531172221L;
		}
		return i_22_;
	}

	static final void method5829(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		String string_26_ = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4488, client.aClass109_11066.aClass2_1367, (byte) -20);
		class527_sub15.buffer.writeShort((Class208_Sub18.method15632(string, (byte) -128) + Class208_Sub18.method15632(string_26_, (byte) -89)), 1404835786);
		class527_sub15.buffer.writeString(string, 968161255);
		class527_sub15.buffer.writeString(string_26_, -1016899476);
		client.aClass109_11066.method1969(class527_sub15, (byte) 1);
	}

	public static int method5830(int i, int i_27_, int i_28_, boolean bool, int i_29_) {
		Class333 class333 = ((Class333) Class51.aClass24_Sub16_522.method81(i_28_, -1734253297));
		Class160 class160 = class333.aClass160_3626;
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 20);
		int i_30_;
		if (null == class527_sub1 || i_27_ < 0 || i_27_ >= class527_sub1.anIntArray10330.length || null == class527_sub1.aClass18Array10335 || null == class527_sub1.aClass18Array10335[i_27_])
			i_30_ = ((Integer) class160.method2577((byte) 1)).intValue();
		else
			i_30_ = class527_sub1.aClass18Array10335[i_27_].method21(class160.anInt1746 * 727971013, (byte) -26);
		return class333.method5839(i_30_, (byte) 3);
	}
}
