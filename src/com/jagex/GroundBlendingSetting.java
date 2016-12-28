/* Class710_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class GroundBlendingSetting extends ClientSetting {
	public static final int anInt10897 = 0;
	public static final int anInt10898 = 1;

	public int method10171(int i) {
		return anInt8842 * -789865385;
	}

	public GroundBlendingSetting(int i, ClientSettings class536_sub40) {
		super(i, class536_sub40);
	}

	int method8352() {
		return 1;
	}

	int method8347(byte i) {
		return 1;
	}

	public boolean method10172(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -126) == GameMode.aClass670_8568)
			return true;
		return false;
	}

	public int method8348(int i, int i_0_) {
		if (aClass536_Sub40_8841.method9865((byte) -17) == GameMode.aClass670_8568) {
			if (i == 0) {
				if (aClass536_Sub40_8841.fogSetting.method10081(1436659191) == 1)
					return 2;
				if (aClass536_Sub40_8841.textureSetting.method9885(639909273) == 1)
					return 2;
				if (aClass536_Sub40_8841.waterDetailSetting.method9894(-1017210055) > 0)
					return 2;
			}
			return 1;
		}
		return 3;
	}

	void method8350(int i, int i_1_) {
		anInt8842 = -1100148889 * i;
	}

	public void method10173() {
		if (aClass536_Sub40_8841.method9865((byte) -64) != GameMode.aClass670_8568)
			anInt8842 = -1100148889;
		if (-789865385 * anInt8842 != 0 && 1 != -789865385 * anInt8842)
			anInt8842 = method8347((byte) -94) * -1100148889;
	}

	public int method8356(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -53) == GameMode.aClass670_8568) {
			if (i == 0) {
				if (aClass536_Sub40_8841.fogSetting.method10081(1436659191) == 1)
					return 2;
				if (aClass536_Sub40_8841.textureSetting.method9885(2004887483) == 1)
					return 2;
				if (aClass536_Sub40_8841.waterDetailSetting.method9894(-1017210055) > 0)
					return 2;
			}
			return 1;
		}
		return 3;
	}

	int method8351() {
		return 1;
	}

	public boolean method10174() {
		if (aClass536_Sub40_8841.method9865((byte) -5) == GameMode.aClass670_8568)
			return true;
		return false;
	}

	void method8346(int i) {
		anInt8842 = -1100148889 * i;
	}

	void method8354(int i) {
		anInt8842 = -1100148889 * i;
	}

	public int method8355(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -41) == GameMode.aClass670_8568) {
			if (i == 0) {
				if (aClass536_Sub40_8841.fogSetting.method10081(1436659191) == 1)
					return 2;
				if (aClass536_Sub40_8841.textureSetting.method9885(-376981204) == 1)
					return 2;
				if (aClass536_Sub40_8841.waterDetailSetting.method9894(-1017210055) > 0)
					return 2;
			}
			return 1;
		}
		return 3;
	}

	public int method10175() {
		return anInt8842 * -789865385;
	}

	public int method8357(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -12) == GameMode.aClass670_8568) {
			if (i == 0) {
				if (aClass536_Sub40_8841.fogSetting.method10081(1436659191) == 1)
					return 2;
				if (aClass536_Sub40_8841.textureSetting.method9885(-279206135) == 1)
					return 2;
				if (aClass536_Sub40_8841.waterDetailSetting.method9894(-1017210055) > 0)
					return 2;
			}
			return 1;
		}
		return 3;
	}

	public void method10176(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -84) != GameMode.aClass670_8568)
			anInt8842 = -1100148889;
		if (-789865385 * anInt8842 != 0 && 1 != -789865385 * anInt8842)
			anInt8842 = method8347((byte) 19) * -1100148889;
	}

	public GroundBlendingSetting(ClientSettings class536_sub40) {
		super(class536_sub40);
	}

	public void method10177() {
		if (aClass536_Sub40_8841.method9865((byte) -42) != GameMode.aClass670_8568)
			anInt8842 = -1100148889;
		if (-789865385 * anInt8842 != 0 && 1 != -789865385 * anInt8842)
			anInt8842 = method8347((byte) 87) * -1100148889;
	}

	int method8353() {
		return 1;
	}

	public int method10178() {
		return anInt8842 * -789865385;
	}

	public int method8358(int i) {
		if (aClass536_Sub40_8841.method9865((byte) -64) == GameMode.aClass670_8568) {
			if (i == 0) {
				if (aClass536_Sub40_8841.fogSetting.method10081(1436659191) == 1)
					return 2;
				if (aClass536_Sub40_8841.textureSetting.method9885(-993797776) == 1)
					return 2;
				if (aClass536_Sub40_8841.waterDetailSetting.method9894(-1017210055) > 0)
					return 2;
			}
			return 1;
		}
		return 3;
	}
}
