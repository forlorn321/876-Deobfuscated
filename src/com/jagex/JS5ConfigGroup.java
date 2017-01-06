/* Class648 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class JS5ConfigGroup {
	static JS5ConfigGroup CHAT_PHRASE_TYPE;
	static JS5ConfigGroup aClass648_8379;
	public static JS5ConfigGroup IDK_TYPE;
	public static JS5ConfigGroup INV_TYPE;
	public static JS5ConfigGroup CURSOR_TYPE;
	static JS5ConfigGroup aClass648_8383;
	static JS5ConfigGroup aClass648_8384;
	public static JS5ConfigGroup ENUM_TYPE;
	static JS5ConfigGroup aClass648_8386;
	public static JS5ConfigGroup OBJ_TYPE;
	public static JS5ConfigGroup FLU_TYPE;
	public int id;
	public static JS5ConfigGroup SPOT_TYPE;
	static JS5ConfigGroup VARBIT;
	static JS5ConfigGroup VARC_STR;
	static JS5ConfigGroup VARP;
	static JS5ConfigGroup aClass648_8394;
	static JS5ConfigGroup AREA_TYPE;
	static JS5ConfigGroup VARC;
	static JS5ConfigGroup aClass648_8397;
	static JS5ConfigGroup aClass648_8398;
	static JS5ConfigGroup aClass648_8399;
	static JS5ConfigGroup aClass648_8400;
	static JS5ConfigGroup aClass648_8401;
	static JS5ConfigGroup CHAT_CAT_TYPE;
	public static JS5ConfigGroup STRUCT_TYPE;
	public static JS5ConfigGroup PARAM_TYPE;
	static JS5ConfigGroup aClass648_8405;
	public static JS5ConfigGroup SKYBOX_TYPE;
	public static JS5ConfigGroup aClass648_8407;
	public static JS5ConfigGroup LIGHT_TYPE;
	public static JS5ConfigGroup BAS_TYPE;
	public static JS5ConfigGroup QUEST_TYPE;
	public static JS5ConfigGroup MSI_TYPE;
	public static JS5ConfigGroup VAR_WORLD;
	public static JS5ConfigGroup MEL_TYPE;
	public static JS5ConfigGroup VAR_CLIENT;
	static JS5ConfigGroup aClass648_8415;
	public static JS5ConfigGroup SEQ_TYPE;
	public static JS5ConfigGroup DB_TABLE_TYPE;
	public static JS5ConfigGroup DB_ROW_TYPE;
	static JS5ConfigGroup aClass648_8419;
	static JS5ConfigGroup aClass648_8420;
	static JS5ConfigGroup aClass648_8421;
	public static JS5ConfigGroup VAR_OBJECT;
	public static JS5ConfigGroup HIT_MARK_TYPE;
	static JS5ConfigGroup VARCLAN;
	static JS5ConfigGroup ITEM_CODE_TYPE;
	static JS5ConfigGroup CATEGORY_TYPE;
	static JS5ConfigGroup aClass648_8427;
	static JS5ConfigGroup aClass648_8428;
	public static JS5ConfigGroup VAR_PLAYER;
	public static JS5ConfigGroup NPC_TYPE;
	static JS5ConfigGroup aClass648_8431;
	public static JS5ConfigGroup VAR_NPC;
	static JS5ConfigGroup aClass648_8433;
	public static JS5ConfigGroup FLO_TYPE = new JS5ConfigGroup(1);
	public static JS5ConfigGroup VAR_REGION;
	static JS5ConfigGroup aClass648_8436;
	public static JS5ConfigGroup VAR_CLAN;
	public static JS5ConfigGroup VAR_CLAN_SETTING;
	public static JS5ConfigGroup aClass648_8439;
	public static JS5ConfigGroup VAR_BIT;
	static JS5ConfigGroup GAME_LOG_TYPE;
	public static JS5ConfigGroup HEAD_BAR_TYPE;
	static JS5ConfigGroup aClass648_8443;
	static JS5ConfigGroup aClass648_8444;
	static JS5ConfigGroup aClass648_8445;
	static JS5ConfigGroup aClass648_8446;
	public static JS5ConfigGroup SEQ_GROUP_TYPE;
	static JS5ConfigGroup aClass648_8448;
	static JS5ConfigGroup aClass648_8449;
	public static JS5ConfigGroup VAR_PLAYER_GROUP;
	static JS5ConfigGroup WATER_TYPE;
	static JS5ConfigGroup aClass648_8452;
	public static JS5ConfigGroup aClass648_8453;
	static JS5ConfigGroup aClass648_8454;
	public static JS5ConfigGroup LOC_TYPE;
	int groupBitSize;
	static Class708 aClass708_8457;

	JS5ConfigGroup(int i, int i_2_) {
		id = -828663533 * i;
		groupBitSize = i_2_ * -579591399;
	}

	public int getClientFileId(int i) {
		return i & (1 << 810453289 * groupBitSize) - 1;
	}

	public int getGroupSize() {
		return 1 << 810453289 * groupBitSize;
	}

	public int getClientGroupId(int i) {
		return i >>> 810453289 * groupBitSize;
	}

	static {
		aClass648_8379 = new JS5ConfigGroup(2);
		IDK_TYPE = new JS5ConfigGroup(3);
		FLU_TYPE = new JS5ConfigGroup(4);
		INV_TYPE = new JS5ConfigGroup(5);
		LOC_TYPE = new JS5ConfigGroup(6, 8);
		aClass648_8384 = new JS5ConfigGroup(7);
		ENUM_TYPE = new JS5ConfigGroup(8, 8);
		NPC_TYPE = new JS5ConfigGroup(9, 7);
		OBJ_TYPE = new JS5ConfigGroup(10, 8);
		PARAM_TYPE = new JS5ConfigGroup(11);
		SEQ_TYPE = new JS5ConfigGroup(12, 7);
		SPOT_TYPE = new JS5ConfigGroup(13, 8);
		VARBIT = new JS5ConfigGroup(14, 10);
		VARC_STR = new JS5ConfigGroup(15);
		VARP = new JS5ConfigGroup(16);
		aClass648_8394 = new JS5ConfigGroup(17);
		AREA_TYPE = new JS5ConfigGroup(18);
		VARC = new JS5ConfigGroup(19);
		aClass648_8397 = new JS5ConfigGroup(20);
		aClass648_8398 = new JS5ConfigGroup(21);
		aClass648_8399 = new JS5ConfigGroup(22);
		aClass648_8386 = new JS5ConfigGroup(23);
		aClass648_8401 = new JS5ConfigGroup(24);
		aClass648_8433 = new JS5ConfigGroup(25);
		STRUCT_TYPE = new JS5ConfigGroup(26, 5);
		CHAT_PHRASE_TYPE = new JS5ConfigGroup(27);
		CHAT_CAT_TYPE = new JS5ConfigGroup(28);
		SKYBOX_TYPE = new JS5ConfigGroup(29);
		aClass648_8407 = new JS5ConfigGroup(30);
		LIGHT_TYPE = new JS5ConfigGroup(31);
		BAS_TYPE = new JS5ConfigGroup(32);
		CURSOR_TYPE = new JS5ConfigGroup(33);
		MSI_TYPE = new JS5ConfigGroup(34);
		QUEST_TYPE = new JS5ConfigGroup(35);
		MEL_TYPE = new JS5ConfigGroup(36);
		aClass648_8446 = new JS5ConfigGroup(37);
		aClass648_8415 = new JS5ConfigGroup(38);
		aClass648_8419 = new JS5ConfigGroup(39);
		DB_TABLE_TYPE = new JS5ConfigGroup(40);
		DB_ROW_TYPE = new JS5ConfigGroup(41);
		aClass648_8445 = new JS5ConfigGroup(42);
		aClass648_8420 = new JS5ConfigGroup(43);
		aClass648_8448 = new JS5ConfigGroup(44);
		aClass648_8443 = new JS5ConfigGroup(45);
		HIT_MARK_TYPE = new JS5ConfigGroup(46);
		VARCLAN = new JS5ConfigGroup(47);
		ITEM_CODE_TYPE = new JS5ConfigGroup(48);
		CATEGORY_TYPE = new JS5ConfigGroup(49);
		aClass648_8427 = new JS5ConfigGroup(50);
		aClass648_8428 = new JS5ConfigGroup(51);
		aClass648_8431 = new JS5ConfigGroup(53);
		aClass648_8400 = new JS5ConfigGroup(54);
		VAR_PLAYER = new JS5ConfigGroup(60);
		VAR_NPC = new JS5ConfigGroup(61);
		VAR_CLIENT = new JS5ConfigGroup(62);
		VAR_WORLD = new JS5ConfigGroup(63);
		VAR_REGION = new JS5ConfigGroup(64);
		VAR_OBJECT = new JS5ConfigGroup(65);
		VAR_CLAN = new JS5ConfigGroup(66);
		VAR_CLAN_SETTING = new JS5ConfigGroup(67);
		aClass648_8439 = new JS5ConfigGroup(68);
		VAR_BIT = new JS5ConfigGroup(69);
		GAME_LOG_TYPE = new JS5ConfigGroup(70);
		HEAD_BAR_TYPE = new JS5ConfigGroup(72);
		aClass648_8405 = new JS5ConfigGroup(73);
		aClass648_8444 = new JS5ConfigGroup(74);
		aClass648_8453 = new JS5ConfigGroup(75);
		WATER_TYPE = new JS5ConfigGroup(76);
		SEQ_GROUP_TYPE = new JS5ConfigGroup(77);
		aClass648_8383 = new JS5ConfigGroup(78);
		aClass648_8449 = new JS5ConfigGroup(79);
		VAR_PLAYER_GROUP = new JS5ConfigGroup(80);
		aClass648_8421 = new JS5ConfigGroup(81);
		aClass648_8452 = new JS5ConfigGroup(82);
		aClass648_8436 = new JS5ConfigGroup(83);
		aClass648_8454 = new JS5ConfigGroup(84);
	}

	public int method7826(int i) {
		return i & (1 << 810453289 * groupBitSize) - 1;
	}

	JS5ConfigGroup(int i) {
		this(i, 0);
	}

	static void method7827(int i, short i_3_) {
		/* empty */
	}

	static void method7828(int[] is, float[] fs, float[] fs_4_, int i, int i_5_, byte i_6_) {
		if (i < i_5_) {
			int i_7_ = (i_5_ + i) / 2;
			int i_8_ = i;
			int i_9_ = is[i_7_];
			is[i_7_] = is[i_5_];
			is[i_5_] = i_9_;
			float f = fs[i_7_];
			fs[i_7_] = fs[i_5_];
			fs[i_5_] = f;
			float f_10_ = fs_4_[i_7_];
			fs_4_[i_7_] = fs_4_[i_5_];
			fs_4_[i_5_] = f_10_;
			int i_11_ = (long) i_9_ == 9223372036854775807L ? 0 : 1;
			for (int i_12_ = i; i_12_ < i_5_; i_12_++) {
				if (is[i_12_] < (i_12_ & i_11_) + i_9_) {
					int i_13_ = is[i_12_];
					is[i_12_] = is[i_8_];
					is[i_8_] = i_13_;
					float f_14_ = fs[i_12_];
					fs[i_12_] = fs[i_8_];
					fs[i_8_] = f_14_;
					float f_15_ = fs_4_[i_12_];
					fs_4_[i_12_] = fs_4_[i_8_];
					fs_4_[i_8_] = f_15_;
					i_8_++;
				}
			}
			is[i_5_] = is[i_8_];
			is[i_8_] = i_9_;
			fs[i_5_] = fs[i_8_];
			fs[i_8_] = f;
			fs_4_[i_5_] = fs_4_[i_8_];
			fs_4_[i_8_] = f_10_;
			method7828(is, fs, fs_4_, i, i_8_ - 1, (byte) 83);
			method7828(is, fs, fs_4_, 1 + i_8_, i_5_, (byte) 79);
		}
	}

	static final void method7829(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.transparency = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1266192547;
		Class668.method8011(class251, 263642117);
	}

	static final void method7830(Class668 class668, int i) {
		int i_16_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_16_);
		Class234 class234 = Class463.aClass234Array5227[i_16_ >> 16];
		Class453.method5447(class251, class234, class668, (byte) 90);
	}

	static final void method7831(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3245(1374626347).method78();
	}

	static final void method7832(int i, int i_17_, int i_18_, int i_19_, boolean bool, int i_20_) {
		if (client.aClass515_11066.method6249(136765170) == null)
			Class677.aClass167_8609.method2057(i, i_17_, i_18_, i_19_, -16777216, (short) -25562);
		else {
			Class436 class436 = (Class565.MY_PLAYER.method7837().aClass436_4823);
			boolean bool_21_ = false;
			if (3 != 1542697723 * client.anInt11074) {
				if (!client.aBool11159)
					bool_21_ = true;
			} else {
				if ((int) class436.aFloat4850 < 0 || ((int) class436.aFloat4850 >= client.aClass515_11066.method6321((byte) -91) * 512) || (int) class436.aFloat4853 < 0 || ((int) class436.aFloat4853 >= client.aClass515_11066.method6243(177401017) * 512))
					bool_21_ = true;
				if (Class246.anInt2474 * 155362615 == 2 && !Class683.aClass301_Sub1_8651.method4091((byte) 8))
					bool_21_ = true;
			}
			if (bool_21_)
				Class677.aClass167_8609.method2057(i, i_17_, i_18_, i_19_, -16777216, (short) -1553);
			else {
				client.anInt11127 += 1788280359;
				if (null != Class565.MY_PLAYER && ((int) class436.aFloat4850 - (Class565.MY_PLAYER.method10874() - 1) * 256) >> 9 == Class101.anInt1205 * -349564685 && (((int) class436.aFloat4853 - (Class565.MY_PLAYER.method10874() - 1) * 256) >> 9 == 400767477 * Class101.anInt1194)) {
					Class101.anInt1205 = 1245738949;
					Class101.anInt1194 = -1934813789;
					Class171.method2430((byte) 5);
				}
				Class442.method5335((byte) 46);
				if (!bool)
					Language.method7997(596840497);
				Class581.method7022(1459072116);
				for (int i_22_ = 0; i_22_ < client.aClass526Array11021.length; i_22_++) {
					if (null != client.aClass526Array11021[i_22_] && !client.aClass526Array11021[i_22_].method6418((byte) 4) && (client.aClass526Array11021[i_22_].method6419(Class677.aClass167_8609, 2106655002)))
						client.aClass526Array11021[i_22_].method6414(client.aClass515_11066.method6249(-2100233601), (byte) 70);
				}
				Class216.method3093(i, i_17_, i_18_, i_19_, true, 1876031981);
				i = -1829303381 * client.anInt11283;
				i_17_ = client.anInt11284 * -134988647;
				i_18_ = client.anInt11285 * -545189665;
				i_19_ = 1930681379 * client.anInt11286;
				Class34.method815(i, i_17_, -2053468663);
				if (155362615 * Class246.anInt2474 == 1) {
					int i_23_ = (int) client.aFloat11271;
					if (client.anInt11312 * -1639712795 >> 8 > i_23_)
						i_23_ = client.anInt11312 * -1639712795 >> 8;
					if (client.aBoolArray11270[4] && 128 + client.anIntArray11272[4] > i_23_)
						i_23_ = client.anIntArray11272[4] + 128;
					int i_24_ = (((int) client.aFloat11106 + 325051359 * client.anInt11093) & 0x3fff);
					client.method10460(-787333673 * JS5ResourceProvider.anInt5216, (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, Class320.anInt3539 * -989431627, 1635608510) - client.anInt10997 * 1873552861), -1817694149 * Class222.anInt2326, i_23_, i_24_, 600 + 3 * (i_23_ >> 3) << 2, i_19_, (byte) 3);
				} else if (6 == Class246.anInt2474 * 155362615) {
					int i_25_ = (int) client.aFloat11271;
					if (-1639712795 * client.anInt11312 >> 8 > i_25_)
						i_25_ = -1639712795 * client.anInt11312 >> 8;
					if (client.aBoolArray11270[4] && client.anIntArray11272[4] + 128 > i_25_)
						i_25_ = 128 + client.anIntArray11272[4];
					int i_26_ = (int) client.aFloat11106 & 0x3fff;
					client.method10460(-787333673 * JS5ResourceProvider.anInt5216, (Class54.method944(289882095 * client.anInt11082, 182288133 * client.anInt11236, -989431627 * Class320.anInt3539, 1475684482) - client.anInt10997 * 1873552861), -1817694149 * Class222.anInt2326, i_25_, i_26_, 600 + 3 * (i_25_ >> 3) << 2, i_19_, (byte) 3);
				} else if (155362615 * Class246.anInt2474 == 5)
					Class205_Sub15.method9086(i_19_, -1905034177);
				int i_27_ = -1607026219 * Class637.anInt8301;
				int i_28_ = Class205_Sub21.anInt9958 * -1598853731;
				int i_29_ = -1646092097 * Class685.anInt8665;
				int i_30_ = 62800801 * Class141.anInt1658;
				int i_31_ = Class144.anInt1681 * 158223895;
				for (int i_32_ = 0; i_32_ < 5; i_32_++) {
					if (client.aBoolArray11270[i_32_]) {
						int i_33_ = (int) ((Math.random() * (double) (1 + (client.anIntArray11006[i_32_]) * 2)) - (double) client.anIntArray11006[i_32_] + (Math.sin((double) (client.anIntArray11302[i_32_]) * ((double) (client.anIntArray11273[i_32_]) / 100.0)) * (double) (client.anIntArray11272[i_32_])));
						if (i_32_ == 0)
							Class637.anInt8301 += 1420867453 * (i_33_ << 2);
						if (1 == i_32_)
							Class205_Sub21.anInt9958 += -300318539 * (i_33_ << 2);
						if (2 == i_32_)
							Class685.anInt8665 += (i_33_ << 2) * 717279039;
						if (i_32_ == 3)
							Class144.anInt1681 = (Class144.anInt1681 * 158223895 + i_33_ & 0x3fff) * 402508199;
						if (i_32_ == 4) {
							Class141.anInt1658 += i_33_ * 269246561;
							if (62800801 * Class141.anInt1658 < 1024)
								Class141.anInt1658 = 830571520;
							else if (Class141.anInt1658 * 62800801 > 3072)
								Class141.anInt1658 = -1803252736;
						}
					}
				}
				if (Class637.anInt8301 * -1607026219 < 0)
					Class637.anInt8301 = 0;
				if (-1607026219 * Class637.anInt8301 > ((client.aClass515_11066.method6249(1097084713).anInt7428 * 937313339) << 9) - 1)
					Class637.anInt8301 = (((client.aClass515_11066.method6249(-783435320).anInt7428) * 937313339 << 9) - 1) * 1420867453;
				if (Class685.anInt8665 * -1646092097 < 0)
					Class685.anInt8665 = 0;
				if (Class685.anInt8665 * -1646092097 > ((client.aClass515_11066.method6249(1025220307).anInt7464 * 1965060689) << 9) - 1)
					Class685.anInt8665 = (((client.aClass515_11066.method6249(-1375722687).anInt7464) * 1965060689 << 9) - 1) * 717279039;
				if (ClientSetting.aClass536_Sub40_8843.removeRoofSetting.method9916() == 2)
					Class205_Sub5.method9058(1478237882);
				else if (ClientSetting.aClass536_Sub40_8843.removeRoofSetting.method9916() == 3)
					Class74.method1138((byte) -10);
				Class677.aClass167_8609.method2048(i, i_17_, i_18_, i_19_);
				Class677.aClass167_8609.method2245(true);
				Class677.aClass167_8609.method2369(i, i_17_, i_18_ + i, i_19_ + i_17_);
				Class625 class625 = client.aClass515_11066.method6252(1796531619).method7570((byte) 123);
				int i_34_ = class625.method7440(-2123453892);
				Class305 class305 = new Class305();
				Class598 class598 = client.aClass515_11066.method6255(-1327225891);
				if (Class70.method1117(1483356422))
					Class37.aClass301_Sub1_302.method4049(class305, client.aClass433_11110, client.aClass443_11198, 1858049507 * class598.anInt7839 << 9, 1479112045 * class598.anInt7840 << 9, -29383128);
				else if (155362615 * Class246.anInt2474 == 2)
					Class683.aClass301_Sub1_8651.method4049(class305, client.aClass433_11110, client.aClass443_11198, class598.anInt7839 * 1858049507 << 9, class598.anInt7840 * 1479112045 << 9, 438198122);
				else {
					client.aClass433_11110.method5203((float) -(-1607026219 * Class637.anInt8301), (float) -(-1598853731 * Class205_Sub21.anInt9958), (float) -(Class685.anInt8665 * -1646092097));
					client.aClass433_11110.method5214(0.0F, -1.0F, 0.0F, Class447.method5400(-(158223895 * Class144.anInt1681) & 0x3fff));
					client.aClass433_11110.method5214(-1.0F, 0.0F, 0.0F, Class447.method5400(-(62800801 * Class141.anInt1658) & 0x3fff));
					client.aClass433_11110.method5214(0.0F, 0.0F, -1.0F, Class447.method5400(-(NPCCustomization.anInt3440 * -872438021) & 0x3fff));
					Class317.method4228(client.aClass443_11198, true, (float) (i_18_ / 2), (float) (i_19_ / 2), (float) (455927939 * client.anInt11287 << 1), (float) (455927939 * client.anInt11287 << 1), i_18_, i_19_, 1385215681);
				}
				Class677.aClass167_8609.method2099(client.aClass433_11110);
				Class677.aClass167_8609.method2390(client.aClass443_11198);
				if (class625.method7442(1304896821) != null) {
					Class677.aClass167_8609.method2006(1.0F);
					Class677.aClass167_8609.method2105(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					if (155362615 * Class246.anInt2474 == 2) {
						int i_35_ = (int) ((double) Class683.aClass301_Sub1_8651.method4058((byte) -59) * 2607.5945876176133);
						int i_36_ = (int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) -30) * 2607.5945876176133);
						class625.method7442(1304896821).method6154(Class677.aClass167_8609, 1869820879 * Class206_Sub1.anInt10025 << 3, i, i_17_, i_18_, i_19_, i_35_, i_36_, 0, i_34_, true, false, -579761569);
					} else
						class625.method7442(1304896821).method6154(Class677.aClass167_8609, Class206_Sub1.anInt10025 * 1869820879 << 3, i, i_17_, i_18_, i_19_, Class141.anInt1658 * 62800801, Class144.anInt1681 * 158223895, NPCCustomization.anInt3440 * -872438021, i_34_, true, false, -1449092242);
					Class677.aClass167_8609.method2084();
				} else
					Class677.aClass167_8609.method2000(3, i_34_);
				Class677.aClass167_8609.method2245(false);
				Class18.method686(client.aClass433_11110, client.aClass443_11198, i_18_, i_19_, 1903100682);
				client.aClass515_11066.method6252(1796531619).method7567(client.aClass515_11066, -1411037171);
				int i_37_ = ClientSetting.aClass536_Sub40_8843.removeRoofSetting.method9916();
				byte i_38_;
				if (2 == i_37_)
					i_38_ = (byte) (648319383 * client.anInt11127);
				else if (i_37_ == 3)
					i_38_ = (byte) (client.aBool11304 ? 1 : -1);
				else
					i_38_ = (byte) 1;
				if (Class70.method1117(-1727260073) || Class246.anInt2474 * 155362615 == 2)
					client.aClass515_11066.method6249(-1830350637).method6730(client.cycles, 606032575 * class305.anInt3441, class305.anInt3442 * 1904157639, 1232077433 * class305.anInt3443, client.aClass515_11066.method6314((byte) -31), client.anIntArray11051, client.anIntArray11089, client.anIntArray11145, client.anIntArray11146, client.anIntArray11097, 1 + (Class565.MY_PLAYER.aByte10839), i_38_, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9,
							ClientSetting.aClass536_Sub40_8843.flickeringSetting.method10087(2069851228) == 0, true, 0, true);
				else
					client.aClass515_11066.method6249(-674673073).method6730(client.cycles, Class637.anInt8301 * -1607026219, -1598853731 * Class205_Sub21.anInt9958, -1646092097 * Class685.anInt8665, client.aClass515_11066.method6314((byte) 20), client.anIntArray11051, client.anIntArray11089, client.anIntArray11145, client.anIntArray11146, client.anIntArray11097, (Class565.MY_PLAYER.aByte10839) + 1, i_38_, (int) class436.aFloat4850 >> 9,
							(int) class436.aFloat4853 >> 9, ClientSetting.aClass536_Sub40_8843.flickeringSetting.method10087(2052345428) == 0, true, 0, true);
				client.anInt11028 += 1265757775;
				if (!Class677.aClass167_8609.method2116() && client.anInt11101 * -708374433 == 9)
					Class199.method2912(i, i_17_, i_18_, i_19_, (byte) -6);
				client.aClass515_11066.method6249(-2024204941).method6696(769133798);
				Class637.anInt8301 = 1420867453 * i_27_;
				Class205_Sub21.anInt9958 = i_28_ * -300318539;
				Class685.anInt8665 = i_29_ * 717279039;
				Class141.anInt1658 = i_30_ * 269246561;
				Class144.anInt1681 = i_31_ * 402508199;
				if (client.aBool11012 && Class176.aClass460_1936.method5526(963482457) == 0)
					client.aBool11012 = false;
				if (client.aBool11012) {
					Class677.aClass167_8609.method2057(i, i_17_, i_18_, i_19_, -16777216, (short) -6740);
					Class306.method4120(Class38.aClass38_402.method840(Class459.CLIENT_PARAMS, 1895792731), false, Class677.aClass167_8609, Clan.aClass184_10488, Class223.aClass2_2338, (byte) 0);
				}
				Class317.method4228(client.aClass443_11198, false, (float) (i_18_ / 2 + i), (float) (i_19_ / 2 + i_17_), (float) (client.anInt11287 * 455927939 << 1), (float) (455927939 * client.anInt11287 << 1), i_18_, i_19_, 1599693767);
				Class677.aClass167_8609.method2390(client.aClass443_11198);
				Class233.method3328(client.aClass443_11198, (byte) 66);
			}
		}
	}

	static final void method7833(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, byte i_44_) {
		for (Class521_Sub4 class521_sub4 = ((Class521_Sub4) client.aClass695_11176.method8210(406582953)); null != class521_sub4; class521_sub4 = ((Class521_Sub4) client.aClass695_11176.method8219(-469148197))) {
			if (client.cycles >= -1485700691 * class521_sub4.anInt10326)
				class521_sub4.method6354((byte) -107);
			else {
				Class672.method8024(441072289 * class521_sub4.anInt10329, 256 + (-811637215 * class521_sub4.anInt10324 << 9), 256 + (-1293340749 * class521_sub4.anInt10325 << 9), 0, class521_sub4.anInt10328 * -1986451078, false, false, -2131275969);
				Class26.aClass184_248.method2742(class521_sub4.aString10327, (int) (client.aFloatArray11133[0] + (float) i), (int) (client.aFloatArray11133[1] + (float) i_39_), ~0xffffff | 828550625 * class521_sub4.anInt10323, 0, (byte) -18);
			}
		}
	}

	public static final IComponentDefinitions method7834(Class234 class234, IComponentDefinitions class251, int i) {
		if (-1 != -1940204141 * class251.parentLayer)
			return class234.getIComponentDefinitions(class251.parentLayer * -1940204141);
		if (!class234.aBool2379) {
			int i_45_ = -1591767037 * class251.anInt2559 >>> 16;
			Class3 class3 = new Class3(client.aClass4_11008);
			for (Class536_Sub36 class536_sub36 = (Class536_Sub36) class3.method552(-1780150733); null != class536_sub36; class536_sub36 = (Class536_Sub36) class3.next()) {
				if (i_45_ == class536_sub36.anInt10634 * -358726121)
					return Class264.getIComponentDefinitions((int) (class536_sub36.aLong7133 * -6909195213925454795L));
			}
		}
		return null;
	}
}
