/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Class106 {
	Class567 aClass567_1254;
	Class708 aClass708_1255 = new Class708();
	int anInt1256;
	RSByteBuffer aClass536_Sub33_1257;
	public Class15 aClass15_1258;
	int anInt1259;
	Class15 aClass15_1260;
	IncomingPacket aClass422_1261;
	int anInt1262;
	boolean aBool1263;
	int anInt1264;
	public int anInt1265;
	public boolean aBool1266;
	Class536_Sub33_Sub2 aClass536_Sub33_Sub2_1267;
	public int anInt1268 = 0;
	int anInt1269;
	IncomingPacket aClass422_1270;
	IncomingPacket aClass422_1271;
	Class27 aClass27_1272;
	int anInt1273;
	IncomingPacket aClass422_1274;
	public static Class143 aClass143_1275;

	final void method1407(int i) {
		aClass708_1255.method8304(454036827);
		anInt1268 = 0;
	}

	public final void method1408(int i) throws IOException {
		if (aClass567_1254 != null && anInt1268 * -1444616881 > 0) {
			aClass536_Sub33_1257.off = 0;
			for (;;) {
				Class536_Sub23 class536_sub23 = (Class536_Sub23) aClass708_1255.method8308(1867269829);
				if (null == class536_sub23 || (class536_sub23.anInt10530 * -1225204241 > (aClass536_Sub33_1257.buffer.length - -810172525 * aClass536_Sub33_1257.off)))
					break;
				aClass536_Sub33_1257.method9696(class536_sub23.aClass536_Sub33_Sub2_10528.buffer, 0, class536_sub23.anInt10530 * -1225204241, (byte) 114);
				anInt1268 -= -1844865695 * class536_sub23.anInt10530;
				class536_sub23.method6484(601871671);
				class536_sub23.aClass536_Sub33_Sub2_10528.method9685(120764410);
				class536_sub23.method9582((byte) 127);
			}
			aClass567_1254.method6912(aClass536_Sub33_1257.buffer, 0, (-810172525 * aClass536_Sub33_1257.off), (byte) -57);
			anInt1256 += aClass536_Sub33_1257.off * 18082327;
			anInt1265 = 0;
		}
	}

	public final void method1409(Class536_Sub23 class536_sub23, int i) {
		aClass708_1255.method8335(class536_sub23, 579551358);
		class536_sub23.anInt10530 = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -2086101859);
		class536_sub23.aClass536_Sub33_Sub2_10528.off = 0;
		anInt1268 += -1844865695 * class536_sub23.anInt10530;
	}

	void method1410(int i) {
		if (client.anInt11014 % 50 == 0) {
			anInt1273 = -343345631 * anInt1256;
			anInt1256 = 0;
			anInt1269 = anInt1259 * -547725185;
			anInt1259 = 0;
		}
	}

	public final void method1411() throws IOException {
		if (aClass567_1254 != null && anInt1268 * -1444616881 > 0) {
			aClass536_Sub33_1257.off = 0;
			for (;;) {
				Class536_Sub23 class536_sub23 = (Class536_Sub23) aClass708_1255.method8308(1867269829);
				if (null == class536_sub23 || (class536_sub23.anInt10530 * -1225204241 > (aClass536_Sub33_1257.buffer.length - -810172525 * aClass536_Sub33_1257.off)))
					break;
				aClass536_Sub33_1257.method9696(class536_sub23.aClass536_Sub33_Sub2_10528.buffer, 0, class536_sub23.anInt10530 * -1225204241, (byte) 90);
				anInt1268 -= -1844865695 * class536_sub23.anInt10530;
				class536_sub23.method6484(-1062937264);
				class536_sub23.aClass536_Sub33_Sub2_10528.method9685(120764410);
				class536_sub23.method9582((byte) 127);
			}
			aClass567_1254.method6912(aClass536_Sub33_1257.buffer, 0, (-810172525 * aClass536_Sub33_1257.off), (byte) -9);
			anInt1256 += aClass536_Sub33_1257.off * 18082327;
			anInt1265 = 0;
		}
	}

	Class106() {
		aClass536_Sub33_1257 = new RSByteBuffer(1700);
		aClass536_Sub33_Sub2_1267 = new Class536_Sub33_Sub2(40000);
		aClass422_1261 = null;
		anInt1262 = 0;
		aBool1263 = true;
		anInt1264 = 0;
		anInt1265 = 0;
		aBool1266 = false;
		aClass27_1272 = new Class27();
		Thread thread = new Thread(aClass27_1272);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	void method1412(int i) {
		aClass567_1254 = null;
		aClass27_1272.method746(null, 1545518211);
	}

	public Class567 method1413(short i) {
		return aClass567_1254;
	}

	final void method1414() {
		aClass708_1255.method8304(454036827);
		anInt1268 = 0;
	}

	final void method1415() {
		aClass708_1255.method8304(454036827);
		anInt1268 = 0;
	}

	void method1416() {
		if (null != aClass567_1254) {
			aClass567_1254.method6913(-842345557);
			aClass567_1254 = null;
		}
		aClass27_1272.method746(null, 2057736557);
	}

	final void method1417() {
		aClass708_1255.method8304(454036827);
		anInt1268 = 0;
	}

	void method1418(int i) {
		if (null != aClass567_1254) {
			aClass567_1254.method6913(-842345557);
			aClass567_1254 = null;
		}
		aClass27_1272.method746(null, 1765330487);
	}

	void method1419() {
		if (null != aClass567_1254) {
			aClass567_1254.method6913(-842345557);
			aClass567_1254 = null;
		}
		aClass27_1272.method746(null, 1972521207);
	}

	void method1420(Class567 class567, String string, int i) {
		aClass567_1254 = class567;
		aClass27_1272.method746(string, 1542482426);
	}

	void method1421() {
		aClass567_1254 = null;
		aClass27_1272.method746(null, 1625532568);
	}

	void method1422() {
		aClass567_1254 = null;
		aClass27_1272.method746(null, 2068253200);
	}

	void method1423() {
		if (null != aClass567_1254) {
			aClass567_1254.method6913(-842345557);
			aClass567_1254 = null;
		}
		aClass27_1272.method746(null, 1753032383);
	}

	public static void method1424(boolean bool, int i) {
		Class184_Sub2.aClass211_9442.method2987((short) 30001);
		if (Class426.method5129(-708374433 * client.anInt11101, 1603352511)) {
			Class106[] class106s = client.aClass106Array11062;
			for (int i_0_ = 0; i_0_ < class106s.length; i_0_++) {
				Class106 class106 = class106s[i_0_];
				class106.anInt1265 += -768200239;
				if (-1086863567 * class106.anInt1265 < 50 && !bool)
					return;
				class106.anInt1265 = 0;
				if (!class106.aBool1266 && class106.method1413((short) -5978) != null) {
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4521, class106.aClass15_1258, 692040490);
					class106.method1409(class536_sub23, 768521961);
					try {
						class106.method1408(282491700);
					} catch (IOException ioexception) {
						class106.aBool1266 = true;
					}
				}
			}
			Class184_Sub2.aClass211_9442.method2987((short) 10786);
		}
	}

	static final void method1425(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class484.method5845(class251, class234, class668, -213751254);
	}

	static final void method1426(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class446.aByte4903;
	}

	public static void method1427(boolean bool, int i) {
		if (bool) {
			if (-1959825479 * client.anInt11187 != -1)
				Class444.method5395(client.anInt11187 * -1959825479, -687424059);
			for (Class536_Sub36 class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method562(-1369733870)); class536_sub36 != null; class536_sub36 = (Class536_Sub36) client.aClass4_11008.method567(333972729)) {
				if (!class536_sub36.method6487((byte) -93)) {
					class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method562(-1251960404));
					if (class536_sub36 == null)
						break;
				}
				Class398.method4903(class536_sub36, true, false, 1759806773);
			}
			client.anInt11187 = -2074470025;
			client.aClass4_11008 = new Class4(8);
			Class302.method4101(-2134721166);
			client.anInt11187 = Class644.aClass628_8352.anInt8195 * -1122882805;
			if (-1 != client.anInt11187 * -1959825479) {
				Class325_Sub1.method9206(false, 39927128);
				Class552.method6692(-1925335057);
				Class668.method8010(-1959825479 * client.anInt11187, null, -731820984);
			}
		}
		Class360_Sub1.method9272((short) -28984);
		Class683.aClass301_Sub1_8651.method4028(true, (byte) 113);
		Class61.aBool653 = false;
		Class209.method2978(-761686175);
		client.anInt11179 = -937599055;
		Class458_Sub5.method9373(client.anInt11178 * -551919553, (byte) 14);
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 = new Class649_Sub1_Sub5_Sub1_Sub2(null);
		client.aMap11157.clear();
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7842((float) (client.aClass515_11066.method6321((byte) 91) * 512 / 2), 0.0F, (float) (client.aClass515_11066.method6243(177401017) * 512 / 2));
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anIntArray11944[0] = client.aClass515_11066.method6321((byte) -98) / 2;
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anIntArray11945[0] = client.aClass515_11066.method6243(177401017) / 2;
		Class685.anInt8665 = 0;
		Class637.anInt8301 = 0;
		if (3 == 155362615 * Class246.anInt2474) {
			Class637.anInt8301 = (50426247 * Class440.anInt4874 << 9) * 1420867453;
			Class685.anInt8665 = 717279039 * (Class606.anInt7898 * -978040595 << 9);
		} else
			Class32.method792((byte) 0);
		client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
	}

	static final void method1428(int i) {
		Class536_Sub33_Sub2 class536_sub33_sub2 = client.aClass106_11322.aClass536_Sub33_Sub2_1267;
		for (int i_2_ = 0; i_2_ < 816748469 * client.anInt11055; i_2_++) {
			int i_3_ = client.anIntArray11105[i_2_];
			Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) (((Class536_Sub13) client.aClass4_11050.method556((long) i_3_)).anObject10468));
			class536_sub33_sub2.readUnsignedShort((short) -9451);
			int i_4_ = class536_sub33_sub2.readUnsignedByte(-1838534941);
			if ((i_4_ & 0x2) != 0)
				i_4_ += class536_sub33_sub2.readUnsignedByte(-677553067) << 8;
			if ((i_4_ & 0x200) != 0)
				i_4_ += class536_sub33_sub2.readUnsignedByte(-865148625) << 16;
			if ((i_4_ & 0x400000) != 0)
				i_4_ += class536_sub33_sub2.readUnsignedByte(-934111606) << 24;
			if ((i_4_ & 0x10000) != 0) {
				class649_sub1_sub5_sub1_sub1.anInterface3_11929.method29(-1410915460);
				class536_sub33_sub2.off += 1032351030;
				int i_5_ = ((class536_sub33_sub2.buffer[((class536_sub33_sub2.off += 516175515) * -810172525) - 1]) & 0xff);
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					int i_7_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
					Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) -90), i_7_, 1858049507));
					Class430 class430 = (Class678.aClass98_Sub1_Sub2_8625.method8390(class536_sub33_sub2, class478, 275541441));
					class649_sub1_sub5_sub1_sub1.anInterface3_11929.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) -30);
				}
			}
			if (0 != (i_4_ & 0x20000)) {
				class649_sub1_sub5_sub1_sub1.anInt12160 = class536_sub33_sub2.readUnsignedShort((short) 513) * 807464793;
				if (65535 == 400189673 * class649_sub1_sub5_sub1_sub1.anInt12160)
					class649_sub1_sub5_sub1_sub1.anInt12160 = 1621981019 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3292);
			}
			if ((i_4_ & 0x800) != 0) {
				class649_sub1_sub5_sub1_sub1.anInt12166 = class536_sub33_sub2.readUnsignedShortLE128(1763511665) * 524255573;
				if (65535 == class649_sub1_sub5_sub1_sub1.anInt12166 * -1969982467)
					class649_sub1_sub5_sub1_sub1.anInt12166 = -524255573;
			}
			if ((i_4_ & 0x200000) != 0) {
				int i_8_ = ((class536_sub33_sub2.buffer[((class536_sub33_sub2.off += 516175515) * -810172525) - 1]) & 0xff);
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					int i_10_ = class536_sub33_sub2.readUnsignedByte(-1283424078);
					int i_11_ = class536_sub33_sub2.readIntV2((byte) 25);
					int i_12_ = class536_sub33_sub2.method9744(-1746932359);
					class649_sub1_sub5_sub1_sub1.method11072(i_10_, i_11_, i_12_, 2098971425);
				}
			}
			if ((i_4_ & 0x100000) != 0) {
				int i_13_ = (class649_sub1_sub5_sub1_sub1.aClass296_12174.anIntArray3274).length;
				int i_14_ = 0;
				if (null != (class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3278))
					i_14_ = (class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3278).length;
				int i_15_ = 0;
				if ((class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3281) != null)
					i_14_ = (class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3281).length;
				int i_16_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
				if ((i_16_ & 0x1) != 1) {
					class536_sub33_sub2.off += 1032351030;
					int[] is = null;
					if ((i_16_ & 0x2) == 2) {
						is = new int[i_13_];
						for (int i_17_ = 0; i_17_ < i_13_; i_17_++)
							is[i_17_] = class536_sub33_sub2.method9720((byte) 1);
					}
					short[] is_18_ = null;
					if (4 == (i_16_ & 0x4)) {
						is_18_ = new short[i_14_];
						for (int i_19_ = 0; i_19_ < i_14_; i_19_++)
							is_18_[i_19_] = (short) class536_sub33_sub2.readUnsignedShort128(-1603970900);
					}
					short[] is_20_ = null;
					if ((i_16_ & 0x8) == 8) {
						is_20_ = new short[i_15_];
						for (int i_21_ = 0; i_21_ < i_15_; i_21_++)
							is_20_[i_21_] = (short) class536_sub33_sub2.readUnsignedShort128(548819823);
					}
					long l = (long) ((Class649_Sub1_Sub5_Sub1_Sub1.anInt12165 += -322954019) * 428710773 - 1);
					new Class304(l, is, null, null, null, is_18_, is_20_);
				}
			}
			if (0 != (i_4_ & 0x40)) {
				class649_sub1_sub5_sub1_sub1.anInt12170 = class536_sub33_sub2.readUnsignedShortLE128(1089402621) * -906604253;
				class649_sub1_sub5_sub1_sub1.anInt12168 = class536_sub33_sub2.readUnsignedShort128(479818072) * 1917987299;
			}
			if ((i_4_ & 0x80000) != 0) {
				class536_sub33_sub2.off += 1032351030;
				int i_22_ = ((class536_sub33_sub2.buffer[((class536_sub33_sub2.off += 516175515) * -810172525) - 1]) & 0xff);
				for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
					int i_24_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
					Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) -72), i_24_, 1858049507));
					Class430 class430 = (Class678.aClass98_Sub1_Sub2_8625.method8390(class536_sub33_sub2, class478, 275541441));
					class649_sub1_sub5_sub1_sub1.anInterface3_11929.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) 16);
				}
			}
			if ((i_4_ & 0x8000) != 0) {
				int i_25_ = (class649_sub1_sub5_sub1_sub1.aClass296_12174.anIntArray3317).length;
				int i_26_ = 0;
				if ((class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3278) != null)
					i_26_ = (class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3278).length;
				int i_27_ = 0;
				if ((class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3281) != null)
					i_27_ = (class649_sub1_sub5_sub1_sub1.aClass296_12174.aShortArray3281).length;
				int i_28_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
				if (1 == (i_28_ & 0x1))
					class649_sub1_sub5_sub1_sub1.aClass304_12163 = null;
				else {
					class536_sub33_sub2.off += 1032351030;
					int[] is = null;
					float[] fs = null;
					int[][] is_29_ = null;
					int[][] is_30_ = null;
					if (2 == (i_28_ & 0x2)) {
						is = new int[i_25_];
						if ((i_28_ & 0x10) == 16) {
							fs = new float[i_25_];
							is_29_ = new int[i_25_][3];
							is_30_ = new int[i_25_][3];
						}
						for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
							is[i_31_] = class536_sub33_sub2.method9720((byte) 1);
							if (16 == (i_28_ & 0x10) && is[i_31_] != -1) {
								fs[i_31_] = class536_sub33_sub2.method9712(2142524161);
								for (int i_32_ = 0; i_32_ < 3; i_32_++)
									is_29_[i_31_][i_32_] = class536_sub33_sub2.method9741((byte) 51);
								for (int i_33_ = 0; i_33_ < 3; i_33_++)
									is_30_[i_31_][i_33_] = class536_sub33_sub2.method9756((byte) 123);
							}
						}
					}
					short[] is_34_ = null;
					if ((i_28_ & 0x4) == 4) {
						is_34_ = new short[i_26_];
						for (int i_35_ = 0; i_35_ < i_26_; i_35_++)
							is_34_[i_35_] = (short) class536_sub33_sub2.readUnsignedShortLE(1517199203);
					}
					short[] is_36_ = null;
					if ((i_28_ & 0x8) == 8) {
						is_36_ = new short[i_27_];
						for (int i_37_ = 0; i_37_ < i_27_; i_37_++)
							is_36_[i_37_] = (short) class536_sub33_sub2.readUnsignedShort128(1047308650);
					}
					long l = (long) ((Class649_Sub1_Sub5_Sub1_Sub1.anInt12175 += -683966327) * -2099907143 - 1);
					class649_sub1_sub5_sub1_sub1.aClass304_12163 = new Class304(l, is, fs, is_29_, is_30_, is_34_, is_36_);
				}
			}
			if ((i_4_ & 0x20) != 0) {
				int[] is = new int[4];
				for (int i_38_ = 0; i_38_ < 4; i_38_++)
					is[i_38_] = class536_sub33_sub2.method9720((byte) 1);
				int i_39_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				Class360_Sub1.method9269(class649_sub1_sub5_sub1_sub1, is, i_39_, true, 1131805852);
			}
			if (0 != (i_4_ & 0x1)) {
				if (class649_sub1_sub5_sub1_sub1.aClass296_12174.method3986(-198439992))
					Class18.method688(class649_sub1_sub5_sub1_sub1, 1146989148);
				class649_sub1_sub5_sub1_sub1.method11075((Class296) (Class172.aClass34_Sub7_1922.method70(class536_sub33_sub2.method9720((byte) 1), (byte) -72)), (i_4_ & 0x800000) == 0, (i_4_ & 0x20000) == 0, true, -573315687);
				class649_sub1_sub5_sub1_sub1.method10873((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272 * 830254667), -324388659);
				class649_sub1_sub5_sub1_sub1.anInt11938 = -1906385303 * (235698067 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3318) << 3);
				if (class649_sub1_sub5_sub1_sub1.aClass296_12174.method3986(-198439992))
					Class76.method1155(class649_sub1_sub5_sub1_sub1.aByte10839, (class649_sub1_sub5_sub1_sub1.anIntArray11944[0]), (class649_sub1_sub5_sub1_sub1.anIntArray11945[0]), 0, null, class649_sub1_sub5_sub1_sub1, null, 352877239);
			}
			if ((i_4_ & 0x80) != 0) {
				int i_40_ = class536_sub33_sub2.readUnsignedByteC(2062437896);
				if (i_40_ > 0) {
					for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
						int i_42_ = -1;
						int i_43_ = -1;
						int i_44_ = -1;
						int i_45_ = class536_sub33_sub2.readUnsignedSmart(1253336712);
						if (i_45_ == 32767) {
							i_45_ = class536_sub33_sub2.readUnsignedSmart(220675172);
							i_43_ = class536_sub33_sub2.readUnsignedSmart(-858439860);
							i_42_ = class536_sub33_sub2.readUnsignedSmart(529077833);
							i_44_ = class536_sub33_sub2.readUnsignedSmart(-822465741);
						} else if (i_45_ != 32766)
							i_43_ = class536_sub33_sub2.readUnsignedSmart(-1149702321);
						else {
							i_45_ = -1;
							i_43_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
						}
						int i_46_ = class536_sub33_sub2.readUnsignedSmart(-31047331);
						class649_sub1_sub5_sub1_sub1.method10871(i_45_, i_43_, i_42_, i_44_, (client.anInt11014), i_46_, 2026638556);
					}
				}
				int i_47_ = class536_sub33_sub2.readUnsignedByteC(2037857994);
				if (i_47_ > 0) {
					for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
						int i_49_ = class536_sub33_sub2.readUnsignedSmart(-1200145891);
						int i_50_ = class536_sub33_sub2.readUnsignedSmart(1079591717);
						if (i_50_ != 32767) {
							int i_51_ = class536_sub33_sub2.readUnsignedSmart(-1289649331);
							int i_52_ = class536_sub33_sub2.readUnsignedByteC(2140836627);
							int i_53_ = (i_50_ > 0 ? class536_sub33_sub2.readUnsignedByteC(2092918311) : i_52_);
							class649_sub1_sub5_sub1_sub1.method10906(i_49_, client.anInt11014, i_50_, i_51_, i_52_, i_53_, -1884532814);
						} else
							class649_sub1_sub5_sub1_sub1.method10872(i_49_, (short) -11683);
					}
				}
			}
			if (0 != (i_4_ & 0x4000000)) {
				int i_54_ = class536_sub33_sub2.readUnsignedShortLE128(-462423853);
				int i_55_ = class536_sub33_sub2.readIntV1(-207199412);
				if (65535 == i_54_)
					i_54_ = -1;
				int i_56_ = class536_sub33_sub2.readUnsignedByte(1729451861);
				int i_57_ = i_56_ & 0x7;
				int i_58_ = i_56_ >> 3 & 0xf;
				if (15 == i_58_)
					i_58_ = -1;
				boolean bool = (i_56_ >> 7 & 0x1) == 1;
				class649_sub1_sub5_sub1_sub1.method10917(i_54_, i_55_, i_57_, i_58_, bool, 3, 929523003);
			}
			if ((i_4_ & 0x4000) != 0) {
				int i_59_ = class536_sub33_sub2.readUnsignedByte(-1209382575);
				int[] is = new int[i_59_];
				int[] is_60_ = new int[i_59_];
				for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
					int i_62_ = class536_sub33_sub2.readUnsignedShortLE(204503609);
					if ((i_62_ & 0xc000) == 49152) {
						int i_63_ = class536_sub33_sub2.readUnsignedShortLE128(-161143851);
						is[i_61_] = i_62_ << 16 | i_63_;
					} else
						is[i_61_] = i_62_;
					is_60_[i_61_] = class536_sub33_sub2.readUnsignedShort((short) 14119);
				}
				class649_sub1_sub5_sub1_sub1.method10895(is, is_60_, 1785765469);
			}
			if ((i_4_ & 0x400) != 0) {
				int i_64_ = class536_sub33_sub2.readUnsignedShortLE128(-144768789);
				int i_65_ = class536_sub33_sub2.readIntV1(-280043949);
				if (65535 == i_64_)
					i_64_ = -1;
				int i_66_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				int i_67_ = i_66_ & 0x7;
				int i_68_ = i_66_ >> 3 & 0xf;
				if (15 == i_68_)
					i_68_ = -1;
				boolean bool = 1 == (i_66_ >> 7 & 0x1);
				class649_sub1_sub5_sub1_sub1.method10917(i_64_, i_65_, i_67_, i_68_, bool, 1, 996320524);
			}
			if ((i_4_ & 0x2000000) != 0) {
				int i_69_ = class536_sub33_sub2.readUnsignedShort128(-39372895);
				int i_70_ = class536_sub33_sub2.readLEInt((short) 11229);
				if (i_69_ == 65535)
					i_69_ = -1;
				int i_71_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
				int i_72_ = i_71_ & 0x7;
				int i_73_ = i_71_ >> 3 & 0xf;
				if (15 == i_73_)
					i_73_ = -1;
				boolean bool = (i_71_ >> 7 & 0x1) == 1;
				class649_sub1_sub5_sub1_sub1.method10917(i_69_, i_70_, i_72_, i_73_, bool, 2, 1969096333);
			}
			if ((i_4_ & 0x10) != 0) {
				class649_sub1_sub5_sub1_sub1.anInt11911 = class536_sub33_sub2.readUnsignedShortLE128(-1734832100) * -16791139;
				if (65535 == class649_sub1_sub5_sub1_sub1.anInt11911 * -1375730507)
					class649_sub1_sub5_sub1_sub1.anInt11911 = 16791139;
			}
			if (0 != (i_4_ & 0x1000)) {
				int i_74_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				int[] is = new int[i_74_];
				int[] is_75_ = new int[i_74_];
				int[] is_76_ = new int[i_74_];
				for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
					int i_78_ = class536_sub33_sub2.method9720((byte) 1);
					is[i_77_] = i_78_;
					is_75_[i_77_] = class536_sub33_sub2.readUnsignedByteC(2125742228);
					is_76_[i_77_] = class536_sub33_sub2.readUnsignedShort128(1175270834);
				}
				Class74.method1139(class649_sub1_sub5_sub1_sub1, is, is_75_, is_76_, (byte) -16);
			}
			if (0 != (i_4_ & 0x8000000)) {
				class649_sub1_sub5_sub1_sub1.aByte11928 = class536_sub33_sub2.read128Byte(1473167349);
				class649_sub1_sub5_sub1_sub1.aByte11936 = class536_sub33_sub2.readByte128(-534750223);
				class649_sub1_sub5_sub1_sub1.aByte11930 = class536_sub33_sub2.readByte(-1871714570);
				class649_sub1_sub5_sub1_sub1.aByte11958 = (byte) class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				class649_sub1_sub5_sub1_sub1.anInt11926 = ((client.anInt11014 + class536_sub33_sub2.readUnsignedShort128(1426135632)) * 2109855411);
				class649_sub1_sub5_sub1_sub1.anInt11927 = ((client.anInt11014 + class536_sub33_sub2.readUnsignedShort((short) -3226)) * -2120654239);
			}
			if ((i_4_ & 0x2000) != 0) {
				class649_sub1_sub5_sub1_sub1.anInt11916 = class536_sub33_sub2.readByte(-858269612) * -339639515;
				class649_sub1_sub5_sub1_sub1.anInt11919 = class536_sub33_sub2.readByteC((byte) 0) * 1183324809;
				class649_sub1_sub5_sub1_sub1.anInt11935 = class536_sub33_sub2.readByte128(140159844) * -1437384935;
				class649_sub1_sub5_sub1_sub1.anInt11920 = class536_sub33_sub2.readByte128(-980174160) * -1947310333;
				class649_sub1_sub5_sub1_sub1.anInt11921 = class536_sub33_sub2.readByte(460855486) * 791753037;
				class649_sub1_sub5_sub1_sub1.anInt11922 = class536_sub33_sub2.read128Byte(802583508) * 107491611;
				class649_sub1_sub5_sub1_sub1.anInt11923 = (class536_sub33_sub2.readUnsignedShortLE128(-371930684) + client.anInt11014) * -1372978185;
				class649_sub1_sub5_sub1_sub1.anInt11924 = (class536_sub33_sub2.readUnsignedShort((short) -15631) + client.anInt11014) * -652258591;
				class649_sub1_sub5_sub1_sub1.anInt11952 = class536_sub33_sub2.readUnsignedShortLE128(1748297877) * -2105433735;
				class649_sub1_sub5_sub1_sub1.anInt11957 = 1754339511;
				class649_sub1_sub5_sub1_sub1.anInt11948 = 0;
				class649_sub1_sub5_sub1_sub1.anInt11916 += (-339639515 * class649_sub1_sub5_sub1_sub1.anIntArray11944[0]);
				class649_sub1_sub5_sub1_sub1.anInt11919 += (1183324809 * class649_sub1_sub5_sub1_sub1.anIntArray11945[0]);
				class649_sub1_sub5_sub1_sub1.anInt11935 += (class649_sub1_sub5_sub1_sub1.anIntArray11944[0] * -1437384935);
				class649_sub1_sub5_sub1_sub1.anInt11920 += (-1947310333 * class649_sub1_sub5_sub1_sub1.anIntArray11945[0]);
				class649_sub1_sub5_sub1_sub1.anInt11921 += class649_sub1_sub5_sub1_sub1.aByte10839 * 791753037;
				class649_sub1_sub5_sub1_sub1.anInt11922 += 107491611 * class649_sub1_sub5_sub1_sub1.aByte10839;
			}
			if (0 != (i_4_ & 0x20000000))
				class649_sub1_sub5_sub1_sub1.aBool11895 = class536_sub33_sub2.readUnsignedByte(-1813032885) == 1;
			if (0 != (i_4_ & 0x800000)) {
				class649_sub1_sub5_sub1_sub1.aString12162 = class536_sub33_sub2.readString((byte) 121);
				if ("".equals(class649_sub1_sub5_sub1_sub1.aString12162) || (class649_sub1_sub5_sub1_sub1.aString12162.equals(class649_sub1_sub5_sub1_sub1.aClass296_12174.aString3271)))
					class649_sub1_sub5_sub1_sub1.aString12162 = (class649_sub1_sub5_sub1_sub1.aClass296_12174.aString3271);
			}
			if (0 != (i_4_ & 0x1000000))
				class649_sub1_sub5_sub1_sub1.anInt12176 = class536_sub33_sub2.readUnsignedByte128((byte) 0) * -288091781;
			if ((i_4_ & 0x10000000) != 0) {
				int i_79_ = class536_sub33_sub2.readUnsignedShortLE128(611365879);
				int i_80_ = class536_sub33_sub2.readLEInt((short) -12602);
				if (i_79_ == 65535)
					i_79_ = -1;
				int i_81_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				int i_82_ = i_81_ & 0x7;
				int i_83_ = i_81_ >> 3 & 0xf;
				if (15 == i_83_)
					i_83_ = -1;
				boolean bool = 1 == (i_81_ >> 7 & 0x1);
				class649_sub1_sub5_sub1_sub1.method10917(i_79_, i_80_, i_82_, i_83_, bool, 4, 1161084942);
			}
			if ((i_4_ & 0x40000) != 0) {
				int i_84_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				int[] is = new int[8];
				short[] is_85_ = new short[8];
				for (int i_86_ = 0; i_86_ < 8; i_86_++) {
					if (0 != (i_84_ & 1 << i_86_)) {
						is[i_86_] = class536_sub33_sub2.method9720((byte) 1);
						is_85_[i_86_] = (short) class536_sub33_sub2.method9718(224960296);
					} else {
						is[i_86_] = -1;
						is_85_[i_86_] = (short) -1;
					}
				}
				class649_sub1_sub5_sub1_sub1.aClass307_12167 = new Class307(is, is_85_);
			}
			if ((i_4_ & 0x4) != 0) {
				int i_87_ = class536_sub33_sub2.readUnsignedShortLE(-954999216);
				int i_88_ = class536_sub33_sub2.readIntV1(718575180);
				if (i_87_ == 65535)
					i_87_ = -1;
				int i_89_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				int i_90_ = i_89_ & 0x7;
				int i_91_ = i_89_ >> 3 & 0xf;
				if (i_91_ == 15)
					i_91_ = -1;
				boolean bool = (i_89_ >> 7 & 0x1) == 1;
				class649_sub1_sub5_sub1_sub1.method10917(i_87_, i_88_, i_90_, i_91_, bool, 0, 831909428);
			}
			if (0 != (i_4_ & 0x8))
				class649_sub1_sub5_sub1_sub1.method11073(class536_sub33_sub2.readString((byte) 46), 0, 0, (byte) 12);
		}
	}

	public static void method1429(int i) {
		for (Class536_Sub18_Sub6 class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8248(470512336)); class536_sub18_sub6 != null; class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8241(-767609708))) {
			if (class536_sub18_sub6.anInt11685 * -606992075 > 1) {
				class536_sub18_sub6.anInt11685 = 0;
				Class70.aClass199_757.method2881(class536_sub18_sub6, ((((Class536_Sub18_Sub9) (class536_sub18_sub6.aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)).aLong11719) * 4372728678228642485L));
				class536_sub18_sub6.aClass700_11683.method8238(-2145836985);
			}
		}
		Class70.anInt761 = 0;
		Class70.anInt760 = 0;
		Class70.aClass708_755.method8304(454036827);
		Class70.aClass4_763.method561(-2117553523);
		Class70.aClass700_764.method8238(-1977365394);
		Class70.aBool752 = false;
	}

	static void method1430(Object object, byte i) {
		if (Class397.anEventQueue4116 != null) {
			for (int i_92_ = 0; i_92_ < 50 && Class397.anEventQueue4116.peekEvent() != null; i_92_++)
				Class212.method3067(1L);
			try {
				if (object != null)
					Class397.anEventQueue4116.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}
}
