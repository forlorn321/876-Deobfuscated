/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class426 {
	public float[] aFloatArray4806 = new float[9];

	void method6732() {
		aFloatArray4806[0] = 1.0F;
		aFloatArray4806[1] = 0.0F;
		aFloatArray4806[2] = 0.0F;
		aFloatArray4806[3] = 0.0F;
		aFloatArray4806[4] = 1.0F;
		aFloatArray4806[5] = 0.0F;
		aFloatArray4806[6] = 0.0F;
		aFloatArray4806[7] = 0.0F;
		aFloatArray4806[8] = 1.0F;
	}

	public Class438 method6733() {
		Class438 class438 = new Class438();
		double d = (double) (1.0F + aFloatArray4806[0] + aFloatArray4806[4] + aFloatArray4806[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class438.aFloat4883 = (aFloatArray4806[7] - aFloatArray4806[5]) / f;
			class438.aFloat4886 = (aFloatArray4806[2] - aFloatArray4806[6]) / f;
			class438.aFloat4887 = (aFloatArray4806[3] - aFloatArray4806[1]) / f;
			class438.aFloat4889 = 0.25F * f;
		} else if (aFloatArray4806[0] > aFloatArray4806[4] && aFloatArray4806[0] > aFloatArray4806[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4806[0] - aFloatArray4806[4] - aFloatArray4806[8])) * 2.0);
			class438.aFloat4883 = 0.25F * f;
			class438.aFloat4886 = (aFloatArray4806[3] + aFloatArray4806[1]) / f;
			class438.aFloat4887 = (aFloatArray4806[2] + aFloatArray4806[6]) / f;
			class438.aFloat4889 = (aFloatArray4806[7] - aFloatArray4806[5]) / f;
		} else if (aFloatArray4806[4] > aFloatArray4806[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4806[4] - aFloatArray4806[0] - aFloatArray4806[8])) * 2.0);
			class438.aFloat4883 = (aFloatArray4806[3] + aFloatArray4806[1]) / f;
			class438.aFloat4886 = 0.25F * f;
			class438.aFloat4887 = (aFloatArray4806[7] + aFloatArray4806[5]) / f;
			class438.aFloat4889 = (aFloatArray4806[2] - aFloatArray4806[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4806[8] - aFloatArray4806[0] - aFloatArray4806[4])) * 2.0);
			class438.aFloat4883 = (aFloatArray4806[2] + aFloatArray4806[6]) / f;
			class438.aFloat4886 = (aFloatArray4806[7] + aFloatArray4806[5]) / f;
			class438.aFloat4887 = 0.25F * f;
			class438.aFloat4889 = (aFloatArray4806[3] - aFloatArray4806[1]) / f;
		}
		return class438;
	}

	public Class426() {
		method6732();
	}

	public Class438 method6734() {
		Class438 class438 = new Class438();
		double d = (double) (1.0F + aFloatArray4806[0] + aFloatArray4806[4] + aFloatArray4806[8]);
		if (d > 1.0E-8) {
			float f = (float) (Math.sqrt(d) * 2.0);
			class438.aFloat4883 = (aFloatArray4806[7] - aFloatArray4806[5]) / f;
			class438.aFloat4886 = (aFloatArray4806[2] - aFloatArray4806[6]) / f;
			class438.aFloat4887 = (aFloatArray4806[3] - aFloatArray4806[1]) / f;
			class438.aFloat4889 = 0.25F * f;
		} else if (aFloatArray4806[0] > aFloatArray4806[4] && aFloatArray4806[0] > aFloatArray4806[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4806[0] - aFloatArray4806[4] - aFloatArray4806[8])) * 2.0);
			class438.aFloat4883 = 0.25F * f;
			class438.aFloat4886 = (aFloatArray4806[3] + aFloatArray4806[1]) / f;
			class438.aFloat4887 = (aFloatArray4806[2] + aFloatArray4806[6]) / f;
			class438.aFloat4889 = (aFloatArray4806[7] - aFloatArray4806[5]) / f;
		} else if (aFloatArray4806[4] > aFloatArray4806[8]) {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4806[4] - aFloatArray4806[0] - aFloatArray4806[8])) * 2.0);
			class438.aFloat4883 = (aFloatArray4806[3] + aFloatArray4806[1]) / f;
			class438.aFloat4886 = 0.25F * f;
			class438.aFloat4887 = (aFloatArray4806[7] + aFloatArray4806[5]) / f;
			class438.aFloat4889 = (aFloatArray4806[2] - aFloatArray4806[6]) / f;
		} else {
			float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4806[8] - aFloatArray4806[0] - aFloatArray4806[4])) * 2.0);
			class438.aFloat4883 = (aFloatArray4806[2] + aFloatArray4806[6]) / f;
			class438.aFloat4886 = (aFloatArray4806[7] + aFloatArray4806[5]) / f;
			class438.aFloat4887 = 0.25F * f;
			class438.aFloat4889 = (aFloatArray4806[3] - aFloatArray4806[1]) / f;
		}
		return class438;
	}
}
