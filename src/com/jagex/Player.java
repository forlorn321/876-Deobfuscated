/* Class649_Sub1_Sub5_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Player extends Class649_Sub1_Sub5_Sub1 {
	public int anInt12178;
	public int[] anIntArray12179;
	String titleBeforeName;
	String aString12181;
	int anInt12182;
	public int[] anIntArray12183;
	public String username;
	public boolean aBool12185;
	public int anInt12186;
	public int anInt12187;
	public int anInt12188;
	public int anInt12189;
	public int faceDirection;
	public int anInt12191;
	public String aString12192;
	public int anInt12193;
	public boolean isClanMember;
	public int anInt12195;
	public int anInt12196;
	public byte aByte12197 = 0;
	public int anInt12198;
	public int transformNPC;
	public Class210 aClass210_12200;
	public Class623 aClass623_12201;
	public Class617 aClass617_12202;

	public Player(Class553 class553, int i) {
		super(class553, i, Class532.aClass98_Sub1_Sub1_7122);
		anIntArray12183 = new int[8];
		anIntArray12179 = new int[8];
		anInt12186 = 0;
		anInt12187 = 0;
		anInt12188 = 1864138265;
		anInt12189 = 0;
		faceDirection = -2114230253;
		aBool12185 = false;
		anInt12191 = 0;
		anInt12193 = 2015033897;
		anInt12198 = -288862015;
		anInt12195 = 665453407;
		anInt12196 = -1376582355;
		transformNPC = 0;
		anInt12178 = -1718096987;
		aClass210_12200 = Class210.aClass210_2258;
		aClass623_12201 = Class623.aClass623_8130;
		isClanMember = false;
		method11083(1980387105);
	}

	public final void decodePlayerAppearance(RSByteBuffer buffer) {
		buffer.off = 0;
		int flag = buffer.readUnsignedByte();
		byte isMale = (byte) (flag & 0x1);
		boolean bool = (flag & 0x4) != 0;
		int i_2_ = super.method10874();
		method10873(1 + (flag >> 3 & 0x7), -324388659);
		boolean titleBeforeName = 0 != (flag & 0x40);
		boolean titleAfterName = (flag & 0x80) != 0;
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		class436.aFloat4850 += (float) (method10874() - i_2_ << 8);
		class436.aFloat4853 += (float) (method10874() - i_2_ << 8);
		method7841(class436);
		class436.method5239();
		if (titleBeforeName)
			this.titleBeforeName = buffer.readVersionedString();
		else
			this.titleBeforeName = null;
		if (titleAfterName)
			aString12181 = buffer.readVersionedString();
		else
			aString12181 = null;
		aClass623_12201 = ((Class623) Class682.method8091(Class623.method7422((byte) 1), buffer.readByte(), 1858049507));
		if (Class678.aClass678_8619 == Class47.aClass678_578 && 423156687 * client.anInt11160 >= 2)
			aClass623_12201 = Class623.aClass623_8130;
		decodePlayerLook(buffer, isMale);
		aString12192 = buffer.readString();
		username = aString12192;
		if (this == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591)
			RuntimeException_Sub1.aString12036 = aString12192;
		anInt12186 = buffer.readUnsignedByte() * 1288777103;
		if (bool) {
			anInt12189 = buffer.readUnsignedShort() * 407837897;
			if (65535 == anInt12189 * -1543258759)
				anInt12189 = -407837897;
			anInt12187 = anInt12186 * -1476570285;
			anInt12188 = 1864138265;
		} else {
			anInt12189 = 0;
			anInt12187 = buffer.readUnsignedByte() * 149561949;
			anInt12188 = buffer.readUnsignedByte() * -1864138265;
			if (255 == 1370751447 * anInt12188)
				anInt12188 = 1864138265;
		}
		int i_5_ = 692832581 * transformNPC;
		transformNPC = buffer.readUnsignedByte() * -1603051123;
		if (0 != 692832581 * transformNPC) {
			int i_6_ = anInt12193 * -1674002969;
			int i_7_ = 1606140095 * anInt12198;
			int i_8_ = 381085537 * anInt12195;
			int i_9_ = anInt12196 * 984444251;
			int i_10_ = anInt12178 * -378853165;
			anInt12193 = buffer.readUnsignedShort() * -2015033897;
			anInt12198 = buffer.readUnsignedShort() * 288862015;
			anInt12195 = buffer.readUnsignedShort() * -665453407;
			anInt12196 = buffer.readUnsignedShort() * 1376582355;
			anInt12178 = buffer.readUnsignedByte() * 1037528923;
			if (i_5_ != 692832581 * transformNPC || anInt12193 * -1674002969 != i_6_ || i_7_ != 1606140095 * anInt12198 || i_8_ != 381085537 * anInt12195 || i_9_ != anInt12196 * 984444251 || i_10_ != -378853165 * anInt12178)
				Class145.method1801(this, (byte) -26);
		} else
			Class47.method912(this, (short) 255);
	}

	public int method10886(int i) {
		return -(anInt11889 * 1710020215) - 1;
	}

	void method11083(int i) {
		for (int i_11_ = 0; i_11_ < anIntArray12183.length; i_11_++)
			anIntArray12183[i_11_] = -1;
		for (int i_12_ = 0; i_12_ < anIntArray12179.length; i_12_++)
			anIntArray12179[i_12_] = -1;
	}

	public Class559 method9946(Class167 class167, int i) {
		return null;
	}

	Class563 method9944(Class167 class167, byte i) {
		if (aClass617_12202 == null || !method11089(class167, 2048, 1228636418))
			return null;
		Class433 class433 = class167.method2091();
		Class433 class433_13_ = method7851();
		Class431 class431 = method7837();
		int i_14_ = aClass62_11940.method1047((byte) 16);
		Class556 class556 = (aClass553_10838.aClass556ArrayArrayArray7430[aByte10839][(int) class431.aClass436_4823.aFloat4850 >> 9][(int) class431.aClass436_4823.aFloat4853 >> 9]);
		if (null != class556 && class556.aClass649_Sub1_Sub2_7503 != null) {
			int i_15_ = (288770361 * anInt11954 - class556.aClass649_Sub1_Sub2_7503.aShort11755);
			anInt11954 = (int) ((float) (288770361 * anInt11954) - (float) i_15_ / 10.0F) * -763112183;
		} else
			anInt11954 = ((int) ((float) (288770361 * anInt11954) - (float) (anInt11954 * 288770361) / 10.0F) * -763112183);
		class433.method5190(class433_13_);
		class433.method5200(0.0F, (float) (-20 - anInt11954 * 288770361), 0.0F);
		Class563 class563 = null;
		aBool11917 = false;
		if (ClientSetting.aClass536_Sub40_8843.spotShadowSetting.method10014(-1904559876) == 1) {
			BASTypeDecoder class589 = method10877(407379079);
			if (class589.aBool7778 && (-1 == -587726343 * aClass617_12202.anInt8079 || ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) 96))).aBool3265)) {
				Class688 class688 = ((aClass688_11925.method8121(-1247322779) && aClass688_11925.method8128(-144709969)) ? aClass688_11925 : null);
				Class688_Sub3 class688_sub3 = ((aClass688_Sub3_11914.method8121(-1772101721) && (!aClass688_Sub3_11914.aBool10975 || class688 == null)) ? aClass688_Sub3_11914 : null);
				short i_16_ = Class644.aClass628_8352.aShort8186;
				byte i_17_ = Class644.aClass628_8352.aByte8199;
				if (aClass617_12202.anInt8079 * -587726343 != -1) {
					i_16_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -31))).aShort3314;
					i_17_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -27))).aByte3315;
				}
				Object object = null;
				Class177 class177;
				if (i_16_ > -1 && ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(2037357124) == 1)
					class177 = (Class536_Sub18_Sub1.method10480(class167, i_14_, anInt11892 * 1681595873, 1915921525 * anInt11900, anInt11891 * -2111850483, aClass177Array11953[0], i_16_, i_17_, (null != class688_sub3 ? (Class688) class688_sub3 : class688), 980369976));
				else
					class177 = Class381.method4819(class167, i_14_, 1681595873 * anInt11892, 1915921525 * anInt11900, -2111850483 * anInt11891, 1, aClass177Array11953[0], 0, 0, 160, 240, (null != class688_sub3 ? (Class688) class688_sub3 : class688), -1640619235);
				if (class177 != null) {
					if (aClass178Array10842 == null || (aClass178Array10842.length < aClass177Array11953.length + 1))
						method9968(1 + aClass177Array11953.length, 1217275626);
					class563 = Class225.method3212(true, -2024160667);
					aBool11917 = true;
					class167.method2302(false);
					class177.method2490(class433, (aClass178Array10842[aClass177Array11953.length]), 0);
					class167.method2302(true);
				}
			}
		}
		if (this == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) {
			for (int i_18_ = client.aClass103Array11020.length - 1; i_18_ >= 0; i_18_--) {
				Class103 class103 = client.aClass103Array11020[i_18_];
				if (class103 != null && -1 != class103.anInt1229 * 19461697) {
					if (2030004867 * class103.anInt1224 == 1) {
						ObjectParam class536_sub13 = ((ObjectParam) (client.aClass4_11050.method556((long) (class103.anInt1223 * 1298998125))));
						if (class536_sub13 != null) {
							NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
							Class436 class436 = (Class436.method5252((class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823), Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_19_ = (int) class436.aFloat4850;
							int i_20_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_19_, (long) i_20_, class103.anInt1229 * 19461697, 92160000L);
						}
					}
					if (2 == class103.anInt1224 * 2030004867) {
						Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
						long l = (long) (class103.anInt1225 * 987706607 - (int) class436.aFloat4850);
						long l_21_ = (long) (class103.anInt1226 * -1675921633 - (int) class436.aFloat4853);
						long l_22_ = (long) (class103.anInt1228 * 46780477 << 9);
						l_22_ *= l_22_;
						method11084(class167, class433, aClass177Array11953[0], l, l_21_, 19461697 * class103.anInt1229, l_22_);
					}
					if (10 == 2030004867 * class103.anInt1224 && class103.anInt1223 * 1298998125 >= 0 && (1298998125 * class103.anInt1223 < (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155).length)) {
						Player class649_sub1_sub5_sub1_sub2_23_ = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[1298998125 * class103.anInt1223]);
						if (null != class649_sub1_sub5_sub1_sub2_23_) {
							Class436 class436 = (Class436.method5252(class649_sub1_sub5_sub1_sub2_23_.method7837().aClass436_4823, Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_24_ = (int) class436.aFloat4850;
							int i_25_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_24_, (long) i_25_, 19461697 * class103.anInt1229, 92160000L);
						}
					}
				}
			}
		}
		class433.method5190(class433_13_);
		class433.method5200(0.0F, (float) (-5 - anInt11954 * 288770361), 0.0F);
		if (aClass178Array10842 == null || aClass178Array10842.length < aClass177Array11953.length)
			method9968(aClass177Array11953.length, 555178619);
		if (null == class563)
			class563 = Class225.method3212(true, 1613726166);
		method10898(class167, aClass177Array11953, class433, false, 1902231380);
		for (int i_26_ = 0; i_26_ < aClass177Array11953.length; i_26_++) {
			if (aClass177Array11953[i_26_] != null)
				aClass177Array11953[i_26_].method2490(class433, aClass178Array10842[i_26_], (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == this ? 1 : 0));
			else
				aClass178Array10842[i_26_].aBool1945 = false;
		}
		if (null != aClass627_11950) {
			Class166 class166 = aClass627_11950.method7476();
			class167.method2351(class166);
		}
		for (int i_27_ = 0; i_27_ < aClass177Array11953.length; i_27_++) {
			if (null != aClass177Array11953[i_27_])
				aBool11917 |= aClass177Array11953[i_27_].method2511();
			aClass177Array11953[i_27_] = null;
		}
		anInt11943 = 1361712787 * client.anInt11127;
		return class563;
	}

	void method9945(Class167 class167, int i) {
		if (aClass617_12202 != null && (aBool11931 || method11089(class167, 0, -1163035825))) {
			Class433 class433 = class167.method2091();
			class433.method5191(method7837());
			class433.method5200(0.0F, -5.0F, 0.0F);
			method10898(class167, aClass177Array11953, class433, aBool11931, 1902231380);
			for (int i_28_ = 0; i_28_ < aClass177Array11953.length; i_28_++)
				aClass177Array11953[i_28_] = null;
		}
	}

	void method11084(Class167 class167, Class433 class433, Class177 class177, long l, long l_29_, int i, long l_30_) {
		long l_31_ = l * l + l_29_ * l_29_;
		if (l_31_ >= 262144L && l_31_ <= l_30_) {
			int i_32_ = ((int) ((Math.atan2((double) l, (double) l_29_) * 2607.5945876176133) - (double) aClass62_11940.method1047((byte) 16)) & 0x3fff);
			Class177 class177_33_ = Class260.method3614(class167, i_32_, 1681595873 * anInt11892, anInt11900 * 1915921525, anInt11891 * -2111850483, i, 546369414);
			if (null != class177_33_) {
				class167.method2302(false);
				class177_33_.method2490(class433, null, 0);
				class167.method2302(true);
			}
		}
	}

	public String method11085(boolean bool, byte i) {
		String string = "";
		if (titleBeforeName != null)
			string = titleBeforeName;
		if (bool)
			string = new StringBuilder().append(string).append(aString12192).toString();
		else
			string = new StringBuilder().append(string).append(username).toString();
		if (null != aString12181)
			string = new StringBuilder().append(string).append(aString12181).toString();
		return string;
	}

	public String method11086(boolean bool, int i) {
		if (bool)
			return aString12192;
		return username;
	}

	final void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_34_, int i_35_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method11087(int i, int i_36_, byte i_37_) {
		stepsCount = 0;
		anInt11948 = 0;
		anInt11915 = 0;
		screenX[0] = i;
		screenY[0] = i_36_;
		int i_38_ = method10874();
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		class436.aFloat4850 = (float) (i_38_ * 256 + 512 * screenX[0]);
		class436.aFloat4853 = (float) (256 * i_38_ + screenY[0] * 512);
		method7841(class436);
		class436.method5239();
		if (this == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591)
			client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
		if (aClass627_11950 != null)
			aClass627_11950.method7467();
	}

	public final boolean method11088(int i) {
		if (null == aClass617_12202)
			return false;
		return true;
	}

	public int method10874() {
		if (null != aClass617_12202 && -587726343 * aClass617_12202.anInt8079 != -1)
			return (((NPCDecoder) Class172.aClass34_Sub7_1922.method70((-587726343 * (aClass617_12202.anInt8079)), (byte) 5)).anInt3272 * 830254667);
		return super.method10874();
	}

	int method10897(int i) {
		return -1903031581 * anInt12182;
	}

	final boolean method9972() {
		return false;
	}

	public boolean method10912() {
		return Class644.aClass628_8352.aBool8219;
	}

	final boolean method9940(int i) {
		return false;
	}

	final void method9986(int i) {
		throw new IllegalStateException();
	}

	public boolean method10865(int i) {
		return Class644.aClass628_8352.aBool8219;
	}

	public Player(Class553 class553) {
		super(class553, Class532.aClass98_Sub1_Sub1_7122);
		anIntArray12183 = new int[8];
		anIntArray12179 = new int[8];
		anInt12186 = 0;
		anInt12187 = 0;
		anInt12188 = 1864138265;
		anInt12189 = 0;
		faceDirection = -2114230253;
		aBool12185 = false;
		anInt12191 = 0;
		anInt12193 = 2015033897;
		anInt12198 = -288862015;
		anInt12195 = 665453407;
		anInt12196 = -1376582355;
		transformNPC = 0;
		anInt12178 = -1718096987;
		aClass210_12200 = Class210.aClass210_2258;
		aClass623_12201 = Class623.aClass623_8130;
		isClanMember = false;
		method11083(2052181317);
	}

	public int method10903() {
		if (null != aClass617_12202 && -587726343 * aClass617_12202.anInt8079 != -1)
			return ((((NPCDecoder) Class172.aClass34_Sub7_1922.method70((-587726343 * (aClass617_12202.anInt8079)), (byte) -64)).anInt3272) * 830254667);
		return super.method10874();
	}

	public Class308 method192(int i) {
		return Class308.aClass308_3456;
	}

	public int method199(short i) {
		return 1710020215 * anInt11889;
	}

	public Class536_Sub30 method190(int i) {
		Class598 class598 = client.aClass515_11066.method6255(-1468793122);
		return (Class247.method3424(aByte10839, ((int) method7837().aClass436_4823.aFloat4850 + class598.anInt7839 * 2133575168), -(int) method7837().aClass436_4823.aFloat4852, ((int) method7837().aClass436_4823.aFloat4853 + 1391122944 * class598.anInt7840), -1000595639));
	}

	public Class425 method193(byte i) {
		Class425 class425 = Class425.method5081();
		class425.method5088(Class447.method5400(aClass62_11940.anInt700 * 897724319), 0.0F, 0.0F);
		return class425;
	}

	public Class436 method194(int i) {
		return Class436.method5238();
	}

	public Class533 method10914() {
		if (null != aClass533_11903) {
			if (aClass533_11903.aString7126 == null)
				return null;
			if (1867600229 * client.anInt11259 == 0 || 1867600229 * client.anInt11259 == 3 || (1 == client.anInt11259 * 1867600229 && Class417.method5037(username, 1189210166)))
				return aClass533_11903;
		}
		return null;
	}

	public Class308 method191() {
		return Class308.aClass308_3456;
	}

	public Class308 method196() {
		return Class308.aClass308_3456;
	}

	public Class308 method197() {
		return Class308.aClass308_3456;
	}

	public int method9() {
		return 1710020215 * anInt11889;
	}

	Class563 method9965(Class167 class167) {
		if (aClass617_12202 == null || !method11089(class167, 2048, -41189478))
			return null;
		Class433 class433 = class167.method2091();
		Class433 class433_39_ = method7851();
		Class431 class431 = method7837();
		int i = aClass62_11940.method1047((byte) 16);
		Class556 class556 = (aClass553_10838.aClass556ArrayArrayArray7430[aByte10839][(int) class431.aClass436_4823.aFloat4850 >> 9][(int) class431.aClass436_4823.aFloat4853 >> 9]);
		if (null != class556 && class556.aClass649_Sub1_Sub2_7503 != null) {
			int i_40_ = (288770361 * anInt11954 - class556.aClass649_Sub1_Sub2_7503.aShort11755);
			anInt11954 = (int) ((float) (288770361 * anInt11954) - (float) i_40_ / 10.0F) * -763112183;
		} else
			anInt11954 = ((int) ((float) (288770361 * anInt11954) - (float) (anInt11954 * 288770361) / 10.0F) * -763112183);
		class433.method5190(class433_39_);
		class433.method5200(0.0F, (float) (-20 - anInt11954 * 288770361), 0.0F);
		Class563 class563 = null;
		aBool11917 = false;
		if (ClientSetting.aClass536_Sub40_8843.spotShadowSetting.method10014(-1904559876) == 1) {
			BASTypeDecoder class589 = method10877(-1477732075);
			if (class589.aBool7778 && (-1 == -587726343 * aClass617_12202.anInt8079 || ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) 63))).aBool3265)) {
				Class688 class688 = ((aClass688_11925.method8121(-1497788714) && aClass688_11925.method8128(-144709969)) ? aClass688_11925 : null);
				Class688_Sub3 class688_sub3 = ((aClass688_Sub3_11914.method8121(-2074918880) && (!aClass688_Sub3_11914.aBool10975 || class688 == null)) ? aClass688_Sub3_11914 : null);
				short i_41_ = Class644.aClass628_8352.aShort8186;
				byte i_42_ = Class644.aClass628_8352.aByte8199;
				if (aClass617_12202.anInt8079 * -587726343 != -1) {
					i_41_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -14))).aShort3314;
					i_42_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -34))).aByte3315;
				}
				Object object = null;
				Class177 class177;
				if (i_41_ > -1 && ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(1748304986) == 1)
					class177 = (Class536_Sub18_Sub1.method10480(class167, i, anInt11892 * 1681595873, 1915921525 * anInt11900, anInt11891 * -2111850483, aClass177Array11953[0], i_41_, i_42_, (null != class688_sub3 ? (Class688) class688_sub3 : class688), 980369976));
				else
					class177 = Class381.method4819(class167, i, 1681595873 * anInt11892, 1915921525 * anInt11900, -2111850483 * anInt11891, 1, aClass177Array11953[0], 0, 0, 160, 240, (null != class688_sub3 ? (Class688) class688_sub3 : class688), -410093020);
				if (class177 != null) {
					if (aClass178Array10842 == null || (aClass178Array10842.length < aClass177Array11953.length + 1))
						method9968(1 + aClass177Array11953.length, -860328874);
					class563 = Class225.method3212(true, -1438530196);
					aBool11917 = true;
					class167.method2302(false);
					class177.method2490(class433, (aClass178Array10842[aClass177Array11953.length]), 0);
					class167.method2302(true);
				}
			}
		}
		if (this == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) {
			for (int i_43_ = client.aClass103Array11020.length - 1; i_43_ >= 0; i_43_--) {
				Class103 class103 = client.aClass103Array11020[i_43_];
				if (class103 != null && -1 != class103.anInt1229 * 19461697) {
					if (2030004867 * class103.anInt1224 == 1) {
						ObjectParam class536_sub13 = ((ObjectParam) (client.aClass4_11050.method556((long) (class103.anInt1223 * 1298998125))));
						if (class536_sub13 != null) {
							NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
							Class436 class436 = (Class436.method5252((class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823), Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_44_ = (int) class436.aFloat4850;
							int i_45_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_44_, (long) i_45_, class103.anInt1229 * 19461697, 92160000L);
						}
					}
					if (2 == class103.anInt1224 * 2030004867) {
						Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
						long l = (long) (class103.anInt1225 * 987706607 - (int) class436.aFloat4850);
						long l_46_ = (long) (class103.anInt1226 * -1675921633 - (int) class436.aFloat4853);
						long l_47_ = (long) (class103.anInt1228 * 46780477 << 9);
						l_47_ *= l_47_;
						method11084(class167, class433, aClass177Array11953[0], l, l_46_, 19461697 * class103.anInt1229, l_47_);
					}
					if (10 == 2030004867 * class103.anInt1224 && class103.anInt1223 * 1298998125 >= 0 && (1298998125 * class103.anInt1223 < (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155).length)) {
						Player class649_sub1_sub5_sub1_sub2_48_ = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[1298998125 * class103.anInt1223]);
						if (null != class649_sub1_sub5_sub1_sub2_48_) {
							Class436 class436 = (Class436.method5252(class649_sub1_sub5_sub1_sub2_48_.method7837().aClass436_4823, Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_49_ = (int) class436.aFloat4850;
							int i_50_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_49_, (long) i_50_, 19461697 * class103.anInt1229, 92160000L);
						}
					}
				}
			}
		}
		class433.method5190(class433_39_);
		class433.method5200(0.0F, (float) (-5 - anInt11954 * 288770361), 0.0F);
		if (aClass178Array10842 == null || aClass178Array10842.length < aClass177Array11953.length)
			method9968(aClass177Array11953.length, -1843394964);
		if (null == class563)
			class563 = Class225.method3212(true, 1972299368);
		method10898(class167, aClass177Array11953, class433, false, 1902231380);
		for (int i_51_ = 0; i_51_ < aClass177Array11953.length; i_51_++) {
			if (aClass177Array11953[i_51_] != null)
				aClass177Array11953[i_51_].method2490(class433, aClass178Array10842[i_51_], (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == this ? 1 : 0));
			else
				aClass178Array10842[i_51_].aBool1945 = false;
		}
		if (null != aClass627_11950) {
			Class166 class166 = aClass627_11950.method7476();
			class167.method2351(class166);
		}
		for (int i_52_ = 0; i_52_ < aClass177Array11953.length; i_52_++) {
			if (null != aClass177Array11953[i_52_])
				aBool11917 |= aClass177Array11953[i_52_].method2511();
			aClass177Array11953[i_52_] = null;
		}
		anInt11943 = 1361712787 * client.anInt11127;
		return class563;
	}

	public Class536_Sub30 method200() {
		Class598 class598 = client.aClass515_11066.method6255(-2103502999);
		return (Class247.method3424(aByte10839, ((int) method7837().aClass436_4823.aFloat4850 + class598.anInt7839 * 2133575168), -(int) method7837().aClass436_4823.aFloat4852, ((int) method7837().aClass436_4823.aFloat4853 + 1391122944 * class598.anInt7840), 1767541755));
	}

	public Class425 method198() {
		Class425 class425 = Class425.method5081();
		class425.method5088(Class447.method5400(aClass62_11940.anInt700 * 897724319), 0.0F, 0.0F);
		return class425;
	}

	public Class425 method201() {
		Class425 class425 = Class425.method5081();
		class425.method5088(Class447.method5400(aClass62_11940.anInt700 * 897724319), 0.0F, 0.0F);
		return class425;
	}

	final boolean method9973() {
		return false;
	}

	public Class559 method9955(Class167 class167) {
		return null;
	}

	public Class559 method9961(Class167 class167) {
		return null;
	}

	public int method10899() {
		return -(anInt11889 * 1710020215) - 1;
	}

	public Class559 method9963(Class167 class167) {
		return null;
	}

	boolean method9969(Class167 class167, int i, int i_53_) {
		if (null == aClass617_12202 || !method11089(class167, 131072, 1754321439))
			return false;
		Class433 class433 = method7851();
		boolean bool = false;
		for (int i_54_ = 0; i_54_ < aClass177Array11953.length; i_54_++) {
			if (aClass177Array11953[i_54_] != null && aClass177Array11953[i_54_].aBool1939 && aClass177Array11953[i_54_].method2549(i, i_53_, class433, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_55_ = 0; i_55_ < aClass177Array11953.length; i_55_++)
			aClass177Array11953[i_55_] = null;
		return bool;
	}

	public Class533 method10880(int i) {
		if (null != aClass533_11903) {
			if (aClass533_11903.aString7126 == null)
				return null;
			if (1867600229 * client.anInt11259 == 0 || 1867600229 * client.anInt11259 == 3 || (1 == client.anInt11259 * 1867600229 && Class417.method5037(username, 851696723)))
				return aClass533_11903;
		}
		return null;
	}

	Class563 method9966(Class167 class167) {
		if (aClass617_12202 == null || !method11089(class167, 2048, -29797067))
			return null;
		Class433 class433 = class167.method2091();
		Class433 class433_56_ = method7851();
		Class431 class431 = method7837();
		int i = aClass62_11940.method1047((byte) 16);
		Class556 class556 = (aClass553_10838.aClass556ArrayArrayArray7430[aByte10839][(int) class431.aClass436_4823.aFloat4850 >> 9][(int) class431.aClass436_4823.aFloat4853 >> 9]);
		if (null != class556 && class556.aClass649_Sub1_Sub2_7503 != null) {
			int i_57_ = (288770361 * anInt11954 - class556.aClass649_Sub1_Sub2_7503.aShort11755);
			anInt11954 = (int) ((float) (288770361 * anInt11954) - (float) i_57_ / 10.0F) * -763112183;
		} else
			anInt11954 = ((int) ((float) (288770361 * anInt11954) - (float) (anInt11954 * 288770361) / 10.0F) * -763112183);
		class433.method5190(class433_56_);
		class433.method5200(0.0F, (float) (-20 - anInt11954 * 288770361), 0.0F);
		Class563 class563 = null;
		aBool11917 = false;
		if (ClientSetting.aClass536_Sub40_8843.spotShadowSetting.method10014(-1904559876) == 1) {
			BASTypeDecoder class589 = method10877(-225976905);
			if (class589.aBool7778 && (-1 == -587726343 * aClass617_12202.anInt8079 || ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) 35))).aBool3265)) {
				Class688 class688 = ((aClass688_11925.method8121(-1850758818) && aClass688_11925.method8128(-144709969)) ? aClass688_11925 : null);
				Class688_Sub3 class688_sub3 = ((aClass688_Sub3_11914.method8121(-2064803389) && (!aClass688_Sub3_11914.aBool10975 || class688 == null)) ? aClass688_Sub3_11914 : null);
				short i_58_ = Class644.aClass628_8352.aShort8186;
				byte i_59_ = Class644.aClass628_8352.aByte8199;
				if (aClass617_12202.anInt8079 * -587726343 != -1) {
					i_58_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -49))).aShort3314;
					i_59_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -84))).aByte3315;
				}
				Object object = null;
				Class177 class177;
				if (i_58_ > -1 && ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(1291221384) == 1)
					class177 = (Class536_Sub18_Sub1.method10480(class167, i, anInt11892 * 1681595873, 1915921525 * anInt11900, anInt11891 * -2111850483, aClass177Array11953[0], i_58_, i_59_, (null != class688_sub3 ? (Class688) class688_sub3 : class688), 980369976));
				else
					class177 = Class381.method4819(class167, i, 1681595873 * anInt11892, 1915921525 * anInt11900, -2111850483 * anInt11891, 1, aClass177Array11953[0], 0, 0, 160, 240, (null != class688_sub3 ? (Class688) class688_sub3 : class688), -633721625);
				if (class177 != null) {
					if (aClass178Array10842 == null || (aClass178Array10842.length < aClass177Array11953.length + 1))
						method9968(1 + aClass177Array11953.length, 901020610);
					class563 = Class225.method3212(true, -862778581);
					aBool11917 = true;
					class167.method2302(false);
					class177.method2490(class433, (aClass178Array10842[aClass177Array11953.length]), 0);
					class167.method2302(true);
				}
			}
		}
		if (this == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) {
			for (int i_60_ = client.aClass103Array11020.length - 1; i_60_ >= 0; i_60_--) {
				Class103 class103 = client.aClass103Array11020[i_60_];
				if (class103 != null && -1 != class103.anInt1229 * 19461697) {
					if (2030004867 * class103.anInt1224 == 1) {
						ObjectParam class536_sub13 = ((ObjectParam) (client.aClass4_11050.method556((long) (class103.anInt1223 * 1298998125))));
						if (class536_sub13 != null) {
							NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
							Class436 class436 = (Class436.method5252((class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823), Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_61_ = (int) class436.aFloat4850;
							int i_62_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_61_, (long) i_62_, class103.anInt1229 * 19461697, 92160000L);
						}
					}
					if (2 == class103.anInt1224 * 2030004867) {
						Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
						long l = (long) (class103.anInt1225 * 987706607 - (int) class436.aFloat4850);
						long l_63_ = (long) (class103.anInt1226 * -1675921633 - (int) class436.aFloat4853);
						long l_64_ = (long) (class103.anInt1228 * 46780477 << 9);
						l_64_ *= l_64_;
						method11084(class167, class433, aClass177Array11953[0], l, l_63_, 19461697 * class103.anInt1229, l_64_);
					}
					if (10 == 2030004867 * class103.anInt1224 && class103.anInt1223 * 1298998125 >= 0 && (1298998125 * class103.anInt1223 < (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155).length)) {
						Player class649_sub1_sub5_sub1_sub2_65_ = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[1298998125 * class103.anInt1223]);
						if (null != class649_sub1_sub5_sub1_sub2_65_) {
							Class436 class436 = (Class436.method5252(class649_sub1_sub5_sub1_sub2_65_.method7837().aClass436_4823, Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_66_ = (int) class436.aFloat4850;
							int i_67_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_66_, (long) i_67_, 19461697 * class103.anInt1229, 92160000L);
						}
					}
				}
			}
		}
		class433.method5190(class433_56_);
		class433.method5200(0.0F, (float) (-5 - anInt11954 * 288770361), 0.0F);
		if (aClass178Array10842 == null || aClass178Array10842.length < aClass177Array11953.length)
			method9968(aClass177Array11953.length, -1887379250);
		if (null == class563)
			class563 = Class225.method3212(true, -1760382158);
		method10898(class167, aClass177Array11953, class433, false, 1902231380);
		for (int i_68_ = 0; i_68_ < aClass177Array11953.length; i_68_++) {
			if (aClass177Array11953[i_68_] != null)
				aClass177Array11953[i_68_].method2490(class433, aClass178Array10842[i_68_], (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == this ? 1 : 0));
			else
				aClass178Array10842[i_68_].aBool1945 = false;
		}
		if (null != aClass627_11950) {
			Class166 class166 = aClass627_11950.method7476();
			class167.method2351(class166);
		}
		for (int i_69_ = 0; i_69_ < aClass177Array11953.length; i_69_++) {
			if (null != aClass177Array11953[i_69_])
				aBool11917 |= aClass177Array11953[i_69_].method2511();
			aClass177Array11953[i_69_] = null;
		}
		anInt11943 = 1361712787 * client.anInt11127;
		return class563;
	}

	void method9967(Class167 class167) {
		if (aClass617_12202 != null && (aBool11931 || method11089(class167, 0, -975188663))) {
			Class433 class433 = class167.method2091();
			class433.method5191(method7837());
			class433.method5200(0.0F, -5.0F, 0.0F);
			method10898(class167, aClass177Array11953, class433, aBool11931, 1902231380);
			for (int i = 0; i < aClass177Array11953.length; i++)
				aClass177Array11953[i] = null;
		}
	}

	void method9975(Class167 class167) {
		if (aClass617_12202 != null && (aBool11931 || method11089(class167, 0, 459003066))) {
			Class433 class433 = class167.method2091();
			class433.method5191(method7837());
			class433.method5200(0.0F, -5.0F, 0.0F);
			method10898(class167, aClass177Array11953, class433, aBool11931, 1902231380);
			for (int i = 0; i < aClass177Array11953.length; i++)
				aClass177Array11953[i] = null;
		}
	}

	boolean method11089(Class167 class167, int i, int i_70_) {
		int i_71_ = i;
		BASTypeDecoder class589 = method10877(1655729056);
		Class688 class688 = ((aClass688_11925.method8121(-768820080) && !aClass688_11925.method8128(-144709969)) ? aClass688_11925 : null);
		Class688_Sub3 class688_sub3 = ((aClass688_Sub3_11914.method8121(-1982703050) && !aBool12185 && (!aClass688_Sub3_11914.aBool10975 || null == class688)) ? aClass688_Sub3_11914 : null);
		int i_72_ = class589.anInt7765 * -843057239;
		int i_73_ = class589.anInt7773 * 1697895001;
		if (i_72_ != 0 || 0 != i_73_ || 0 != class589.anInt7776 * 480250987 || 0 != class589.anInt7781 * -880668853)
			i |= 0x7;
		int i_74_ = aClass62_11940.method1047((byte) 16);
		boolean bool = (0 != aByte11958 && client.cycles >= -329856901 * anInt11926 && client.cycles < -736181855 * anInt11927);
		if (bool)
			i |= 0x80000;
		Class177 class177 = (aClass177Array11953[0] = aClass617_12202.method7345(class167, i, Class497.aClass34_Sub16_5554, Class205_Sub7.aClass34_Sub2_9878, Class172.aClass34_Sub7_1922, Class111.aClass34_Sub13_1391, Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, class688, class688_sub3, aClass688_Sub2_Sub1Array11947, anIntArray11918, i_74_, true, Class71.aClass631_796, 16711680));
		int i_75_ = Class36.method829(-862353037);
		if (GameShell.maxMemory * -839563813 < 96 && i_75_ > 50)
			Class99.method1332((byte) 11);
		if (Class678.aClass678_8619 != Class47.aClass678_578 && i_75_ < 50) {
			int i_76_;
			for (i_76_ = 50 - i_75_; i_76_ > -1749065659 * client.anInt11013; client.anInt11013 += -1098337651)
				Class692.aByteArrayArray8722[-1749065659 * client.anInt11013] = new byte[102400];
			while (i_76_ < -1749065659 * client.anInt11013) {
				client.anInt11013 -= -1098337651;
				Class692.aByteArrayArray8722[client.anInt11013 * -1749065659] = null;
			}
		} else if (Class47.aClass678_578 != Class678.aClass678_8619) {
			Class692.aByteArrayArray8722 = new byte[50][];
			client.anInt11013 = 0;
		}
		if (null == class177)
			return false;
		anInt11908 = class177.method2562() * 1914123523;
		anInt11893 = class177.method2571() * -1016305711;
		class177.method2579();
		method10918(class177, (byte) 10);
		if (0 != i_72_ || i_73_ != 0) {
			method10876(i_74_, i_72_, i_73_, class589.anInt7767 * 574089585, -1281794323 * class589.anInt7768, 25894113);
			if (anInt11892 * 1681595873 != 0)
				class177.method2457(1681595873 * anInt11892);
			if (1915921525 * anInt11900 != 0)
				class177.method2529(anInt11900 * 1915921525);
			if (0 != -2111850483 * anInt11891)
				class177.method2472(0, anInt11891 * -2111850483, 0);
		} else
			method10876(i_74_, method10874() << 9, method10874() << 9, 0, 0, -595375831);
		if (bool)
			class177.method2510(aByte11928, aByte11936, aByte11930, aByte11958 & 0xff);
		if (!aBool12185)
			method10875(class167, class589, i_71_, i_72_, i_73_, i_74_, -1868758242);
		return true;
	}

	boolean method9957(Class167 class167, int i, int i_77_) {
		if (null == aClass617_12202 || !method11089(class167, 131072, 1656446957))
			return false;
		Class433 class433 = method7851();
		boolean bool = false;
		for (int i_78_ = 0; i_78_ < aClass177Array11953.length; i_78_++) {
			if (aClass177Array11953[i_78_] != null && aClass177Array11953[i_78_].aBool1939 && aClass177Array11953[i_78_].method2549(i, i_77_, class433, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_79_ = 0; i_79_ < aClass177Array11953.length; i_79_++)
			aClass177Array11953[i_79_] = null;
		return bool;
	}

	public boolean method10911() {
		return Class644.aClass628_8352.aBool8219;
	}

	public void method11090(String string, int i, int i_80_, byte i_81_) {
		method10869(string, i, i_80_, (Class319_Sub1.method9134(1075241770) * (Class644.aClass628_8352.anInt8208 * -2097108747)), (short) 255);
	}

	public void decodeIcons(RSByteBuffer buffer) {
		buffer.off = 0;
		int i_82_ = buffer.readUnsignedByte();
		for (int i_83_ = 0; i_83_ < anIntArray12183.length; i_83_++) {
			if (0 != (i_82_ & 1 << i_83_)) {
				int i_84_ = buffer.readUnsignedByte();
				int i_85_ = buffer.readUnsignedShort();
				anIntArray12183[i_83_] = i_84_;
				anIntArray12179[i_83_] = i_85_;
			} else {
				anIntArray12183[i_83_] = -1;
				anIntArray12179[i_83_] = -1;
			}
		}
	}

	int method10907() {
		return -1903031581 * anInt12182;
	}

	final void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_86_, int i_87_, boolean bool) {
		throw new IllegalStateException();
	}

	public int method10902() {
		if (null != aClass617_12202 && -587726343 * aClass617_12202.anInt8079 != -1)
			return ((((NPCDecoder) Class172.aClass34_Sub7_1922.method70((-587726343 * (aClass617_12202.anInt8079)), (byte) -19)).anInt3272) * 830254667);
		return super.method10874();
	}

	Class563 method9985(Class167 class167) {
		if (aClass617_12202 == null || !method11089(class167, 2048, 918244321))
			return null;
		Class433 class433 = class167.method2091();
		Class433 class433_88_ = method7851();
		Class431 class431 = method7837();
		int i = aClass62_11940.method1047((byte) 16);
		Class556 class556 = (aClass553_10838.aClass556ArrayArrayArray7430[aByte10839][(int) class431.aClass436_4823.aFloat4850 >> 9][(int) class431.aClass436_4823.aFloat4853 >> 9]);
		if (null != class556 && class556.aClass649_Sub1_Sub2_7503 != null) {
			int i_89_ = (288770361 * anInt11954 - class556.aClass649_Sub1_Sub2_7503.aShort11755);
			anInt11954 = (int) ((float) (288770361 * anInt11954) - (float) i_89_ / 10.0F) * -763112183;
		} else
			anInt11954 = ((int) ((float) (288770361 * anInt11954) - (float) (anInt11954 * 288770361) / 10.0F) * -763112183);
		class433.method5190(class433_88_);
		class433.method5200(0.0F, (float) (-20 - anInt11954 * 288770361), 0.0F);
		Class563 class563 = null;
		aBool11917 = false;
		if (ClientSetting.aClass536_Sub40_8843.spotShadowSetting.method10014(-1904559876) == 1) {
			BASTypeDecoder class589 = method10877(-666449940);
			if (class589.aBool7778 && (-1 == -587726343 * aClass617_12202.anInt8079 || ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) 9))).aBool3265)) {
				Class688 class688 = ((aClass688_11925.method8121(-1693903310) && aClass688_11925.method8128(-144709969)) ? aClass688_11925 : null);
				Class688_Sub3 class688_sub3 = ((aClass688_Sub3_11914.method8121(-242886574) && (!aClass688_Sub3_11914.aBool10975 || class688 == null)) ? aClass688_Sub3_11914 : null);
				short i_90_ = Class644.aClass628_8352.aShort8186;
				byte i_91_ = Class644.aClass628_8352.aByte8199;
				if (aClass617_12202.anInt8079 * -587726343 != -1) {
					i_90_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) -68))).aShort3314;
					i_91_ = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * aClass617_12202.anInt8079, (byte) 64))).aByte3315;
				}
				Object object = null;
				Class177 class177;
				if (i_90_ > -1 && ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(-1627270348) == 1)
					class177 = (Class536_Sub18_Sub1.method10480(class167, i, anInt11892 * 1681595873, 1915921525 * anInt11900, anInt11891 * -2111850483, aClass177Array11953[0], i_90_, i_91_, (null != class688_sub3 ? (Class688) class688_sub3 : class688), 980369976));
				else
					class177 = Class381.method4819(class167, i, 1681595873 * anInt11892, 1915921525 * anInt11900, -2111850483 * anInt11891, 1, aClass177Array11953[0], 0, 0, 160, 240, (null != class688_sub3 ? (Class688) class688_sub3 : class688), 1446621212);
				if (class177 != null) {
					if (aClass178Array10842 == null || (aClass178Array10842.length < aClass177Array11953.length + 1))
						method9968(1 + aClass177Array11953.length, 255603834);
					class563 = Class225.method3212(true, 35902532);
					aBool11917 = true;
					class167.method2302(false);
					class177.method2490(class433, (aClass178Array10842[aClass177Array11953.length]), 0);
					class167.method2302(true);
				}
			}
		}
		if (this == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) {
			for (int i_92_ = client.aClass103Array11020.length - 1; i_92_ >= 0; i_92_--) {
				Class103 class103 = client.aClass103Array11020[i_92_];
				if (class103 != null && -1 != class103.anInt1229 * 19461697) {
					if (2030004867 * class103.anInt1224 == 1) {
						ObjectParam class536_sub13 = ((ObjectParam) (client.aClass4_11050.method556((long) (class103.anInt1223 * 1298998125))));
						if (class536_sub13 != null) {
							NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
							Class436 class436 = (Class436.method5252((class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823), Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_93_ = (int) class436.aFloat4850;
							int i_94_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_93_, (long) i_94_, class103.anInt1229 * 19461697, 92160000L);
						}
					}
					if (2 == class103.anInt1224 * 2030004867) {
						Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
						long l = (long) (class103.anInt1225 * 987706607 - (int) class436.aFloat4850);
						long l_95_ = (long) (class103.anInt1226 * -1675921633 - (int) class436.aFloat4853);
						long l_96_ = (long) (class103.anInt1228 * 46780477 << 9);
						l_96_ *= l_96_;
						method11084(class167, class433, aClass177Array11953[0], l, l_95_, 19461697 * class103.anInt1229, l_96_);
					}
					if (10 == 2030004867 * class103.anInt1224 && class103.anInt1223 * 1298998125 >= 0 && (1298998125 * class103.anInt1223 < (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155).length)) {
						Player class649_sub1_sub5_sub1_sub2_97_ = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[1298998125 * class103.anInt1223]);
						if (null != class649_sub1_sub5_sub1_sub2_97_) {
							Class436 class436 = (Class436.method5252(class649_sub1_sub5_sub1_sub2_97_.method7837().aClass436_4823, Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823));
							int i_98_ = (int) class436.aFloat4850;
							int i_99_ = (int) class436.aFloat4853;
							method11084(class167, class433, aClass177Array11953[0], (long) i_98_, (long) i_99_, 19461697 * class103.anInt1229, 92160000L);
						}
					}
				}
			}
		}
		class433.method5190(class433_88_);
		class433.method5200(0.0F, (float) (-5 - anInt11954 * 288770361), 0.0F);
		if (aClass178Array10842 == null || aClass178Array10842.length < aClass177Array11953.length)
			method9968(aClass177Array11953.length, 1579360520);
		if (null == class563)
			class563 = Class225.method3212(true, -1760130074);
		method10898(class167, aClass177Array11953, class433, false, 1902231380);
		for (int i_100_ = 0; i_100_ < aClass177Array11953.length; i_100_++) {
			if (aClass177Array11953[i_100_] != null)
				aClass177Array11953[i_100_].method2490(class433, aClass178Array10842[i_100_], (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == this ? 1 : 0));
			else
				aClass178Array10842[i_100_].aBool1945 = false;
		}
		if (null != aClass627_11950) {
			Class166 class166 = aClass627_11950.method7476();
			class167.method2351(class166);
		}
		for (int i_101_ = 0; i_101_ < aClass177Array11953.length; i_101_++) {
			if (null != aClass177Array11953[i_101_])
				aBool11917 |= aClass177Array11953[i_101_].method2511();
			aClass177Array11953[i_101_] = null;
		}
		anInt11943 = 1361712787 * client.anInt11127;
		return class563;
	}

	public int method10904() {
		if (null != aClass617_12202 && -587726343 * aClass617_12202.anInt8079 != -1)
			return (((NPCDecoder) Class172.aClass34_Sub7_1922.method70((-587726343 * (aClass617_12202.anInt8079)), (byte) 79)).anInt3272 * 830254667);
		return super.method10874();
	}

	public int method10909() {
		return -1;
	}

	public int method10908() {
		return -1;
	}

	public Class536_Sub30 method195() {
		Class598 class598 = client.aClass515_11066.method6255(-1205093258);
		return (Class247.method3424(aByte10839, ((int) method7837().aClass436_4823.aFloat4850 + class598.anInt7839 * 2133575168), -(int) method7837().aClass436_4823.aFloat4852, ((int) method7837().aClass436_4823.aFloat4853 + 1391122944 * class598.anInt7840), -2117006767));
	}

	public int method10910() {
		return -1;
	}

	public int method10879(byte i) {
		return -1;
	}

	public Class533 method10913() {
		if (null != aClass533_11903) {
			if (aClass533_11903.aString7126 == null)
				return null;
			if (1867600229 * client.anInt11259 == 0 || 1867600229 * client.anInt11259 == 3 || (1 == client.anInt11259 * 1867600229 && Class417.method5037(username, 1678135551)))
				return aClass533_11903;
		}
		return null;
	}

	final void method9976() {
		throw new IllegalStateException();
	}

	public final void method11092(int i, int i_102_, byte i_103_, byte i_104_) {
		if (aClass688_11925.method8121(-1312452097) && (aClass688_11925.method8159(-1366786349).anInt2168 * 713510171 == 1)) {
			anIntArray11913 = null;
			aClass688_11925.method8122(-1, -1950317619);
		}
		for (int i_105_ = 0; i_105_ < aClass500Array11901.length; i_105_++) {
			if (-1262960011 * aClass500Array11901[i_105_].anInt6839 != -1) {
				Class677 class677 = ((Class677) (Class633.aClass34_Sub15_8260.method70(-1262960011 * aClass500Array11901[i_105_].anInt6839, (byte) -106)));
				if (class677.aBool8604 && -1 != class677.anInt8607 * -1078340929 && (((Class191) Class45.aClass34_Sub11_529.method70((-1078340929 * (class677.anInt8607)), (byte) 60)).anInt2168) * 713510171 == 1) {
					aClass500Array11901[i_105_].aClass688_6843.method8122(-1, -915048957);
					aClass500Array11901[i_105_].anInt6839 = -1673100765;
				}
			}
		}
		faceDirection = -2114230253;
		if (i < 0 || i >= client.aClass515_11066.method6321((byte) 15) || i_102_ < 0 || i_102_ >= client.aClass515_11066.method6243(177401017))
			method11087(i, i_102_, (byte) 1);
		else if (screenX[0] < 0 || (screenX[0] >= client.aClass515_11066.method6321((byte) -29)) || screenY[0] < 0 || (screenY[0] >= client.aClass515_11066.method6243(177401017)))
			method11087(i, i_102_, (byte) 1);
		else
			method11093(i, i_102_, i_103_, -424528054);
	}

	public int method10878() {
		return -(anInt11889 * 1710020215) - 1;
	}

	final void method11093(int i, int i_106_, byte i_107_, int i_108_) {
		if (stepsCount * -711375609 < screenX.length - 1)
			stepsCount += 1754339511;
		for (int i_109_ = -711375609 * stepsCount; i_109_ > 0; i_109_--) {
			screenX[i_109_] = screenX[i_109_ - 1];
			screenY[i_109_] = screenY[i_109_ - 1];
			aByteArray11946[i_109_] = aByteArray11946[i_109_ - 1];
		}
		screenX[0] = i;
		screenY[0] = i_106_;
		aByteArray11946[0] = i_107_;
	}

	public int method10864() {
		return -(anInt11889 * 1710020215) - 1;
	}

	boolean method9939(Class167 class167, int i, int i_110_, byte i_111_) {
		if (null == aClass617_12202 || !method11089(class167, 131072, -350100517))
			return false;
		Class433 class433 = method7851();
		boolean bool = false;
		for (int i_112_ = 0; i_112_ < aClass177Array11953.length; i_112_++) {
			if (aClass177Array11953[i_112_] != null && aClass177Array11953[i_112_].aBool1939 && aClass177Array11953[i_112_].method2549(i, i_110_, class433, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_113_ = 0; i_113_ < aClass177Array11953.length; i_113_++)
			aClass177Array11953[i_113_] = null;
		return bool;
	}

	boolean method9971(Class167 class167, int i, int i_120_) {
		if (null == aClass617_12202 || !method11089(class167, 131072, -1228725661))
			return false;
		Class433 class433 = method7851();
		boolean bool = false;
		for (int i_121_ = 0; i_121_ < aClass177Array11953.length; i_121_++) {
			if (aClass177Array11953[i_121_] != null && aClass177Array11953[i_121_].aBool1939 && aClass177Array11953[i_121_].method2549(i, i_120_, class433, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_122_ = 0; i_122_ < aClass177Array11953.length; i_122_++)
			aClass177Array11953[i_122_] = null;
		return bool;
	}

	public Class436 method202() {
		return Class436.method5238();
	}

	public void decodePlayerLook(RSByteBuffer stream, byte isMale) {
		aByte12197 = isMale;
		int i_124_ = -1;
		anInt12191 = 0;
		int[] is = new int[Class71.aClass631_796.anIntArray8241.length];
		ItemEffects[] itemEffects = new ItemEffects[Class71.aClass631_796.anIntArray8241.length];
		ItemDecoder[] itemDecoders = new ItemDecoder[Class71.aClass631_796.anIntArray8241.length];
		for (int i_125_ = 0; i_125_ < Class71.aClass631_796.anIntArray8241.length; i_125_++) {
			if (Class71.aClass631_796.anIntArray8241[i_125_] != 1) {
				int i_126_ = stream.readUnsignedByte();
				if (i_126_ == 0)
					is[i_125_] = 0;
				else {
					int i_127_ = stream.readUnsignedByte();
					int i_128_ = (i_126_ << 8) + i_127_;
					if (0 == i_125_ && 65535 == i_128_) {
						i_124_ = stream.readBigSmart();
						anInt12191 = (stream.readUnsignedByte() * -554265225);
						break;
					}
					if (i_128_ >= 16384) {
						i_128_ -= 16384;
						is[i_125_] = i_128_ | 0x40000000;
						itemDecoders[i_125_] = (ItemDecoder) Class111.aClass34_Sub13_1391.method70(i_128_, (byte) 77);
						int i_129_ = itemDecoders[i_125_].teamId * 755426589;
						if (0 != i_129_)
							anInt12191 = -554265225 * i_129_;
					} else
						is[i_125_] = i_128_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (-1 == i_124_) {
			int i_130_ = stream.readUnsignedShort();
			int i_131_ = 0;
			for (int index = 0; index < Class71.aClass631_796.anIntArray8241.length; index++) {
				if (0 == Class71.aClass631_796.anIntArray8241[index]) {
					if (0 != (i_130_ & 1 << i_131_))
						itemEffects[index] = Class588.readItemEffects(itemDecoders[index], stream);
					i_131_++;
				}
			}
		}
		int[] is_133_ = new int[10];
		for (int i_134_ = 0; i_134_ < 10; i_134_++) {
			int i_135_ = stream.readUnsignedByte();
			if (Class267.aShortArrayArrayArray2870.length < 1 || i_135_ < 0 || (i_135_ >= Class267.aShortArrayArrayArray2870[i_134_][0].length))
				i_135_ = 0;
			is_133_[i_134_] = i_135_;
		}
		int[] is_136_ = new int[10];
		for (int i_137_ = 0; i_137_ < 10; i_137_++) {
			int i_138_ = stream.readUnsignedByte();
			if (Class44.aShortArrayArrayArray520.length < 1 || i_138_ < 0 || (i_138_ >= Class44.aShortArrayArrayArray520[i_137_][0].length))
				i_138_ = 0;
			is_136_[i_137_] = i_138_;
		}
		anInt12182 = stream.readUnsignedShort() * 1741785803;
		if (aClass617_12202 == null)
			aClass617_12202 = new Class617();
		int i_139_ = aClass617_12202.anInt8079 * -587726343;
		int[] is_140_ = aClass617_12202.anIntArray8072;
		aClass617_12202.method7340(method10897(1991099139), is, itemEffects, is_133_, is_136_, 1 == aByte12197, i_124_, (byte) -65);
		if (i_139_ != i_124_) {
			Class436 class436 = Class436.method5240(method7837().aClass436_4823);
			class436.aFloat4850 = (float) ((screenX[0] << 9) + (method10874() << 8));
			class436.aFloat4853 = (float) ((screenY[0] << 9) + (method10874() << 8));
			method7841(class436);
			class436.method5239();
		}
		if (1710020215 * anInt11889 == client.anInt11156 * -1791435655 && is_140_ != null) {
			for (int i_141_ = 0; i_141_ < is_133_.length; i_141_++) {
				if (is_133_[i_141_] != is_140_[i_141_]) {
					Class111.aClass34_Sub13_1391.method10340((byte) -116);
					break;
				}
			}
		}
		if (null != aClass627_11950)
			aClass627_11950.method7467();
		if (aClass688_Sub3_11914.method8121(-1194275772) && aClass688_Sub3_11914.aBool10975) {
			BASTypeDecoder class589 = method10877(-1081655812);
			if (!class589.method7090(aClass688_Sub3_11914.method8120((byte) 91), 900823373)) {
				aClass688_Sub3_11914.method8122(-1, -1717861513);
				aClass688_Sub3_11914.aBool10975 = false;
			}
		}
	}

	public Class559 method9962(Class167 class167) {
		return null;
	}

	final boolean method9938() {
		return false;
	}

	final void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_142_, int i_143_, boolean bool, int i_144_) {
		throw new IllegalStateException();
	}
}
