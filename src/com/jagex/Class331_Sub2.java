/* Class331_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class331_Sub2 extends Class331 {
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10036;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10037;
	Class443 aClass443_10038 = new Class443();
	Class286 aClass286_10039;
	Class285 aClass285_10040;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10041;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10042;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10043;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10044;
	Class285 aClass285_10045;
	Class285 aClass285_10046;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10047;
	public static Class621 aClass621_10048;
	public static Class549 aClass549_10049;

	void method9181(boolean bool, boolean bool_0_) {
		aClass286_10039.method3896(aClass536_Sub8_Sub1_10047, 0, anInterface36_3606, -948976061);
		aClass286_10039.method3860(aClass536_Sub8_Sub1_10037, aClass443_10038, (byte) 85);
		aClass286_10039.method3874(aClass536_Sub8_Sub1_10036, aClass443_3605, -975392909);
		aClass286_10039.method3891(aClass536_Sub8_Sub1_10044, anInt3608, -1615697296);
		if (bool) {
			if (bool_0_)
				aClass286_10039.method3856(aClass536_Sub8_Sub1_10041, aClass427_3609.aFloat4813, aClass427_3609.aFloat4811, aClass427_3609.aFloat4814, aClass427_3609.aFloat4812, 538718616);
			else
				aClass286_10039.method3902(aClass536_Sub8_Sub1_10043, Math.min(Math.max(aFloat3611, 0.0F), 1.0F), -217376106);
			aClass286_10039.method3882(aClass536_Sub8_Sub1_10042, aClass436_3610.aFloat4850, aClass436_3610.aFloat4852, aClass436_3610.aFloat4853, -1358706529);
		}
	}

	boolean method9182(short i) throws Exception_Sub7 {
		aClass286_10039 = aClass167_Sub3_3607.method8714("Particle");
		aClass536_Sub8_Sub1_10037 = aClass286_10039.method3866("WVPMatrix", (byte) 0);
		aClass536_Sub8_Sub1_10047 = aClass286_10039.method3866("DiffuseSampler", (byte) 0);
		aClass536_Sub8_Sub1_10036 = aClass286_10039.method3866("TexCoordMatrix", (byte) 0);
		aClass536_Sub8_Sub1_10041 = aClass286_10039.method3866("DistanceFogPlane", (byte) 0);
		aClass536_Sub8_Sub1_10042 = aClass286_10039.method3866("DistanceFogColour", (byte) 0);
		aClass536_Sub8_Sub1_10043 = aClass286_10039.method3866("DistanceFogAmount", (byte) 0);
		aClass536_Sub8_Sub1_10044 = aClass286_10039.method3866("DiffuseColour", (byte) 0);
		aClass285_10045 = aClass286_10039.method3855("NoFog", (byte) -55);
		aClass285_10040 = aClass286_10039.method3855("ParticleFog", (byte) -9);
		aClass285_10046 = aClass286_10039.method3855("BillboardFog", (byte) 38);
		if (!aClass285_10045.method3785())
			return false;
		if (!aClass285_10040.method3785())
			return false;
		if (!aClass285_10046.method3785())
			return false;
		return true;
	}

	public void method4324(Class443 class443) {
		aClass443_10038.method5339(class443);
		aClass443_10038.method5390(aClass167_Sub3_3607.aClass443_9585);
	}

	public void method4323(int i, boolean bool) {
		aClass286_10039.method3850(bool ? aClass285_10040 : aClass285_10045);
		aClass286_10039.method3843();
		method9183(bool, true, (byte) 51);
		aClass167_Sub3_3607.method8817(Class377.aClass377_3917, 0, i * 4, 0, i * 2);
	}

	public void method4321(boolean bool) {
		aClass286_10039.method3850(bool ? aClass285_10046 : aClass285_10045);
		aClass286_10039.method3843();
		method9183(bool, false, (byte) 121);
		aClass167_Sub3_3607.method8813();
	}

	void method9183(boolean bool, boolean bool_1_, byte i) {
		aClass286_10039.method3896(aClass536_Sub8_Sub1_10047, 0, anInterface36_3606, -948976061);
		aClass286_10039.method3860(aClass536_Sub8_Sub1_10037, aClass443_10038, (byte) 109);
		aClass286_10039.method3874(aClass536_Sub8_Sub1_10036, aClass443_3605, -1703687349);
		aClass286_10039.method3891(aClass536_Sub8_Sub1_10044, anInt3608, -1615697296);
		if (bool) {
			if (bool_1_)
				aClass286_10039.method3856(aClass536_Sub8_Sub1_10041, aClass427_3609.aFloat4813, aClass427_3609.aFloat4811, aClass427_3609.aFloat4814, aClass427_3609.aFloat4812, 538718616);
			else
				aClass286_10039.method3902(aClass536_Sub8_Sub1_10043, Math.min(Math.max(aFloat3611, 0.0F), 1.0F), 1805789095);
			aClass286_10039.method3882(aClass536_Sub8_Sub1_10042, aClass436_3610.aFloat4850, aClass436_3610.aFloat4852, aClass436_3610.aFloat4853, -1627244910);
		}
	}

	public Class331_Sub2(Class167_Sub3 class167_sub3) throws Exception_Sub7 {
		super(class167_sub3);
		method9182((short) 15890);
	}

	public void method4326(int i, boolean bool) {
		aClass286_10039.method3850(bool ? aClass285_10040 : aClass285_10045);
		aClass286_10039.method3843();
		method9183(bool, true, (byte) 23);
		aClass167_Sub3_3607.method8817(Class377.aClass377_3917, 0, i * 4, 0, i * 2);
	}

	public void method4327(boolean bool) {
		aClass286_10039.method3850(bool ? aClass285_10046 : aClass285_10045);
		aClass286_10039.method3843();
		method9183(bool, false, (byte) 94);
		aClass167_Sub3_3607.method8813();
	}

	public void method4322(boolean bool) {
		aClass286_10039.method3850(bool ? aClass285_10046 : aClass285_10045);
		aClass286_10039.method3843();
		method9183(bool, false, (byte) 66);
		aClass167_Sub3_3607.method8813();
	}

	public void method4325(Class443 class443) {
		aClass443_10038.method5339(class443);
		aClass443_10038.method5390(aClass167_Sub3_3607.aClass443_9585);
	}

	boolean method9184() throws Exception_Sub7 {
		aClass286_10039 = aClass167_Sub3_3607.method8714("Particle");
		aClass536_Sub8_Sub1_10037 = aClass286_10039.method3866("WVPMatrix", (byte) 0);
		aClass536_Sub8_Sub1_10047 = aClass286_10039.method3866("DiffuseSampler", (byte) 0);
		aClass536_Sub8_Sub1_10036 = aClass286_10039.method3866("TexCoordMatrix", (byte) 0);
		aClass536_Sub8_Sub1_10041 = aClass286_10039.method3866("DistanceFogPlane", (byte) 0);
		aClass536_Sub8_Sub1_10042 = aClass286_10039.method3866("DistanceFogColour", (byte) 0);
		aClass536_Sub8_Sub1_10043 = aClass286_10039.method3866("DistanceFogAmount", (byte) 0);
		aClass536_Sub8_Sub1_10044 = aClass286_10039.method3866("DiffuseColour", (byte) 0);
		aClass285_10045 = aClass286_10039.method3855("NoFog", (byte) -5);
		aClass285_10040 = aClass286_10039.method3855("ParticleFog", (byte) 11);
		aClass285_10046 = aClass286_10039.method3855("BillboardFog", (byte) -5);
		if (!aClass285_10045.method3785())
			return false;
		if (!aClass285_10040.method3785())
			return false;
		if (!aClass285_10046.method3785())
			return false;
		return true;
	}

	public void method4328(boolean bool) {
		aClass286_10039.method3850(bool ? aClass285_10046 : aClass285_10045);
		aClass286_10039.method3843();
		method9183(bool, false, (byte) 88);
		aClass167_Sub3_3607.method8813();
	}
}
