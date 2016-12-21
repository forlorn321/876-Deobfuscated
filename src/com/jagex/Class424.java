/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class424 {
	public float[] aFloatArray4792 = new float[9];

	void method5076() {
		aFloatArray4792[0] = 1.0F;
		aFloatArray4792[1] = 0.0F;
		aFloatArray4792[2] = 0.0F;
		aFloatArray4792[3] = 0.0F;
		aFloatArray4792[4] = 1.0F;
		aFloatArray4792[5] = 0.0F;
		aFloatArray4792[6] = 0.0F;
		aFloatArray4792[7] = 0.0F;
		aFloatArray4792[8] = 1.0F;
	}

	public Class424() {
		method5078();
	}

	public Class425 method5077() {
		Class425 class425 = new Class425();
		double d = (double) (1.0F + aFloatArray4792[0] + aFloatArray4792[4] + aFloatArray4792[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class425.aFloat4796 = (aFloatArray4792[7] - aFloatArray4792[5]) / f;
			class425.aFloat4793 = (aFloatArray4792[2] - aFloatArray4792[6]) / f;
			class425.aFloat4798 = (aFloatArray4792[3] - aFloatArray4792[1]) / f;
			class425.aFloat4799 = 0.25F * f;
		} else if (aFloatArray4792[0] > aFloatArray4792[4] && aFloatArray4792[0] > aFloatArray4792[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4792[0] - aFloatArray4792[4] - aFloatArray4792[8])) * 2.0);
			class425.aFloat4796 = 0.25F * f;
			class425.aFloat4793 = (aFloatArray4792[3] + aFloatArray4792[1]) / f;
			class425.aFloat4798 = (aFloatArray4792[2] + aFloatArray4792[6]) / f;
			class425.aFloat4799 = (aFloatArray4792[7] - aFloatArray4792[5]) / f;
		} else if (aFloatArray4792[4] > aFloatArray4792[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4792[4] - aFloatArray4792[0] - aFloatArray4792[8])) * 2.0);
			class425.aFloat4796 = (aFloatArray4792[3] + aFloatArray4792[1]) / f;
			class425.aFloat4793 = 0.25F * f;
			class425.aFloat4798 = (aFloatArray4792[7] + aFloatArray4792[5]) / f;
			class425.aFloat4799 = (aFloatArray4792[2] - aFloatArray4792[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4792[8] - aFloatArray4792[0] - aFloatArray4792[4])) * 2.0);
			class425.aFloat4796 = (aFloatArray4792[2] + aFloatArray4792[6]) / f;
			class425.aFloat4793 = (aFloatArray4792[7] + aFloatArray4792[5]) / f;
			class425.aFloat4798 = 0.25F * f;
			class425.aFloat4799 = (aFloatArray4792[3] - aFloatArray4792[1]) / f;
		}
		return class425;
	}

	void method5078() {
		aFloatArray4792[0] = 1.0F;
		aFloatArray4792[1] = 0.0F;
		aFloatArray4792[2] = 0.0F;
		aFloatArray4792[3] = 0.0F;
		aFloatArray4792[4] = 1.0F;
		aFloatArray4792[5] = 0.0F;
		aFloatArray4792[6] = 0.0F;
		aFloatArray4792[7] = 0.0F;
		aFloatArray4792[8] = 1.0F;
	}

	void method5079() {
		aFloatArray4792[0] = 1.0F;
		aFloatArray4792[1] = 0.0F;
		aFloatArray4792[2] = 0.0F;
		aFloatArray4792[3] = 0.0F;
		aFloatArray4792[4] = 1.0F;
		aFloatArray4792[5] = 0.0F;
		aFloatArray4792[6] = 0.0F;
		aFloatArray4792[7] = 0.0F;
		aFloatArray4792[8] = 1.0F;
	}
}
