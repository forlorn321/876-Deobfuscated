/* Class612 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class612 implements Interface76 {
	static Class612 aClass612_8010;
	static Class612 aClass612_8011;
	static Class612 aClass612_8012 = new Class612(0);
	static Class612 aClass612_8013;
	static Class612 aClass612_8014;
	static Class612 aClass612_8015;
	int anInt8016;

	Class612(int i) {
		anInt8016 = -1534630629 * i;
	}

	public int method87() {
		return anInt8016 * 86338835;
	}

	static {
		aClass612_8011 = new Class612(1);
		aClass612_8010 = new Class612(2);
		aClass612_8013 = new Class612(3);
		aClass612_8014 = new Class612(4);
		aClass612_8015 = new Class612(5);
	}

	public int method42() {
		return anInt8016 * 86338835;
	}

	public int method91() {
		return anInt8016 * 86338835;
	}

	public static Class612[] method10122() {
		return (new Class612[] { aClass612_8012, aClass612_8015, aClass612_8013, aClass612_8011, aClass612_8010, aClass612_8014 });
	}

	static final void method10123(Class665 class665, byte i) {
		class665.anInt8526 -= 102380841;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class540.method9011(i_0_, (byte) -102);
	}

	static Class527_Sub8_Sub12 method10124(Class459 class459, int i, short i_1_) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(class459.method7470(0, i, (byte) -12));
		return Class39.method1160(class527_sub38, i, (short) 255);
	}
}
