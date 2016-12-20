/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class569 implements Interface65 {
	int anInt7616;
	int anInt7617;
	int[] anIntArray7618;

	static Class569 method9571(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_0_ = class527_sub38.readUnsignedByte();
		int i_1_ = class527_sub38.readUnsignedByte();
		int[] is = new int[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
			is[i_2_] = class527_sub38.readUnsignedByte();
		return new Class569(i, i_0_, is);
	}

	public boolean method420(Class527_Sub34 class527_sub34, Interface64[] interface64s, int i, Class554 class554, byte i_3_) {
		if (class527_sub34 == null) {
			if (anInt7616 * 2052056529 != -1)
				return false;
		} else {
			if (anInt7616 * 2052056529 != class527_sub34.method16355(1029210433))
				return false;
			if (anInt7617 * 1049178491 > class527_sub34.method16358(-378755809))
				return false;
			int[] is = anIntArray7618;
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				int i_5_ = is[i_4_];
				if (!class554.method9199(i_5_, 1593748650))
					return false;
			}
		}
		return true;
	}

	static Class569 method9572(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_6_ = class527_sub38.readUnsignedByte();
		int i_7_ = class527_sub38.readUnsignedByte();
		int[] is = new int[i_7_];
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
			is[i_8_] = class527_sub38.readUnsignedByte();
		return new Class569(i, i_6_, is);
	}

	static Class569 method9573(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_9_ = class527_sub38.readUnsignedByte();
		int i_10_ = class527_sub38.readUnsignedByte();
		int[] is = new int[i_10_];
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
			is[i_11_] = class527_sub38.readUnsignedByte();
		return new Class569(i, i_9_, is);
	}

	static Class569 method9574(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_12_ = class527_sub38.readUnsignedByte();
		int i_13_ = class527_sub38.readUnsignedByte();
		int[] is = new int[i_13_];
		for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
			is[i_14_] = class527_sub38.readUnsignedByte();
		return new Class569(i, i_12_, is);
	}

	public boolean method419(Class527_Sub34 class527_sub34, Interface64[] interface64s, int i, Class554 class554) {
		if (class527_sub34 == null) {
			if (anInt7616 * 2052056529 != -1)
				return false;
		} else {
			if (anInt7616 * 2052056529 != class527_sub34.method16355(1029210433))
				return false;
			if (anInt7617 * 1049178491 > class527_sub34.method16358(-252692497))
				return false;
			int[] is = anIntArray7618;
			for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
				int i_16_ = is[i_15_];
				if (!class554.method9199(i_16_, 1247830639))
					return false;
			}
		}
		return true;
	}

	Class569(int i, int i_17_, int[] is) {
		anInt7616 = -480341199 * i;
		anInt7617 = -505346637 * i_17_;
		anIntArray7618 = is;
	}

	static final void method9575(Class665 class665, byte i) throws Exception_Sub7 {
		Class333 class333 = (Class333) (class665.aClass527_Sub8_Sub10_8548.anObjectArray11725[891367231 * class665.anInt8527]);
		Interface19 interface19 = ((Interface19) (0 == class665.anIntArray8545[class665.anInt8527 * 891367231] ? class665.aMap8523.get(class333.aClass160_3626.aClass465_1745) : class665.aMap8536.get(class333.aClass160_3626.aClass465_1745)));
		try {
			interface19.method109(class333, class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], 65280);
		} catch (Exception_Sub7 exception_sub7) {
			if (interface19 instanceof Class603)
				Class24_Sub2.method17352(class665, Class501.aClass501_5924, exception_sub7, "VO", 995760993);
			else
				throw exception_sub7;
		}
	}

	static final void method9576(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class461.method7599(class243, class240, class665, -1897206919);
	}

	static final void method9577(Class665 class665, int i) {
		long l = Class234.method4347(-1408626088);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (l / 60000L);
	}

	static void method9578(int i) {
		if (Class503.aFileOutputStream6884 != null) {
			try {
				Class503.aFileOutputStream6884.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class503.aFileOutputStream6884 = null;
	}
}
