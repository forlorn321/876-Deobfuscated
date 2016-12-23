/* Class583 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class583 {
	static Class583 aClass583_7701;
	int anInt7702;
	static Class583 aClass583_7703;
	static Class583 aClass583_7704 = new Class583(0);

	static {
		aClass583_7701 = new Class583(1);
		aClass583_7703 = new Class583(2);
	}

	Class583(int i) {
		anInt7702 = i * 1911969733;
	}

	static final void method7026(Class668 class668, int i) {
		Class536_Sub30 class536_sub30 = ((Class536_Sub30) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]));
		if (Class683.aClass301_Sub1_8651.method4062(-1288106910) != Class300.aClass300_3355)
			throw new RuntimeException();
		Class706_Sub1 class706_sub1 = ((Class706_Sub1) Class683.aClass301_Sub1_8651.method4052(-810172525));
		class706_sub1.method10137(class536_sub30, 1654730976);
		client.aBool11242 = true;
	}

	static RSByteBuffer method7027(int i) {
		RSByteBuffer class536_sub33 = Class458_Sub3.method9358((byte) -43);
		long l;
		if (-1 != 1234839363 * Class61.anInt648)
			l = (long) (Class61.anInt648 * 1234839363);
		else if (Class61.aLong649 * -7692785137277514277L == -1L)
			l = Class30.method780(Class61.aString679, (byte) -12);
		else
			l = Class61.aLong649 * -7692785137277514277L;
		Class450.aLong4943 = l * -1074143907366248879L;
		Class655.method7938(class536_sub33, l);
		class536_sub33.writeString(Class61.aString696);
		class536_sub33.writeLong(Class61.aLong644 * 4393163627905998863L);
		class536_sub33.writeLong(6862939200387171825L * client.aLong11025);
		class536_sub33.applyRSA(Class72.LOGIN_PUBLIC_EXPONENT, Class72.LOGIN_PUBLIC_MODULUS, -988574007);
		return class536_sub33;
	}

	static final void method7028(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, boolean bool, int i) {
		int i_0_ = Class680.aClass680_8643.aByte8644;
		int i_1_ = 0;
		if (class649_sub1_sub5_sub1.anInt11923 * 1080012231 > client.anInt11014)
			Class197.method2870(class649_sub1_sub5_sub1, -854822387);
		else if (class649_sub1_sub5_sub1.anInt11924 * -327061215 >= client.anInt11014)
			Class189.method2814(class649_sub1_sub5_sub1, (short) -16640);
		else {
			Class609.method7267(class649_sub1_sub5_sub1, bool, 653292690);
			i_0_ = Class489.anInt5465 * -2066703787;
			i_1_ = 1866061237 * Class207.anInt2243;
		}
		Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
		if ((int) class436.aFloat4850 < 512 || (int) class436.aFloat4853 < 512 || ((int) class436.aFloat4850 >= (client.aClass515_11066.method6321((byte) -22) - 1) * 512) || ((int) class436.aFloat4853 >= (client.aClass515_11066.method6243(177401017) - 1) * 512)) {
			class649_sub1_sub5_sub1.aClass688_11925.method8122(-1, -962933598);
			for (int i_2_ = 0; i_2_ < class649_sub1_sub5_sub1.aClass500Array11901.length; i_2_++) {
				class649_sub1_sub5_sub1.aClass500Array11901[i_2_].anInt6839 = -1673100765;
				class649_sub1_sub5_sub1.aClass500Array11901[i_2_].aClass688_6843.method8122(-1, -1043946008);
			}
			class649_sub1_sub5_sub1.anIntArray11913 = null;
			class649_sub1_sub5_sub1.anInt11923 = 0;
			class649_sub1_sub5_sub1.anInt11924 = 0;
			i_0_ = Class680.aClass680_8643.aByte8644;
			i_1_ = 0;
			class649_sub1_sub5_sub1.method7842((float) (class649_sub1_sub5_sub1.anIntArray11944[0] * 512 + (class649_sub1_sub5_sub1.method10874(1355242333) * 256)), class436.aFloat4852, (float) (class649_sub1_sub5_sub1.anIntArray11945[0] * 512 + (class649_sub1_sub5_sub1.method10874(1355242333) * 256)));
			class649_sub1_sub5_sub1.method10870(-1003451901);
		}
		if ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == class649_sub1_sub5_sub1) && ((int) class436.aFloat4850 < 6144 || (int) class436.aFloat4853 < 6144 || ((int) class436.aFloat4850 >= ((client.aClass515_11066.method6321((byte) -45) - 12) * 512)) || ((int) class436.aFloat4853 >= ((client.aClass515_11066.method6243(177401017) - 12) * 512)))) {
			class649_sub1_sub5_sub1.aClass688_11925.method8122(-1, -2033290885);
			for (int i_3_ = 0; i_3_ < class649_sub1_sub5_sub1.aClass500Array11901.length; i_3_++) {
				class649_sub1_sub5_sub1.aClass500Array11901[i_3_].anInt6839 = -1673100765;
				class649_sub1_sub5_sub1.aClass500Array11901[i_3_].aClass688_6843.method8122(-1, -876141525);
			}
			class649_sub1_sub5_sub1.anIntArray11913 = null;
			class649_sub1_sub5_sub1.anInt11923 = 0;
			class649_sub1_sub5_sub1.anInt11924 = 0;
			i_0_ = Class680.aClass680_8643.aByte8644;
			i_1_ = 0;
			class649_sub1_sub5_sub1.method7842((float) (512 * class649_sub1_sub5_sub1.anIntArray11944[0] + (class649_sub1_sub5_sub1.method10874(1355242333) * 256)), class436.aFloat4852, (float) (class649_sub1_sub5_sub1.anIntArray11945[0] * 512 + (class649_sub1_sub5_sub1.method10874(1355242333) * 256)));
			class649_sub1_sub5_sub1.method10870(-1663755729);
		}
		int i_4_ = IncomingPacket.method5073(class649_sub1_sub5_sub1, -739996926);
		Class305.method4108(class649_sub1_sub5_sub1, -953349292);
		Class633.method7546(class649_sub1_sub5_sub1, i_0_, i_1_, i_4_, -1680764195);
		Class611.method7278(class649_sub1_sub5_sub1, i_0_, 1334829212);
		Class521_Sub2.method9341(class649_sub1_sub5_sub1, (byte) 91);
		Class425 class425 = Class425.method5081();
		class425.method5088(Class447.method5400(class649_sub1_sub5_sub1.aClass62_11940.method1047((byte) 16)), Class447.method5400(class649_sub1_sub5_sub1.aClass62_11942.method1047((byte) 16)), Class447.method5400(class649_sub1_sub5_sub1.aClass62_11902.method1047((byte) 16)));
		class649_sub1_sub5_sub1.method7840(class425);
		class425.method5080();
	}

	static final void method7029(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_6_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class683.aClass301_Sub1_8651.method4043((float) i_5_, (float) i_6_, -746805273);
	}
}
