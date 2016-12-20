/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class452 {
	static final int anInt4940 = 5;
	static final int anInt4941 = 500;
	public volatile int anInt4942;
	static final int anInt4943 = 102400;
	static final int anInt4944 = 500;
	static final int anInt4945 = 5;
	RSByteBuffer aClass527_Sub38_4946;
	Class693 aClass693_4947;
	Class693 aClass693_4948;
	public volatile int anInt4949;
	Class527_Sub8_Sub13_Sub3 aClass527_Sub8_Sub13_Sub3_4950;
	long aLong4951;
	RSByteBuffer aClass527_Sub38_4952;
	byte aByte4953;
	Class693 aClass693_4954;
	static final int anInt4955 = 4;
	public volatile int anInt4956;
	public volatile int anInt4957;
	RSByteBuffer aClass527_Sub38_4958;
	int anInt4959;
	Class693 aClass693_4960 = new Class693();
	int anInt4961;
	static Class147 aClass147_4962;
	public static int anInt4963;
	public static int anInt4964;

	int method7296(int i) {
		return (aClass693_4948.method14064(258753010) + aClass693_4954.method14064(-1121260134));
	}

	Class527_Sub8_Sub13_Sub3 method7297(int i, int i_0_, byte i_1_, boolean bool, int i_2_) {
		long l = (long) i_0_ + ((long) i << 32);
		Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = new Class527_Sub8_Sub13_Sub3();
		class527_sub8_sub13_sub3.aLong10401 = l * 1718300610056979369L;
		class527_sub8_sub13_sub3.aByte12118 = i_1_;
		class527_sub8_sub13_sub3.aBool11767 = bool;
		if (bool) {
			if (method7301(783672856) >= 500)
				throw new RuntimeException();
			aClass693_4960.method14055(class527_sub8_sub13_sub3, 1187610160);
		} else {
			if (method7296(583463581) >= 500)
				throw new RuntimeException();
			aClass693_4948.method14055(class527_sub8_sub13_sub3, 1052461943);
		}
		return class527_sub8_sub13_sub3;
	}

	public abstract void method7298();

	public boolean method7299(byte i) {
		return method7301(2092619851) >= 500;
	}

	public abstract void method7300(Object object, boolean bool);

	public int method7301(int i) {
		return (aClass693_4960.method14064(-770082839) + aClass693_4947.method14064(-912627863));
	}

	abstract void method7302(int i, int i_3_, int i_4_);

	public abstract boolean method7303(int i);

	public abstract void method7304(Object object, boolean bool, int i);

	public abstract void method7305(boolean bool, int i);

	public abstract void method7306(int i);

	public abstract void method7307(int i);

	public abstract boolean method7308();

	Class527_Sub8_Sub13_Sub3 method7309(int i, int i_5_, byte i_6_, boolean bool) {
		long l = (long) i_5_ + ((long) i << 32);
		Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = new Class527_Sub8_Sub13_Sub3();
		class527_sub8_sub13_sub3.aLong10401 = l * 1718300610056979369L;
		class527_sub8_sub13_sub3.aByte12118 = i_6_;
		class527_sub8_sub13_sub3.aBool11767 = bool;
		if (bool) {
			if (method7301(849643749) >= 500)
				throw new RuntimeException();
			aClass693_4960.method14055(class527_sub8_sub13_sub3, 1386297254);
		} else {
			if (method7296(583463581) >= 500)
				throw new RuntimeException();
			aClass693_4948.method14055(class527_sub8_sub13_sub3, 1096733082);
		}
		return class527_sub8_sub13_sub3;
	}

	public boolean method7310() {
		return method7296(583463581) >= 500;
	}

	public boolean method7311() {
		return method7296(583463581) >= 500;
	}

	Class452() {
		aClass693_4947 = new Class693();
		aClass693_4948 = new Class693();
		aClass693_4954 = new Class693();
		aClass527_Sub38_4952 = new RSByteBuffer(6);
		aByte4953 = (byte) 0;
		anInt4949 = 0;
		anInt4942 = 0;
		anInt4956 = 1393292253;
		anInt4957 = -1193760277;
		aClass527_Sub38_4958 = new RSByteBuffer(5);
		aClass527_Sub38_4946 = new RSByteBuffer(5);
		anInt4961 = 0;
		aClass527_Sub8_Sub13_Sub3_4950 = null;
	}

	public boolean method7312() {
		return method7301(742466983) >= 500;
	}

	public boolean method7313() {
		return method7301(-718757491) >= 500;
	}

	public boolean method7314() {
		return method7301(-1325718479) >= 500;
	}

	public int method7315() {
		return (aClass693_4960.method14064(-350223445) + aClass693_4947.method14064(355659780));
	}

	public int method7316() {
		return (aClass693_4960.method14064(874716532) + aClass693_4947.method14064(311815180));
	}

	abstract void method7317(int i, int i_7_);

	public abstract void method7318(boolean bool);

	public abstract void method7319();

	public abstract void method7320(Object object, boolean bool);

	public abstract void method7321(Object object, boolean bool);

	public abstract void method7322(boolean bool);

	public boolean method7323(int i) {
		return method7296(583463581) >= 500;
	}

	public abstract void method7324();

	public int method7325() {
		return (aClass693_4960.method14064(-1122028600) + aClass693_4947.method14064(1318747459));
	}

	public abstract void method7326();

	public abstract void method7327();

	public abstract void method7328();

	public abstract void method7329(int i);

	public abstract void method7330();

	static final void method7331(Class665 class665, byte i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		boolean bool = true;
		if (i_8_ < 0)
			bool = 0 == (i_8_ + 1) % 4;
		else if (i_8_ < 1582)
			bool = i_8_ % 4 == 0;
		else if (i_8_ % 4 != 0)
			bool = false;
		else if (0 != i_8_ % 100)
			bool = true;
		else if (0 != i_8_ % 400)
			bool = false;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = bool ? 1 : 0;
	}

	public static void method7332(int i, int i_9_, String string, String string_10_, String string_11_, String string_12_, String string_13_, int i_14_, Class406 class406, int i_15_) {
		Class271 class271 = (Class271) Class264.aMap2869.get(Integer.valueOf(i));
		if (class271 == null) {
			class271 = new Class271();
			Class264.aMap2869.put(Integer.valueOf(i), class271);
		}
		Class527_Sub8_Sub11 class527_sub8_sub11 = class271.method5065(i, i_9_, string, string_10_, string_11_, string_12_, string_13_, i_14_, class406, -1202965396);
		Class264.aClass14_2870.method714(class527_sub8_sub11, (long) (class527_sub8_sub11.anInt11752 * 867529685));
		Class264.aClass693_2871.method14055(class527_sub8_sub11, 1239069441);
		client.anInt11236 = 953068673 * client.anInt11221;
	}
}
