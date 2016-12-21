/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class380 {
	public static Class380 aClass380_3928;
	public static Class380 aClass380_3929 = new Class380(8);
	public static Class380 aClass380_3930;
	public static Class380 aClass380_3931 = new Class380(16);
	static Class380 aClass380_3932;
	public int anInt3933;

	static {
		aClass380_3928 = new Class380(8);
		aClass380_3930 = new Class380(16);
		aClass380_3932 = new Class380(32);
	}

	Class380(int i) {
		anInt3933 = i * 1940935389;
	}

	static Class420[] method4805(int i) {
		return (new Class420[] { Class420.aClass420_4577, Class420.aClass420_4584, Class420.aClass420_4581, Class420.aClass420_4574, Class420.aClass420_4583, Class420.aClass420_4579, Class420.aClass420_4572, Class420.aClass420_4576, Class420.aClass420_4578, Class420.aClass420_4582, Class420.aClass420_4580, Class420.aClass420_4573 });
	}

	static final void method4806(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4513, client.aClass106_11322.aClass15_1258, 1086604485);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(string.length() + 1, 465637339);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string, -1892786441);
		client.aClass106_11322.method1409(class536_sub23, 1945228138);
	}

	static final void method4807(Class668 class668, byte i) {
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub35_10788), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		Class27.method763(1984566907);
		client.aBool11015 = false;
	}

	public static void method4808(boolean bool, byte[] is, byte i) {
		if (Class683.aClass536_Sub33_8652 == null)
			Class683.aClass536_Sub33_8652 = new RSByteBuffer(20000);
		Class683.aClass536_Sub33_8652.method9696(is, 0, is.length, (byte) 80);
		if (bool) {
			Class40.method870(Class683.aClass536_Sub33_8652.buffer, 1564818358);
			Class23.aClass603_Sub1Array226 = new Class603_Sub1[Class593.anInt7807 * -537974539];
			int i_0_ = 0;
			for (int i_1_ = -805119937 * Class220.anInt2310; i_1_ <= 870600939 * Class593.anInt7808; i_1_++) {
				Class603_Sub1 class603_sub1 = Class324.method4269(i_1_, 540233729);
				if (class603_sub1 != null)
					Class23.aClass603_Sub1Array226[i_0_++] = class603_sub1;
			}
			Class23.aBool224 = false;
			Class23.aLong225 = Class249.method3450(1615509552) * -1285747780723244827L;
			Class683.aClass536_Sub33_8652 = null;
		}
	}

	public static void method4809(String string, boolean bool, boolean bool_2_, int i) {
		Class420.method5063(string, bool, "openjs", bool_2_, (byte) 113);
	}
}
