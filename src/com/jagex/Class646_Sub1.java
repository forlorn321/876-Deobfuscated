/* Class646_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class646_Sub1 extends Class646 implements Interface6 {
	static short aShort10841;

	public Class method55() {
		return com.jagex.Class650.class;
	}

	public Interface14 method58(int i, Interface13 interface13, int i_0_) {
		return new Class650(i, this);
	}

	public Class method53(byte i) {
		return com.jagex.Class650.class;
	}

	Class646_Sub1(Class459 class459) {
		super(class459);
	}

	public Interface14 method54(int i, Interface13 interface13) {
		return new Class650(i, this);
	}

	public Interface14 method56(int i, Interface13 interface13) {
		return new Class650(i, this);
	}

	public Class method57() {
		return com.jagex.Class650.class;
	}

	public Interface14 method52(int i, Interface13 interface13) {
		return new Class650(i, this);
	}

	public Class method59() {
		return com.jagex.Class650.class;
	}

	static final void method16932(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_2_ = i_1_ >> 14 & 0x3fff;
		int i_3_ = i_1_ & 0x3fff;
		Class592 class592 = client.aClass509_11072.method8283((short) 25055);
		i_2_ -= 153371143 * class592.anInt7798;
		if (i_2_ < 0)
			i_2_ = 0;
		else if (i_2_ >= client.aClass509_11072.method8284((byte) 67))
			i_2_ = client.aClass509_11072.method8284((byte) 86);
		i_3_ -= -2029646807 * class592.anInt7799;
		if (i_3_ < 0)
			i_3_ = 0;
		else if (i_3_ >= client.aClass509_11072.method8285(1981519878))
			i_3_ = client.aClass509_11072.method8285(-1088717586);
		client.anInt11179 = -1033417211 * (256 + (i_2_ << 9));
		client.anInt11045 = -50210015 * (256 + (i_3_ << 9));
		Class30.anInt265 = -406597490;
		Class452.anInt4964 = 1432081761;
		Class400.anInt4141 = -228665961;
		client.aBool11119 = true;
	}

	static final void method16933(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_5_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (client.aClass492ArrayArray11272[i_5_][i_4_].anInt5488 * 781903863);
	}

	static final void method16934(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class605.method10049(class243, class240, class665, 2122431205);
	}
}
