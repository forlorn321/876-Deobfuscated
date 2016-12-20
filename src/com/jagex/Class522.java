/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class522 {
	public Class522 aClass522_7088;
	public Class522 aClass522_7089;

	public void method8681() {
		if (null != aClass522_7089) {
			aClass522_7089.aClass522_7088 = aClass522_7088;
			aClass522_7088.aClass522_7089 = aClass522_7089;
			aClass522_7088 = null;
			aClass522_7089 = null;
		}
	}

	public void method8682(int i) {
		if (null != aClass522_7089) {
			aClass522_7089.aClass522_7088 = aClass522_7088;
			aClass522_7088.aClass522_7089 = aClass522_7089;
			aClass522_7088 = null;
			aClass522_7089 = null;
		}
	}

	static final void method8683(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (Class66.method1470(i_0_, 1620175916) / 60000L);
	}

	static final void method8684(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		if (-1 != -437471887 * class243.anInt2572)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class243.anInt2589 * -1109781355;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
