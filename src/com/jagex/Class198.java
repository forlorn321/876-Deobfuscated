/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198 {
	static Class198 aClass198_2203;
	static Class198 aClass198_2204;
	static Class198 aClass198_2205;
	static Class198 aClass198_2206;
	static Class198 aClass198_2207 = new Class198();
	static Class198 aClass198_2208;
	static Class198 aClass198_2209;
	static Class198 aClass198_2210;
	public static Class198 aClass198_2211;
	public static Class198 aClass198_2212;
	static Class198 aClass198_2213;
	static Class198 aClass198_2214;
	static Class198 aClass198_2215;
	public static Class32 aClass32_2216;

	Class198() {
		/* empty */
	}

	static {
		aClass198_2206 = new Class198();
		aClass198_2204 = new Class198();
		aClass198_2214 = new Class198();
		aClass198_2205 = new Class198();
		aClass198_2208 = new Class198();
		aClass198_2209 = new Class198();
		aClass198_2210 = new Class198();
		aClass198_2211 = new Class198();
		aClass198_2212 = new Class198();
		aClass198_2213 = new Class198();
		aClass198_2203 = new Class198();
		aClass198_2215 = new Class198();
	}

	static final void method2872(Class251 class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		class251.anInt2640 = -70230299 * (class668.anIntArray8541[class668.anInt8542 * 1867269829]);
		class251.anInt2641 = (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1] * -358806889);
		class251.anInt2721 = (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2] * -1326793683);
		Class668.method8011(class251, 263642117);
	}

	static final void method2873(Class251 class251, Class234 class234, Class668 class668, Class233 class233, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		switch (class233.anInt2375 * -1515262187) {
		case 3:
			if (null != Class360_Sub1.aClass94Array10168 && i_0_ < Class360_Sub1.aClass94Array10168.length)
				class251.aString2699 = Class360_Sub1.aClass94Array10168[i_0_].aString1143;
			break;
		case 4:
		case 5:
			class251.aString2699 = (class668.aClass536_Sub15_8553.aClass349Array10479[i_0_].aString3695);
			break;
		case 2:
			if (2 == client.anInt11289 * -1484801557 && i_0_ < client.anInt11288 * 142551095)
				class251.aString2699 = client.aClass31Array11291[i_0_].aString266;
			else
				return;
			break;
		case 0:
			class251.aString2699 = Class63.aClass226_717.method3227(i_0_, -781094290).method3113((byte) 2);
			break;
		default:
			throw new IllegalStateException();
		case 1:
			class251.aString2699 = ((Class224) Class63.aClass226_717.method3220((byte) 113).get(i_0_)).method3204((byte) 42);
		}
		class251.aClass233_2714 = class233;
	}

	static final void method2874(Class668 class668, int i) {
		Class689.method8182(1948158634);
	}

	public static void method2875(int i, byte i_1_) {
		if (i < 1)
			Class542_Sub1.anInt10705 = Class542_Sub1.anInt10704 * 1558559153;
		else
			Class542_Sub1.anInt10705 = i * 1640702067;
	}

	static void method2876(Class536_Sub18_Sub16 class536_sub18_sub16, int i, Class668 class668, int i_2_) {
		class668.anInt8542 = 0;
		class668.anInt8544 = 0;
		class668.anInt8564 = 1531084683;
		class668.aClass536_Sub18_Sub16_8547 = class536_sub18_sub16;
		class668.aClass499Array8545 = class668.aClass536_Sub18_Sub16_8547.aClass499Array11797;
		class668.anIntArray8537 = class668.aClass536_Sub18_Sub16_8547.anIntArray11798;
		Class499 class499 = null;
		class668.anInt8552 = 0;
		class668.aMap8557.clear();
		class668.aMap8557.put(Class458.aClass458_5176, Class465_Sub1.aClass96_10352.aClass610_1164);
		class668.aMap8557.put(Class458.aClass458_5167, Class590.aClass147_Sub1_7791);
		class668.aMap8557.put(Class458.aClass458_5171, Class535.aClass147_7131);
		if (null != class668.aClass350_8563)
			class668.aMap8557.put(Class458.aClass458_5165, Class262.method3643(class668.aClass350_8563, 601478596));
		if (class668.aClass649_Sub1_Sub5_Sub1_8554 instanceof Class649_Sub1_Sub5_Sub1_Sub1)
			class668.aMap8557.put(Class458.aClass458_5166, (class668.aClass649_Sub1_Sub5_Sub1_8554.anInterface19_11888));
		if (class668.aClass649_Sub1_Sub5_Sub1_8554 instanceof Player)
			class668.aMap8558.put(Class458.aClass458_5176, (class668.aClass649_Sub1_Sub5_Sub1_8554.anInterface19_11888));
		if (null != Class63.aClass226_717)
			class668.aMap8557.put(Class458.aClass458_5174, Class63.aClass226_717.method3228(-1626644055));
		try {
			try {
				Class685.anInt8656 = 0;
				for (;;) {
					Class685.anInt8656 += 1351162395;
					if (-1582682093 * Class685.anInt8656 > i)
						throw new RuntimeException("");
					class499 = class668.aClass499Array8545[((class668.anInt8564 += -1531084683) * -1640738851)];
					if (Class685.aBool8660 && (Class685.aString8661 == null || ((class668.aClass536_Sub18_Sub16_8547.aString11801) != null && class668.aClass536_Sub18_Sub16_8547.aString11801.indexOf(Class685.aString8661) != -1)))
						System.out.println(new StringBuilder().append(class668.aClass536_Sub18_Sub16_8547.aString11801).append(": ").append(class499).toString());
					if (1 == (class668.anIntArray8537[class668.anInt8564 * -1640738851]))
						class668.aBool8548 = true;
					else
						class668.aBool8548 = false;
					if (class499 == Class499.aClass499_5870 && 0 == class668.anInt8552 * 2100083885) {
						Class573.method6939((short) -8119);
						break;
					}
					Class593.method7123(class499, class668, (byte) -127);
				}
			} catch (Exception exception) {
				Class245.method3414(class668, class499, exception, "S", (byte) -1);
				Class573.method6939((short) 21705);
			}
		} catch (Exception object) {
			Class573.method6939((short) 5157);
			throw object;
		}
	}
}
