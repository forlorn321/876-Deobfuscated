/* Class153_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;

public class Class153_Sub1 extends Class153 {
	public int anInt8867;

	void method1859(RSByteBuffer class536_sub33, int i) {
		Class236 class236 = (Class236) Class682.method8091(Class66.method1073(617262572), i, 1858049507);
		if (Class236.aClass236_2396 == class236)
			anInt8867 = class536_sub33.readUnsignedShort((short) -14335) * 578611583;
	}

	void method1858(RSByteBuffer class536_sub33, int i, int i_0_) {
		Class236 class236 = (Class236) Class682.method8091(Class66.method1073(314952450), i, 1858049507);
		if (Class236.aClass236_2396 == class236)
			anInt8867 = class536_sub33.readUnsignedShort((short) -9473) * 578611583;
	}

	public void method75(byte i) {
		/* empty */
	}

	void method1863(RSByteBuffer class536_sub33, int i) {
		Class236 class236 = (Class236) Class682.method8091(Class66.method1073(-677319559), i, 1858049507);
		if (Class236.aClass236_2396 == class236)
			anInt8867 = class536_sub33.readUnsignedShort((short) -17319) * 578611583;
	}

	void method1860(RSByteBuffer class536_sub33, int i) {
		Class236 class236 = (Class236) Class682.method8091(Class66.method1073(-234847798), i, 1858049507);
		if (Class236.aClass236_2396 == class236)
			anInt8867 = class536_sub33.readUnsignedShort((short) 30359) * 578611583;
	}

	public void method77() {
		/* empty */
	}

	Class153_Sub1(Class458 class458, int i) {
		super(class458, i);
	}

	public static Class6 method8383(String string, String string_1_, boolean bool, int i) {
		File file = new File(Class63.aFile718, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class6 class6;
				try {
					Class6 class6_2_ = new Class6(file, "rw", 10000L);
					class6 = class6_2_;
				} catch (IOException ioexception) {
					break;
				}
				return class6;
			}
		} while (false);
		String string_3_ = "";
		if (33 == Class679.anInt8636 * -1104382251)
			string_3_ = "_rc";
		else if (34 == Class679.anInt8636 * -1104382251)
			string_3_ = "_wip";
		File file_4_ = new File(Class189.aString2145, new StringBuilder().append("jagex_").append(string_1_).append("_preferences").append(string).append(string_3_).append(".dat").toString());
		do {
			if (!bool && file_4_.exists()) {
				Class6 class6;
				try {
					Class6 class6_5_ = new Class6(file_4_, "rw", 10000L);
					class6 = class6_5_;
				} catch (IOException ioexception) {
					break;
				}
				return class6;
			}
		} while (false);
		Class6 class6;
		try {
			Class6 class6_6_ = new Class6(file, "rw", 10000L);
			class6 = class6_6_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class6;
	}

	static final void method8384(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class63.aClass226_717.method3255(-1572014489);
	}

	static final void method8385(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class390.method4856(class251, class234, false, 1, class668, (byte) -98);
	}

	public static int method8386(Class425 class425, int i) {
		Class436 class436 = Class436.method5257(0.0F, 0.0F, 1.0F);
		class436.method5263(class425);
		double d = Math.atan2((double) class436.aFloat4850, (double) class436.aFloat4853);
		class436.method5239();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}
}
