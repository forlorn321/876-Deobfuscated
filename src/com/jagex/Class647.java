/* Class647 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class647 {
	int anInt8351;
	int anInt8352;
	int anInt8353;
	float aFloat8354;
	float aFloat8355;
	Class442 aClass442_8356;
	int anInt8357;
	float aFloat8358;
	float aFloat8359;
	float aFloat8360;
	int anInt8361;
	int anInt8362;
	int anInt8363;
	float aFloat8364;
	int anInt8365;
	int anInt8366;
	int[] anIntArray8367 = new int[3];
	float[] aFloatArray8368 = new float[3];
	int anInt8369;

	public int method10757() {
		return -46464389 * anInt8362;
	}

	void method10758(int i) {
		anInt8351 = -1847877941;
		aFloat8364 = -1.0F;
		aFloat8359 = -1.0F;
		aFloat8354 = -1.0F;
		aClass442_8356 = null;
		anInt8353 = 1432299235;
		anInt8357 = -2063174399;
		aFloat8358 = -1.0F;
		aFloat8355 = -1.0F;
		aFloat8360 = -1.0F;
		anInt8361 = -1864891883;
		anInt8362 = 1165587277;
		anInt8363 = -1777445181;
		anInt8352 = -21591345;
		anInt8365 = -2066491751;
		anInt8366 = 1452202017;
		for (int i_0_ = 0; i_0_ < anIntArray8367.length; i_0_++) {
			anIntArray8367[i_0_] = -1;
			aFloatArray8368[i_0_] = 0.0F;
		}
		anInt8369 = 1675736056;
	}

	public boolean method10759(RSByteBuffer class527_sub38, int i) {
		int i_1_ = class527_sub38.readUnsignedShort();
		if (i_1_ == 0) {
			anInt8369 = class527_sub38.readUnsignedShort() * 699555823;
			return false;
		}
		if ((i_1_ & Class658.aClass658_8487.anInt8474 * -1193884611) != 0)
			anInt8351 = class527_sub38.readInt() * 1847877941;
		if (0 != (i_1_ & -1193884611 * Class658.aClass658_8475.anInt8474))
			aFloat8364 = class527_sub38.readFloat(-1336917380);
		if ((i_1_ & -1193884611 * Class658.aClass658_8476.anInt8474) != 0)
			aFloat8359 = class527_sub38.readFloat(-1476217465);
		if ((i_1_ & -1193884611 * Class658.aClass658_8477.anInt8474) != 0)
			aFloat8354 = class527_sub38.readFloat(-1979560963);
		if (0 != (i_1_ & -1193884611 * Class658.aClass658_8478.anInt8474))
			aClass442_8356 = Class442.method7142(class527_sub38);
		if ((i_1_ & -1193884611 * Class658.aClass658_8479.anInt8474) != 0)
			anInt8353 = class527_sub38.readInt() * -1432299235;
		if (0 != (i_1_ & -1193884611 * Class658.aClass658_8480.anInt8474))
			anInt8357 = class527_sub38.readUnsignedShort() * 2063174399;
		if ((i_1_ & Class658.aClass658_8485.anInt8474 * -1193884611) != 0)
			anInt8361 = class527_sub38.readUnsignedShort() * 1864891883;
		if (0 != (i_1_ & Class658.aClass658_8482.anInt8474 * -1193884611))
			aFloat8358 = class527_sub38.readFloat(-911879106);
		if (0 != (i_1_ & -1193884611 * Class658.aClass658_8483.anInt8474))
			aFloat8355 = class527_sub38.readFloat(-1201173826);
		if ((i_1_ & -1193884611 * Class658.aClass658_8484.anInt8474) != 0)
			aFloat8360 = class527_sub38.readFloat(-1526481334);
		if ((i_1_ & -1193884611 * Class658.aClass658_8486.anInt8474) != 0) {
			anInt8362 = class527_sub38.readUnsignedShort() * -1165587277;
			anInt8363 = class527_sub38.readShort() * 1777445181;
			anInt8352 = class527_sub38.readShort() * 21591345;
			anInt8365 = class527_sub38.readShort() * 2066491751;
			anInt8366 = class527_sub38.readUnsignedShort() * -1452202017;
		}
		if (0 != (i_1_ & -1193884611 * Class658.aClass658_8489.anInt8474)) {
			anIntArray8367[0] = class527_sub38.readUnsignedShort();
			aFloatArray8368[0] = class527_sub38.readFloat(-1642406712);
		}
		if ((i_1_ & -1193884611 * Class658.aClass658_8481.anInt8474) != 0) {
			anIntArray8367[1] = class527_sub38.readUnsignedShort();
			aFloatArray8368[1] = class527_sub38.readFloat(-778417676);
		}
		if ((i_1_ & Class658.aClass658_8488.anInt8474 * -1193884611) != 0) {
			anIntArray8367[2] = class527_sub38.readUnsignedShort();
			aFloatArray8368[2] = class527_sub38.readFloat(-1598577305);
		}
		anInt8369 = class527_sub38.readUnsignedShort() * 699555823;
		return true;
	}

	public int method10760(byte i) {
		return anInt8351 * 780249373;
	}

	public float method10761(byte i) {
		return aFloat8364;
	}

	public float method10762(int i) {
		return aFloat8359;
	}

	public float method10763(byte i) {
		return aFloat8354;
	}

	public Class442 method10764(int i) {
		return aClass442_8356;
	}

	public int method10765(byte i) {
		return anInt8361 * -1015463229;
	}

	public int method10766() {
		return -662130929 * anInt8369;
	}

	public boolean method10767(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedShort();
		if (i == 0) {
			anInt8369 = class527_sub38.readUnsignedShort() * 699555823;
			return false;
		}
		if ((i & Class658.aClass658_8487.anInt8474 * -1193884611) != 0)
			anInt8351 = class527_sub38.readInt() * 1847877941;
		if (0 != (i & -1193884611 * Class658.aClass658_8475.anInt8474))
			aFloat8364 = class527_sub38.readFloat(-1066742896);
		if ((i & -1193884611 * Class658.aClass658_8476.anInt8474) != 0)
			aFloat8359 = class527_sub38.readFloat(-1864646507);
		if ((i & -1193884611 * Class658.aClass658_8477.anInt8474) != 0)
			aFloat8354 = class527_sub38.readFloat(-734887443);
		if (0 != (i & -1193884611 * Class658.aClass658_8478.anInt8474))
			aClass442_8356 = Class442.method7142(class527_sub38);
		if ((i & -1193884611 * Class658.aClass658_8479.anInt8474) != 0)
			anInt8353 = class527_sub38.readInt() * -1432299235;
		if (0 != (i & -1193884611 * Class658.aClass658_8480.anInt8474))
			anInt8357 = class527_sub38.readUnsignedShort() * 2063174399;
		if ((i & Class658.aClass658_8485.anInt8474 * -1193884611) != 0)
			anInt8361 = class527_sub38.readUnsignedShort() * 1864891883;
		if (0 != (i & Class658.aClass658_8482.anInt8474 * -1193884611))
			aFloat8358 = class527_sub38.readFloat(-1665217966);
		if (0 != (i & -1193884611 * Class658.aClass658_8483.anInt8474))
			aFloat8355 = class527_sub38.readFloat(-508372459);
		if ((i & -1193884611 * Class658.aClass658_8484.anInt8474) != 0)
			aFloat8360 = class527_sub38.readFloat(-1898043820);
		if ((i & -1193884611 * Class658.aClass658_8486.anInt8474) != 0) {
			anInt8362 = class527_sub38.readUnsignedShort() * -1165587277;
			anInt8363 = class527_sub38.readShort() * 1777445181;
			anInt8352 = class527_sub38.readShort() * 21591345;
			anInt8365 = class527_sub38.readShort() * 2066491751;
			anInt8366 = class527_sub38.readUnsignedShort() * -1452202017;
		}
		if (0 != (i & -1193884611 * Class658.aClass658_8489.anInt8474)) {
			anIntArray8367[0] = class527_sub38.readUnsignedShort();
			aFloatArray8368[0] = class527_sub38.readFloat(-1754491885);
		}
		if ((i & -1193884611 * Class658.aClass658_8481.anInt8474) != 0) {
			anIntArray8367[1] = class527_sub38.readUnsignedShort();
			aFloatArray8368[1] = class527_sub38.readFloat(-632131868);
		}
		if ((i & Class658.aClass658_8488.anInt8474 * -1193884611) != 0) {
			anIntArray8367[2] = class527_sub38.readUnsignedShort();
			aFloatArray8368[2] = class527_sub38.readFloat(-1205578449);
		}
		anInt8369 = class527_sub38.readUnsignedShort() * 699555823;
		return true;
	}

	public float method10768(int i) {
		return aFloat8355;
	}

	public float method10769(int i) {
		return aFloat8360;
	}

	public Class647() {
		method10758(-1178741830);
	}

	public int method10770(int i) {
		return -46464389 * anInt8362;
	}

	public int method10771(short i) {
		return 478639637 * anInt8363;
	}

	public int method10772(int i) {
		return -2043427887 * anInt8352;
	}

	public int method10773() {
		return 1125036341 * anInt8353;
	}

	public int method10774(int i) {
		return -123120609 * anInt8366;
	}

	public int method10775(int i, int i_2_) {
		return anIntArray8367[i];
	}

	public float method10776(int i, int i_3_) {
		return aFloatArray8368[i];
	}

	public int method10777(int i) {
		return -662130929 * anInt8369;
	}

	void method10778() {
		anInt8351 = -1847877941;
		aFloat8364 = -1.0F;
		aFloat8359 = -1.0F;
		aFloat8354 = -1.0F;
		aClass442_8356 = null;
		anInt8353 = 1432299235;
		anInt8357 = -2063174399;
		aFloat8358 = -1.0F;
		aFloat8355 = -1.0F;
		aFloat8360 = -1.0F;
		anInt8361 = -1864891883;
		anInt8362 = 1165587277;
		anInt8363 = -1777445181;
		anInt8352 = -21591345;
		anInt8365 = -2066491751;
		anInt8366 = 1452202017;
		for (int i = 0; i < anIntArray8367.length; i++) {
			anIntArray8367[i] = -1;
			aFloatArray8368[i] = 0.0F;
		}
		anInt8369 = 1675736056;
	}

	public int method10779() {
		return anInt8361 * -1015463229;
	}

	void method10780() {
		anInt8351 = -1847877941;
		aFloat8364 = -1.0F;
		aFloat8359 = -1.0F;
		aFloat8354 = -1.0F;
		aClass442_8356 = null;
		anInt8353 = 1432299235;
		anInt8357 = -2063174399;
		aFloat8358 = -1.0F;
		aFloat8355 = -1.0F;
		aFloat8360 = -1.0F;
		anInt8361 = -1864891883;
		anInt8362 = 1165587277;
		anInt8363 = -1777445181;
		anInt8352 = -21591345;
		anInt8365 = -2066491751;
		anInt8366 = 1452202017;
		for (int i = 0; i < anIntArray8367.length; i++) {
			anIntArray8367[i] = -1;
			aFloatArray8368[i] = 0.0F;
		}
		anInt8369 = 1675736056;
	}

	public int method10781() {
		return anInt8351 * 780249373;
	}

	public int method10782() {
		return -2043427887 * anInt8352;
	}

	public int method10783() {
		return anInt8351 * 780249373;
	}

	public int method10784() {
		return anInt8351 * 780249373;
	}

	public int method10785(byte i) {
		return 1125036341 * anInt8353;
	}

	public int method10786() {
		return anInt8351 * 780249373;
	}

	public float method10787() {
		return aFloat8364;
	}

	public float method10788() {
		return aFloat8364;
	}

	public float method10789() {
		return aFloat8364;
	}

	public float method10790() {
		return aFloat8359;
	}

	public int method10791(int i) {
		return 694674007 * anInt8365;
	}

	public int method10792() {
		return 546141439 * anInt8357;
	}

	public float method10793(int i) {
		return aFloatArray8368[i];
	}

	public int method10794() {
		return 1125036341 * anInt8353;
	}

	public Class442 method10795() {
		return aClass442_8356;
	}

	public int method10796() {
		return 546141439 * anInt8357;
	}

	public boolean method10797(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedShort();
		if (i == 0) {
			anInt8369 = class527_sub38.readUnsignedShort() * 699555823;
			return false;
		}
		if ((i & Class658.aClass658_8487.anInt8474 * -1193884611) != 0)
			anInt8351 = class527_sub38.readInt() * 1847877941;
		if (0 != (i & -1193884611 * Class658.aClass658_8475.anInt8474))
			aFloat8364 = class527_sub38.readFloat(-132914596);
		if ((i & -1193884611 * Class658.aClass658_8476.anInt8474) != 0)
			aFloat8359 = class527_sub38.readFloat(-2086942506);
		if ((i & -1193884611 * Class658.aClass658_8477.anInt8474) != 0)
			aFloat8354 = class527_sub38.readFloat(-770280806);
		if (0 != (i & -1193884611 * Class658.aClass658_8478.anInt8474))
			aClass442_8356 = Class442.method7142(class527_sub38);
		if ((i & -1193884611 * Class658.aClass658_8479.anInt8474) != 0)
			anInt8353 = class527_sub38.readInt() * -1432299235;
		if (0 != (i & -1193884611 * Class658.aClass658_8480.anInt8474))
			anInt8357 = class527_sub38.readUnsignedShort() * 2063174399;
		if ((i & Class658.aClass658_8485.anInt8474 * -1193884611) != 0)
			anInt8361 = class527_sub38.readUnsignedShort() * 1864891883;
		if (0 != (i & Class658.aClass658_8482.anInt8474 * -1193884611))
			aFloat8358 = class527_sub38.readFloat(-1699294713);
		if (0 != (i & -1193884611 * Class658.aClass658_8483.anInt8474))
			aFloat8355 = class527_sub38.readFloat(-456455857);
		if ((i & -1193884611 * Class658.aClass658_8484.anInt8474) != 0)
			aFloat8360 = class527_sub38.readFloat(-403332290);
		if ((i & -1193884611 * Class658.aClass658_8486.anInt8474) != 0) {
			anInt8362 = class527_sub38.readUnsignedShort() * -1165587277;
			anInt8363 = class527_sub38.readShort() * 1777445181;
			anInt8352 = class527_sub38.readShort() * 21591345;
			anInt8365 = class527_sub38.readShort() * 2066491751;
			anInt8366 = class527_sub38.readUnsignedShort() * -1452202017;
		}
		if (0 != (i & -1193884611 * Class658.aClass658_8489.anInt8474)) {
			anIntArray8367[0] = class527_sub38.readUnsignedShort();
			aFloatArray8368[0] = class527_sub38.readFloat(-1224038526);
		}
		if ((i & -1193884611 * Class658.aClass658_8481.anInt8474) != 0) {
			anIntArray8367[1] = class527_sub38.readUnsignedShort();
			aFloatArray8368[1] = class527_sub38.readFloat(-807225639);
		}
		if ((i & Class658.aClass658_8488.anInt8474 * -1193884611) != 0) {
			anIntArray8367[2] = class527_sub38.readUnsignedShort();
			aFloatArray8368[2] = class527_sub38.readFloat(-960873004);
		}
		anInt8369 = class527_sub38.readUnsignedShort() * 699555823;
		return true;
	}

	public float method10798() {
		return aFloat8360;
	}

	void method10799() {
		anInt8351 = -1847877941;
		aFloat8364 = -1.0F;
		aFloat8359 = -1.0F;
		aFloat8354 = -1.0F;
		aClass442_8356 = null;
		anInt8353 = 1432299235;
		anInt8357 = -2063174399;
		aFloat8358 = -1.0F;
		aFloat8355 = -1.0F;
		aFloat8360 = -1.0F;
		anInt8361 = -1864891883;
		anInt8362 = 1165587277;
		anInt8363 = -1777445181;
		anInt8352 = -21591345;
		anInt8365 = -2066491751;
		anInt8366 = 1452202017;
		for (int i = 0; i < anIntArray8367.length; i++) {
			anIntArray8367[i] = -1;
			aFloatArray8368[i] = 0.0F;
		}
		anInt8369 = 1675736056;
	}

	public int method10800() {
		return -46464389 * anInt8362;
	}

	public int method10801() {
		return 1125036341 * anInt8353;
	}

	public int method10802() {
		return -46464389 * anInt8362;
	}

	public int method10803(int i) {
		return 546141439 * anInt8357;
	}

	public int method10804() {
		return 478639637 * anInt8363;
	}

	public int method10805() {
		return -2043427887 * anInt8352;
	}

	public int method10806() {
		return 694674007 * anInt8365;
	}

	public int method10807() {
		return 694674007 * anInt8365;
	}

	public int method10808() {
		return -123120609 * anInt8366;
	}

	public int method10809() {
		return -123120609 * anInt8366;
	}

	public float method10810() {
		return aFloat8360;
	}

	public float method10811(int i) {
		return aFloatArray8368[i];
	}

	public float method10812(int i) {
		return aFloat8358;
	}

	public float method10813(int i) {
		return aFloatArray8368[i];
	}

	static final void method10814(Class665 class665, byte i) {
		int i_4_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_4_, -1968314602);
		Class240 class240 = Class183.aClass240Array2100[i_4_ >> 16];
		Class455.method7343(class243, class240, class665, -2141330452);
	}

	static final void method10815(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		boolean bool = (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526] == 1);
		Class45.method1214(i_5_, bool, -1156088789);
	}

	static final void method10816(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub41_10626.method17310(-2113437344) == 1 ? 1 : 0;
	}

	static final void method10817(Class665 class665, byte i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (-2119864417 * client.anInt11237 != -1) {
			if (0 == i_6_) {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -2119864417 * client.anInt11237;
				return;
			}
			i_6_--;
		}
		Class527_Sub41 class527_sub41 = (Class527_Sub41) client.aClass14_11276.method713((byte) 47);
		while (i_6_-- > 0)
			class527_sub41 = (Class527_Sub41) client.aClass14_11276.method717(-802956835);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class527_sub41.anInt10752 * 1307137747;
	}

	static final void method10818(Class665 class665, byte i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_7_, -1948618969);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (1 == -1260029751 * class243.anInt2541 ? 1538136819 * class243.anInt2542 : -1);
	}

	public static int method10819(short[] is, int i, Class325 class325, int i_8_, int i_9_) throws IOException {
		int i_10_ = 1;
		int i_11_ = 0;
		for (int i_12_ = 0; i_12_ < i_8_; i_12_++) {
			int i_13_ = class325.method5735(is, i + i_10_, 1287213995);
			i_10_ <<= 1;
			i_10_ += i_13_;
			i_11_ |= i_13_ << i_12_;
		}
		return i_11_;
	}

	static final void method10820(Class665 class665, byte i) {
		int i_14_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_14_ == 0)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class529_Sub1.aBool10790 ? 1 : 0;
		else if (1 == i_14_)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class529_Sub1.aBool10792 ? 1 : 0;
		else if (2 == i_14_)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class529_Sub1.aBool10793 ? 1 : 0;
		else
			throw new RuntimeException();
	}
}
