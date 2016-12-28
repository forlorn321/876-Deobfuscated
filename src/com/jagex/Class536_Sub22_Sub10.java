/* Class536_Sub22_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub22_Sub10 extends Class536_Sub22 {
	Class344 this$0;
	String aString11694;
	long aLong11695;

	Class536_Sub22_Sub10(Class344 class344) {
		this$0 = class344;
		aLong11695 = 5916458040912982245L;
		aString11694 = null;
	}

	void method9578(RSByteBuffer class536_sub33, int i) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11695 = class536_sub33.readLong(702869087) * -5916458040912982245L;
		}
		aString11694 = class536_sub33.method9713(16509697);
	}

	void method9581(ClanSettings class350, int i) {
		class350.method4622(-4391481928540294381L * aLong11695, aString11694, 0, -1804882421);
	}

	void method9580(ClanSettings class350) {
		class350.method4622(-4391481928540294381L * aLong11695, aString11694, 0, 481275833);
	}

	void method9579(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11695 = class536_sub33.readLong(702869087) * -5916458040912982245L;
		}
		aString11694 = class536_sub33.method9713(16509697);
	}

	void method9577(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 255) {
			class536_sub33.off -= 516175515;
			aLong11695 = class536_sub33.readLong(702869087) * -5916458040912982245L;
		}
		aString11694 = class536_sub33.method9713(16509697);
	}

	static boolean method10696(Interface59 interface59, Class34_Sub17 class34_sub17, int i, int i_0_, byte i_1_) {
		if (interface59 == null)
			return false;
		Class612 class612 = ((Class612) class34_sub17.method70(interface59.method373((byte) 16), (byte) 64));
		if (class612.aBool8001 && !client.aBool11123)
			return false;
		int i_2_ = class612.anInt7994 * -876565287;
		if (class612.anIntArray7988 != null) {
			for (int i_3_ = 0; i_3_ < class612.anIntArray7988.length; i_3_++) {
				if (-1 != class612.anIntArray7988[i_3_]) {
					Class612 class612_4_ = ((Class612) class34_sub17.method70((class612.anIntArray7988[i_3_]), (byte) -61));
					if (-876565287 * class612_4_.anInt7994 >= 0)
						i_2_ = class612_4_.anInt7994 * -876565287;
				}
			}
		}
		if (i_2_ >= 0) {
			Class101.anIntArray1202[-1314589555 * Class101.anInt1199] = 1083959103 * class612.anInt8008;
			Class101.anIntArray1198[-1314589555 * Class101.anInt1199] = i;
			Class101.anIntArray1203[-1314589555 * Class101.anInt1199] = i_0_;
			Class101.anInt1199 += 1303113285;
			return true;
		}
		return false;
	}
}
