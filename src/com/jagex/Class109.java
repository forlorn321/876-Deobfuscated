/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class109 {
	static final short aShort1330 = 1006;
	static final short aShort1331 = 3;
	static final short aShort1332 = 19;
	static final short aShort1333 = 5;
	static final short aShort1334 = 6;
	static final short aShort1335 = 8;
	static final short aShort1336 = 9;
	static final short aShort1337 = 10;
	static final short aShort1338 = 45;
	static final short aShort1339 = 13;
	static final short aShort1340 = 20;
	static final short aShort1341 = 15;
	static final short aShort1342 = 16;
	static final short aShort1343 = 17;
	static final short aShort1344 = 18;
	static final short aShort1345 = 59;
	static final short aShort1346 = 1003;
	static final short aShort1347 = 21;
	static final short aShort1348 = 22;
	static final short aShort1349 = 23;
	static final short aShort1350 = 25;
	static final short aShort1351 = 30;
	static final short aShort1352 = 53;
	static final short aShort1353 = 2;
	static final short aShort1354 = 46;
	static final short aShort1355 = 47;
	static final short aShort1356 = 48;
	static final short aShort1357 = 1012;
	static final short aShort1358 = 50;
	static final short aShort1359 = 51;
	static final short aShort1360 = 52;
	static final short aShort1361 = 49;
	static final short aShort1362 = 1004;
	static final short aShort1363 = 58;
	static final short aShort1364 = 57;
	static final short aShort1365 = 60;
	static final short aShort1366 = 1001;
	static final short aShort1367 = 1002;
	static final short aShort1368 = 4;
	static final short aShort1369 = 44;
	static final short aShort1370 = 11;
	static final short aShort1371 = 1007;
	static final short aShort1372 = 1008;
	static final short aShort1373 = 1009;
	static final short aShort1374 = 1010;
	static final short aShort1375 = 1011;
	static final short aShort1376 = 12;

	Class109() throws Throwable {
		throw new Error();
	}

	public static Class609[] method1448(byte i) {
		return (new Class609[] { Class609.aClass609_7911, Class609.aClass609_7912, Class609.aClass609_7913 });
	}

	public static Class394 method1449(RSByteBuffer class536_sub33, int i) {
		Class395 class395 = (Class333_Sub3.method9230(1822744981)[class536_sub33.readUnsignedByte()]);
		Class399 class399 = (Class266.method3692(878827744)[class536_sub33.readUnsignedByte()]);
		int i_0_ = class536_sub33.readShort();
		int i_1_ = class536_sub33.readShort();
		int i_2_ = class536_sub33.readBigSmart();
		int i_3_ = class536_sub33.readInt();
		int i_4_ = class536_sub33.readUnsignedByte();
		return new Class394(class395, class399, i_0_, i_1_, i_2_, i_3_, i_4_);
	}

	public static void method1450(Class67_Sub1 class67_sub1, byte i) {
		Class467.method5689(class67_sub1, -1710040755);
	}

	static void method1451(int i, byte i_5_) {
		int i_6_;
		if (i == 0)
			i_6_ = 0;
		else if (i == 1)
			i_6_ = 1;
		else if (2 == i)
			i_6_ = 2;
		else
			return;
		int i_7_;
		if ((double) Class542_Sub1.aFloat7232 == 2.0)
			i_7_ = 0;
		else if ((double) Class542_Sub1.aFloat7232 == 3.0)
			i_7_ = 1;
		else if ((double) Class542_Sub1.aFloat7232 == 4.0)
			i_7_ = 2;
		else if ((double) Class542_Sub1.aFloat7232 == 6.0)
			i_7_ = 3;
		else if ((double) Class542_Sub1.aFloat7232 >= 8.0)
			i_7_ = 4;
		else
			return;
		Class34_Sub19.aClass184_10977 = Class542_Sub1.aClass184ArrayArray10712[i_6_][i_7_];
		Class618.aClass2_8091 = Class542_Sub1.aClass2ArrayArray10723[i_6_][i_7_];
	}
}
