/* Class205_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub15 extends Class205 {
	String aString9935;
	int anInt9936;
	int anInt9937;
	int anInt9938;

	public void method2942() {
		Class193.aClass189Array2180[195693317 * anInt9936].method2804(-767861728).method10869(aString9935, anInt9937 * 427805191, 0, -2100627391 * anInt9938, (short) 255);
	}

	public void method2940(int i) {
		Class193.aClass189Array2180[195693317 * anInt9936].method2804(-1467715334).method10869(aString9935, anInt9937 * 427805191, 0, -2100627391 * anInt9938, (short) 255);
	}

	Class205_Sub15(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9936 = class536_sub33.readUnsignedShort((short) 2147) * -1286993459;
		aString9935 = class536_sub33.method9695((byte) 29);
		anInt9937 = class536_sub33.method9709(-1353667183) * -682392649;
		anInt9938 = class536_sub33.readUnsignedShort((short) 9024) * 896341953;
	}

	public void method2943() {
		Class193.aClass189Array2180[195693317 * anInt9936].method2804(-1691044754).method10869(aString9935, anInt9937 * 427805191, 0, -2100627391 * anInt9938, (short) 255);
	}

	public static Class507 method9085(int i, int i_0_, int i_1_, int i_2_, Interface12 interface12, Interface12 interface12_3_, int i_4_) {
		Class513[] class513s = null;
		Class574 class574 = (Class574) interface12.method70(i, (byte) -23);
		if (null != class574.anIntArray7642) {
			class513s = new Class513[class574.anIntArray7642.length];
			for (int i_5_ = 0; i_5_ < class513s.length; i_5_++) {
				Class311 class311 = ((Class311) interface12_3_.method70(class574.anIntArray7642[i_5_], (byte) -56));
				class513s[i_5_] = new Class513(class311.anInt3482 * -1245825921, -1385043905 * class311.anInt3483, class311.anInt3477 * 309364943, 2070586277 * class311.anInt3478, -273551905 * class311.anInt3479, class311.anInt3476 * -1524005885, class311.anInt3481 * -1468589603, class311.aBool3480, -2104300895 * class311.anInt3475, -1271604973 * class311.anInt3484, -1094127543 * class311.anInt3485);
			}
		}
		return new Class507(class574.anInt7643 * -470865277, class513s, class574.anInt7640 * -1646415501, i_0_, i_1_, i_2_, class574.aClass569_7641, -182216499 * class574.anInt7644);
	}

	static final void method9086(int i, int i_6_) {
		int i_7_ = client.anInt11014 - client.anInt11267 * 219142479;
		if (i_7_ >= 100) {
			Class246.anInt2474 = Class65.method1062((short) -10921) * -1704189817;
			Class667.anInt8535 = 1594603721;
			Class658.anInt8498 = -662013517;
		} else {
			float f = 1.0F - ((float) ((100 - i_7_) * ((100 - i_7_) * (100 - i_7_))) / 1000000.0F);
			int i_8_;
			if (Class65.method1062((short) -10878) == 2) {
				Class536_Sub30 class536_sub30 = Class683.aClass301_Sub1_8651.method4051(826143221).method4353(-1713984555);
				Class598 class598 = client.aClass515_11066.method6255(-1455257551);
				Class141.anInt1658 = ((int) ((double) Class683.aClass301_Sub1_8651.method4058((byte) -75) * 2607.5945876176133) & 0x3fff) * 269246561;
				Class144.anInt1681 = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) -55) * -2607.5945876176133) & 0x3fff) * 402508199;
				Class304.anInt3440 = 0;
				client.anInt11287 = (int) ((float) (72330275 * Class98_Sub1_Sub2.anInt11335) + (float) ((int) ((double) (client.anInt11285 * -545189665) / (4.0 * (Math.tan((double) ((Class683.aClass301_Sub1_8651.method4071(896139802)) / 2.0F))))) - (72330275 * (Class98_Sub1_Sub2.anInt11335))) * f) * -1383029205;
				Class637.anInt8301 = (1420867453 * (int) ((float) (class536_sub30.anInt10568 * 2135129199 - 2133575168 * class598.anInt7839 - (Class184_Sub6.anInt9933 * 2114813609)) * f + (float) (2114813609 * Class184_Sub6.anInt9933)));
				Class205_Sub21.anInt9958 = ((int) (f * (float) (-(class536_sub30.anInt10564 * 737759727) - 351830209 * Class469.anInt5356) + (float) (351830209 * Class469.anInt5356)) * -300318539);
				Class685.anInt8665 = (717279039 * (int) ((float) ((-1369836225 * class536_sub30.anInt10567) - 1391122944 * class598.anInt7840 - 1414844411 * Class681.anInt8648) * f + (float) (Class681.anInt8648 * 1414844411)));
				i_8_ = (-(158223895 * Class144.anInt1681) - -1859034621 * Class23.anInt231) & 0x3fff;
				if (i_8_ > 8192)
					i_8_ -= 16384;
				else if (i_8_ < -8192)
					i_8_ += 16384;
			} else {
				int i_9_ = (int) client.aFloat11271;
				if (-1639712795 * client.anInt11312 >> 8 > i_9_)
					i_9_ = -1639712795 * client.anInt11312 >> 8;
				if (client.aBoolArray11270[4] && client.anIntArray11272[4] + 128 > i_9_)
					i_9_ = client.anIntArray11272[4] + 128;
				int i_10_ = ((int) client.aFloat11106 + client.anInt11093 * 325051359 & 0x3fff);
				Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
				client.method10460(-787333673 * Class461.anInt5216, (Class54.method944((int) class436.aFloat4850, (int) class436.aFloat4853, -989431627 * Class320.anInt3539, 2115814221) - client.anInt10997 * 1873552861), Class222.anInt2326 * -1817694149, i_9_, i_10_, 3 * (i_9_ >> 3) + 600 << 2, i, (byte) 3);
				Class637.anInt8301 = (1420867453 * (int) (f * (float) (Class637.anInt8301 * -1607026219 - (2114813609 * Class184_Sub6.anInt9933)) + (float) (Class184_Sub6.anInt9933 * 2114813609)));
				Class205_Sub21.anInt9958 = (-300318539 * (int) ((float) (Class469.anInt5356 * 351830209) + ((float) ((Class205_Sub21.anInt9958 * -1598853731) - Class469.anInt5356 * 351830209) * f)));
				Class685.anInt8665 = ((int) ((float) (-1646092097 * Class685.anInt8665 - 1414844411 * Class681.anInt8648) * f + (float) (Class681.anInt8648 * 1414844411)) * 717279039);
				Class141.anInt1658 = (int) ((float) (Class392_Sub3.anInt10231 * 2042579545) + f * (float) (Class141.anInt1658 * 62800801 - (Class392_Sub3.anInt10231 * 2042579545))) * 269246561;
				i_8_ = (158223895 * Class144.anInt1681 - -1859034621 * Class23.anInt231);
				if (i_8_ > 8192)
					i_8_ -= 16384;
				else if (i_8_ < -8192)
					i_8_ += 16384;
			}
			Class144.anInt1681 = 402508199 * (int) ((float) (Class23.anInt231 * -1859034621) + f * (float) i_8_);
			Class144.anInt1681 = (Class144.anInt1681 * 158223895 & 0x3fff) * 402508199;
			client.anInt11287 = ((int) (f * (float) (client.anInt11287 * 455927939 - (Class98_Sub1_Sub2.anInt11335 * 72330275)) + (float) (Class98_Sub1_Sub2.anInt11335 * 72330275)) * -1383029205);
		}
	}

	public static int method9087(Class678 class678, Class665 class665, int i, int i_11_) {
		if (class678 == Class678.aClass678_8619)
			return 443;
		return 50000 + i;
	}
}
