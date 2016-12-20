/* Class313_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.ArrayList;

import com.RS3Applet;

public class Class313_Sub1 extends Class313 {
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_9998;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_9999;
	Class427 aClass427_10000 = new Class427();
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10001;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10002;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10003;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10004;
	Class265 aClass265_10005;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10006;
	Class265 aClass265_10007;
	Class265 aClass265_10008;
	Class261 aClass261_10009;
	public static int anInt10010;

	void method15654(boolean bool, boolean bool_0_) {
		aClass261_10009.method4807(aClass527_Sub18_Sub1_9999, 0, anInterface38_3498, -1467730417);
		aClass261_10009.method4824(aClass527_Sub18_Sub1_10001, aClass427_10000, -1974065914);
		aClass261_10009.method4821(aClass527_Sub18_Sub1_10002, aClass427_3501, 1908711447);
		aClass261_10009.method4820(aClass527_Sub18_Sub1_10006, anInt3499, (byte) 0);
		if (bool) {
			if (bool_0_)
				aClass261_10009.method4817(aClass527_Sub18_Sub1_10003, aClass441_3502.aFloat4913, aClass441_3502.aFloat4911, aClass441_3502.aFloat4912, aClass441_3502.aFloat4910, 25096982);
			else
				aClass261_10009.method4814(aClass527_Sub18_Sub1_9998, Math.min(Math.max(aFloat3504, 0.0F), 1.0F), -695836231);
			aClass261_10009.method4869(aClass527_Sub18_Sub1_10004, aClass442_3503.aFloat4918, aClass442_3503.aFloat4915, aClass442_3503.aFloat4919, -1284020209);
		}
	}

	boolean method15655(int i) throws Exception_Sub5 {
		aClass261_10009 = aClass180_Sub2_3500.method14894("Particle");
		aClass527_Sub18_Sub1_10001 = aClass261_10009.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_9999 = aClass261_10009.method4881("DiffuseSampler", -1803846915);
		aClass527_Sub18_Sub1_10002 = aClass261_10009.method4881("TexCoordMatrix", -1803846915);
		aClass527_Sub18_Sub1_10003 = aClass261_10009.method4881("DistanceFogPlane", -1803846915);
		aClass527_Sub18_Sub1_10004 = aClass261_10009.method4881("DistanceFogColour", -1803846915);
		aClass527_Sub18_Sub1_9998 = aClass261_10009.method4881("DistanceFogAmount", -1803846915);
		aClass527_Sub18_Sub1_10006 = aClass261_10009.method4881("DiffuseColour", -1803846915);
		aClass265_10005 = aClass261_10009.method4805("NoFog", -1733553076);
		aClass265_10008 = aClass261_10009.method4805("ParticleFog", -1733553076);
		aClass265_10007 = aClass261_10009.method4805("BillboardFog", -1733553076);
		if (!aClass265_10005.method4988())
			return false;
		if (!aClass265_10008.method4988())
			return false;
		if (!aClass265_10007.method4988())
			return false;
		return true;
	}

	boolean method15656() throws Exception_Sub5 {
		aClass261_10009 = aClass180_Sub2_3500.method14894("Particle");
		aClass527_Sub18_Sub1_10001 = aClass261_10009.method4881("WVPMatrix", -1803846915);
		aClass527_Sub18_Sub1_9999 = aClass261_10009.method4881("DiffuseSampler", -1803846915);
		aClass527_Sub18_Sub1_10002 = aClass261_10009.method4881("TexCoordMatrix", -1803846915);
		aClass527_Sub18_Sub1_10003 = aClass261_10009.method4881("DistanceFogPlane", -1803846915);
		aClass527_Sub18_Sub1_10004 = aClass261_10009.method4881("DistanceFogColour", -1803846915);
		aClass527_Sub18_Sub1_9998 = aClass261_10009.method4881("DistanceFogAmount", -1803846915);
		aClass527_Sub18_Sub1_10006 = aClass261_10009.method4881("DiffuseColour", -1803846915);
		aClass265_10005 = aClass261_10009.method4805("NoFog", -1733553076);
		aClass265_10008 = aClass261_10009.method4805("ParticleFog", -1733553076);
		aClass265_10007 = aClass261_10009.method4805("BillboardFog", -1733553076);
		if (!aClass265_10005.method4988())
			return false;
		if (!aClass265_10008.method4988())
			return false;
		if (!aClass265_10007.method4988())
			return false;
		return true;
	}

	public void method5655(int i, boolean bool) {
		aClass261_10009.method4810(bool ? aClass265_10008 : aClass265_10005);
		aClass261_10009.method4875();
		method15657(bool, true, 883398632);
		aClass180_Sub2_3500.method15010(Class364.aClass364_3861, 0, i * 4, 0, i * 2);
	}

	public Class313_Sub1(Class180_Sub2 class180_sub2) throws Exception_Sub5 {
		super(class180_sub2);
		method15655(-1863105120);
	}

	void method15657(boolean bool, boolean bool_1_, int i) {
		aClass261_10009.method4807(aClass527_Sub18_Sub1_9999, 0, anInterface38_3498, -2053124520);
		aClass261_10009.method4824(aClass527_Sub18_Sub1_10001, aClass427_10000, -1974065914);
		aClass261_10009.method4821(aClass527_Sub18_Sub1_10002, aClass427_3501, 1908711447);
		aClass261_10009.method4820(aClass527_Sub18_Sub1_10006, anInt3499, (byte) 0);
		if (bool) {
			if (bool_1_)
				aClass261_10009.method4817(aClass527_Sub18_Sub1_10003, aClass441_3502.aFloat4913, aClass441_3502.aFloat4911, aClass441_3502.aFloat4912, aClass441_3502.aFloat4910, 1415791012);
			else
				aClass261_10009.method4814(aClass527_Sub18_Sub1_9998, Math.min(Math.max(aFloat3504, 0.0F), 1.0F), -1994257985);
			aClass261_10009.method4869(aClass527_Sub18_Sub1_10004, aClass442_3503.aFloat4918, aClass442_3503.aFloat4915, aClass442_3503.aFloat4919, -953551670);
		}
	}

	public void method5657(Class427 class427) {
		aClass427_10000.method6750(class427);
		aClass427_10000.method6751(aClass180_Sub2_3500.aClass427_9474);
	}

	public void method5653(int i, boolean bool) {
		aClass261_10009.method4810(bool ? aClass265_10008 : aClass265_10005);
		aClass261_10009.method4875();
		method15657(bool, true, 1940049938);
		aClass180_Sub2_3500.method15010(Class364.aClass364_3861, 0, i * 4, 0, i * 2);
	}

	public void method5658(boolean bool) {
		aClass261_10009.method4810(bool ? aClass265_10007 : aClass265_10005);
		aClass261_10009.method4875();
		method15657(bool, false, 969142824);
		aClass180_Sub2_3500.method14944();
	}

	public void method5656(boolean bool) {
		aClass261_10009.method4810(bool ? aClass265_10007 : aClass265_10005);
		aClass261_10009.method4875();
		method15657(bool, false, 332412861);
		aClass180_Sub2_3500.method14944();
	}

	public void method5654(Class427 class427) {
		aClass427_10000.method6750(class427);
		aClass427_10000.method6751(aClass180_Sub2_3500.aClass427_9474);
	}

	static final void method15658(byte i) {
		if (Class208_Sub23.method15642(-1927019389 * client.anInt11048, -1566355899) || Class640_Sub1_Sub3_Sub2.method18677(-1927019389 * client.anInt11048, 1495946201))
			Class149.method2493(false, (byte) -107);
		else {
			Class494.aClass563_5549 = client.aClass109_11067.method1967(2138297945);
			client.aClass109_11067.method1959(379476342);
			Class78.method1560(17, (byte) 0);
		}
	}

	public static void method15660(byte i) {
		Class275.method5143((byte) -109);
	}

	static final void method15661(Class665 class665, int i) {
		int i_485_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_485_, 356529334).method4085(-902973984);
	}
}
