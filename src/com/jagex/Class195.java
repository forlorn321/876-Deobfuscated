/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;

public class Class195 {
	int[] anIntArray2157;
	static final int anInt2158 = 2;
	static final int anInt2159 = 0;
	int[] anIntArray2160;
	static Class185 aClass185_2161;

	void method3704(Class196 class196, int i, int i_0_) {
		int i_1_ = anIntArray2160[0];
		class196.method3716(i, i_1_ >>> 16, i_1_ & 0xffff, -868433964);
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = class196.method3717(-393085276);
		class640_sub1_sub2_sub1.anInt11942 = 0;
		for (int i_2_ = anIntArray2157.length - 1; i_2_ >= 0; i_2_--) {
			int i_3_ = anIntArray2157[i_2_];
			int i_4_ = anIntArray2160[i_2_];
			class640_sub1_sub2_sub1.anIntArray11902[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_4_ >> 16;
			class640_sub1_sub2_sub1.anIntArray11944[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_4_ & 0xffff;
			byte i_5_ = Class679.aClass679_8622.aByte8627;
			if (i_3_ == 0)
				i_5_ = Class679.aClass679_8620.aByte8627;
			else if (2 == i_3_)
				i_5_ = Class679.aClass679_8623.aByte8627;
			class640_sub1_sub2_sub1.aByteArray11945[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_5_;
			class640_sub1_sub2_sub1.anInt11942 += 1705181029;
		}
	}

	Class195(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedSmart((byte) -82);
		anIntArray2157 = new int[i];
		anIntArray2160 = new int[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int i_7_ = class527_sub38.readUnsignedByte();
			anIntArray2157[i_6_] = i_7_;
			int i_8_ = class527_sub38.readUnsignedShort();
			int i_9_ = class527_sub38.readUnsignedShort();
			anIntArray2160[i_6_] = i_9_ + (i_8_ << 16);
		}
	}

	void method3705(Class196 class196, int i) {
		int i_10_ = anIntArray2160[0];
		class196.method3716(i, i_10_ >>> 16, i_10_ & 0xffff, 2104020658);
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = class196.method3717(-1895044397);
		class640_sub1_sub2_sub1.anInt11942 = 0;
		for (int i_11_ = anIntArray2157.length - 1; i_11_ >= 0; i_11_--) {
			int i_12_ = anIntArray2157[i_11_];
			int i_13_ = anIntArray2160[i_11_];
			class640_sub1_sub2_sub1.anIntArray11902[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_13_ >> 16;
			class640_sub1_sub2_sub1.anIntArray11944[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_13_ & 0xffff;
			byte i_14_ = Class679.aClass679_8622.aByte8627;
			if (i_12_ == 0)
				i_14_ = Class679.aClass679_8620.aByte8627;
			else if (2 == i_12_)
				i_14_ = Class679.aClass679_8623.aByte8627;
			class640_sub1_sub2_sub1.aByteArray11945[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_14_;
			class640_sub1_sub2_sub1.anInt11942 += 1705181029;
		}
	}

	void method3706(Class196 class196, int i) {
		int i_15_ = anIntArray2160[0];
		class196.method3716(i, i_15_ >>> 16, i_15_ & 0xffff, 720788540);
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = class196.method3717(219196796);
		class640_sub1_sub2_sub1.anInt11942 = 0;
		for (int i_16_ = anIntArray2157.length - 1; i_16_ >= 0; i_16_--) {
			int i_17_ = anIntArray2157[i_16_];
			int i_18_ = anIntArray2160[i_16_];
			class640_sub1_sub2_sub1.anIntArray11902[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_18_ >> 16;
			class640_sub1_sub2_sub1.anIntArray11944[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_18_ & 0xffff;
			byte i_19_ = Class679.aClass679_8622.aByte8627;
			if (i_17_ == 0)
				i_19_ = Class679.aClass679_8620.aByte8627;
			else if (2 == i_17_)
				i_19_ = Class679.aClass679_8623.aByte8627;
			class640_sub1_sub2_sub1.aByteArray11945[class640_sub1_sub2_sub1.anInt11942 * -1057678739] = i_19_;
			class640_sub1_sub2_sub1.anInt11942 += 1705181029;
		}
	}

	static final void method3707(Class665 class665, byte i) {
		int i_20_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_20_, 1536471340);
		Class240 class240 = Class183.aClass240Array2100[i_20_ >> 16];
		Class615.method10185(class243, class240, class665, -157184823);
	}

	static final void method3708(Class665 class665, short i) {
		int i_21_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_21_, -528327134);
		Class324.method5724(class243, class665, -2139084008);
	}

	static final void method3709(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class670.method13765(class243, class665, -1282104551);
	}

	static final void method3710(Class665 class665, int i) {
		Class47.method1242(0, 0, -1054537975 * client.aClass243_11201.anInt2511, client.aClass243_11201.anInt2514 * -1386504031, false, (short) -22302);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.anInt11291 * 473278291;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1527615753 * client.anInt11040;
	}

	static void method3711(Class109 class109, int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4404, class109.aClass2_1367, (byte) -21);
		class527_sub15.buffer.writeByte(Class81.method1574((byte) 3), -990018283);
		class527_sub15.buffer.writeShort(Class289.anInt3223 * -1803844265, 1404835786);
		class527_sub15.buffer.writeShort(Class611.anInt8009 * -471480167, 1404835786);
		class527_sub15.buffer.writeByte(Class204.aClass527_Sub31_2213.aClass700_Sub37_10637.method17279((byte) 125), -134429454);
		class109.method1969(class527_sub15, (byte) 1);
	}

	static final void doLogin(int i) {
		if (1 != -17413703 * Class32.loginStage && 108 != -17413703 * Class32.loginStage) {
			do {
				try {
					int i_22_;
					if (Class32.anInt310 * -1381929297 == 0 && Class32.loginStage * -17413703 < 95)
						i_22_ = 500;
					else
						i_22_ = 2000;
					if (Class32.aBool273 && -17413703 * Class32.loginStage >= 63)
						i_22_ = 6000;
					if ((257 == -626035783 * Class32.anInt286 && 213 != Class32.loginStage * -17413703 && 42 != -648250681 * Class32.anInt302) || (120 == -626035783 * Class32.anInt286 && 49 != Class32.anInt311 * -1928963105 && Class32.anInt311 * -1928963105 != 52))
						Class32.anInt309 += -201470083;
					if (Class32.anInt309 * -1723571755 > i_22_) {
						Class32.aClass109_270.method1968((byte) 106);
						if (-1381929297 * Class32.anInt310 < 3) {
							if (257 == Class32.anInt286 * -626035783)
								Class3.aClass13_34.method700(1493443496);
							else
								Class3.aClass13_36.method700(2106522513);
							Class32.anInt309 = 0;
							Class32.anInt310 += -1321949105;
							Class32.loginStage = 496299902;
						} else {
							Class32.loginStage = 35449993;
							Class95.method1727(-5, (byte) 19);
							Class387.method6437(1523573383);
							break;
						}
					}
					if (14 == Class32.loginStage * -17413703) {
						if (Class32.anInt286 * -626035783 == 257)
							Class32.aClass109_270.method1957(Class492.method7995(Class3.aClass13_34.method705((byte) 0), 40000, 1523233102), Class3.aClass13_34.aString178, -1525702675);
						else
							Class32.aClass109_270.method1957(Class492.method7995(Class3.aClass13_36.method705((byte) 0), 40000, -1070875887), Class3.aClass13_36.aString178, -1357999715);
						Class32.aClass109_270.method1960((byte) -60);
						Class527_Sub15 class527_sub15 = Class565.method9498(757051694);
						if (Class32.aBool273) {
							class527_sub15.buffer.writeByte((1000765535 * Class410.aClass410_4349.anInt4354), -943137077);
							class527_sub15.buffer.writeShort(0, 1404835786);
							int i_23_ = ((class527_sub15.buffer.anInt10689) * -441238943);
							class527_sub15.buffer.writeInt(876, -336923322);
							class527_sub15.buffer.writeInt(1, 2132686084);
							if (Class32.anInt286 * -626035783 == 257)
								class527_sub15.buffer.writeByte((client.anInt11048 * -1927019389 == 17 ? 1 : 0), 117717797);
							RSByteBuffer class527_sub38 = Class708.method14376(-2141542814);
							Class586.method9783(class527_sub38, (long) (-1552456759 * Class32.anInt274));
							Class684.aLong8653 = ((long) Class32.anInt274 * -2165735784609393233L);
							class527_sub38.writeByte((Class32.anInt274 * -1552456759), 491782454);
							class527_sub38.writeByte(Class144_Sub1.aClass671_8995.method87(), 1115896254);
							class527_sub38.writeInt((651761593 * client.anInt10992), 828874406);
							for (int i_24_ = 0; i_24_ < 5; i_24_++)
								class527_sub38.writeInt((int) (Math.random() * 9.9999999E7), 513308597);
							class527_sub38.writeLong(client.aLong11281 * 3809206929332399715L);
							class527_sub38.writeByte(((client.aClass678_11259.anInt8610) * -1907167873), -1102265837);
							class527_sub38.writeByte((int) (Math.random() * 9.9999999E7), -727874786);
							class527_sub38.method16650(Class52.LOGIN_PUBLIC_EXPONENT, Class52.LOGIN_PUBLIC_MODULUS, (byte) -3);
							class527_sub15.buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 96);
							class527_sub15.buffer.method16437(-441238943 * (class527_sub15.buffer.anInt10689) - i_23_, -18705907);
						} else
							class527_sub15.buffer.writeByte((1000765535 * Class410.aClass410_4350.anInt4354), 202300395);
						Class32.aClass109_270.method1969(class527_sub15, (byte) 1);
						Class32.aClass109_270.method1954(-1156917091);
						Class32.loginStage = 1098949783;
					}
					if (Class32.loginStage * -17413703 == 31) {
						if (!Class32.aClass109_270.method1967(2043368913).method9466(1, (byte) -72))
							break;
						Class32.aClass109_270.method1967(1995223080).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						int i_25_ = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedByte();
						if (0 != i_25_) {
							Class32.loginStage = 35449993;
							Class519.method8659(i_25_, 1903879396);
							Class95.method1727(i_25_, (byte) 44);
							Class32.aClass109_270.method1968((byte) 57);
							Class387.method6437(-661613918);
							break;
						}
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						if (Class32.aBool273)
							Class32.loginStage = 1417999720;
						else
							Class32.loginStage = -1246267898;
					}
					if (Class32.loginStage * -17413703 == 40) {
						if (!Class32.aClass109_270.method1967(2007392488).method9466(2, (byte) -109))
							break;
						Class32.aClass109_270.method1967(2064067871).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 2, -226630132);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedShort() * 1474750881;
						Class32.loginStage = 1914299622;
					}
					if (-17413703 * Class32.loginStage == 54) {
						if (!Class32.aClass109_270.method1967(2061010895).method9466((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) * -441238943, (byte) -50))
							break;
						Class32.aClass109_270.method1967(2032572907).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) * -441238943, -226630132);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.method16470(Class32.anIntArray272, 1086737603);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						String string = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readVersionedString(90180177);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						String string_26_ = Class411.aClass411_4356.method6584((byte) 2);
						Class477.method7780(string, true, string_26_, client.aBool11193, (byte) -18);
						Class32.loginStage = -2061617737;
					}
					if (Class32.loginStage * -17413703 == 63) {
						if (!Class32.aClass109_270.method1967(1969519650).method9466(1, (byte) -16))
							break;
						Class32.aClass109_270.method1967(1919535063).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
						if (((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff) == 1)
							Class32.loginStage = -1600767828;
					}
					if (76 == -17413703 * Class32.loginStage) {
						if (!Class32.aClass109_270.method1967(2061051925).method9466(16, (byte) -67))
							break;
						Class32.aClass109_270.method1967(2058398154).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 16, -226630132);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 2121177616;
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.method16470(Class32.anIntArray272, 1086737603);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						Class32.aLong321 = (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.method16612((byte) 1) * 2730100241404364287L);
						Class32.aLong304 = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.method16612((byte) 1) * 829433339312207801L;
						Class32.loginStage = -1246267898;
					}
					if (86 == Class32.loginStage * -17413703) {
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						Class32.aClass109_270.method1960((byte) -81);
						Class527_Sub15 class527_sub15 = Class565.method9498(757051694);
						Class527_Sub38_Sub2 buffer = class527_sub15.buffer;
						if (-626035783 * Class32.anInt286 == 257) {
							Class410 class410;
							if (Class32.aBool273)
								class410 = Class410.aClass410_4352;
							else
								class410 = Class410.aClass410_4351;
							buffer.writeByte((class410.anInt4354 * 1000765535), -1640104980);
							buffer.writeShort(0, 1404835786);
							int i_27_ = buffer.anInt10689 * -441238943;
							int i_28_ = -441238943 * buffer.anInt10689;
							if (!Class32.aBool273) {
								buffer.writeInt(876, 2082033705);
								buffer.writeInt(1, 1846463036);
								buffer.writeByte((17 == client.anInt11048 * -1927019389 ? 1 : 0), 578459157);
								i_28_ = (-441238943 * buffer.anInt10689);
								RSByteBuffer class527_sub38 = Class454.method7337(-297243231);
								buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 65);
								i_28_ = (-441238943 * buffer.anInt10689);
								buffer.writeByte((Class32.aLong321 * -8573635942399706625L == -1L) ? 1 : 0, -979547420);
								if (Class32.aLong321 * -8573635942399706625L == -1L)
									buffer.writeString(Class32.aString289, 555386408);
								else
									buffer.writeLong(Class32.aLong321 * -8573635942399706625L);
							}
							buffer.writeByte(Class81.method1574((byte) 3), 533570693);
							buffer.writeShort((Class289.anInt3223 * -1803844265), 1404835786);
							buffer.writeShort((-471480167 * (Class611.anInt8009)), 1404835786);
							buffer.writeByte(Class204.aClass527_Sub31_2213.aClass700_Sub37_10637.method17279((byte) 85), 79676709);
							Class187.method3655(buffer, 575631556);
							buffer.writeString(client.aString11162, 331776964);
							buffer.writeInt((client.anInt10992 * 651761593), 1605192647);
							RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
							buffer.writeByte(((class527_sub38.anInt10689) * -441238943), 528495772);
							buffer.writeBytes(class527_sub38.buffer, 0, -441238943 * class527_sub38.anInt10689, (byte) 13);
							client.aBool11020 = true;
							RSByteBuffer class527_sub38_29_ = (new RSByteBuffer(Class177.aClass527_Sub40_2048.method16673(-966642639)));
							Class177.aClass527_Sub40_2048.method16668(class527_sub38_29_, -1401845428);
							buffer.writeBytes(class527_sub38_29_.buffer, 0, class527_sub38_29_.buffer.length, (byte) 81);
							buffer.writeInt((client.anInt11069 * -256103321), -328537095);
							buffer.writeInt((-2046174135 * (client.anInt11035)), 1278394600);
							buffer.writeInt((1582447073 * (client.anInt10995)), -832083547);
							buffer.writeInt((-327211569 * (client.anInt10998)), 29528695);
							buffer.writeInt((-686351769 * (client.anInt11007)), -2112063010);
							buffer.writeString(Class628.aString8204, 1801410273);
							buffer.writeByte(((client.aString11308) == null) ? 0 : 1, 1749274502);
							if (client.aString11308 != null)
								buffer.writeString(client.aString11308, 1762970152);
							buffer.writeByte((client.aBool11271 ? 1 : 0), 1253570295);
							buffer.writeByte((client.aBool11109 ? 1 : 0), 2062746847);
							buffer.writeByte(Class546.anInt7265 * 809456719 & 0x1, 5240385);
							buffer.writeInt((2061730483 * (client.anInt11008)), -68981264);
							buffer.writeString(client.aString11009, 1021853918);
							buffer.writeByte((Class3.aClass13_41 == null || (44791937 * Class3.aClass13_41.anInt181 != 44791937 * (Class3.aClass13_34.anInt181))) ? 1 : 0, -849514143);
							buffer.writeShort(((Class3.aClass13_36.anInt181) * 44791937), 1404835786);
							Class90.method1642(buffer, -990040724);
							buffer.method16471(Class32.anIntArray272, i_28_, buffer.anInt10689 * -441238943, (byte) -20);
							buffer.method16437((-441238943 * buffer.anInt10689 - i_27_), -18705907);
						} else {
							Class410 class410;
							if (Class32.aBool273)
								class410 = Class410.aClass410_4352;
							else
								class410 = Class410.aClass410_4348;
							buffer.writeByte((class410.anInt4354 * 1000765535), 30739203);
							buffer.writeShort(0, 1404835786);
							int i_30_ = buffer.anInt10689 * -441238943;
							int i_31_ = buffer.anInt10689 * -441238943;
							if (!Class32.aBool273) {
								buffer.writeInt(876, -1980493121);
								buffer.writeInt(1, 511591276);
								RSByteBuffer class527_sub38 = Class454.method7337(-1906607608);
								buffer.writeBytes(class527_sub38.buffer, 0, -441238943 * class527_sub38.anInt10689, (byte) 91);
								i_31_ = (buffer.anInt10689 * -441238943);
								buffer.writeByte((-8573635942399706625L * Class32.aLong321 == -1L) ? 1 : 0, -202689824);
								if (-8573635942399706625L * Class32.aLong321 == -1L)
									buffer.writeString(Class32.aString289, -722012680);
								else
									buffer.writeLong(-8573635942399706625L * Class32.aLong321);
							}
							buffer.writeByte((-1907167873 * client.aClass678_11259.anInt8610), -1224491920);
							buffer.writeByte(Class144_Sub1.aClass671_8995.method87(), -1371156954);
							buffer.writeByte(Class81.method1574((byte) 3), -1286513092);
							buffer.writeShort((-1803844265 * (Class289.anInt3223)), 1404835786);
							buffer.writeShort((-471480167 * (Class611.anInt8009)), 1404835786);
							buffer.writeByte(Class204.aClass527_Sub31_2213.aClass700_Sub37_10637.method17279((byte) 122), 1975486784);
							Class187.method3655(buffer, -176000687);
							buffer.writeString(client.aString11162, 940856628);
							RSByteBuffer class527_sub38 = Class204.aClass527_Sub31_2213.method16329(1998601858);
							buffer.writeByte((-441238943 * (class527_sub38.anInt10689)), 1171733348);
							buffer.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 92);
							RSByteBuffer class527_sub38_32_ = (new RSByteBuffer(Class177.aClass527_Sub40_2048.method16673(-271613782)));
							Class177.aClass527_Sub40_2048.method16668(class527_sub38_32_, -153167754);
							buffer.writeBytes(class527_sub38_32_.buffer, 0, class527_sub38_32_.buffer.length, (byte) 28);
							buffer.writeInt((-256103321 * (client.anInt11069)), 1067436139);
							buffer.writeString(Class628.aString8204, -54276493);
							buffer.writeInt((client.anInt10992 * 651761593), -43503941);
							buffer.writeInt((2061730483 * (client.anInt11008)), 885261467);
							buffer.writeString(client.aString11009, -2120101790);
							buffer.writeByte(809456719 * Class546.anInt7265 & 0x1, 41163473);
							Class90.method1642(buffer, -990040724);
							buffer.method16471(Class32.anIntArray272, i_31_, buffer.anInt10689 * -441238943, (byte) -2);
							buffer.method16437((-441238943 * buffer.anInt10689 - i_30_), -18705907);
						}
						Class32.aClass109_270.method1969(class527_sub15, (byte) 1);
						Class32.aClass109_270.method1954(-597283324);
						Class32.aClass109_270.aClass2_1367 = new Class2(Class32.anIntArray272);
						for (int i_33_ = 0; i_33_ < 4; i_33_++)
							Class32.anIntArray272[i_33_] += 50;
						Class32.aClass109_270.aClass2_1365 = new Class2(Class32.anIntArray272);
						new Class2(Class32.anIntArray272);
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.method18445(Class32.aClass109_270.aClass2_1365, -324035411);
						Class32.anIntArray272 = null;
						Class32.loginStage = -927217961;
					}
					if (95 == -17413703 * Class32.loginStage) {
						if (!Class32.aClass109_270.method1967(2035360292).method9466(1, (byte) -100))
							break;
						Class32.aClass109_270.method1967(1943119072).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
						int i_34_ = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedByte();
						Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
						if (21 == i_34_)
							Class32.loginStage = 65381843;
						else {
							if (i_34_ == 1) {
								Class32.loginStage = -466368052;
								Class95.method1727(i_34_, (byte) -65);
								break;
							}
							if (52 == i_34_) {
								Class226.anInt2352 = -568496511 * i_34_;
								Class32.loginStage = -613686167;
							} else if (2 == i_34_) {
								if (Class32.aBool322) {
									Class32.aBool322 = false;
									Class32.loginStage = 496299902;
									break;
								}
								if (-626035783 * Class32.anInt286 == 257) {
									Class598.aClass144_Sub1_7852.method14504(1403860340);
									Class32.loginStage = 449813623;
								} else
									Class32.loginStage = 738931710;
							} else if (15 == i_34_) {
								Class32.aClass109_270.anInt1359 = -628032958;
								Class32.loginStage = -1393586013;
							} else {
								if (i_34_ == 23 && Class32.anInt310 * -1381929297 < 3) {
									Class32.anInt309 = 0;
									Class32.anInt310 += -1321949105;
									Class32.loginStage = 496299902;
									Class32.aClass109_270.method1968((byte) 108);
									break;
								}
								if (42 == i_34_) {
									Class32.loginStage = -1039086083;
									Class95.method1727(i_34_, (byte) 61);
									break;
								}
								if (120 == Class32.anInt286 * -626035783 && i_34_ == 49 && client.anInt11048 * -1927019389 != 4) {
									if (52 != Class32.anInt311 * -1928963105)
										Class95.method1727(i_34_, (byte) 58);
									break;
								}
								if (Class32.aBool269 && !Class32.aBool273 && -1552456759 * Class32.anInt274 != -1 && i_34_ == 35) {
									Class32.aBool273 = true;
									Class32.anInt309 = 0;
									Class32.loginStage = 496299902;
									Class32.aClass109_270.method1968((byte) 50);
									break;
								}
								if (i_34_ == 53)
									Class32.loginStage = 59863700;
								else {
									Class32.loginStage = 35449993;
									Class95.method1727(i_34_, (byte) -9);
									Class32.aClass109_270.method1968((byte) 116);
									Class387.method6437(-869433787);
									break;
								}
							}
						}
					}
					if (Class32.loginStage * -17413703 == 123) {
						if (Class32.aClass109_270.method1967(2016862464).method9466(1, (byte) -101)) {
							Class32.aClass109_270.method1967(1966052027).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
							int i_35_ = ((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff);
							Class32.anInt316 = i_35_ * 1207118122;
							Class32.loginStage = 35449993;
							Class95.method1727(21, (byte) 36);
							Class32.aClass109_270.method1968((byte) 63);
							Class387.method6437(-719421158);
						}
					} else if (-17413703 * Class32.loginStage == 213) {
						if (Class32.aClass109_270.method1967(2031361154).method9466(2, (byte) -90)) {
							Class32.aClass109_270.method1967(2082137652).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 2, -226630132);
							Class32.anInt319 = (((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[1]) & 0xff) + (((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff) << 8)) * 1042918403;
							Class32.loginStage = -927217961;
						}
					} else if (Class32.loginStage * -17413703 == 244) {
						if (Class32.aClass109_270.method1967(1883932287).method9466(4, (byte) -70)) {
							Class32.aClass109_270.method1967(2013219991).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 4, -226630132);
							Class32.anInt295 = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readInt() * 881536147;
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							Class32.loginStage = 35449993;
							Class95.method1727(53, (byte) 19);
							Class32.aClass109_270.method1968((byte) 82);
							Class387.method6437(-959328724);
						}
					} else if (190 == Class32.loginStage * -17413703) {
						if (Class226.anInt2352 * 972345729 == 29) {
							if (!Class32.aClass109_270.method1967(1922072088).method9466(1, (byte) -74))
								break;
							Class32.aClass109_270.method1967(1946151621).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
							Class32.anInt315 = ((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff) * 1716310515;
						} else if (45 == 972345729 * Class226.anInt2352) {
							if (!Class32.aClass109_270.method1967(2098923243).method9466(3, (byte) 5))
								break;
							Class32.aClass109_270.method1967(1965025622).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 3, -226630132);
							Class32.anInt315 = ((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff) * 1716310515;
							Class32.anInt317 = ((((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[1]) & 0xff) << 8) + ((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[2]) & 0xff)) * -157279991;
						} else
							throw new IllegalStateException();
						Class32.loginStage = 35449993;
						Class95.method1727(Class226.anInt2352 * 972345729, (byte) 12);
						Class32.aClass109_270.method1968((byte) 65);
						Class387.method6437(1419712018);
						if (Class208_Sub23.method15642((-1927019389 * client.anInt11048), -1530909155)) {
							Class149.method2493(true, (byte) -25);
							Class32.anInt302 = -94156425 * Class226.anInt2352;
						}
					} else if (-17413703 * Class32.loginStage == 225) {
						if (Class32.aClass109_270.method1967(1960917857).method9466(2, (byte) -41)) {
							Class32.aClass109_270.method1967(1955478971).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 2, -226630132);
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							Class208.anInt2234 = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedShort() * -347706509;
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							Class32.loginStage = -400986209;
						}
					} else if (231 == Class32.loginStage * -17413703) {
						if (Class32.aClass109_270.method1967(1947505259).method9466(-395857477 * Class208.anInt2234, (byte) -14)) {
							Class32.aClass109_270.method1967(2014079562).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, Class208.anInt2234 * -395857477, -226630132);
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							byte[] is = (new byte[-395857477 * Class208.anInt2234 + 1]);
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.method18449(is, 0, -395857477 * Class208.anInt2234, 1293617182);
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							RSByteBuffer class527_sub38 = new RSByteBuffer(is);
							String string = class527_sub38.readString(776941415);
							Class183.method3558(string, true, client.aBool11193, 908926441);
							Class95.method1727(972345729 * Class226.anInt2352, (byte) 76);
							if (Class32.anInt286 * -626035783 == 120 && client.anInt11048 * -1927019389 != 4)
								Class32.loginStage = -927217961;
							else {
								Class32.loginStage = 35449993;
								Class32.aClass109_270.method1968((byte) 69);
								Class387.method6437(1829699813);
							}
						}
					} else {
						if (255 == Class32.loginStage * -17413703) {
							if (!Class32.aClass109_270.method1967(2122751888).method9466(2, (byte) -86))
								break;
							Class32.aClass109_270.method1967(1921847074).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 2, -226630132);
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							Class32.aClass109_270.anInt1359 = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedShort() * 314016479;
							Class32.loginStage = 804313553;
						}
						if (-17413703 * Class32.loginStage == 265) {
							if (!Class32.aClass109_270.method1967(2128483288).method9466(Class32.aClass109_270.anInt1359 * 1011661087, (byte) -15))
								break;
							Class32.aClass109_270.method1967(2056697150).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1011661087 * Class32.aClass109_270.anInt1359, -226630132);
							Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
							boolean bool = (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedByte() == 1);
							while (-441238943 * (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) < (Class32.aClass109_270.anInt1359 * 1011661087)) {
								Class425 class425 = (Class112.aClass95_Sub1_Sub2_1406.method14483((Class32.aClass109_270.aClass527_Sub38_Sub2_1364), 1221640757));
								Class598.aClass144_Sub1_7852.anInterface3_1670.method18(class425.anInt4803 * 494563151, class425.anObject4804, -216256563);
							}
							if (bool) {
								Class527_Sub15 class527_sub15 = Class565.method9498(757051694);
								Class527_Sub38_Sub2 class527_sub38_sub2 = (class527_sub15.buffer);
								class527_sub38_sub2.writeByte((1000765535 * Class410.aClass410_4342.anInt4354), 1486069252);
								Class32.aClass109_270.method1969(class527_sub15, (byte) 1);
								Class32.aClass109_270.method1954(-1127305339);
								Class32.loginStage = 384431780;
							} else
								Class32.loginStage = 449813623;
						}
						if (-17413703 * Class32.loginStage == 132) {
							if (!Class32.aClass109_270.method1967(1955050306).method9466(1, (byte) -54))
								break;
							Class32.aClass109_270.method1967(1942796741).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
							int i_36_ = ((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff);
							if (i_36_ != 2) {
								if (29 == i_36_ || i_36_ == 45) {
									Class226.anInt2352 = i_36_ * -568496511;
									Class32.loginStage = -1854435922;
								} else {
									Class32.loginStage = 35449993;
									Class95.method1727(i_36_, (byte) 78);
									Class32.aClass109_270.method1968((byte) 93);
									Class387.method6437(-60666087);
									if (Class208_Sub23.method15642(client.anInt11048 * -1927019389, -622665131)) {
										Class149.method2493(true, (byte) -69);
										Class32.anInt302 = 1511270135 * i_36_;
									}
									break;
								}
								break;
							}
							Class32.loginStage = 738931710;
						}
						if (142 == Class32.loginStage * -17413703) {
							if (!Class32.aClass109_270.method1967(2001432296).method9466(1, (byte) -99))
								break;
							Class32.aClass109_270.method1967(2058746254).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
							Class398.anInt4122 = ((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer[0]) & 0xff) * 45424191;
							Class32.loginStage = 1199781619;
						}
						if (-17413703 * Class32.loginStage == 155) {
							Class527_Sub38_Sub2 class527_sub38_sub2 = (Class32.aClass109_270.aClass527_Sub38_Sub2_1364);
							if (257 == -626035783 * Class32.anInt286) {
								if (!Class32.aClass109_270.method1967(2012661271).method9466(-2121018945 * Class398.anInt4122, (byte) -16))
									break;
								Class32.aClass109_270.method1967(1971687476).method9472(class527_sub38_sub2.buffer, 0, -2121018945 * Class398.anInt4122, -226630132);
								class527_sub38_sub2.anInt10689 = 0;
								Class553.method9193(class527_sub38_sub2, (byte) 82);
								client.anInt11075 = class527_sub38_sub2.readUnsignedByte() * 916095945;
								client.anInt11118 = (class527_sub38_sub2.readUnsignedByte() * -564089575);
								client.aBool11180 = class527_sub38_sub2.readUnsignedByte() == 1;
								client.aBool11169 = class527_sub38_sub2.readUnsignedByte() == 1;
								client.aBool11170 = class527_sub38_sub2.readUnsignedByte() == 1;
								client.aBool11172 = class527_sub38_sub2.readUnsignedByte() == 1;
								client.anInt11070 = class527_sub38_sub2.readUnsignedShort() * 46813759;
								client.aBool11127 = class527_sub38_sub2.readUnsignedByte() == 1;
								Class335.anInt3642 = class527_sub38_sub2.method16581(491564909) * 1129192597;
								client.aBool11165 = class527_sub38_sub2.readUnsignedByte() == 1;
								Class470.aString5359 = class527_sub38_sub2.readString(1631140103);
								Class542.aLong7237 = ((class527_sub38_sub2.method16500((byte) -11) - Class234.method4347(-1408626088)) * 3431728537074997063L);
								client.aClass509_11072.method8310(-1606967924).method17368(client.aBool11165, 97871808);
								Class396.aClass506_4119.method8231(1137245391).method8310(1643121979).method17368(client.aBool11165, 97871808);
								Class174_Sub2.aClass24_Sub17_9120.method17406(client.aBool11165, (byte) -47);
								Class381.aClass24_Sub9_3936.method17383(client.aBool11165, (byte) 109);
							} else {
								if (!Class32.aClass109_270.method1967(1921058833).method9466(Class398.anInt4122 * -2121018945, (byte) -110))
									break;
								Class32.aClass109_270.method1967(2094486602).method9472(class527_sub38_sub2.buffer, 0, -2121018945 * Class398.anInt4122, -226630132);
								class527_sub38_sub2.anInt10689 = 0;
								Class553.method9193(class527_sub38_sub2, (byte) 51);
								client.anInt11075 = class527_sub38_sub2.readUnsignedByte() * 916095945;
								client.anInt11118 = (class527_sub38_sub2.readUnsignedByte() * -564089575);
								client.aBool11180 = class527_sub38_sub2.readUnsignedByte() == 1;
								Class335.anInt3642 = class527_sub38_sub2.method16581(308104857) * 1129192597;
								Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte12190 = (byte) class527_sub38_sub2.readUnsignedByte();
								client.aBool11169 = class527_sub38_sub2.readUnsignedByte() == 1;
								client.aBool11170 = class527_sub38_sub2.readUnsignedByte() == 1;
								Class208_Sub4.aLong9886 = (class527_sub38_sub2.method16612((byte) 1) * 5772380842217832197L);
								Class542.aLong7237 = (((Class208_Sub4.aLong9886 * -5607471586899397171L) - Class234.method4347(-1408626088) - class527_sub38_sub2.method16451((byte) 0)) * 3431728537074997063L);
								int i_37_ = class527_sub38_sub2.readUnsignedByte();
								client.aBool11127 = 0 != (i_37_ & 0x1);
								Class632.aBool8270 = 0 != (i_37_ & 0x2);
								Class338.anInt3655 = class527_sub38_sub2.readInt() * -543847665;
								Class599.anInt7857 = (class527_sub38_sub2.readInt() * -1773581867);
								Class299.anInt3400 = class527_sub38_sub2.readUnsignedShort() * -1264613215;
								Class254.anInt2808 = class527_sub38_sub2.readUnsignedShort() * 1790063359;
								Class518.anInt7051 = class527_sub38_sub2.readUnsignedShort() * 1626011459;
								Class509.anInt6971 = (class527_sub38_sub2.readInt() * -827094421);
								Class200.aClass50_2203 = new Class50(Class509.anInt6971 * 1512428099);
								new Thread(Class200.aClass50_2203).start();
								Class218.anInt2286 = (class527_sub38_sub2.readUnsignedByte() * 2028231237);
								Class9.anInt152 = class527_sub38_sub2.readUnsignedShort() * 2147330289;
								Class407.anInt4263 = class527_sub38_sub2.readUnsignedShort() * -639497575;
								Class697.aBool8762 = class527_sub38_sub2.readUnsignedByte() == 1;
								Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12202 = RuntimeException_Sub1.aString12047 = class527_sub38_sub2.readVersionedString(90180177);
								Class313_Sub1.anInt10010 = (class527_sub38_sub2.readUnsignedByte() * 1239025433);
								Class105.anInt1310 = (class527_sub38_sub2.readInt() * -1084407043);
								Class3.aClass13_41 = new Class13();
								Class3.aClass13_41.anInt181 = class527_sub38_sub2.readUnsignedShort() * 1189922689;
								if (44791937 * Class3.aClass13_41.anInt181 == 65535)
									Class3.aClass13_41.anInt181 = -1189922689;
								Class3.aClass13_41.aString178 = class527_sub38_sub2.readVersionedString(90180177);
								Class3.aClass13_41.anInt179 = class527_sub38_sub2.readUnsignedShort() * -1993161747;
								Class3.aClass13_41.anInt180 = class527_sub38_sub2.readUnsignedShort() * -911001455;
								if ((Class73.aClass677_790 != Class677.aClass677_8599) && ((Class73.aClass677_790 != Class677.aClass677_8597) || 962135673 * client.anInt11075 < 2) && (Class3.aClass13_34.method703(Class3.aClass13_39, 1250978745)))
									Class385.method6431((byte) 7);
							}
							if (client.aBool11170) {
								try {
									Class60.method1375(Class212.anApplet2258, "zap", 605015114);
								} catch (Throwable throwable) {
									if (client.aBool10990) {
										try {
											Class212.anApplet2258.getAppletContext().showDocument(new URL(Class212.anApplet2258.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception exception) {
											/* empty */
										}
									}
								}
							} else {
								try {
									Class60.method1375(Class212.anApplet2258, "unzap", 918437091);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if (Class73.aClass677_790 == Class677.aClass677_8596)
								Class411.aClass411_4357.method6580((byte) 5);
							if (-626035783 * Class32.anInt286 == 257)
								Class32.loginStage = 1873331486;
							else {
								Class32.loginStage = 35449993;
								Class95.method1727(2, (byte) 17);
								Class297.method5511((byte) -72);
								Class78.method1560(0, (byte) 0);
								Class32.aClass109_270.incomingPacket = null;
								break;
							}
						}
						if (-17413703 * Class32.loginStage == 174) {
							if (!Class32.aClass109_270.method1967(2047923020).method9466(3, (byte) -15))
								break;
							Class32.aClass109_270.method1967(1982215204).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 3, -226630132);
							Class32.loginStage = -2138035866;
						}
						if (182 == -17413703 * Class32.loginStage) {
							Class527_Sub38_Sub2 class527_sub38_sub2 = (Class32.aClass109_270.aClass527_Sub38_Sub2_1364);
							class527_sub38_sub2.anInt10689 = 0;
							if (class527_sub38_sub2.method18447((byte) 80)) {
								if (!Class32.aClass109_270.method1967(2140624185).method9466(1, (byte) -83))
									break;
								Class32.aClass109_270.method1967(2002134105).method9472(class527_sub38_sub2.buffer, 3, 1, -226630132);
							}
							Class32.aClass109_270.incomingPacket = (Class294.method5296(2109488458)[class527_sub38_sub2.method18465((byte) 3)]);
							Class32.aClass109_270.anInt1359 = (class527_sub38_sub2.readUnsignedShort() * 314016479);
							Class32.loginStage = 1377031584;
						}
						if (Class32.loginStage * -17413703 == 160) {
							if (Class32.aClass109_270.method1967(2045175016).method9466(Class32.aClass109_270.anInt1359 * 1011661087, (byte) -107)) {
								Class32.aClass109_270.method1967(2139511120).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, (Class32.aClass109_270.anInt1359 * 1011661087), -226630132);
								Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
								int i_38_ = (1011661087 * Class32.aClass109_270.anInt1359);
								Class32.loginStage = 35449993;
								Class95.method1727(2, (byte) 31);
								Class238.method4376(1836827513);
								Class174.method2796((Class32.aClass109_270.aClass527_Sub38_Sub2_1364), -278499904);
								int i_39_ = i_38_ - (-441238943 * (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689));
								Class527_Sub38_Sub2 class527_sub38_sub2 = new Class527_Sub38_Sub2(i_39_);
								System.arraycopy((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) * -441238943, (class527_sub38_sub2.buffer), 0, i_39_);
								Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 += 1474750881 * i_39_;
								if (IncomingPacket.aClass422_4780 == Class32.aClass109_270.incomingPacket)
									client.aClass509_11072.method8280(new Class514(Class503.aClass503_6877, class527_sub38_sub2), -2018589233);
								else
									client.aClass509_11072.method8280(new Class514(Class503.aClass503_6876, class527_sub38_sub2), -236126026);
								if (((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) * -441238943) != i_38_)
									throw new RuntimeException(new StringBuilder().append((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) * -441238943).append(" ").append(i_38_).toString());
								Class32.aClass109_270.incomingPacket = null;
							}
						} else {
							if (203 != -17413703 * Class32.loginStage)
								break;
							if (1011661087 * Class32.aClass109_270.anInt1359 == -2) {
								if (!Class32.aClass109_270.method1967(2121310594).method9466(2, (byte) -6))
									break;
								Class32.aClass109_270.method1967(1935544938).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, 2, -226630132);
								Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
								Class32.aClass109_270.anInt1359 = Class32.aClass109_270.aClass527_Sub38_Sub2_1364.readUnsignedShort() * 314016479;
							}
							if (Class32.aClass109_270.method1967(2060671486).method9466(Class32.aClass109_270.anInt1359 * 1011661087, (byte) -83)) {
								Class32.aClass109_270.method1967(2098768078).method9472((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.buffer), 0, (1011661087 * Class32.aClass109_270.anInt1359), -226630132);
								Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689 = 0;
								int i_40_ = (1011661087 * Class32.aClass109_270.anInt1359);
								Class32.loginStage = 35449993;
								Class95.method1727(15, (byte) 15);
								Class631.method10468((byte) 42);
								Class174.method2796((Class32.aClass109_270.aClass527_Sub38_Sub2_1364), 70337356);
								if (-441238943 * (Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) != i_40_)
									throw new RuntimeException(new StringBuilder().append((Class32.aClass109_270.aClass527_Sub38_Sub2_1364.anInt10689) * -441238943).append(" ").append(i_40_).toString());
								Class32.aClass109_270.incomingPacket = null;
							}
						}
					}
				} catch (IOException ioexception) {
					Class32.aClass109_270.method1968((byte) 7);
					if (Class32.anInt310 * -1381929297 < 3) {
						if (Class32.anInt286 * -626035783 == 257)
							Class3.aClass13_34.method700(1957009914);
						else
							Class3.aClass13_36.method700(1918850911);
						Class32.anInt309 = 0;
						Class32.anInt310 += -1321949105;
						Class32.loginStage = 496299902;
					} else {
						Class32.loginStage = 35449993;
						Class95.method1727(-4, (byte) -6);
						Class387.method6437(-466713895);
					}
					break;
				}
				break;
			} while (false);
		}
	}
}
