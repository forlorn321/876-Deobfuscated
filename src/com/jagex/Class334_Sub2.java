/* Class334_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class334_Sub2 extends Class334 {
	static final int anInt10053 = 3;
	static final int anInt10054 = 0;
	static final int anInt10055 = 1;
	static final int anInt10056 = 1;
	static final int anInt10057 = 2;
	Class441 aClass441_10058;
	static final int anInt10059 = 5;
	static final int anInt10060 = 6;
	static final int anInt10061 = 7;
	static final int anInt10062 = 2;
	Class261 aClass261_10063;
	static final int anInt10064 = 0;
	static final int anInt10065 = 3;
	Class265[] aClass265Array10066 = new Class265[3];
	int[][] anIntArrayArray10067 = new int[3][7];
	int[] anIntArray10068;
	static final int anInt10069 = 4;
	Class441 aClass441_10070;
	static int anInt10071;

	public void method5854() {
		aClass261_10063.method4810(aClass265Array10066[0]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -36)];
		method15757((short) -18397);
	}

	boolean method15755(int i) throws Exception_Sub5 {
		aClass261_10063 = aClass180_Sub2_3632.method14894("Sprite");
		Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_10063.method4881("WVPMatrix", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_0_ = aClass261_10063.method4881("SpriteSampler", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_1_ = aClass261_10063.method4881("MaskSampler", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_2_ = aClass261_10063.method4881("MulColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_3_ = aClass261_10063.method4881("AddColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_4_ = aClass261_10063.method4881("SpriteTexCoordMatrix", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_5_ = aClass261_10063.method4881("MaskTexCoordMatrix", -1803846915);
		aClass265Array10066[0] = aClass261_10063.method4805("Normal", -1733553076);
		aClass265Array10066[1] = aClass261_10063.method4805("Masked", -1733553076);
		aClass265Array10066[2] = aClass261_10063.method4805("AlphaTex", -1733553076);
		for (int i_6_ = 0; i_6_ < 3; i_6_++) {
			int i_7_ = aClass261_10063.method4808(aClass265Array10066[i_6_], (byte) 53);
			anIntArrayArray10067[i_6_][0] = class527_sub18_sub1.method18146(i_7_);
			anIntArrayArray10067[i_6_][1] = class527_sub18_sub1_0_.method18146(i_7_);
			anIntArrayArray10067[i_6_][2] = class527_sub18_sub1_1_.method18146(i_7_);
			anIntArrayArray10067[i_6_][5] = class527_sub18_sub1_2_.method18146(i_7_);
			anIntArrayArray10067[i_6_][6] = class527_sub18_sub1_3_.method18146(i_7_);
			anIntArrayArray10067[i_6_][3] = class527_sub18_sub1_4_.method18146(i_7_);
			anIntArrayArray10067[i_6_][4] = class527_sub18_sub1_5_.method18146(i_7_);
		}
		aClass261_10063.method4810(aClass265Array10066[0]);
		return true;
	}

	public void method5851(int i, int i_8_) {
		switch (i) {
		case 3:
			aClass441_10058.method7132(0xffffff | i_8_ & ~0xffffff);
			aClass441_10070.method7132(i_8_ & 0xffffff);
			break;
		case 1:
			aClass441_10058.method7132(-1);
			aClass441_10070.method7132(0);
			break;
		case 2:
			aClass441_10058.method7132(i_8_);
			aClass441_10070.method7132(0);
			break;
		case 4:
			aClass441_10058.method7132(-1);
			aClass441_10070.method7132(i_8_);
			aClass441_10070.method7122();
			break;
		case 0:
			aClass441_10058.method7132(i_8_);
			aClass441_10070.method7132(0);
			break;
		}
	}

	void method15756() {
		aClass261_10063.method4831(anIntArray10068[1], 0, anInterface38_3630, (byte) 2);
		aClass180_Sub2_3632.method14940(aClass427_3633);
		aClass261_10063.method4830(anIntArray10068[0], aClass427_3633, -345045236);
		aClass261_10063.method4829(anIntArray10068[3], aClass427_3631, -1728992553);
		aClass261_10063.method4825(anIntArray10068[5], aClass441_10058.aFloat4913, aClass441_10058.aFloat4911, aClass441_10058.aFloat4912, aClass441_10058.aFloat4910, (short) 255);
		aClass261_10063.method4825(anIntArray10068[6], aClass441_10070.aFloat4913, aClass441_10070.aFloat4911, aClass441_10070.aFloat4912, aClass441_10070.aFloat4910, (short) 255);
		aClass180_Sub2_3632.method14988(0, anInterface37_3636);
		aClass180_Sub2_3632.method15149(aClass355_3634);
		aClass180_Sub2_3632.method15008(Class364.aClass364_3862, anInt3637, 2);
	}

	public Class334_Sub2(Class180_Sub2 class180_sub2) throws Exception_Sub5 {
		super(class180_sub2);
		aClass441_10058 = new Class441(1.0F, 1.0F, 1.0F, 1.0F);
		aClass441_10070 = new Class441(0.0F, 0.0F, 0.0F, 0.0F);
		method15755(-69483284);
	}

	void method15757(short i) {
		aClass261_10063.method4831(anIntArray10068[1], 0, anInterface38_3630, (byte) 2);
		aClass180_Sub2_3632.method14940(aClass427_3633);
		aClass261_10063.method4830(anIntArray10068[0], aClass427_3633, 1476273174);
		aClass261_10063.method4829(anIntArray10068[3], aClass427_3631, -1333419165);
		aClass261_10063.method4825(anIntArray10068[5], aClass441_10058.aFloat4913, aClass441_10058.aFloat4911, aClass441_10058.aFloat4912, aClass441_10058.aFloat4910, (short) 255);
		aClass261_10063.method4825(anIntArray10068[6], aClass441_10070.aFloat4913, aClass441_10070.aFloat4911, aClass441_10070.aFloat4912, aClass441_10070.aFloat4910, (short) 255);
		aClass180_Sub2_3632.method14988(0, anInterface37_3636);
		aClass180_Sub2_3632.method15149(aClass355_3634);
		aClass180_Sub2_3632.method15008(Class364.aClass364_3862, anInt3637, 2);
	}

	public void method5852() {
		aClass261_10063.method4810(aClass265Array10066[1]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -113)];
		aClass261_10063.method4831(anIntArray10068[2], 1, anInterface38_3638, (byte) 2);
		aClass261_10063.method4829(anIntArray10068[4], aClass427_3635, -1391844215);
		method15757((short) -21366);
	}

	public void method5850() {
		aClass261_10063.method4810(aClass265Array10066[0]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -67)];
		method15757((short) -18439);
	}

	public void method5855() {
		aClass261_10063.method4810(aClass265Array10066[1]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -43)];
		aClass261_10063.method4831(anIntArray10068[2], 1, anInterface38_3638, (byte) 2);
		aClass261_10063.method4829(anIntArray10068[4], aClass427_3635, -256430600);
		method15757((short) -20774);
	}

	public void method5856() {
		aClass261_10063.method4810(aClass265Array10066[0]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -62)];
		method15757((short) -18628);
	}

	public void method5857() {
		aClass261_10063.method4810(aClass265Array10066[1]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -40)];
		aClass261_10063.method4831(anIntArray10068[2], 1, anInterface38_3638, (byte) 2);
		aClass261_10063.method4829(anIntArray10068[4], aClass427_3635, -924293765);
		method15757((short) 7781);
	}

	public void method5858(int i, int i_9_) {
		switch (i) {
		case 3:
			aClass441_10058.method7132(0xffffff | i_9_ & ~0xffffff);
			aClass441_10070.method7132(i_9_ & 0xffffff);
			break;
		case 1:
			aClass441_10058.method7132(-1);
			aClass441_10070.method7132(0);
			break;
		case 2:
			aClass441_10058.method7132(i_9_);
			aClass441_10070.method7132(0);
			break;
		case 4:
			aClass441_10058.method7132(-1);
			aClass441_10070.method7132(i_9_);
			aClass441_10070.method7122();
			break;
		case 0:
			aClass441_10058.method7132(i_9_);
			aClass441_10070.method7132(0);
			break;
		}
	}

	public void method5859(int i, int i_10_) {
		switch (i) {
		case 3:
			aClass441_10058.method7132(0xffffff | i_10_ & ~0xffffff);
			aClass441_10070.method7132(i_10_ & 0xffffff);
			break;
		case 1:
			aClass441_10058.method7132(-1);
			aClass441_10070.method7132(0);
			break;
		case 2:
			aClass441_10058.method7132(i_10_);
			aClass441_10070.method7132(0);
			break;
		case 4:
			aClass441_10058.method7132(-1);
			aClass441_10070.method7132(i_10_);
			aClass441_10070.method7122();
			break;
		case 0:
			aClass441_10058.method7132(i_10_);
			aClass441_10070.method7132(0);
			break;
		}
	}

	boolean method15758() throws Exception_Sub5 {
		aClass261_10063 = aClass180_Sub2_3632.method14894("Sprite");
		Class527_Sub18_Sub1 class527_sub18_sub1 = aClass261_10063.method4881("WVPMatrix", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_11_ = aClass261_10063.method4881("SpriteSampler", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_12_ = aClass261_10063.method4881("MaskSampler", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_13_ = aClass261_10063.method4881("MulColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_14_ = aClass261_10063.method4881("AddColour", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_15_ = aClass261_10063.method4881("SpriteTexCoordMatrix", -1803846915);
		Class527_Sub18_Sub1 class527_sub18_sub1_16_ = aClass261_10063.method4881("MaskTexCoordMatrix", -1803846915);
		aClass265Array10066[0] = aClass261_10063.method4805("Normal", -1733553076);
		aClass265Array10066[1] = aClass261_10063.method4805("Masked", -1733553076);
		aClass265Array10066[2] = aClass261_10063.method4805("AlphaTex", -1733553076);
		for (int i = 0; i < 3; i++) {
			int i_17_ = aClass261_10063.method4808(aClass265Array10066[i], (byte) 4);
			anIntArrayArray10067[i][0] = class527_sub18_sub1.method18146(i_17_);
			anIntArrayArray10067[i][1] = class527_sub18_sub1_11_.method18146(i_17_);
			anIntArrayArray10067[i][2] = class527_sub18_sub1_12_.method18146(i_17_);
			anIntArrayArray10067[i][5] = class527_sub18_sub1_13_.method18146(i_17_);
			anIntArrayArray10067[i][6] = class527_sub18_sub1_14_.method18146(i_17_);
			anIntArrayArray10067[i][3] = class527_sub18_sub1_15_.method18146(i_17_);
			anIntArrayArray10067[i][4] = class527_sub18_sub1_16_.method18146(i_17_);
		}
		aClass261_10063.method4810(aClass265Array10066[0]);
		return true;
	}

	public void method5853() {
		aClass261_10063.method4810(aClass265Array10066[1]);
		aClass261_10063.method4875();
		anIntArray10068 = anIntArrayArray10067[aClass261_10063.method4925((byte) -126)];
		aClass261_10063.method4831(anIntArray10068[2], 1, anInterface38_3638, (byte) 2);
		aClass261_10063.method4829(anIntArray10068[4], aClass427_3635, -1205314341);
		method15757((short) -26365);
	}
}
