/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class292 implements Runnable {
	Class303 aClass303_3232;
	boolean aBool3233;
	Interface30 anInterface30_3234;
	volatile boolean aBool3235;
	long aLong3236;
	int anInt3237;
	long aLong3238;
	String aString3239;
	String aString3240;
	int anInt3241;
	Interface30 anInterface30_3242 = new Class306();
	public static int anInt3243;
	public static long aLong3244;
	static int anInt3245;

	int method3931(int i) {
		return -354297595 * anInt3237;
	}

	synchronized void method3932() {
		aBool3233 = true;
	}

	synchronized boolean method3933(int i) {
		return anInterface30_3242.method175(-1633045531321851775L * aLong3236);
	}

	synchronized void method3934(Interface30 interface30, int i) {
		anInterface30_3234 = anInterface30_3242;
		anInterface30_3242 = interface30;
		aLong3236 = Class249.method3450(1693639977) * 5631515777316855681L;
	}

	synchronized void method3935(long l, String string, String string_0_, int i, Class303 class303, int i_1_) {
		aLong3238 = 8677187914260377009L * l;
		aString3240 = string;
		aString3239 = string_0_;
		anInt3241 = i * 1211966861;
		aClass303_3232 = class303;
	}

	Class292() {
		anInterface30_3234 = null;
	}

	public String method3936(byte i) {
		return aString3239;
	}

	public int method3937(int i) {
		if (null == aClass303_3232)
			return 0;
		int i_2_ = -783382047 * aClass303_3232.anInt3425;
		if (aClass303_3232.aBool3427 && 1624614213 * anInt3241 < aClass303_3232.anInt3429 * -1375848401)
			return 1 + anInt3241 * 1624614213;
		if (i_2_ < 0 || i_2_ >= Class310.aClass303Array3467.length - 1)
			return 100;
		if (anInt3241 * 1624614213 == aClass303_3232.anInt3431 * -1949228175)
			return -1375848401 * aClass303_3232.anInt3429;
		return aClass303_3232.anInt3431 * -1949228175;
	}

	public long method3938() {
		return -4167224886854370479L * aLong3238;
	}

	public long method3939(int i) {
		return -4167224886854370479L * aLong3238;
	}

	public Class303 method3940(int i) {
		return aClass303_3232;
	}

	void method3941(short i) {
		aBool3235 = true;
	}

	synchronized void method3942(int i) {
		aBool3233 = true;
	}

	public int method3943() {
		if (null == aClass303_3232)
			return 0;
		int i = -783382047 * aClass303_3232.anInt3425;
		if (aClass303_3232.aBool3427 && 1624614213 * anInt3241 < aClass303_3232.anInt3429 * -1375848401)
			return 1 + anInt3241 * 1624614213;
		if (i < 0 || i >= Class310.aClass303Array3467.length - 1)
			return 100;
		if (anInt3241 * 1624614213 == aClass303_3232.anInt3431 * -1949228175)
			return -1375848401 * aClass303_3232.anInt3429;
		return aClass303_3232.anInt3431 * -1949228175;
	}

	public int method3944(int i) {
		return 1624614213 * anInt3241;
	}

	synchronized void method3945() {
		aBool3233 = true;
	}

	int method3946() {
		return -354297595 * anInt3237;
	}

	int method3947() {
		return -354297595 * anInt3237;
	}

	public void method3948() {
		while (!aBool3235) {
			long l = Class249.method3450(1326302172);
			synchronized (this) {
				try {
					anInt3237 += 1378487245;
					if (anInterface30_3242 instanceof Class306)
						anInterface30_3242.method188(aBool3233, (byte) 61);
					else {
						long l_3_ = Class249.method3450(2115602407);
						if (null != Class677.aClass167_8609 && null != anInterface30_3234 && anInterface30_3234.method173(-1798719505) != 0 && (-1633045531321851775L * aLong3236 >= (l_3_ - (long) anInterface30_3234.method173(-1293695142)))) {
							int i = (int) ((l_3_ - aLong3236 * -1633045531321851775L) * 255L / (long) anInterface30_3234.method173(-1399539178));
							int i_4_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_4_ = i_4_ << 24 | 0xffffff;
							Class477.method5751((byte) -107);
							Class677.aClass167_8609.method2000(1, 0);
							Class143 class143 = (Class677.aClass167_8609.method2276(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, true, -675301968));
							Class183_Sub2 class183_sub2 = Class677.aClass167_8609.method2304();
							class183_sub2.method9035(0, class143.method1782());
							Class677.aClass167_8609.method2028(class183_sub2, -409819235);
							anInterface30_3234.method188(true, (byte) 34);
							Class677.aClass167_8609.method2029(class183_sub2, (byte) 1);
							class143.method1729(0, 0, 0, i_4_, 1);
							Class677.aClass167_8609.method2028(class183_sub2, -409819235);
							Class677.aClass167_8609.method2000(1, 0);
							anInterface30_3242.method188(true, (byte) 46);
							Class677.aClass167_8609.method2029(class183_sub2, (byte) 1);
							class143.method1729(0, 0, 0, i, 1);
						} else {
							if (anInterface30_3234 != null) {
								aBool3233 = true;
								anInterface30_3234.method182(1981443792);
								anInterface30_3234 = null;
							}
							if (aBool3233) {
								Class477.method5751((byte) -38);
								if (null != Class677.aClass167_8609)
									Class677.aClass167_8609.method2000(1, 0);
							}
							anInterface30_3242.method188(aBool3233 || (Class677.aClass167_8609 != null && Class677.aClass167_8609.method2010()), (byte) 87);
						}
						try {
							if (Class677.aClass167_8609 != null && !(anInterface30_3242 instanceof Class306))
								Class677.aClass167_8609.method2002((byte) 73);
						} catch (Exception_Sub5 exception_sub5) {
							Class81.method1165(new StringBuilder().append(exception_sub5.getMessage()).append(Class313.aclient3500.method6092(490878200)).toString(), exception_sub5, (byte) -51);
							Class704.method8264(0, true, (byte) 34);
						}
					}
					aBool3233 = false;
					if (null != Class677.aClass167_8609 && !(anInterface30_3242 instanceof Class306) && (-783382047 * aClass303_3232.anInt3425 < Class303.aClass303_3422.anInt3425 * -783382047))
						Class205_Sub1.method9054(-803601661);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_5_ = Class249.method3450(2145471168);
			int i = (int) (20L - (l_5_ - l));
			if (i > 0)
				Class212.method3067((long) i);
		}
	}

	synchronized void method3949() {
		aBool3233 = true;
	}

	synchronized boolean method3950() {
		return anInterface30_3242.method175(-1633045531321851775L * aLong3236);
	}

	synchronized boolean method3951() {
		return anInterface30_3242.method175(-1633045531321851775L * aLong3236);
	}

	public String method3952(int i) {
		return aString3240;
	}

	synchronized boolean method3953() {
		return anInterface30_3242.method175(-1633045531321851775L * aLong3236);
	}

	synchronized boolean method3954() {
		return anInterface30_3242.method175(-1633045531321851775L * aLong3236);
	}

	public void run() {
		while (!aBool3235) {
			long l = Class249.method3450(1606799209);
			synchronized (this) {
				try {
					anInt3237 += 1378487245;
					if (anInterface30_3242 instanceof Class306)
						anInterface30_3242.method188(aBool3233, (byte) 8);
					else {
						long l_6_ = Class249.method3450(1613194567);
						if (null != Class677.aClass167_8609 && null != anInterface30_3234 && anInterface30_3234.method173(-2075429389) != 0 && (-1633045531321851775L * aLong3236 >= (l_6_ - (long) anInterface30_3234.method173(-1304627920)))) {
							int i = (int) ((l_6_ - aLong3236 * -1633045531321851775L) * 255L / (long) anInterface30_3234.method173(-1582215306));
							int i_7_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_7_ = i_7_ << 24 | 0xffffff;
							Class477.method5751((byte) -12);
							Class677.aClass167_8609.method2000(1, 0);
							Class143 class143 = (Class677.aClass167_8609.method2276(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, true, -1172746711));
							Class183_Sub2 class183_sub2 = Class677.aClass167_8609.method2304();
							class183_sub2.method9035(0, class143.method1782());
							Class677.aClass167_8609.method2028(class183_sub2, -409819235);
							anInterface30_3234.method188(true, (byte) 64);
							Class677.aClass167_8609.method2029(class183_sub2, (byte) 1);
							class143.method1729(0, 0, 0, i_7_, 1);
							Class677.aClass167_8609.method2028(class183_sub2, -409819235);
							Class677.aClass167_8609.method2000(1, 0);
							anInterface30_3242.method188(true, (byte) 112);
							Class677.aClass167_8609.method2029(class183_sub2, (byte) 1);
							class143.method1729(0, 0, 0, i, 1);
						} else {
							if (anInterface30_3234 != null) {
								aBool3233 = true;
								anInterface30_3234.method182(2107944387);
								anInterface30_3234 = null;
							}
							if (aBool3233) {
								Class477.method5751((byte) -119);
								if (null != Class677.aClass167_8609)
									Class677.aClass167_8609.method2000(1, 0);
							}
							anInterface30_3242.method188(aBool3233 || (Class677.aClass167_8609 != null && Class677.aClass167_8609.method2010()), (byte) 123);
						}
						try {
							if (Class677.aClass167_8609 != null && !(anInterface30_3242 instanceof Class306))
								Class677.aClass167_8609.method2002((byte) 51);
						} catch (Exception_Sub5 exception_sub5) {
							Class81.method1165(new StringBuilder().append(exception_sub5.getMessage()).append(Class313.aclient3500.method6092(736268227)).toString(), exception_sub5, (byte) 0);
							Class704.method8264(0, true, (byte) 41);
						}
					}
					aBool3233 = false;
					if (null != Class677.aClass167_8609 && !(anInterface30_3242 instanceof Class306) && (-783382047 * aClass303_3232.anInt3425 < Class303.aClass303_3422.anInt3425 * -783382047))
						Class205_Sub1.method9054(1240044306);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_8_ = Class249.method3450(1408441477);
			int i = (int) (20L - (l_8_ - l));
			if (i > 0)
				Class212.method3067((long) i);
		}
	}

	public int method3955() {
		if (null == aClass303_3232)
			return 0;
		int i = -783382047 * aClass303_3232.anInt3425;
		if (aClass303_3232.aBool3427 && 1624614213 * anInt3241 < aClass303_3232.anInt3429 * -1375848401)
			return 1 + anInt3241 * 1624614213;
		if (i < 0 || i >= Class310.aClass303Array3467.length - 1)
			return 100;
		if (anInt3241 * 1624614213 == aClass303_3232.anInt3431 * -1949228175)
			return -1375848401 * aClass303_3232.anInt3429;
		return aClass303_3232.anInt3431 * -1949228175;
	}

	public int method3956() {
		if (null == aClass303_3232)
			return 0;
		int i = -783382047 * aClass303_3232.anInt3425;
		if (aClass303_3232.aBool3427 && 1624614213 * anInt3241 < aClass303_3232.anInt3429 * -1375848401)
			return 1 + anInt3241 * 1624614213;
		if (i < 0 || i >= Class310.aClass303Array3467.length - 1)
			return 100;
		if (anInt3241 * 1624614213 == aClass303_3232.anInt3431 * -1949228175)
			return -1375848401 * aClass303_3232.anInt3429;
		return aClass303_3232.anInt3431 * -1949228175;
	}

	public int method3957() {
		return 1624614213 * anInt3241;
	}

	int method3958() {
		return -354297595 * anInt3237;
	}

	int method3959() {
		return -354297595 * anInt3237;
	}

	void method3960() {
		aBool3235 = true;
	}

	void method3961() {
		aBool3235 = true;
	}

	void method3962() {
		aBool3235 = true;
	}

	void method3963() {
		aBool3235 = true;
	}

	public static boolean method3964(int i) {
		return Class575.aBool7667;
	}

	static void method3965(Class668 class668, byte i) {
		Class277 class277 = ((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) -80));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (null == class277.anIntArray3036 ? 0 : class277.anIntArray3036.length);
	}

	static final void method3966(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		Class184_Sub2.aClass211_9442.method3010(class668.anIntArray8541[1867269829 * class668.anInt8542], class668.anIntArray8541[1 + 1867269829 * class668.anInt8542], 1217993769);
	}

	static final void method3967(Class668 class668, byte i) {
		int i_9_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class542.method6535(i_9_ >> 14 & 0x3fff, i_9_ & 0x3fff);
		if (class536_sub18_sub14 == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -673647059 * class536_sub18_sub14.anInt11765;
	}

	static final void method3968(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1996770834) != null)
			string = string.substring(0, string.length() - 1);
		class251.onPlayerGroupTransmitHook = Class33.method796(string, class668, (short) 308);
		class251.hasComponentHook = true;
	}
}
