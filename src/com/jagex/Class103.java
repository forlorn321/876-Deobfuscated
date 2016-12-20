/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class103 {
	static final short aShort1238 = 5;
	static final short aShort1239 = 3;
	static final short aShort1240 = 23;
	static final short aShort1241 = 30;
	static final short aShort1242 = 6;
	static final short aShort1243 = 8;
	static final short aShort1244 = 9;
	static final short aShort1245 = 10;
	static final short aShort1246 = 11;
	static final short aShort1247 = 12;
	static final short aShort1248 = 52;
	static final short aShort1249 = 15;
	static final short aShort1250 = 16;
	static final short aShort1251 = 17;
	static final short aShort1252 = 18;
	static final short aShort1253 = 45;
	static final short aShort1254 = 20;
	static final short aShort1255 = 21;
	static final short aShort1256 = 22;
	static final short aShort1257 = 2;
	static final short aShort1258 = 25;
	static final short aShort1259 = 57;
	static final short aShort1260 = 44;
	static final short aShort1261 = 1011;
	static final short aShort1262 = 46;
	static final short aShort1263 = 47;
	static final short aShort1264 = 48;
	static final short aShort1265 = 1006;
	static final short aShort1266 = 50;
	static final short aShort1267 = 51;
	static final short aShort1268 = 4;
	static final short aShort1269 = 53;
	static final short aShort1270 = 49;
	static final short aShort1271 = 58;
	static final short aShort1272 = 59;
	static final short aShort1273 = 60;
	static final short aShort1274 = 1001;
	static final short aShort1275 = 13;
	static final short aShort1276 = 1003;
	static final short aShort1277 = 1004;
	static final short aShort1278 = 1002;
	static final short aShort1279 = 1007;
	static final short aShort1280 = 1008;
	static final short aShort1281 = 1009;
	static final short aShort1282 = 1010;
	static final short aShort1283 = 19;
	static final short aShort1284 = 1012;

	Class103() throws Throwable {
		throw new Error();
	}

	static final Object[] method1800(String string, Class665 class665, byte i) {
		Object[] objects = new Object[string.length() + 1];
		for (int i_0_ = objects.length - 1; i_0_ >= 1; i_0_--) {
			if (string.charAt(i_0_ - 1) == 's')
				objects[i_0_] = (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
			else if (string.charAt(i_0_ - 1) == 'l')
				objects[i_0_] = new Long(class665.aLongArray8529[((class665.anInt8530 -= 32636613) * -2076258291)]);
			else
				objects[i_0_] = new Integer(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]);
		}
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (-1 != i_1_)
			objects[0] = new Integer(i_1_);
		else
			objects = null;
		return objects;
	}

	static final void method1801(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		boolean bool = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1] == 1);
		if (!Class695_Sub1.method17367(i_2_, bool, 750792507))
			throw new RuntimeException();
	}

	public static boolean method1802(char c, byte i) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	static final void method1803(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_4_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0 != (i_3_ & 1 << i_4_) ? 1 : 0;
	}
}
