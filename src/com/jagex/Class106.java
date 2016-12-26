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
	IncomingPacket currentPacket;
	int anInt1262;
	boolean aBool1263;
	int anInt1264;
	public int anInt1265;
	public boolean aBool1266;
	RSBitBuffer byteBuffer;
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
				aClass536_Sub33_1257.writeBytes(class536_sub23.aClass536_Sub33_Sub2_10528.buffer, 0, class536_sub23.anInt10530 * -1225204241, (byte) 114);
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
		if (client.cycles % 50 == 0) {
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
				aClass536_Sub33_1257.writeBytes(class536_sub23.aClass536_Sub33_Sub2_10528.buffer, 0, class536_sub23.anInt10530 * -1225204241, (byte) 90);
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
		byteBuffer = new RSBitBuffer(40000);
		currentPacket = null;
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
		InterfaceDefinitions class251 = Class264.method3678(i_1_, -689214737);
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
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 = new Player(null);
		client.aMap11157.clear();
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7842((float) (client.aClass515_11066.method6321((byte) 91) * 512 / 2), 0.0F, (float) (client.aClass515_11066.method6243(177401017) * 512 / 2));
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0] = client.aClass515_11066.method6321((byte) -98) / 2;
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0] = client.aClass515_11066.method6243(177401017) / 2;
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
		RSBitBuffer buffer = client.aClass106_11322.byteBuffer;
		for (int i_2_ = 0; i_2_ < 816748469 * client.anInt11055; i_2_++) {
			int i_3_ = client.anIntArray11105[i_2_];
			NPC npc = ((NPC) (((Class536_Sub13) client.aClass4_11050.method556((long) i_3_)).anObject10468));
			buffer.readUnsignedShort();
			int i_4_ = buffer.readUnsignedByte();
			if ((i_4_ & 0x2) != 0)
				i_4_ += buffer.readUnsignedByte() << 8;
			if ((i_4_ & 0x200) != 0)
				i_4_ += buffer.readUnsignedByte() << 16;
			if ((i_4_ & 0x400000) != 0)
				i_4_ += buffer.readUnsignedByte() << 24;
			
			if ((i_4_ & 0x10000) != 0) { //unknown
				npc.anInterface3_11929.method29(-1410915460);
				buffer.off += 1032351030;
				int i_5_ = ((buffer.buffer[((buffer.off += 516175515) * -810172525) - 1]) & 0xff);
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					int i_7_ = buffer.readUnsigned128Byte();
					Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) -90), i_7_, 1858049507));
					Class430 class430 = (Class678.aClass98_Sub1_Sub2_8625.method8390(buffer, class478, 275541441));
					npc.anInterface3_11929.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) -30);
				}
			}
			if (0 != (i_4_ & 0x20000)) { //combat level
				npc.anInt12160 = buffer.readUnsignedShort() * 807464793;
				if (65535 == 400189673 * npc.anInt12160)
					npc.anInt12160 = 1621981019 * (npc.aClass296_12174.anInt3292);
			}
			if ((i_4_ & 0x800) != 0) { //unknown
				npc.anInt12166 = buffer.readUnsignedShortLE128() * 524255573;
				if (65535 == npc.anInt12166 * -1969982467)
					npc.anInt12166 = -524255573;
			}
			if ((i_4_ & 0x200000) != 0) { //target information
				int size = ((buffer.buffer[((buffer.off += 516175515) * -810172525) - 1]) & 0xff);
				for (int i_9_ = 0; i_9_ < size; i_9_++) {
					int i_10_ = buffer.readUnsignedByte();
					int i_11_ = buffer.readIntV2();
					int i_12_ = buffer.read24BitIntegerV2();
					npc.method11072(i_10_, i_11_, i_12_, 2098971425);
				}
			}
			if ((i_4_ & 0x100000) != 0) { //unknown
				int i_13_ = (npc.aClass296_12174.anIntArray3274).length;
				int i_14_ = 0;
				if (null != (npc.aClass296_12174.aShortArray3278))
					i_14_ = (npc.aClass296_12174.aShortArray3278).length;
				int i_15_ = 0;
				if ((npc.aClass296_12174.aShortArray3281) != null)
					i_14_ = (npc.aClass296_12174.aShortArray3281).length;
				int i_16_ = buffer.readUnsignedByte128();
				if ((i_16_ & 0x1) != 1) {
					buffer.off += 1032351030;
					int[] is = null;
					if ((i_16_ & 0x2) == 2) {
						is = new int[i_13_];
						for (int i_17_ = 0; i_17_ < i_13_; i_17_++)
							is[i_17_] = buffer.readBigSmart();
					}
					short[] is_18_ = null;
					if (4 == (i_16_ & 0x4)) {
						is_18_ = new short[i_14_];
						for (int i_19_ = 0; i_19_ < i_14_; i_19_++)
							is_18_[i_19_] = (short) buffer.readUnsignedShort128();
					}
					short[] is_20_ = null;
					if ((i_16_ & 0x8) == 8) {
						is_20_ = new short[i_15_];
						for (int i_21_ = 0; i_21_ < i_15_; i_21_++)
							is_20_[i_21_] = (short) buffer.readUnsignedShort128();
					}
					long l = (long) ((NPC.anInt12165 += -322954019) * 428710773 - 1);
					new Class304(l, is, null, null, null, is_18_, is_20_);
				}
			}
			if (0 != (i_4_ & 0x40)) { //face_worldtile
				npc.faceTileX = buffer.readUnsignedShortLE128() * -906604253;
				npc.faecTileY = buffer.readUnsignedShort128() * 1917987299;
			}
			if ((i_4_ & 0x80000) != 0) { //unknown
				buffer.off += 1032351030;
				int i_22_ = ((buffer.buffer[((buffer.off += 516175515) * -810172525) - 1]) & 0xff);
				for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
					int i_24_ = buffer.readUnsignedByte128();
					Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) -72), i_24_, 1858049507));
					Class430 class430 = (Class678.aClass98_Sub1_Sub2_8625.method8390(buffer, class478, 275541441));
					npc.anInterface3_11929.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) 16);
				}
			}
			if ((i_4_ & 0x8000) != 0) { //unknown
				int i_25_ = (npc.aClass296_12174.anIntArray3317).length;
				int i_26_ = 0;
				if ((npc.aClass296_12174.aShortArray3278) != null)
					i_26_ = (npc.aClass296_12174.aShortArray3278).length;
				int i_27_ = 0;
				if ((npc.aClass296_12174.aShortArray3281) != null)
					i_27_ = (npc.aClass296_12174.aShortArray3281).length;
				int i_28_ = buffer.readUnsignedByte128();
				if (1 == (i_28_ & 0x1))
					npc.aClass304_12163 = null;
				else {
					buffer.off += 1032351030;
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
							is[i_31_] = buffer.readBigSmart();
							if (16 == (i_28_ & 0x10) && is[i_31_] != -1) {
								fs[i_31_] = buffer.method9712(2142524161);
								for (int i_32_ = 0; i_32_ < 3; i_32_++)
									is_29_[i_31_][i_32_] = buffer.method9741((byte) 51);
								for (int i_33_ = 0; i_33_ < 3; i_33_++)
									is_30_[i_31_][i_33_] = buffer.method9756((byte) 123);
							}
						}
					}
					short[] is_34_ = null;
					if ((i_28_ & 0x4) == 4) {
						is_34_ = new short[i_26_];
						for (int i_35_ = 0; i_35_ < i_26_; i_35_++)
							is_34_[i_35_] = (short) buffer.readUnsignedShortLE();
					}
					short[] is_36_ = null;
					if ((i_28_ & 0x8) == 8) {
						is_36_ = new short[i_27_];
						for (int i_37_ = 0; i_37_ < i_27_; i_37_++)
							is_36_[i_37_] = (short) buffer.readUnsignedShort128();
					}
					long l = (long) ((NPC.anInt12175 += -683966327) * -2099907143 - 1);
					npc.aClass304_12163 = new Class304(l, is, fs, is_29_, is_30_, is_34_, is_36_);
				}
			}
			if ((i_4_ & 0x20) != 0) { //animation
				int[] is = new int[4];
				for (int i_38_ = 0; i_38_ < 4; i_38_++)
					is[i_38_] = buffer.readBigSmart();
				int i_39_ = buffer.readUnsigned128Byte();
				Class360_Sub1.method9269(npc, is, i_39_, true);
			}
			if (0 != (i_4_ & 0x1)) { //npc_transformation
				if (npc.aClass296_12174.method3986(-198439992))
					Class18.method688(npc, 1146989148);
				npc.method11075((Class296) (Class172.aClass34_Sub7_1922.method70(buffer.readBigSmart(), (byte) -72)), (i_4_ & 0x800000) == 0, (i_4_ & 0x20000) == 0, true, -573315687);
				npc.method10873((npc.aClass296_12174.anInt3272 * 830254667), -324388659);
				npc.anInt11938 = -1906385303 * (235698067 * (npc.aClass296_12174.anInt3318) << 3);
				if (npc.aClass296_12174.method3986(-198439992))
					Class76.method1155(npc.aByte10839, (npc.screenX[0]), (npc.screenY[0]), 0, null, npc, null, 352877239);
			}
			if ((i_4_ & 0x80) != 0) { //hitbars
				int hitsSize = buffer.readUnsignedByteC();
				if (hitsSize > 0) {
					for (int i_41_ = 0; i_41_ < hitsSize; i_41_++) {
						int i_42_ = -1;
						int damage = -1;
						int i_44_ = -1;
						int hitType = buffer.readUnsignedSmart();
						if (hitType == 32767) {
							hitType = buffer.readUnsignedSmart();
							damage = buffer.readUnsignedSmart();
							i_42_ = buffer.readUnsignedSmart();
							i_44_ = buffer.readUnsignedSmart();
						} else if (hitType != 32766)
							damage = buffer.readUnsignedSmart();
						else {
							hitType = -1;
							damage = buffer.readUnsignedByte128();
						}
						int i_46_ = buffer.readUnsignedSmart();
						npc.method10871(hitType, damage, i_42_, i_44_, (client.cycles), i_46_, 2026638556);
					}
				}
				int hitBarsSize = buffer.readUnsignedByteC();
				if (hitBarsSize > 0) {
					for (int i_48_ = 0; i_48_ < hitBarsSize; i_48_++) {
						int i_49_ = buffer.readUnsignedSmart();
						int i_50_ = buffer.readUnsignedSmart();
						if (i_50_ != 32767) {
							int i_51_ = buffer.readUnsignedSmart();
							int i_52_ = buffer.readUnsignedByteC();
							int i_53_ = (i_50_ > 0 ? buffer.readUnsignedByteC() : i_52_);
							npc.method10906(i_49_, client.cycles, i_50_, i_51_, i_52_, i_53_, -1884532814);
						} else
							npc.method10872(i_49_, (short) -11683);
					}
				}
			}
			if (0 != (i_4_ & 0x4000000)) { //graphics_4
				int i_54_ = buffer.readUnsignedShortLE128();
				int i_55_ = buffer.readIntV1();
				if (65535 == i_54_)
					i_54_ = -1;
				int i_56_ = buffer.readUnsignedByte();
				int i_57_ = i_56_ & 0x7;
				int i_58_ = i_56_ >> 3 & 0xf;
				if (15 == i_58_)
					i_58_ = -1;
				boolean bool = (i_56_ >> 7 & 0x1) == 1;
				npc.method10917(i_54_, i_55_, i_57_, i_58_, bool, 3, 929523003);
			}
			if ((i_4_ & 0x4000) != 0) { //unknown
				int i_59_ = buffer.readUnsignedByte();
				int[] is = new int[i_59_];
				int[] is_60_ = new int[i_59_];
				for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
					int i_62_ = buffer.readUnsignedShortLE();
					if ((i_62_ & 0xc000) == 49152) {
						int i_63_ = buffer.readUnsignedShortLE128();
						is[i_61_] = i_62_ << 16 | i_63_;
					} else
						is[i_61_] = i_62_;
					is_60_[i_61_] = buffer.readUnsignedShort();
				}
				npc.method10895(is, is_60_, 1785765469);
			}
			if ((i_4_ & 0x400) != 0) { //graphics_2
				int i_64_ = buffer.readUnsignedShortLE128();
				int i_65_ = buffer.readIntV1();
				if (65535 == i_64_)
					i_64_ = -1;
				int i_66_ = buffer.readUnsigned128Byte();
				int i_67_ = i_66_ & 0x7;
				int i_68_ = i_66_ >> 3 & 0xf;
				if (15 == i_68_)
					i_68_ = -1;
				boolean bool = 1 == (i_66_ >> 7 & 0x1);
				npc.method10917(i_64_, i_65_, i_67_, i_68_, bool, 1, 996320524);
			}
			if ((i_4_ & 0x2000000) != 0) { //graphics_3
				int i_69_ = buffer.readUnsignedShort128();
				int i_70_ = buffer.readLEInt();
				if (i_69_ == 65535)
					i_69_ = -1;
				int i_71_ = buffer.readUnsignedByte128();
				int i_72_ = i_71_ & 0x7;
				int i_73_ = i_71_ >> 3 & 0xf;
				if (15 == i_73_)
					i_73_ = -1;
				boolean bool = (i_71_ >> 7 & 0x1) == 1;
				npc.method10917(i_69_, i_70_, i_72_, i_73_, bool, 2, 1969096333);
			}
			if ((i_4_ & 0x10) != 0) { //face_entity
				npc.anInt11911 = buffer.readUnsignedShortLE128() * -16791139;
				if (65535 == npc.anInt11911 * -1375730507)
					npc.anInt11911 = 16791139;
			}
			if (0 != (i_4_ & 0x1000)) { //unknown
				int i_74_ = buffer.readUnsigned128Byte();
				int[] is = new int[i_74_];
				int[] is_75_ = new int[i_74_];
				int[] is_76_ = new int[i_74_];
				for (int i_77_ = 0; i_77_ < i_74_; i_77_++) {
					int i_78_ = buffer.readBigSmart();
					is[i_77_] = i_78_;
					is_75_[i_77_] = buffer.readUnsignedByteC();
					is_76_[i_77_] = buffer.readUnsignedShort128();
				}
				Class74.method1139(npc, is, is_75_, is_76_, (byte) -16);
			}
			if (0 != (i_4_ & 0x8000000)) { //unknown
				npc.aByte11928 = buffer.read128Byte();
				npc.aByte11936 = buffer.readByte128();
				npc.aByte11930 = buffer.readByte();
				npc.aByte11958 = (byte) buffer.readUnsigned128Byte();
				npc.anInt11926 = ((client.cycles + buffer.readUnsignedShort128()) * 2109855411);
				npc.anInt11927 = ((client.cycles + buffer.readUnsignedShort()) * -2120654239);
			}
			if ((i_4_ & 0x2000) != 0) { //force_movement
				npc.anInt11916 = buffer.readByte() * -339639515;
				npc.anInt11919 = buffer.readByteC() * 1183324809;
				npc.anInt11935 = buffer.readByte128() * -1437384935;
				npc.anInt11920 = buffer.readByte128() * -1947310333;
				npc.anInt11921 = buffer.readByte() * 791753037;
				npc.anInt11922 = buffer.read128Byte() * 107491611;
				npc.anInt11923 = (buffer.readUnsignedShortLE128() + client.cycles) * -1372978185;
				npc.anInt11924 = (buffer.readUnsignedShort() + client.cycles) * -652258591;
				npc.anInt11952 = buffer.readUnsignedShortLE128() * -2105433735;
				npc.stepsCount = 1754339511;
				npc.anInt11948 = 0;
				npc.anInt11916 += (-339639515 * npc.screenX[0]);
				npc.anInt11919 += (1183324809 * npc.screenY[0]);
				npc.anInt11935 += (npc.screenX[0] * -1437384935);
				npc.anInt11920 += (-1947310333 * npc.screenY[0]);
				npc.anInt11921 += npc.aByte10839 * 791753037;
				npc.anInt11922 += 107491611 * npc.aByte10839;
			}
			if (0 != (i_4_ & 0x20000000)) 
				npc.aBool11895 = buffer.readUnsignedByte() == 1;
			if (0 != (i_4_ & 0x800000)) { //change_name
				npc.aString12162 = buffer.readString();
				if ("".equals(npc.aString12162) || (npc.aString12162.equals(npc.aClass296_12174.aString3271)))
					npc.aString12162 = (npc.aClass296_12174.aString3271);
			}
			if (0 != (i_4_ & 0x1000000)) //npc reticule
				npc.anInt12176 = buffer.readUnsignedByte128() * -288091781;
			if ((i_4_ & 0x10000000) != 0) {
				int i_79_ = buffer.readUnsignedShortLE128();
				int i_80_ = buffer.readLEInt();
				if (i_79_ == 65535)
					i_79_ = -1;
				int i_81_ = buffer.readUnsigned128Byte();
				int i_82_ = i_81_ & 0x7;
				int i_83_ = i_81_ >> 3 & 0xf;
				if (15 == i_83_)
					i_83_ = -1;
				boolean bool = 1 == (i_81_ >> 7 & 0x1);
				npc.method10917(i_79_, i_80_, i_82_, i_83_, bool, 4, 1161084942);
			}
			if ((i_4_ & 0x40000) != 0) { //head_icons
				int i_84_ = buffer.readUnsigned128Byte();
				int[] is = new int[8];
				short[] is_85_ = new short[8];
				for (int i_86_ = 0; i_86_ < 8; i_86_++) {
					if (0 != (i_84_ & 1 << i_86_)) {
						is[i_86_] = buffer.readBigSmart();
						is_85_[i_86_] = (short) buffer.readSmart();
					} else {
						is[i_86_] = -1;
						is_85_[i_86_] = (short) -1;
					}
				}
				npc.aClass307_12167 = new Class307(is, is_85_);
			}
			if ((i_4_ & 0x4) != 0) {
				int i_87_ = buffer.readUnsignedShortLE();
				int i_88_ = buffer.readIntV1();
				if (i_87_ == 65535)
					i_87_ = -1;
				int i_89_ = buffer.readUnsigned128Byte();
				int i_90_ = i_89_ & 0x7;
				int i_91_ = i_89_ >> 3 & 0xf;
				if (i_91_ == 15)
					i_91_ = -1;
				boolean bool = (i_89_ >> 7 & 0x1) == 1;
				npc.method10917(i_87_, i_88_, i_90_, i_91_, bool, 0, 831909428);
			}
			if (0 != (i_4_ & 0x8)) //force_chat
				npc.method11073(buffer.readString(), 0, 0, (byte) 12);
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
