/* Class527_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class527_Sub40 extends Class527 {
	static final int anInt10696 = 4;
	static final int anInt10697 = 1;
	static final int anInt10698 = 3;
	static final int anInt10699 = 3;
	static final int anInt10700 = 4;
	int anInt10701;
	boolean aBool10702;
	int anInt10703;
	boolean aBool10704;
	static final int anInt10705 = 7;
	String aString10706;
	static final int anInt10707 = 5;
	public static final int anInt10708 = 0;
	static final int anInt10709 = 7;
	static final int anInt10710 = 8;
	static final int anInt10711 = 9;
	static final int anInt10712 = 10;
	static final int anInt10713 = 11;
	int anInt10714;
	String aString10715;
	static final int anInt10716 = 22;
	static final int anInt10717 = 23;
	static final int anInt10718 = 24;
	static final int anInt10719 = 25;
	static final int anInt10720 = 26;
	public int anInt10721;
	int anInt10722;
	static final int anInt10723 = 27;
	static final int anInt10724 = 2;
	static final int anInt10725 = 2;
	static final int anInt10726 = 4;
	static final int anInt10727 = 5;
	int anInt10728;
	int anInt10729;
	static final int anInt10730 = 1;
	String aString10731;
	int anInt10732;
	int anInt10733;
	static final int anInt10734 = 0;
	int anInt10735;
	static final int anInt10736 = 21;
	static final int anInt10737 = 3;
	int anInt10738;
	String aString10739;
	String aString10740;
	String aString10741;
	static final int anInt10742 = 6;
	int anInt10743;
	int anInt10744;
	int anInt10745;
	int anInt10746;
	String aString10747;
	static final int anInt10748 = 20;
	int[] anIntArray10749 = new int[3];
	static final int anInt10750 = 1;
	static final int anInt10751 = 2;

	public int method16666() {
		int i = 38;
		i += Class57.method1363(aString10706, (byte) 8);
		i += Class57.method1363(aString10740, (byte) 8);
		i += Class57.method1363(aString10741, (byte) 8);
		i += Class57.method1363(aString10731, (byte) 8);
		i += Class57.method1363(aString10747, (byte) 8);
		i += Class57.method1363(aString10715, (byte) 8);
		i += Class57.method1363(aString10739, (byte) 8);
		return i;
	}

	void method16667(int i) {
		if (aString10706.length() > 40)
			aString10706 = aString10706.substring(0, 40);
		if (aString10740.length() > 40)
			aString10740 = aString10740.substring(0, 40);
		if (aString10741.length() > 10)
			aString10741 = aString10741.substring(0, 10);
		if (aString10731.length() > 10)
			aString10731 = aString10731.substring(0, 10);
		if (aString10739.length() > 120)
			aString10739 = aString10739.substring(0, 120);
	}

	public Class527_Sub40(boolean bool) {
		if (bool) {
			if (Class234.aString2373.startsWith("win"))
				anInt10701 = -541534939;
			else if (Class234.aString2373.startsWith("mac"))
				anInt10701 = -1083069878;
			else if (Class234.aString2373.startsWith("linux"))
				anInt10701 = -1624604817;
			else
				anInt10701 = 2128827540;
			if (Class193.aString2155.startsWith("amd64") || Class193.aString2155.startsWith("x86_64"))
				aBool10702 = true;
			else
				aBool10702 = false;
			if (1 == anInt10701 * -1144701267) {
				if (Class383_Sub1.aString10277.indexOf("4.0") != -1)
					anInt10722 = -447972037;
				else if (Class383_Sub1.aString10277.indexOf("4.1") != -1)
					anInt10722 = -895944074;
				else if (Class383_Sub1.aString10277.indexOf("4.9") != -1)
					anInt10722 = -1343916111;
				else if (Class383_Sub1.aString10277.indexOf("5.0") != -1)
					anInt10722 = -1791888148;
				else if (Class383_Sub1.aString10277.indexOf("5.1") != -1)
					anInt10722 = 2055107111;
				else if (Class383_Sub1.aString10277.indexOf("5.2") != -1)
					anInt10722 = 711191000;
				else if (Class383_Sub1.aString10277.indexOf("6.0") != -1)
					anInt10722 = 1607135074;
				else if (Class383_Sub1.aString10277.indexOf("6.1") != -1)
					anInt10722 = 1159163037;
				else if (Class383_Sub1.aString10277.indexOf("6.2") != -1)
					anInt10722 = 263218963;
				else if (Class383_Sub1.aString10277.indexOf("6.3") != -1)
					anInt10722 = -184753074;
				else if (Class383_Sub1.aString10277.indexOf("10.0") != -1)
					anInt10722 = -632725111;
			} else if (2 == anInt10701 * -1144701267) {
				if (Class383_Sub1.aString10277.indexOf("10.4") != -1)
					anInt10722 = -369506148;
				else if (Class383_Sub1.aString10277.indexOf("10.5") != -1)
					anInt10722 = -817478185;
				else if (Class383_Sub1.aString10277.indexOf("10.6") != -1)
					anInt10722 = -1265450222;
				else if (Class383_Sub1.aString10277.indexOf("10.7") != -1)
					anInt10722 = -1713422259;
				else if (Class383_Sub1.aString10277.indexOf("10.8") != -1)
					anInt10722 = 2133573000;
				else if (Class383_Sub1.aString10277.indexOf("10.9") != -1)
					anInt10722 = 1685600963;
				else if (Class383_Sub1.aString10277.indexOf("10.10") != -1)
					anInt10722 = 1237628926;
				else if (Class383_Sub1.aString10277.indexOf("10.11") != -1)
					anInt10722 = 789656889;
			}
			if (Class282.aString3198.toLowerCase().indexOf("sun") != -1)
				anInt10728 = -781037461;
			else if (Class282.aString3198.toLowerCase().indexOf("microsoft") != -1)
				anInt10728 = -1562074922;
			else if (Class282.aString3198.toLowerCase().indexOf("apple") != -1)
				anInt10728 = 1951854913;
			else if (Class282.aString3198.toLowerCase().indexOf("oracle") != -1)
				anInt10728 = 389779991;
			else
				anInt10728 = 1170817452;
			int i = 2;
			int i_0_ = 0;
			try {
				for (/**/; i < Class261.aString2862.length(); i++) {
					int i_1_ = Class261.aString2862.charAt(i);
					if (i_1_ < 48 || i_1_ > 57)
						break;
					i_0_ = i_1_ - 48 + i_0_ * 10;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10729 = i_0_ * 290786477;
			i = Class261.aString2862.indexOf('.', 2) + 1;
			i_0_ = 0;
			try {
				for (/**/; i < Class261.aString2862.length(); i++) {
					int i_2_ = Class261.aString2862.charAt(i);
					if (i_2_ < 48 || i_2_ > 57)
						break;
					i_0_ = i_0_ * 10 + (i_2_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10703 = 1202338111 * i_0_;
			i = Class261.aString2862.indexOf('_', 4) + 1;
			i_0_ = 0;
			try {
				for (/**/; i < Class261.aString2862.length(); i++) {
					int i_3_ = Class261.aString2862.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_0_ = i_3_ - 48 + i_0_ * 10;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt10732 = -619042343 * i_0_;
			aBool10704 = false;
			anInt10733 = 475307055 * Class515.anInt7045;
			if (1617704741 * anInt10729 > 3)
				anInt10735 = Class515.anInt7046 * -1900823485;
			else
				anInt10735 = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (is != null && is.length == 3) {
					anInt10745 = is[0] * -1063922795;
					anInt10738 = is[1] * -117548175;
					anInt10721 = -174486753 * is[2];
				}
				int[] is_4_ = HardwareInfo.getRawCPUInfo();
				if (null != is_4_ && 0 == is_4_.length % 5) {
					HashMap hashmap = new HashMap();
					for (int i_5_ = 0; i_5_ < is_4_.length / 5; i_5_++) {
						int i_6_ = is_4_[i_5_ * 5];
						int i_7_ = is_4_[1 + 5 * i_5_];
						int i_8_ = is_4_[5 * i_5_ + 2];
						int i_9_ = is_4_[3 + 5 * i_5_];
						int i_10_ = is_4_[5 * i_5_ + 4];
						Class38 class38 = new Class38(i_6_, i_7_, i_8_, i_9_, i_10_);
						hashmap.put(Integer.valueOf(i_6_), class38);
					}
					Class38 class38 = (Class38) hashmap.get(Integer.valueOf(0));
					if (class38 != null) {
						RSByteBuffer class527_sub38 = new RSByteBuffer(13);
						class527_sub38.writeIntLE((-13885207 * class38.anInt428), (byte) 95);
						class527_sub38.writeIntLE((-923877367 * class38.anInt426), (byte) 57);
						class527_sub38.writeIntLE((593265099 * class38.anInt429), (byte) 86);
						class527_sub38.anInt10689 = 0;
						aString10747 = class527_sub38.readString(920948710);
					}
					Class38 class38_11_ = (Class38) hashmap.get(Integer.valueOf(1));
					if (null != class38_11_) {
						anInt10714 = -1664177657 * class38_11_.anInt427;
						int i_12_ = -13885207 * class38_11_.anInt428;
						anInt10746 = 887620781 * (i_12_ >> 16 & 0xff);
						anIntArray10749[0] = class38_11_.anInt429 * 593265099;
						anIntArray10749[1] = -923877367 * class38_11_.anInt426;
					}
					Class38 class38_13_ = (Class38) hashmap.get(Integer.valueOf(-2147483647));
					if (class38_13_ != null)
						anIntArray10749[2] = -923877367 * class38_13_.anInt426;
					RSByteBuffer class527_sub38 = new RSByteBuffer(49);
					for (int i_14_ = -2147483646; i_14_ <= -2147483644; i_14_++) {
						Class38 class38_15_ = (Class38) hashmap.get(Integer.valueOf(i_14_));
						if (class38_15_ != null) {
							class527_sub38.writeIntLE((-147355563 * (class38_15_.anInt427)), (byte) 72);
							class527_sub38.writeIntLE((class38_15_.anInt428 * -13885207), (byte) 106);
							class527_sub38.writeIntLE((class38_15_.anInt429 * 593265099), (byte) 94);
							class527_sub38.writeIntLE((-923877367 * (class38_15_.anInt426)), (byte) 74);
						}
					}
					class527_sub38.anInt10689 = 0;
					aString10715 = class527_sub38.readString(961897450);
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (null != strings && strings.length > 0 && strings[0] != null) {
					for (int i_16_ = 0; i_16_ < strings[0].length; i_16_ += 2) {
						if (strings[0][i_16_].equalsIgnoreCase("szDescription"))
							aString10706 = strings[0][1 + i_16_];
						else if (strings[0][i_16_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][i_16_ + 1];
							try {
								int i_17_ = string.indexOf("/");
								int i_18_ = string.indexOf("/", 1 + i_17_);
								anInt10744 = ((Integer.parseInt(string.substring(0, i_17_))) * 1181341381);
								anInt10743 = ((Integer.parseInt(string.substring(i_18_ + 1, string.indexOf(" ", i_18_)))) * -2117862677);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
				String[] strings_19_ = HardwareInfo.getDXDiagSystemProps();
				if (null != strings_19_) {
					String string = "";
					String string_20_ = "";
					String string_21_ = "";
					for (int i_22_ = 0; i_22_ < strings_19_.length; i_22_ += 2) {
						if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionMajor"))
							string = strings_19_[i_22_ + 1];
						else if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_20_ = strings_19_[1 + i_22_];
						else if (strings_19_[i_22_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_21_ = strings_19_[1 + i_22_];
					}
					aString10741 = new StringBuilder().append(string).append(".").append(string_20_).append(string_21_).toString();
				}
			} catch (Throwable throwable) {
				anInt10721 = 0;
			}
		}
		if (null == aString10706)
			aString10706 = "";
		if (aString10740 == null)
			aString10740 = "";
		if (aString10741 == null)
			aString10741 = "";
		if (null == aString10731)
			aString10731 = "";
		if (aString10747 == null)
			aString10747 = "";
		if (aString10715 == null)
			aString10715 = "";
		if (null == aString10739)
			aString10739 = "";
		method16667(-185501669);
	}

	public void method16668(RSByteBuffer class527_sub38, int i) {
		class527_sub38.writeByte(7, -529453156);
		class527_sub38.writeByte(anInt10701 * -1144701267, -1049390238);
		class527_sub38.writeByte(aBool10702 ? 1 : 0, -309151252);
		class527_sub38.writeByte(anInt10722 * -2102307853, -1029923136);
		class527_sub38.writeByte(1345051715 * anInt10728, -1419806674);
		class527_sub38.writeByte(1617704741 * anInt10729, -1727307419);
		class527_sub38.writeByte(anInt10703 * 420755135, -1609165952);
		class527_sub38.writeByte(-171981207 * anInt10732, 1703692455);
		class527_sub38.writeByte(aBool10704 ? 1 : 0, 696428898);
		class527_sub38.writeShort(-1666033367 * anInt10733, 1404835786);
		class527_sub38.writeByte(408207281 * anInt10735, -497258172);
		class527_sub38.writeTriByte(529936607 * anInt10721, 1052664992);
		class527_sub38.writeShort(-839580271 * anInt10738, 1404835786);
		class527_sub38.writeGJString3(aString10706, (short) -1053);
		class527_sub38.writeGJString3(aString10740, (short) -30173);
		class527_sub38.writeGJString3(aString10741, (short) -521);
		class527_sub38.writeGJString3(aString10731, (short) -1048);
		class527_sub38.writeByte(-1587464179 * anInt10744, 1751354633);
		class527_sub38.writeShort(1267850691 * anInt10743, 1404835786);
		class527_sub38.writeGJString3(aString10747, (short) -4634);
		class527_sub38.writeGJString3(aString10715, (short) -29465);
		class527_sub38.writeByte(281337789 * anInt10745, -1660284610);
		class527_sub38.writeByte(anInt10746 * 535559973, -1349071441);
		for (int i_23_ = 0; i_23_ < anIntArray10749.length; i_23_++)
			class527_sub38.writeInt(anIntArray10749[i_23_], 1247299032);
		class527_sub38.writeInt(-1308191805 * anInt10714, -1307754376);
		class527_sub38.writeGJString3(aString10739, (short) -18590);
	}

	void method16669() {
		if (aString10706.length() > 40)
			aString10706 = aString10706.substring(0, 40);
		if (aString10740.length() > 40)
			aString10740 = aString10740.substring(0, 40);
		if (aString10741.length() > 10)
			aString10741 = aString10741.substring(0, 10);
		if (aString10731.length() > 10)
			aString10731 = aString10731.substring(0, 10);
		if (aString10739.length() > 120)
			aString10739 = aString10739.substring(0, 120);
	}

	void method16670() {
		if (aString10706.length() > 40)
			aString10706 = aString10706.substring(0, 40);
		if (aString10740.length() > 40)
			aString10740 = aString10740.substring(0, 40);
		if (aString10741.length() > 10)
			aString10741 = aString10741.substring(0, 10);
		if (aString10731.length() > 10)
			aString10731 = aString10731.substring(0, 10);
		if (aString10739.length() > 120)
			aString10739 = aString10739.substring(0, 120);
	}

	void method16671() {
		if (aString10706.length() > 40)
			aString10706 = aString10706.substring(0, 40);
		if (aString10740.length() > 40)
			aString10740 = aString10740.substring(0, 40);
		if (aString10741.length() > 10)
			aString10741 = aString10741.substring(0, 10);
		if (aString10731.length() > 10)
			aString10731 = aString10731.substring(0, 10);
		if (aString10739.length() > 120)
			aString10739 = aString10739.substring(0, 120);
	}

	public int method16672() {
		int i = 38;
		i += Class57.method1363(aString10706, (byte) 8);
		i += Class57.method1363(aString10740, (byte) 8);
		i += Class57.method1363(aString10741, (byte) 8);
		i += Class57.method1363(aString10731, (byte) 8);
		i += Class57.method1363(aString10747, (byte) 8);
		i += Class57.method1363(aString10715, (byte) 8);
		i += Class57.method1363(aString10739, (byte) 8);
		return i;
	}

	public int method16673(int i) {
		int i_24_ = 38;
		i_24_ += Class57.method1363(aString10706, (byte) 8);
		i_24_ += Class57.method1363(aString10740, (byte) 8);
		i_24_ += Class57.method1363(aString10741, (byte) 8);
		i_24_ += Class57.method1363(aString10731, (byte) 8);
		i_24_ += Class57.method1363(aString10747, (byte) 8);
		i_24_ += Class57.method1363(aString10715, (byte) 8);
		i_24_ += Class57.method1363(aString10739, (byte) 8);
		return i_24_;
	}

	public int method16674() {
		int i = 38;
		i += Class57.method1363(aString10706, (byte) 8);
		i += Class57.method1363(aString10740, (byte) 8);
		i += Class57.method1363(aString10741, (byte) 8);
		i += Class57.method1363(aString10731, (byte) 8);
		i += Class57.method1363(aString10747, (byte) 8);
		i += Class57.method1363(aString10715, (byte) 8);
		i += Class57.method1363(aString10739, (byte) 8);
		return i;
	}

	static final void method16675(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class153.method2524(class243, class240, class665, (byte) -13);
	}

	static final void method16676(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_25_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_26_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_26_, -1304539054));
		if (class80.method1566(569265489))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_25_, 36371590)).method649(i_26_, class80.aString806, 2126097853);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_25_, 1612526655)).method620(i_26_, class80.anInt804 * 780718929, (byte) 0));
	}
}
