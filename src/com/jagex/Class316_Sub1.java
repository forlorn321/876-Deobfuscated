/* Class316_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class316_Sub1 extends Class316 {
	Class261 aClass261_10036;
	static short aShort10037;
	Class265 aClass265_10038;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10039;
	public static int anInt10040;

	public Class316_Sub1(Class180_Sub2 class180_sub2) throws Exception_Sub5 {
		super(class180_sub2);
		method15718(861150009);
	}

	boolean method15718(int i) throws Exception_Sub5 {
		aClass261_10036 = aClass180_Sub2_3526.method14894("BatchedSprite");
		aClass527_Sub18_Sub1_10039 = aClass261_10036.method4881("SpriteSampler", -1803846915);
		aClass265_10038 = aClass261_10036.method4805("Normal", -1733553076);
		aClass261_10036.method4810(aClass265_10038);
		return true;
	}

	boolean method15719() throws Exception_Sub5 {
		aClass261_10036 = aClass180_Sub2_3526.method14894("BatchedSprite");
		aClass527_Sub18_Sub1_10039 = aClass261_10036.method4881("SpriteSampler", -1803846915);
		aClass265_10038 = aClass261_10036.method4805("Normal", -1733553076);
		aClass261_10036.method4810(aClass265_10038);
		return true;
	}

	public void method5677() {
		aClass261_10036.method4875();
		aClass261_10036.method4807(aClass527_Sub18_Sub1_10039, 0, anInterface38_3525, -1676286456);
	}

	public void method5676() {
		aClass261_10036.method4875();
		aClass261_10036.method4807(aClass527_Sub18_Sub1_10039, 0, anInterface38_3525, -1666980182);
	}

	boolean method15720() throws Exception_Sub5 {
		aClass261_10036 = aClass180_Sub2_3526.method14894("BatchedSprite");
		aClass527_Sub18_Sub1_10039 = aClass261_10036.method4881("SpriteSampler", -1803846915);
		aClass265_10038 = aClass261_10036.method4805("Normal", -1733553076);
		aClass261_10036.method4810(aClass265_10038);
		return true;
	}

	static final void method15721(boolean bool, int i) {
		Class628.method10415(client.anInt11237 * -2119864417, Class289.anInt3223 * -1803844265, Class611.anInt8009 * -471480167, bool, (byte) 11);
	}

	static final void method15722(int i, int i_0_, int i_1_) {
		if (Class189.method3666(i, null, -374584257))
			Class227.method4309((Class183.aClass240Array2100[i].aClass243Array2392), i_0_, (byte) -96);
	}

	public static final void method15723(boolean bool, int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4440, client.aClass109_11067.aClass2_1367, (byte) -34);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		for (Class527_Sub41 class527_sub41 = (Class527_Sub41) client.aClass14_11276.method713((byte) 60); null != class527_sub41; class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method717(342602515))) {
			if (!class527_sub41.method8736(-2126519674)) {
				class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method713((byte) 122));
				if (null == class527_sub41)
					break;
			}
			if (1842780707 * class527_sub41.anInt10753 == 0)
				Class231.method4326(class527_sub41, true, bool, 750825831);
		}
		if (null != client.aClass243_11196) {
			Class430.method6876(client.aClass243_11196, (byte) 81);
			client.aClass243_11196 = null;
		}
	}
}
