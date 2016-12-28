/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class537 {
	short[] aShortArray7135;
	Class332 aClass332_7136;
	short[] aShortArray7137;
	Class520 aClass520_7138;
	short[] aShortArray7139;
	short[] aShortArray7140;
	short[] aShortArray7141;
	Class511 aClass511_7142 = new Class511();
	Class317[] aClass317Array7143;
	short[] aShortArray7144;
	Class317 aClass317_7145;
	short[] aShortArray7146;
	Class520 aClass520_7147;
	Class540 aClass540_7148;
	int anInt7149;
	int anInt7150;
	int anInt7151;
	static Class461 aClass461_7152;

	void method6492() throws IOException {
		aClass511_7142.method6193(false, 195661259);
		Class263.method3666(aShortArray7137, (byte) -123);
		Class263.method3666(aShortArray7140, (byte) -66);
		Class263.method3666(aShortArray7146, (byte) -24);
		Class263.method3666(aShortArray7139, (byte) -37);
		Class263.method3666(aShortArray7135, (byte) -117);
		Class263.method3666(aShortArray7141, (byte) -93);
		Class263.method3666(aShortArray7144, (byte) -9);
		aClass540_7148.method6514(-1260775800);
		for (int i = 0; i < 4; i++)
			aClass317Array7143[i].method4225(396294013);
		aClass520_7138.method6344(196223109);
		aClass520_7147.method6344(-942694281);
		aClass317_7145.method4225(396294013);
		aClass332_7136.method4331(-1284185312);
	}

	boolean method6493(int i, int i_0_, int i_1_, int i_2_) {
		if (i > 8 || i_0_ > 4 || i_1_ > 4)
			return false;
		aClass540_7148.method6515(i_0_, i, (byte) 108);
		int i_3_ = 1 << i_1_;
		aClass520_7138.method6339(i_3_, -353266087);
		aClass520_7147.method6339(i_3_, 517027417);
		anInt7151 = (i_3_ - 1) * 1744590829;
		return true;
	}

	boolean method6494(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass332_7136.method4338(inputstream, 1915295349);
		aClass511_7142.method6191(outputstream, (byte) -61);
		method6504((byte) -95);
		int i = Class229.method3290(1157739621);
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		long l_8_ = 0L;
		byte i_9_ = 0;
		while (l < 0L || l_8_ < l) {
			int i_10_ = (int) l_8_ & -509764123 * anInt7151;
			if (aClass332_7136.method4333(aShortArray7137, (i << 4) + i_10_, -1821483953) == 0) {
				Class541 class541 = aClass540_7148.method6517((int) l_8_, i_9_, (byte) 43);
				if (!Class672.method8023(i, (byte) -1))
					i_9_ = (class541.method6523(aClass332_7136, aClass511_7142.method6196(i_4_, (short) 16383), -468583255));
				else
					i_9_ = class541.method6526(aClass332_7136, 1546978460);
				aClass511_7142.method6195(i_9_, (byte) 14);
				i = Class265.method3685(i, (byte) 1);
				l_8_++;
			} else {
				int i_11_;
				if (aClass332_7136.method4333(aShortArray7146, i, -20271182) == 1) {
					i_11_ = 0;
					if (aClass332_7136.method4333(aShortArray7139, i, 1803793637) == 0) {
						if (aClass332_7136.method4333(aShortArray7140, (i << 4) + i_10_, 508656701) == 0) {
							i = Class313.method4199(i, (byte) -84);
							i_11_ = 1;
						}
					} else {
						int i_12_;
						if (aClass332_7136.method4333(aShortArray7135, i, 1800117118) == 0)
							i_12_ = i_5_;
						else {
							if (aClass332_7136.method4333(aShortArray7141, i, 1698954567) == 0)
								i_12_ = i_6_;
							else {
								i_12_ = i_7_;
								i_7_ = i_6_;
							}
							i_6_ = i_5_;
						}
						i_5_ = i_4_;
						i_4_ = i_12_;
					}
					if (0 == i_11_) {
						i_11_ = aClass520_7147.method6341(aClass332_7136, i_10_, 271381653) + 2;
						i = Class604.method7207(i, -235700602);
					}
				} else {
					i_7_ = i_6_;
					i_6_ = i_5_;
					i_5_ = i_4_;
					i_11_ = 2 + aClass520_7138.method6341(aClass332_7136, i_10_, 1391939045);
					i = Class323.method4260(i, -281748706);
					int i_13_ = aClass317Array7143[Class286.method3910(i_11_, (byte) -13)].method4220(aClass332_7136, (byte) -10);
					if (i_13_ >= 4) {
						int i_14_ = (i_13_ >> 1) - 1;
						i_4_ = (0x2 | i_13_ & 0x1) << i_14_;
						if (i_13_ < 14)
							i_4_ += Class11.method619(aShortArray7144, i_4_ - i_13_ - 1, aClass332_7136, i_14_, -523332892);
						else {
							i_4_ += aClass332_7136.method4332(i_14_ - 4, (byte) 87) << 4;
							i_4_ += aClass317_7145.method4221(aClass332_7136, 1795667801);
							if (i_4_ < 0) {
								if (i_4_ != -1)
									return false;
								break;
							}
						}
					} else
						i_4_ = i_13_;
				}
				if ((long) i_4_ >= l_8_ || i_4_ >= -1580477763 * anInt7150)
					return false;
				aClass511_7142.method6205(i_4_, i_11_, 1867269829);
				l_8_ += (long) i_11_;
				i_9_ = aClass511_7142.method6196(0, (short) 16383);
			}
		}
		aClass511_7142.method6206((byte) 58);
		aClass511_7142.method6192(-983738100);
		aClass332_7136.method4330(1130576261);
		return true;
	}

	boolean method6495(byte[] is, int i) {
		if (is.length < 5)
			return false;
		int i_15_ = is[0] & 0xff;
		int i_16_ = i_15_ % 9;
		int i_17_ = i_15_ / 9;
		int i_18_ = i_17_ % 5;
		int i_19_ = i_17_ / 5;
		int i_20_ = 0;
		for (int i_21_ = 0; i_21_ < 4; i_21_++)
			i_20_ += (is[1 + i_21_] & 0xff) << i_21_ * 8;
		if (!method6493(i_16_, i_18_, i_19_, -984558468))
			return false;
		return method6503(i_20_, 569306320);
	}

	boolean method6496(int i) {
		if (i < 0)
			return false;
		if (i != anInt7149 * 386651053) {
			anInt7149 = 2097219621 * i;
			anInt7150 = Math.max(386651053 * anInt7149, 1) * 1445542037;
			aClass511_7142.method6190(Math.max(anInt7150 * -1580477763, 4096), -34162956);
		}
		return true;
	}

	boolean method6497(int i) {
		if (i < 0)
			return false;
		if (i != anInt7149 * 386651053) {
			anInt7149 = 2097219621 * i;
			anInt7150 = Math.max(386651053 * anInt7149, 1) * 1445542037;
			aClass511_7142.method6190(Math.max(anInt7150 * -1580477763, 4096), 464518019);
		}
		return true;
	}

	boolean method6498(int i, int i_22_, int i_23_) {
		if (i > 8 || i_22_ > 4 || i_23_ > 4)
			return false;
		aClass540_7148.method6515(i_22_, i, (byte) 84);
		int i_24_ = 1 << i_23_;
		aClass520_7138.method6339(i_24_, 831536060);
		aClass520_7147.method6339(i_24_, -1641556098);
		anInt7151 = (i_24_ - 1) * 1744590829;
		return true;
	}

	boolean method6499(int i, int i_25_, int i_26_) {
		if (i > 8 || i_25_ > 4 || i_26_ > 4)
			return false;
		aClass540_7148.method6515(i_25_, i, (byte) 68);
		int i_27_ = 1 << i_26_;
		aClass520_7138.method6339(i_27_, 671352643);
		aClass520_7147.method6339(i_27_, 212751989);
		anInt7151 = (i_27_ - 1) * 1744590829;
		return true;
	}

	boolean method6500(int i, int i_28_, int i_29_) {
		if (i > 8 || i_28_ > 4 || i_29_ > 4)
			return false;
		aClass540_7148.method6515(i_28_, i, (byte) 30);
		int i_30_ = 1 << i_29_;
		aClass520_7138.method6339(i_30_, 925775129);
		aClass520_7147.method6339(i_30_, -635150274);
		anInt7151 = (i_30_ - 1) * 1744590829;
		return true;
	}

	void method6501() throws IOException {
		aClass511_7142.method6193(false, -1669196930);
		Class263.method3666(aShortArray7137, (byte) -5);
		Class263.method3666(aShortArray7140, (byte) -44);
		Class263.method3666(aShortArray7146, (byte) -66);
		Class263.method3666(aShortArray7139, (byte) -73);
		Class263.method3666(aShortArray7135, (byte) -51);
		Class263.method3666(aShortArray7141, (byte) -121);
		Class263.method3666(aShortArray7144, (byte) -71);
		aClass540_7148.method6514(-1079445074);
		for (int i = 0; i < 4; i++)
			aClass317Array7143[i].method4225(396294013);
		aClass520_7138.method6344(-774736422);
		aClass520_7147.method6344(1946319431);
		aClass317_7145.method4225(396294013);
		aClass332_7136.method4331(-1552163451);
	}

	void method6502() throws IOException {
		aClass511_7142.method6193(false, 974481820);
		Class263.method3666(aShortArray7137, (byte) -15);
		Class263.method3666(aShortArray7140, (byte) -99);
		Class263.method3666(aShortArray7146, (byte) -62);
		Class263.method3666(aShortArray7139, (byte) -27);
		Class263.method3666(aShortArray7135, (byte) -27);
		Class263.method3666(aShortArray7141, (byte) -14);
		Class263.method3666(aShortArray7144, (byte) -82);
		aClass540_7148.method6514(864779003);
		for (int i = 0; i < 4; i++)
			aClass317Array7143[i].method4225(396294013);
		aClass520_7138.method6344(-742262307);
		aClass520_7147.method6344(819049089);
		aClass317_7145.method4225(396294013);
		aClass332_7136.method4331(-1409930615);
	}

	boolean method6503(int i, int i_31_) {
		if (i < 0)
			return false;
		if (i != anInt7149 * 386651053) {
			anInt7149 = 2097219621 * i;
			anInt7150 = Math.max(386651053 * anInt7149, 1) * 1445542037;
			aClass511_7142.method6190(Math.max(anInt7150 * -1580477763, 4096), -1077856287);
		}
		return true;
	}

	Class537() {
		aClass332_7136 = new Class332();
		aShortArray7137 = new short[192];
		aShortArray7146 = new short[12];
		aShortArray7139 = new short[12];
		aShortArray7135 = new short[12];
		aShortArray7141 = new short[12];
		aShortArray7140 = new short[192];
		aClass317Array7143 = new Class317[4];
		aShortArray7144 = new short[114];
		aClass317_7145 = new Class317(4);
		aClass520_7138 = new Class520(this);
		aClass520_7147 = new Class520(this);
		aClass540_7148 = new Class540(this);
		anInt7149 = -2097219621;
		anInt7150 = -1445542037;
		for (int i = 0; i < 4; i++)
			aClass317Array7143[i] = new Class317(6);
	}

	void method6504(byte i) throws IOException {
		aClass511_7142.method6193(false, -2074781388);
		Class263.method3666(aShortArray7137, (byte) -19);
		Class263.method3666(aShortArray7140, (byte) -118);
		Class263.method3666(aShortArray7146, (byte) -24);
		Class263.method3666(aShortArray7139, (byte) -41);
		Class263.method3666(aShortArray7135, (byte) -34);
		Class263.method3666(aShortArray7141, (byte) -16);
		Class263.method3666(aShortArray7144, (byte) -21);
		aClass540_7148.method6514(-1367725389);
		for (int i_32_ = 0; i_32_ < 4; i_32_++)
			aClass317Array7143[i_32_].method4225(396294013);
		aClass520_7138.method6344(-1551357287);
		aClass520_7147.method6344(-570194686);
		aClass317_7145.method4225(396294013);
		aClass332_7136.method4331(-1081059384);
	}

	static final void method6505(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class173_Sub1.method8633(class251, class234, class668, 65280);
	}

	static final boolean method6506(Class106 class106, int i) {
		boolean bool;
		try {
			bool = PacketDecoder.decodePacket(class106, 1697143964);
		} catch (IOException ioexception) {
			if (client.anInt11101 * -708374433 == 8) {
				class106.method1412(2043797255);
				return false;
			}
			Class628.method7496(-1635733589);
			return true;
		} catch (Exception exception) {
			Class598 class598 = client.aClass515_11066.method6255(-1858708269);
			String string = new StringBuilder().append(null != class106.currentPacket ? -798865899 * class106.currentPacket.id : -1).append(Class40.aString491).append(null != class106.aClass422_1271 ? -798865899 * class106.aClass422_1271.id : -1).append(Class40.aString491).append(class106.aClass422_1274 != null ? -798865899 * class106.aClass422_1274.id : -1).append(" ").append(610303591 * class106.anInt1262).append(Class40.aString491)
					.append(1858049507 * class598.anInt7839 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0])).append(Class40.aString491).append(1479112045 * class598.anInt7840 + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0])).append(" ").toString();
			for (int i_33_ = 0; i_33_ < class106.anInt1262 * 610303591 && i_33_ < 50; i_33_++)
				string = new StringBuilder().append(string).append(class106.byteBuffer.buffer[i_33_]).append(Class40.aString491).toString();
			Class81.method1165(string, exception, (byte) 71);
			Class275.method3737(false, -1187948125);
			return true;
		}
		return bool;
	}

	static void method6507(int i, int i_34_) {
		if (Class76_Sub1.anInt10981 * 1382700277 == 107)
			Class61.anInt654 = i * -1113122667;
		else if (Class76_Sub1.anInt10981 * 1382700277 == 244)
			Class61.anInt687 = -1813287759 * i;
	}

	static void method6508(int i, int i_35_, IComponentDefinitions class251, Class244 class244, int i_36_, int i_37_, int i_38_) {
		Class103[] class103s = client.aClass103Array11020;
		for (int i_39_ = 0; i_39_ < class103s.length; i_39_++) {
			Class103 class103 = class103s[i_39_];
			if (class103 != null && 2030004867 * class103.anInt1224 != 0 && client.cycles % 20 < 10) {
				if (1 == class103.anInt1224 * 2030004867) {
					ObjectParam class536_sub13 = ((ObjectParam) (client.aClass4_11050.method556((long) (class103.anInt1223 * 1298998125))));
					if (null != class536_sub13) {
						NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
						Class436 class436 = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
						int i_40_ = (int) class436.aFloat4850 / 128 - i / 128;
						int i_41_ = (int) class436.aFloat4853 / 128 - i_35_ / 128;
						Class671.method8018(class251, class244, i_36_, i_37_, i_40_, i_41_, class103.anInt1222 * -1060879377, 360000L);
					}
				}
				if (class103.anInt1224 * 2030004867 == 2) {
					int i_42_ = class103.anInt1225 * 987706607 / 128 - i / 128;
					int i_43_ = -1675921633 * class103.anInt1226 / 128 - i_35_ / 128;
					long l = (long) (46780477 * class103.anInt1228 << 7);
					l *= l;
					Class671.method8018(class251, class244, i_36_, i_37_, i_42_, i_43_, class103.anInt1222 * -1060879377, l);
				}
				if (10 == class103.anInt1224 * 2030004867 && class103.anInt1223 * 1298998125 >= 0 && (1298998125 * class103.anInt1223 < (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155).length)) {
					Player class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[1298998125 * class103.anInt1223]);
					if (class649_sub1_sub5_sub1_sub2 != null) {
						Class436 class436 = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
						int i_44_ = (int) class436.aFloat4850 / 128 - i / 128;
						int i_45_ = (int) class436.aFloat4853 / 128 - i_35_ / 128;
						Class671.method8018(class251, class244, i_36_, i_37_, i_44_, i_45_, -1060879377 * class103.anInt1222, 360000L);
					}
				}
			}
		}
	}
}
