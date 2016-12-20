/* Class208_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub17 extends Class208 {
	String aString9944;
	int anInt9945;
	int anInt9946;
	int anInt9947;
	int anInt9948;

	Class208_Sub17(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9948 = class527_sub38.readUnsignedShort() * -7891881;
		anInt9945 = class527_sub38.readUnsignedShort() * -224291229;
		aString9944 = class527_sub38.readString(1440067742);
		anInt9947 = class527_sub38.readInt() * -1604789171;
		anInt9946 = class527_sub38.readUnsignedShort() * 829959539;
	}

	public void method3846(int i) {
		Class643.method10736(Class673.anInt8585 * 162317215, anInt9948 * 1865193319, anInt9945 * -496395445, Class590.method9853(1865193319 * anInt9948, -496395445 * anInt9945, (162317215 * Class673.anInt8585), (byte) 5), -1409630277 * anInt9946, -1027490683 * anInt9947, aString9944, 65643443);
	}

	public void method3848() {
		Class643.method10736(Class673.anInt8585 * 162317215, anInt9948 * 1865193319, anInt9945 * -496395445, Class590.method9853(1865193319 * anInt9948, -496395445 * anInt9945, (162317215 * Class673.anInt8585), (byte) 5), -1409630277 * anInt9946, -1027490683 * anInt9947, aString9944, 65643443);
	}

	public void method3851() {
		Class643.method10736(Class673.anInt8585 * 162317215, anInt9948 * 1865193319, anInt9945 * -496395445, Class590.method9853(1865193319 * anInt9948, -496395445 * anInt9945, (162317215 * Class673.anInt8585), (byte) 5), -1409630277 * anInt9946, -1027490683 * anInt9947, aString9944, 65643443);
	}

	static void method15630(Class243 class243, int i) {
		if (-270144907 * class243.anInt2501 == 5 && -1 != class243.anInt2572 * -437471887)
			Class289.method5225(Class402.aClass180_4150, class243, -45663419);
	}

	static void method15631(Class527_Sub8_Sub10 class527_sub8_sub10, int i, Class665 class665, int i_0_) {
		class665.anInt8526 = 0;
		class665.anInt8528 = 0;
		class665.anInt8527 = 1038991169;
		class665.aClass527_Sub8_Sub10_8548 = class527_sub8_sub10;
		class665.aClass501Array8521 = class665.aClass527_Sub8_Sub10_8548.aClass501Array11731;
		class665.anIntArray8545 = class665.aClass527_Sub8_Sub10_8548.anIntArray11724;
		Class501 class501 = null;
		class665.anInt8531 = 0;
		class665.aMap8523.clear();
		class665.aMap8523.put(Class465.aClass465_5313, Class671.aClass97_8584.aClass603_1162);
		class665.aMap8523.put(Class465.aClass465_5303, Class598.aClass144_Sub1_7852);
		class665.aMap8523.put(Class465.aClass465_5301, Class383_Sub1.aClass144_10279);
		if (null != class665.aClass346_8532)
			class665.aMap8523.put(Class465.aClass465_5308, Class187.method3659(class665.aClass346_8532, (byte) -102));
		if (class665.aClass640_Sub1_Sub2_Sub1_8522 instanceof Class640_Sub1_Sub2_Sub1_Sub1)
			class665.aMap8523.put(Class465.aClass465_5302, (class665.aClass640_Sub1_Sub2_Sub1_8522.anInterface19_11957));
		if (class665.aClass640_Sub1_Sub2_Sub1_8522 instanceof Class640_Sub1_Sub2_Sub1_Sub2)
			class665.aMap8536.put(Class465.aClass465_5313, (class665.aClass640_Sub1_Sub2_Sub1_8522.anInterface19_11957));
		if (Class703.aClass219_8825 != null)
			class665.aMap8523.put(Class465.aClass465_5309, Class703.aClass219_8825.method3994(1636000752));
		try {
			try {
				Class666.anInt8553 = 0;
				for (;;) {
					Class666.anInt8553 += -880165931;
					if (Class666.anInt8553 * 460563837 > i)
						throw new RuntimeException("");
					class501 = (class665.aClass501Array8521[(class665.anInt8527 += -1038991169) * 891367231]);
					if (Class666.aBool8557 && (Class666.aString8558 == null || (null != (class665.aClass527_Sub8_Sub10_8548.aString11722) && class665.aClass527_Sub8_Sub10_8548.aString11722.indexOf(Class666.aString8558) != -1)))
						System.out.println(new StringBuilder().append(class665.aClass527_Sub8_Sub10_8548.aString11722).append(": ").append(class501).toString());
					if (class665.anIntArray8545[891367231 * class665.anInt8527] == 1)
						class665.aBool8549 = true;
					else
						class665.aBool8549 = false;
					if (Class501.aClass501_5903 == class501 && 0 == class665.anInt8531 * -305384391) {
						Class619.method10213(1944569516);
						break;
					}
					Class531.method8920(class501, class665, 1838965151);
				}
			} catch (Exception exception) {
				Class24_Sub2.method17352(class665, class501, exception, "S", -1737378690);
				Class619.method10213(2050612140);
			}
		} catch (Exception object) {
			Class619.method10213(2055453450);
			throw object;
		}
	}
}
