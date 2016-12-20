/* Class208_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub12_Sub1 extends Class208_Sub12 {
	int anInt11417;
	int anInt11418;
	int anInt11419;

	Class208_Sub12_Sub1(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		int i = class527_sub38.readInt();
		anInt11419 = (i >>> 16) * 187215401;
		anInt11418 = (i & 0xffff) * 81712067;
		anInt11417 = class527_sub38.readUnsignedByte() * -192523729;
	}

	public void method3848() {
		int i = 630993408 * anInt11419 + 256;
		int i_0_ = -1603676672 * anInt11418 + 256;
		int i_1_ = 435041487 * anInt11417;
		if (i_1_ < 3 && (client.aClass509_11072.method8359(331045701).method7706(anInt11419 * 1041419801, anInt11418 * -1831848725, (short) -3178)))
			i_1_++;
		Class640_Sub1_Sub2_Sub4 class640_sub1_sub2_sub4 = (new Class640_Sub1_Sub2_Sub4(client.aClass509_11072.method8314(-1103615661), anInt9927 * 1651021427, 0, anInt11417 * 435041487, i_1_, i, (Class590.method9853(i, i_0_, anInt11417 * 435041487, (byte) 5) - -333515721 * anInt9929), i_0_, anInt11419 * 1041419801, 1041419801 * anInt11419, -1831848725 * anInt11418, anInt11418 * -1831848725, 1601854329 * anInt9928, false, 0));
		client.aClass14_11184.method714(new Class527_Sub8_Sub6(class640_sub1_sub2_sub4), (long) (anInt11419 * 1041419801 << 16 | -1831848725 * anInt11418));
	}

	public void method3846(int i) {
		int i_2_ = 630993408 * anInt11419 + 256;
		int i_3_ = -1603676672 * anInt11418 + 256;
		int i_4_ = 435041487 * anInt11417;
		if (i_4_ < 3 && (client.aClass509_11072.method8359(1521950308).method7706(anInt11419 * 1041419801, anInt11418 * -1831848725, (short) -7051)))
			i_4_++;
		Class640_Sub1_Sub2_Sub4 class640_sub1_sub2_sub4 = (new Class640_Sub1_Sub2_Sub4(client.aClass509_11072.method8314(1744234087), anInt9927 * 1651021427, 0, anInt11417 * 435041487, i_4_, i_2_, Class590.method9853(i_2_, i_3_, anInt11417 * 435041487, (byte) 5) - -333515721 * anInt9929, i_3_, anInt11419 * 1041419801, 1041419801 * anInt11419, -1831848725 * anInt11418, anInt11418 * -1831848725, 1601854329 * anInt9928, false, 0));
		client.aClass14_11184.method714(new Class527_Sub8_Sub6(class640_sub1_sub2_sub4), (long) (anInt11419 * 1041419801 << 16 | -1831848725 * anInt11418));
	}

	public void method3851() {
		int i = 630993408 * anInt11419 + 256;
		int i_5_ = -1603676672 * anInt11418 + 256;
		int i_6_ = 435041487 * anInt11417;
		if (i_6_ < 3 && (client.aClass509_11072.method8359(467740911).method7706(anInt11419 * 1041419801, anInt11418 * -1831848725, (short) -5398)))
			i_6_++;
		Class640_Sub1_Sub2_Sub4 class640_sub1_sub2_sub4 = (new Class640_Sub1_Sub2_Sub4(client.aClass509_11072.method8314(-1232214712), anInt9927 * 1651021427, 0, anInt11417 * 435041487, i_6_, i, (Class590.method9853(i, i_5_, anInt11417 * 435041487, (byte) 5) - -333515721 * anInt9929), i_5_, anInt11419 * 1041419801, 1041419801 * anInt11419, -1831848725 * anInt11418, anInt11418 * -1831848725, 1601854329 * anInt9928, false, 0));
		client.aClass14_11184.method714(new Class527_Sub8_Sub6(class640_sub1_sub2_sub4), (long) (anInt11419 * 1041419801 << 16 | -1831848725 * anInt11418));
	}
}
