/* Class527 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527 {
	public Class527 aClass527_7105;
	public long aLong7106;
	public Class527 aClass527_7107;

	public void method8735(int i) {
		if (aClass527_7107 != null) {
			aClass527_7107.aClass527_7105 = aClass527_7105;
			aClass527_7105.aClass527_7107 = aClass527_7107;
			aClass527_7105 = null;
			aClass527_7107 = null;
		}
	}

	public boolean method8736(int i) {
		if (aClass527_7107 == null)
			return false;
		return true;
	}

	public boolean method8737() {
		if (aClass527_7107 == null)
			return false;
		return true;
	}

	public void method8738() {
		if (aClass527_7107 != null) {
			aClass527_7107.aClass527_7105 = aClass527_7105;
			aClass527_7105.aClass527_7107 = aClass527_7107;
			aClass527_7105 = null;
			aClass527_7107 = null;
		}
	}

	public void method8739() {
		if (aClass527_7107 != null) {
			aClass527_7107.aClass527_7105 = aClass527_7105;
			aClass527_7105.aClass527_7107 = aClass527_7107;
			aClass527_7105 = null;
			aClass527_7107 = null;
		}
	}

	public boolean method8740() {
		if (aClass527_7107 == null)
			return false;
		return true;
	}

	static final void method8741(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class305.method5594(class243, class240, class665, -1873276726);
	}

	static final void method8742(Class665 class665, short i) {
		class665.anInt8526 -= 204761682;
		Class570.method9598((class665.anIntArray8525[class665.anInt8526 * 1769813785]), (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]), 0, -1944295345);
	}

	static void method8743(int i, int i_0_, int i_1_, int i_2_) {
		if (1008 == i)
			Class546.method9060(Class579.aClass579_7651, i_0_, i_1_, (byte) -86);
		else if (i == 1009)
			Class546.method9060(Class579.aClass579_7657, i_0_, i_1_, (byte) 0);
		else if (1010 == i)
			Class546.method9060(Class579.aClass579_7665, i_0_, i_1_, (byte) -54);
		else if (i == 1011)
			Class546.method9060(Class579.aClass579_7653, i_0_, i_1_, (byte) -83);
		else if (i == 1012)
			Class546.method9060(Class579.aClass579_7654, i_0_, i_1_, (byte) -109);
	}

	static final void method8744(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		client.aShort11283 = (short) class665.anIntArray8525[1769813785 * class665.anInt8526];
		if (client.aShort11283 <= 0)
			client.aShort11283 = (short) 256;
		client.aShort11284 = (short) (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]);
		if (client.aShort11284 <= 0)
			client.aShort11284 = (short) 320;
	}
}
