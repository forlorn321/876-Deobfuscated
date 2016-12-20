/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Class32 {
	static final int anInt267 = 95;
	static final int anInt268 = 257;
	static boolean aBool269 = false;
	static Class109 aClass109_270;
	static boolean aBool271;
	static int[] anIntArray272;
	static boolean aBool273 = false;
	static int anInt274 = 1833818503;
	public static int anInt275;
	static final int anInt276 = 40;
	static final int anInt277 = 1;
	static final int anInt278 = 132;
	static final int anInt279 = 120;
	static final int anInt280 = 31;
	static final int anInt281 = 54;
	static final int anInt282 = 63;
	static final int anInt283 = 76;
	static final int anInt284 = 86;
	static final int anInt285 = 4;
	static int anInt286;
	static final int anInt287 = 111;
	static final int anInt288 = 123;
	public static String aString289;
	static final int anInt290 = 142;
	static final int anInt291 = 155;
	static final int anInt292 = 160;
	static final int anInt293 = 174;
	static final int anInt294 = 182;
	public static int anInt295;
	static final int anInt296 = 203;
	static final int anInt297 = 213;
	static final int anInt298 = 225;
	static final int anInt299 = 231;
	static final int anInt300 = 244;
	static final int anInt301 = 255;
	public static int anInt302;
	static final int anInt303 = 14;
	static long aLong304;
	public static int anInt305;
	public static String aString306;
	static int loginStage;
	static final int anInt308 = 190;
	static int anInt309;
	static int anInt310;
	public static int anInt311;
	static final int anInt312 = 265;
	static final int anInt313 = 108;
	public static int anInt314;
	public static int anInt315;
	public static int anInt316;
	public static int anInt317;
	static String aString318;
	public static int anInt319;
	static boolean aBool320;
	static long aLong321 = -2730100241404364287L;
	static boolean aBool322;
	static Class703 aClass703_323;

	static void method887() {
		Class700_Sub35.method17268((byte) -106);
	}

	static boolean method888() {
		if (-1 != -1552456759 * anInt274)
			return Class700_Sub39.method17292(-281159195);
		return Class430.method6874(aString289, aString306, (byte) 58);
	}

	static void method889(Class527_Sub38_Sub2 class527_sub38_sub2) {
		Class36[] class36s = Class457.method7447(2057623545);
		for (int i = 0; i < class36s.length; i++) {
			Class36 class36 = class36s[i];
			if (class36 != Class36.aClass36_407) {
				Class459 class459 = (Class459) Class319.aMap3538.get(class36);
				if (class459 == null)
					class527_sub38_sub2.writeInt(0, -1049033209);
				else
					class527_sub38_sub2.writeInt(class459.method7472(335838185), -923734603);
			}
		}
	}

	static boolean method890(boolean bool, boolean bool_0_, String string, String string_1_, long l) {
		aBool273 = bool;
		if (!bool_0_)
			anInt274 = 1833818503;
		aBool269 = bool_0_;
		aString289 = string;
		aString306 = string_1_;
		aLong321 = l * 2730100241404364287L;
		if (!aBool269 && (aString289.equals("") || aString306.equals(""))) {
			Class95.method1727(3, (byte) -61);
			Class387.method6437(-1187724870);
			return false;
		}
		if (120 != -626035783 * anInt286) {
			anInt316 = 0;
			anInt315 = -1716310515;
			anInt317 = 157279991;
		}
		aClass109_270.aBool1378 = false;
		Class95.method1727(-3, (byte) 66);
		loginStage = 496299902;
		anInt309 = 0;
		anInt310 = 0;
		return true;
	}

	static boolean method891() {
		if (-1 != -1552456759 * anInt274)
			return Class700_Sub39.method17292(-281159195);
		return Class430.method6874(aString289, aString306, (byte) 47);
	}

	static boolean method892(String string, String string_2_) {
		anInt286 = -1320406984;
		aClass109_270 = client.aClass109_11066;
		return Class40.method1166(false, false, string, string_2_, -1L);
	}

	static boolean method893() {
		if (-1 != -1552456759 * anInt274)
			return Class700_Sub39.method17292(-281159195);
		return Class430.method6874(aString289, aString306, (byte) 3);
	}

	static boolean method894() {
		if (anInt274 * -1552456759 != -1)
			return Class279.method5175(-1539791909);
		return Class308.method5626(aString289, aString306, 2067504171);
	}

	public static final void method895() {
		loginStage = 35449993;
		anInt302 = 1272427026;
		anInt311 = 1371389890;
	}

	public static final void method896() {
		loginStage = 35449993;
		anInt302 = 1272427026;
		anInt311 = 1371389890;
	}

	static RSByteBuffer method897() {
		RSByteBuffer class527_sub38 = Class708.method14376(-2145449829);
		long l;
		if (-1552456759 * anInt274 != -1)
			l = (long) (anInt274 * -1552456759);
		else if (-1L == aLong321 * -8573635942399706625L)
			l = Class525.method8726(aString289, -141984090);
		else
			l = aLong321 * -8573635942399706625L;
		Class684.aLong8653 = 8116618987213126071L * l;
		Class586.method9783(class527_sub38, l);
		class527_sub38.writeString(aString306, -1155328013);
		class527_sub38.writeLong(aLong304 * 8955827681536040585L);
		class527_sub38.writeLong(client.aLong11281 * 3809206929332399715L);
		class527_sub38.method16650(Class52.LOGIN_PUBLIC_EXPONENT, Class52.LOGIN_PUBLIC_MODULUS, (byte) -101);
		return class527_sub38;
	}

	public static final void method898() {
		loginStage = 35449993;
		anInt302 = 1272427026;
		anInt311 = 1371389890;
	}

	static boolean method899() {
		anInt286 = -1320406984;
		aClass109_270 = client.aClass109_11066;
		return Class40.method1166(-1L == -8573635942399706625L * aLong321, true, "", "", -8573635942399706625L * aLong321);
	}

	static final void method900() {
		aLong321 = -2730100241404364287L;
		aLong304 = 0L;
		anInt274 = 1833818503;
	}

	public static final void method901() {
		if (loginStage * -17413703 != 1) {
			aClass109_270.method1968((byte) 60);
			Class106.method1886(262144);
			Class387.method6437(916833179);
		}
	}

	public static final void method902() {
		if (loginStage * -17413703 != 1) {
			aClass109_270.method1968((byte) 50);
			Class106.method1886(262144);
			Class387.method6437(194062985);
		}
	}

	public static final void method903() {
		if (loginStage * -17413703 != 1) {
			aClass109_270.method1968((byte) 100);
			Class106.method1886(262144);
			Class387.method6437(1292833197);
		}
	}

	public static final void method904() {
		if (loginStage * -17413703 != 1) {
			aClass109_270.method1968((byte) 105);
			Class106.method1886(262144);
			Class387.method6437(318248187);
		}
	}

	public static final boolean method905() {
		return 1 != -17413703 * loginStage;
	}

	public static final boolean method906() {
		return 1 != -17413703 * loginStage;
	}

	static final void method907() {
		aLong321 = -2730100241404364287L;
		aLong304 = 0L;
		anInt274 = 1833818503;
	}

	public static void method908(String string, String string_3_, String string_4_, boolean bool) {
		if (string.length() <= 320 && Class144.method2386(-141234958)) {
			Class157.method2560(-879629701);
			aString289 = string;
			aString306 = string_3_;
			aString318 = string_4_;
			aBool271 = bool;
			Class78.method1560(3, (byte) 0);
		}
	}

	public static void method909(String string, boolean bool) {
		if (0 == client.anInt11048 * -1927019389 && (!Class266.method5045((byte) 1) && !Class472.method7739(1812361491))) {
			aString318 = string;
			aBool271 = bool;
			Class78.method1560(8, (byte) 0);
		}
	}

	public static void method910(int i, String string, boolean bool) {
		if (Class144.method2386(446347985)) {
			if (-1552456759 * anInt274 != i)
				aLong321 = -2730100241404364287L;
			anInt274 = i * -1833818503;
			aString318 = string;
			aBool271 = bool;
			client.aClass109_11066.method1968((byte) 36);
			Class78.method1560(1, (byte) 0);
		}
	}

	public static void method911(String string, String string_5_, String string_6_, boolean bool) {
		if (string.length() <= 320 && Class144.method2386(1940900068)) {
			client.aClass109_11066.method1968((byte) 6);
			Class157.method2560(1601981310);
			aString289 = string;
			aString306 = string_5_;
			aString318 = string_6_;
			aBool271 = bool;
			Class78.method1560(1, (byte) 0);
		}
	}

	static void method912() {
		aString318 = "";
		aString306 = "";
		aString289 = "";
		aBool271 = true;
	}

	static boolean method913(String string, String string_7_) {
		anInt286 = -1320406984;
		aClass109_270 = client.aClass109_11066;
		return Class40.method1166(false, false, string, string_7_, -1L);
	}

	static void method914(int i) {
		/* empty */
	}

	static boolean method915() {
		if (-1 != -1552456759 * anInt274)
			return Class700_Sub39.method17292(-281159195);
		return Class430.method6874(aString289, aString306, (byte) 99);
	}

	static boolean method916() {
		anInt286 = -1320406984;
		aClass109_270 = client.aClass109_11066;
		return Class40.method1166(-1L == -8573635942399706625L * aLong321, true, "", "", -8573635942399706625L * aLong321);
	}

	static boolean method917() {
		anInt286 = -1320406984;
		aClass109_270 = client.aClass109_11066;
		return Class40.method1166(-1L == -8573635942399706625L * aLong321, true, "", "", -8573635942399706625L * aLong321);
	}

	Class32() throws Throwable {
		throw new Error();
	}

	public static void method918() {
		if (-17413703 * loginStage == 108)
			loginStage = -360018073;
	}

	static boolean method919(boolean bool, boolean bool_8_, String string, String string_9_, long l) {
		aBool273 = bool;
		if (!bool_8_)
			anInt274 = 1833818503;
		aBool269 = bool_8_;
		aString289 = string;
		aString306 = string_9_;
		aLong321 = l * 2730100241404364287L;
		if (!aBool269 && (aString289.equals("") || aString306.equals(""))) {
			Class95.method1727(3, (byte) 26);
			Class387.method6437(-77141564);
			return false;
		}
		if (120 != -626035783 * anInt286) {
			anInt316 = 0;
			anInt315 = -1716310515;
			anInt317 = 157279991;
		}
		aClass109_270.aBool1378 = false;
		Class95.method1727(-3, (byte) -100);
		loginStage = 496299902;
		anInt309 = 0;
		anInt310 = 0;
		return true;
	}

	static boolean method921() {
		anInt286 = -2004669559;
		aClass109_270 = client.aClass109_11067;
		return Class40.method1166(aLong321 * -8573635942399706625L == -1L, true, "", "", aLong321 * -8573635942399706625L);
	}

	static void method922(int i) {
		/* empty */
	}

	static void method923(RSByteBuffer class527_sub38, long l) {
		Class16 class16;
		if (aString318 != null && aString318.length() == 6) {
			if (aBool271)
				class16 = Class16.aClass16_194;
			else
				class16 = Class16.aClass16_193;
		} else if (Class105.aClass45_1309.method1198(l))
			class16 = Class16.aClass16_191;
		else
			class16 = Class16.aClass16_192;
		class527_sub38.writeByte(class16.method87(), -336766442);
		switch (-2029514083 * class16.anInt190) {
		case 0:
			class527_sub38.writeInt(Class105.aClass45_1309.method1203(l), 1620282761);
			break;
		case 3:
			class527_sub38.anInt10689 += 1604036228;
			break;
		case 1:
		case 2:
			class527_sub38.writeTriByte(Integer.parseInt(aString318), -350080802);
			class527_sub38.anInt10689 += 1474750881;
			break;
		}
	}

	static void method924(RSByteBuffer class527_sub38, long l) {
		Class16 class16;
		if (aString318 != null && aString318.length() == 6) {
			if (aBool271)
				class16 = Class16.aClass16_194;
			else
				class16 = Class16.aClass16_193;
		} else if (Class105.aClass45_1309.method1198(l))
			class16 = Class16.aClass16_191;
		else
			class16 = Class16.aClass16_192;
		class527_sub38.writeByte(class16.method87(), 212177175);
		switch (-2029514083 * class16.anInt190) {
		case 0:
			class527_sub38.writeInt(Class105.aClass45_1309.method1203(l), -1449554493);
			break;
		case 3:
			class527_sub38.anInt10689 += 1604036228;
			break;
		case 1:
		case 2:
			class527_sub38.writeTriByte(Integer.parseInt(aString318), 1537186756);
			class527_sub38.anInt10689 += 1474750881;
			break;
		}
	}

	static void method925(RSByteBuffer class527_sub38, long l) {
		Class16 class16;
		if (aString318 != null && aString318.length() == 6) {
			if (aBool271)
				class16 = Class16.aClass16_194;
			else
				class16 = Class16.aClass16_193;
		} else if (Class105.aClass45_1309.method1198(l))
			class16 = Class16.aClass16_191;
		else
			class16 = Class16.aClass16_192;
		class527_sub38.writeByte(class16.method87(), 1643821235);
		switch (-2029514083 * class16.anInt190) {
		case 0:
			class527_sub38.writeInt(Class105.aClass45_1309.method1203(l), 24561770);
			break;
		case 3:
			class527_sub38.anInt10689 += 1604036228;
			break;
		case 1:
		case 2:
			class527_sub38.writeTriByte(Integer.parseInt(aString318), 701964806);
			class527_sub38.anInt10689 += 1474750881;
			break;
		}
	}

	static boolean method926() {
		if (anInt274 * -1552456759 != -1)
			return Class279.method5175(-1539791909);
		return Class308.method5626(aString289, aString306, 1043435926);
	}

	static void method927(RSByteBuffer class527_sub38, long l) {
		Class16 class16;
		if (aString318 != null && aString318.length() == 6) {
			if (aBool271)
				class16 = Class16.aClass16_194;
			else
				class16 = Class16.aClass16_193;
		} else if (Class105.aClass45_1309.method1198(l))
			class16 = Class16.aClass16_191;
		else
			class16 = Class16.aClass16_192;
		class527_sub38.writeByte(class16.method87(), 1818339909);
		switch (-2029514083 * class16.anInt190) {
		case 0:
			class527_sub38.writeInt(Class105.aClass45_1309.method1203(l), -778840601);
			break;
		case 3:
			class527_sub38.anInt10689 += 1604036228;
			break;
		case 1:
		case 2:
			class527_sub38.writeTriByte(Integer.parseInt(aString318), -1377552680);
			class527_sub38.anInt10689 += 1474750881;
			break;
		}
	}

	static void method928(int i) {
		if (-626035783 * anInt286 == 120)
			anInt311 = i * -685694945;
		else if (-626035783 * anInt286 == 257)
			anInt302 = i * 1511270135;
	}

	static {
		loginStage = 35449993;
		aLong304 = 0L;
		aString289 = "";
		aString306 = "";
		aString318 = "";
		aBool271 = true;
		anInt309 = 0;
		anInt310 = 0;
		anInt311 = 1371389890;
		anInt302 = 1272427026;
		anInt275 = 1500982066;
		anInt314 = -1703277417;
		anInt305 = -2105418497;
		anInt316 = 0;
		anInt317 = 157279991;
		anInt315 = -1716310515;
		anInt319 = 0;
		aBool320 = false;
		anInt295 = 0;
		aBool322 = false;
	}

	static void method929(int i) {
		if (-626035783 * anInt286 == 120)
			anInt311 = i * -685694945;
		else if (-626035783 * anInt286 == 257)
			anInt302 = i * 1511270135;
	}

	static boolean method930() {
		if (-1 != -1552456759 * anInt274)
			return Class700_Sub39.method17292(-281159195);
		return Class430.method6874(aString289, aString306, (byte) 123);
	}

	static void method931(Class527_Sub38_Sub2 class527_sub38_sub2) {
		Class36[] class36s = Class457.method7447(2109503586);
		for (int i = 0; i < class36s.length; i++) {
			Class36 class36 = class36s[i];
			if (class36 != Class36.aClass36_407) {
				Class459 class459 = (Class459) Class319.aMap3538.get(class36);
				if (class459 == null)
					class527_sub38_sub2.writeInt(0, -1632797142);
				else
					class527_sub38_sub2.writeInt(class459.method7472(335838185), -1823036596);
			}
		}
	}

	static void method932() {
		aClass109_270.method1960((byte) -66);
		aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
		aClass109_270.aClass422_1361 = null;
		aClass109_270.aClass422_1376 = null;
		aClass109_270.aClass422_1377 = null;
		aClass109_270.anInt1369 = 0;
		client.anInt11024 = 0;
		client.anInt11083 = 0;
		client.anInt11261 = 0;
		client.anInt11299 = 0;
		client.aString11270 = null;
		Class695_Sub3.anInt10976 = 0;
		Class679.aClass104Array8629 = null;
		Class208_Sub8.aClass346_9916 = null;
		Class386.aClass346_3964 = null;
		client.aBool11309 = true;
		Class450.method7285(1275557894);
		for (int i = 0; i < Class671.aClass97_8584.aClass634Array1160.length; i++) {
			Class634 class634 = new Class634(Class525.aClass610_7102.method10096(i, (byte) -120), false);
			class634.method10521(0, 1519699714);
			class634.method10531(0, 1101889682);
			Class671.aClass97_8584.aClass634Array1160[i] = class634;
		}
		Class671.aClass97_8584.aClass603_1162.method10014(990458224);
		Class527_Sub5.method16052(49653433);
		Class195.method3711(aClass109_270, 1984334704);
	}

	static void method933() {
		Class700_Sub35.method17268((byte) -84);
	}

	static void method934(int i) {
		if (-626035783 * anInt286 == 120)
			anInt311 = i * -685694945;
		else if (-626035783 * anInt286 == 257)
			anInt302 = i * 1511270135;
	}

	static void method935() {
		Class700_Sub35.method17268((byte) -41);
	}

	static void method936() {
		if (-1927019389 * client.anInt11048 == 19)
			Class666.method13742(147882242);
		client.aClass109_11066.method1968((byte) 51);
		Class700_Sub35.method17268((byte) -9);
		Class333.aBool3628 = true;
		Class171_Sub1_Sub3.method17968((byte) 12);
		for (int i = 0; i < client.aClass100Array11025.length; i++)
			client.aClass100Array11025[i] = null;
		client.aBool11188 = false;
		client.anInt11195 = ((int) (Math.random() * 100.0) - 50) * -661349667;
		client.anInt11213 = ((int) (Math.random() * 110.0) - 55) * -697325023;
		client.anInt11099 = ((int) (Math.random() * 80.0) - 40) * -867196655;
		client.anInt11088 = ((int) (Math.random() * 120.0) - 60) * 302279291;
		client.anInt10991 = ((int) (Math.random() * 30.0) - 20) * -998726409;
		client.aFloat11112 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class144.method2390((short) -9553);
		for (int i = 0; i < 2048; i++)
			client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = null;
		client.anInt11059 = 0;
		client.anInt11030 = 0;
		client.aClass14_10989.method721(701797229);
		client.aClass694_11290.method14105((byte) 124);
		client.aClass14_11184.method721(-1960765081);
		client.aClass705_11182.method14332(-1768081817);
		client.aClass14_11253.method721(503730139);
		Class527_Sub2.aClass694_10357 = new Class694();
		Class527_Sub2.aClass694_10359 = new Class694();
		Class321.anInt3552 = 0;
		Class452.anInt4963 = 0;
		Class568.anInt7614 = 0;
		Class498.anInt5586 = 0;
		Class208_Sub11.anInt9926 = 0;
		Class405.anInt4196 = 0;
		Class170.anInt1881 = 0;
		Class447.anInt4930 = 0;
		Class209.anInt2246 = 0;
		Class78.anInt801 = 0;
		if (-1 != -2119864417 * client.anInt11237)
			Class112.method2017(-2119864417 * client.anInt11237, 1284328969);
		for (Class527_Sub41 class527_sub41 = (Class527_Sub41) client.aClass14_11276.method713((byte) 28); null != class527_sub41; class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method717(428225614))) {
			if (!class527_sub41.method8736(-2126519674)) {
				class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method713((byte) 12));
				if (class527_sub41 == null)
					break;
			}
			Class231.method4326(class527_sub41, true, false, 1137595589);
		}
		client.anInt11237 = 1087640481;
		client.aClass14_11276 = new Class14(8);
		Class602.method10008(-383814969);
		client.aClass243_11196 = null;
		for (int i = 0; i < 8; i++) {
			client.aStringArray11262[i] = null;
			client.aBoolArray11177[i] = false;
			client.anIntArray11175[i] = -1;
		}
		Class318.method5685(-1511501578);
		client.aBool11017 = true;
		for (int i = 0; i < 102; i++)
			client.aBoolArray11310[i] = true;
		for (int i = 0; i < 3; i++) {
			for (int i_28_ = 0; i_28_ < 8; i_28_++)
				client.aClass492ArrayArray11272[i][i_28_] = new Class492();
		}
		client.aClass509_11072.method8397(591563627).method10252((short) -21189);
		client.aBool11119 = true;
		Class602.aShortArray7935 = Class295.aShortArray3275 = Class9.aShortArray78 = new short[256];
		Class485.aString5463 = Class53.aClass53_660.method1290(Class144_Sub1.aClass671_8995, (byte) -44);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), Class204.aClass527_Sub31_2213.aClass700_Sub13_10607.method16964((byte) 2), 465024737);
		client.anInt11069 = 0;
		Class107.method1928((byte) 0);
		Class59.aClass638_724 = null;
		Class395.aLong4106 = 0L;
	}

	static void method937() {
		if (-1927019389 * client.anInt11048 == 19)
			Class666.method13742(1799413906);
		client.aClass109_11066.method1968((byte) 88);
		Class700_Sub35.method17268((byte) -38);
		Class333.aBool3628 = true;
		Class171_Sub1_Sub3.method17968((byte) -16);
		for (int i = 0; i < client.aClass100Array11025.length; i++)
			client.aClass100Array11025[i] = null;
		client.aBool11188 = false;
		client.anInt11195 = ((int) (Math.random() * 100.0) - 50) * -661349667;
		client.anInt11213 = ((int) (Math.random() * 110.0) - 55) * -697325023;
		client.anInt11099 = ((int) (Math.random() * 80.0) - 40) * -867196655;
		client.anInt11088 = ((int) (Math.random() * 120.0) - 60) * 302279291;
		client.anInt10991 = ((int) (Math.random() * 30.0) - 20) * -998726409;
		client.aFloat11112 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class144.method2390((short) 8026);
		for (int i = 0; i < 2048; i++)
			client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = null;
		client.anInt11059 = 0;
		client.anInt11030 = 0;
		client.aClass14_10989.method721(-780086229);
		client.aClass694_11290.method14105((byte) 26);
		client.aClass14_11184.method721(-1378883871);
		client.aClass705_11182.method14332(-2110197128);
		client.aClass14_11253.method721(692547411);
		Class527_Sub2.aClass694_10357 = new Class694();
		Class527_Sub2.aClass694_10359 = new Class694();
		Class321.anInt3552 = 0;
		Class452.anInt4963 = 0;
		Class568.anInt7614 = 0;
		Class498.anInt5586 = 0;
		Class208_Sub11.anInt9926 = 0;
		Class405.anInt4196 = 0;
		Class170.anInt1881 = 0;
		Class447.anInt4930 = 0;
		Class209.anInt2246 = 0;
		Class78.anInt801 = 0;
		if (-1 != -2119864417 * client.anInt11237)
			Class112.method2017(-2119864417 * client.anInt11237, 1850148934);
		for (Class527_Sub41 class527_sub41 = (Class527_Sub41) client.aClass14_11276.method713((byte) -9); null != class527_sub41; class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method717(164747041))) {
			if (!class527_sub41.method8736(-2126519674)) {
				class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method713((byte) 2));
				if (class527_sub41 == null)
					break;
			}
			Class231.method4326(class527_sub41, true, false, 1484293535);
		}
		client.anInt11237 = 1087640481;
		client.aClass14_11276 = new Class14(8);
		Class602.method10008(-1524782194);
		client.aClass243_11196 = null;
		for (int i = 0; i < 8; i++) {
			client.aStringArray11262[i] = null;
			client.aBoolArray11177[i] = false;
			client.anIntArray11175[i] = -1;
		}
		Class318.method5685(-1511501578);
		client.aBool11017 = true;
		for (int i = 0; i < 102; i++)
			client.aBoolArray11310[i] = true;
		for (int i = 0; i < 3; i++) {
			for (int i_29_ = 0; i_29_ < 8; i_29_++)
				client.aClass492ArrayArray11272[i][i_29_] = new Class492();
		}
		client.aClass509_11072.method8397(1465910601).method10252((short) -8943);
		client.aBool11119 = true;
		Class602.aShortArray7935 = Class295.aShortArray3275 = Class9.aShortArray78 = new short[256];
		Class485.aString5463 = Class53.aClass53_660.method1290(Class144_Sub1.aClass671_8995, (byte) -124);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), Class204.aClass527_Sub31_2213.aClass700_Sub13_10607.method16964((byte) -65), 746423058);
		client.anInt11069 = 0;
		Class107.method1928((byte) 0);
		Class59.aClass638_724 = null;
		Class395.aLong4106 = 0L;
	}

	static void method938() {
		aClass109_270.method1960((byte) -23);
		aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
		aClass109_270.incomingPacket = null;
		aClass109_270.aClass422_1361 = null;
		aClass109_270.aClass422_1376 = null;
		aClass109_270.aClass422_1377 = null;
		aClass109_270.anInt1359 = 0;
		aClass109_270.anInt1369 = 0;
		client.anInt11024 = 0;
		Class107.method1928((byte) 0);
		Class331_Sub2.method15714(-1005940472);
		for (int i = 0; i < 2048; i++)
			client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = null;
		for (int i = 0; i < 152738023 * client.anInt11030; i++) {
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) client.aClass527_Sub26Array11313[i].anObject10522);
			if (null != class640_sub1_sub2_sub1)
				class640_sub1_sub2_sub1.anInt11910 = 1271780505;
		}
		Class318.method5685(-1511501578);
		Class393.method6490(Class527_Sub29.method16288(1777647246), -2083654616);
		Class78.method1560(9, (byte) 0);
		for (int i = 0; i < 102; i++)
			client.aBoolArray11310[i] = true;
		Class195.method3711(aClass109_270, 2018337393);
		Class59.aClass638_724 = null;
		Class395.aLong4106 = 0L;
		Class296_Sub1.method15694(-297336387);
		Class598.aClass144_Sub1_7852.method14503(-1444645831);
	}

	static final void method939(Class665 class665, byte i) {
		int i_30_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class103.method1802((char) i_30_, (byte) 15) ? 1 : 0;
	}

	static final void method940(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub24_10591.method17139((byte) -71);
	}

	static final void method941(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16842(-1266538779) ? 1 : 0;
	}

	public static final void method942(boolean bool, int i) {
		if (!bool) {
			Class153.aClass24_Sub14_1716.method836(-1593912539);
			Class317.aClass24_Sub5_3533.method836(-899577067);
			Class587.aClass24_Sub19_7760.method836(-384600375);
			client.aClass509_11072.method8310(-1891963183).method836(-82966206);
			Class381.aClass24_Sub9_3936.method836(-999391439);
			Class174_Sub2.aClass24_Sub17_9120.method836(-987593739);
			Class321.aClass24_Sub10_3551.method836(-336972497);
			Class57.aClass24_Sub4_720.method836(-659570346);
			Class51.aClass24_Sub16_522.method836(-1551887154);
			Class248.aClass95_Sub1_Sub1_2731.method17857(1947047675);
			IncomingPacket.aClass95_Sub1_Sub2_4802.method17876(-652048962);
			Class499.aClass95_Sub1_Sub2_5593.method17876(-652048962);
			Class333.aClass95_Sub1_Sub2_3629.method17876(-652048962);
			Class104.aClass95_Sub1_Sub2_1292.method17876(-652048962);
			Class98.aClass95_Sub1_Sub2_1166.method17876(-652048962);
			Class258.aClass24_Sub2_2827.method836(-624964995);
			Class346.aClass24_Sub8_3731.method836(-969010749);
			Class457.aClass24_Sub12_5063.method836(-143056700);
			Class679.aClass24_Sub21_8628.method836(-258941321);
			Class84.aClass24_Sub1_815.method836(-1802366251);
			Class189.aClass24_Sub7_2127.method836(-942420847);
			Class482.aClass24_Sub22_5430.method836(-667993408);
			Class312.aClass24_Sub11_3497.method836(-395979853);
			Class234.aClass24_Sub18_2375.method836(-211387875);
			Class536_Sub1.aClass24_Sub13_10343.method836(-1507525590);
			Class540.method9012((short) 18974);
			Class73.method1510(-1223348228);
			Class211.aClass420_2256.method6685(1424963227);
			Class109.method1983((byte) -105);
			if (Class677.aClass677_8596 != Class73.aClass677_790) {
				for (int i_31_ = 0; i_31_ < Class398.aByteArrayArray4123.length; i_31_++)
					Class398.aByteArrayArray4123[i_31_] = null;
				client.anInt11018 = 0;
			}
			client.aClass509_11072.method8397(2107007083).method10242(1752792775);
			Class6_Sub1.method17418((byte) -80);
			Class467.method7667(-791920877);
			Class659.aClass391_8496.method6475(-1479175311);
			Class643.aClass397_8346.method6509(-1300285372);
			Class666.aClass205_8551.method3793((byte) 25);
			client.aClass205_11050.method3793((byte) 53);
			client.aClass205_11152.method3793((byte) 107);
			client.aClass205_11306.method3793((byte) 90);
			Class431.aClass24_4851.method836(-2015957405);
			Class208_Sub2.aClass24_9868.method836(-1448827058);
			client.aClass205_11200.method3793((byte) 38);
		}
		Class227.method4308(1764258591);
		Class384.method6423(-1662576093);
	}

	static final void method943(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class243.anInt2541 = 605595485;
		class243.anInt2542 = client.anInt11070 * 961629445;
		class243.anInt2543 = 0;
		if (class243.anInt2675 * -927924265 == -1 && !class240.aBool2394)
			Class207.method3844(-254728301 * class243.anInt2504, -1291827521);
	}

	public static Class19 method944(String string, String string_32_, boolean bool, byte i) {
		File file = new File(Class105.aFile1307, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class19 class19;
				try {
					Class19 class19_33_ = new Class19(file, "rw", 10000L);
					class19 = class19_33_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		String string_34_ = "";
		if (33 == -692807731 * Class23.anInt228)
			string_34_ = "_rc";
		else if (-692807731 * Class23.anInt228 == 34)
			string_34_ = "_wip";
		File file_35_ = new File(Class329.aString3605, new StringBuilder().append("jagex_").append(string_32_).append("_preferences").append(string).append(string_34_).append(".dat").toString());
		do {
			if (!bool && file_35_.exists()) {
				Class19 class19;
				try {
					Class19 class19_36_ = new Class19(file_35_, "rw", 10000L);
					class19 = class19_36_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		Class19 class19;
		try {
			Class19 class19_37_ = new Class19(file, "rw", 10000L);
			class19 = class19_37_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class19;
	}
}
