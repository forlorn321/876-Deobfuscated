/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class333 implements Interface12 {
	int anInt3619 = 1259631045;
	Class318 aClass318_3620;
	public int anInt3621;
	int anInt3622;
	int anInt3623;
	String aString3624;
	static int[] anIntArray3625 = new int[32];
	public Class160 aClass160_3626;
	Class465 aClass465_3627;
	public static boolean aBool3628;
	public static Class95_Sub1_Sub2 aClass95_Sub1_Sub2_3629;

	public int method5839(int i, byte i_0_) {
		int i_1_ = anIntArray3625[anInt3623 * 1048447727 - anInt3622 * -437375127];
		return i >> anInt3622 * -437375127 & i_1_;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		method5847(class527_sub38, false, (byte) 15);
	}

	public void method83(RSByteBuffer class527_sub38) {
		method5847(class527_sub38, false, (byte) 15);
	}

	public int method5840(int i, int i_2_) throws Exception_Sub7 {
		int i_3_ = anIntArray3625[1048447727 * anInt3623 - -437375127 * anInt3622];
		if (i_2_ < 0 || i_2_ > i_3_)
			throw new Exception_Sub7((aString3624 != null ? aString3624 : Integer.toString(anInt3621 * -1249512957)), i_2_, i_3_);
		i_3_ <<= anInt3622 * -437375127;
		return i & (i_3_ ^ 0xffffffff) | i_2_ << -437375127 * anInt3622 & i_3_;
	}

	public void method85() {
		/* empty */
	}

	public void method84() {
		/* empty */
	}

	public int method5841(int i, int i_4_, byte i_5_) throws Exception_Sub7 {
		int i_6_ = anIntArray3625[1048447727 * anInt3623 - -437375127 * anInt3622];
		if (i_4_ < 0 || i_4_ > i_6_)
			throw new Exception_Sub7((aString3624 != null ? aString3624 : Integer.toString(anInt3621 * -1249512957)), i_4_, i_6_);
		i_6_ <<= anInt3622 * -437375127;
		return i & (i_6_ ^ 0xffffffff) | i_4_ << -437375127 * anInt3622 & i_6_;
	}

	static {
		int i = 2;
		for (int i_7_ = 0; i_7_ < 32; i_7_++) {
			anIntArray3625[i_7_] = i - 1;
			i += i;
		}
	}

	void method5842(RSByteBuffer class527_sub38, int i, boolean bool, int i_8_) {
		Class315 class315 = (Class315) Class26.method858(Class45.method1211(-362033272), i, 772482040);
		switch (1699035857 * class315.anInt3523) {
		case 9: {
			int i_9_ = class527_sub38.readUnsignedByte();
			aClass465_3627 = (Class465) Class26.method858(Class465.method7644(1790249703), i_9_, -1395337325);
			if (null == aClass465_3627)
				throw new IllegalStateException("");
			anInt3619 = class527_sub38.method16466(-1820401290) * -1259631045;
			if (null != aClass318_3620) {
				Interface13 interface13 = ((Interface13) aClass318_3620.aMap3534.get(aClass465_3627));
				if (interface13 != null)
					aClass160_3626 = ((Class160) interface13.method81(2055346931 * anInt3619, 419837226));
				else if (!bool)
					throw new IllegalStateException("");
			}
			break;
		}
		case 0:
			break;
		default:
			break;
		case 13:
			anInt3622 = class527_sub38.readUnsignedByte() * 669077721;
			anInt3623 = class527_sub38.readUnsignedByte() * -349674481;
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		method5847(class527_sub38, false, (byte) 15);
	}

	void method5843(RSByteBuffer class527_sub38, int i, boolean bool) {
		Class315 class315 = (Class315) Class26.method858(Class45.method1211(924190151), i, -155578747);
		switch (1699035857 * class315.anInt3523) {
		case 9: {
			int i_10_ = class527_sub38.readUnsignedByte();
			aClass465_3627 = (Class465) Class26.method858(Class465.method7644(2103617642), i_10_, -1184530210);
			if (null == aClass465_3627)
				throw new IllegalStateException("");
			anInt3619 = class527_sub38.method16466(-1858394802) * -1259631045;
			if (null != aClass318_3620) {
				Interface13 interface13 = ((Interface13) aClass318_3620.aMap3534.get(aClass465_3627));
				if (interface13 != null)
					aClass160_3626 = ((Class160) interface13.method81(2055346931 * anInt3619, 1241697757));
				else if (!bool)
					throw new IllegalStateException("");
			}
			break;
		}
		case 0:
			break;
		default:
			break;
		case 13:
			anInt3622 = class527_sub38.readUnsignedByte() * 669077721;
			anInt3623 = class527_sub38.readUnsignedByte() * -349674481;
		}
	}

	public int method5844(int i) {
		int i_11_ = anIntArray3625[anInt3623 * 1048447727 - anInt3622 * -437375127];
		return i >> anInt3622 * -437375127 & i_11_;
	}

	void method5845(RSByteBuffer class527_sub38, boolean bool) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method5842(class527_sub38, i, bool, 292547013);
		}
	}

	void method5846(RSByteBuffer class527_sub38, boolean bool) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method5842(class527_sub38, i, bool, -204784495);
		}
	}

	public void method86(int i) {
		/* empty */
	}

	void method5847(RSByteBuffer class527_sub38, boolean bool, byte i) {
		for (;;) {
			int i_12_ = class527_sub38.readUnsignedByte();
			if (i_12_ == 0)
				break;
			method5842(class527_sub38, i_12_, bool, 796140409);
		}
	}

	public int method5848(int i) {
		int i_13_ = anIntArray3625[anInt3623 * 1048447727 - anInt3622 * -437375127];
		return i >> anInt3622 * -437375127 & i_13_;
	}

	Class333(int i, Class318 class318) {
		anInt3621 = 338151595 * i;
		aClass318_3620 = class318;
	}

	public int method5849(int i, int i_14_) throws Exception_Sub7 {
		int i_15_ = anIntArray3625[1048447727 * anInt3623 - -437375127 * anInt3622];
		if (i_14_ < 0 || i_14_ > i_15_)
			throw new Exception_Sub7((aString3624 != null ? aString3624 : Integer.toString(anInt3621 * -1249512957)), i_14_, i_15_);
		i_15_ <<= anInt3622 * -437375127;
		return (i & (i_15_ ^ 0xffffffff) | i_14_ << -437375127 * anInt3622 & i_15_);
	}
}
