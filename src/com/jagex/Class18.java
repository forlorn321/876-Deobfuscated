/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class18 implements Interface3 {
	Interface53 anInterface53_199;
	Map aMap200;

	public void method14(int i, int i_0_, int i_1_) {
		if (null == aMap200) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, Integer.valueOf(i_0_)));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 == null)
				aMap200.put(Integer.valueOf(i), new Class425(i, Integer.valueOf(i_0_)));
			else
				class425.anObject4804 = Integer.valueOf(i_0_);
		}
	}

	public int method21(int i, byte i_2_) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null != class425)
				return ((Integer) class425.anObject4804).intValue();
		}
		return ((Integer) anInterface53_199.method354(i, -987221023)).intValue();
	}

	public void method39(int i) {
		if (aMap200 != null)
			aMap200.remove(Integer.valueOf(i));
	}

	public long method22(int i) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 != null)
				return ((Long) class425.anObject4804).longValue();
		}
		return ((Long) anInterface53_199.method354(i, -641865037)).longValue();
	}

	public void method35(int i, long l) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, Long.valueOf(l)));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 == null)
				aMap200.put(Integer.valueOf(i), new Class425(i, Long.valueOf(l)));
			else
				class425.anObject4804 = Long.valueOf(l);
		}
	}

	public Object method31(int i, int i_3_) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null != class425)
				return class425.anObject4804;
		}
		return anInterface53_199.method354(i, 155033982);
	}

	public void method18(int i, Object object, int i_4_) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, object));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null == class425)
				aMap200.put(Integer.valueOf(i), new Class425(i, object));
			else
				class425.anObject4804 = object;
		}
	}

	public void method19(byte i) {
		if (null != aMap200)
			aMap200.clear();
	}

	public void method16(int i, int i_5_) {
		if (aMap200 != null)
			aMap200.remove(Integer.valueOf(i));
	}

	public void method17(int i, Object object) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, object));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null == class425)
				aMap200.put(Integer.valueOf(i), new Class425(i, object));
			else
				class425.anObject4804 = object;
		}
	}

	public Iterator method744() {
		if (aMap200 == null)
			return Collections.emptyList().iterator();
		return aMap200.values().iterator();
	}

	public long method30(int i) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 != null)
				return ((Long) class425.anObject4804).longValue();
		}
		return ((Long) anInterface53_199.method354(i, 388161052)).longValue();
	}

	public long method15(int i, byte i_6_) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 != null)
				return ((Long) class425.anObject4804).longValue();
		}
		return ((Long) anInterface53_199.method354(i, -1298196026)).longValue();
	}

	public long method23(int i) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 != null)
				return ((Long) class425.anObject4804).longValue();
		}
		return ((Long) anInterface53_199.method354(i, -1408220821)).longValue();
	}

	public long method24(int i) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 != null)
				return ((Long) class425.anObject4804).longValue();
		}
		return ((Long) anInterface53_199.method354(i, -180123843)).longValue();
	}

	public Class18(Interface53 interface53) {
		anInterface53_199 = interface53;
	}

	public void method27(int i, long l) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, Long.valueOf(l)));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 == null)
				aMap200.put(Integer.valueOf(i), new Class425(i, Long.valueOf(l)));
			else
				class425.anObject4804 = Long.valueOf(l);
		}
	}

	public void method20(int i, long l) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, Long.valueOf(l)));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 == null)
				aMap200.put(Integer.valueOf(i), new Class425(i, Long.valueOf(l)));
			else
				class425.anObject4804 = Long.valueOf(l);
		}
	}

	public Object method37(int i) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null != class425)
				return class425.anObject4804;
		}
		return anInterface53_199.method354(i, -1539589425);
	}

	public void method29(int i, Object object) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, object));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null == class425)
				aMap200.put(Integer.valueOf(i), new Class425(i, object));
			else
				class425.anObject4804 = object;
		}
	}

	public void method25(int i, Object object) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, object));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null == class425)
				aMap200.put(Integer.valueOf(i), new Class425(i, object));
			else
				class425.anObject4804 = object;
		}
	}

	public void method28(int i, Object object) {
		if (aMap200 == null) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, object));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null == class425)
				aMap200.put(Integer.valueOf(i), new Class425(i, object));
			else
				class425.anObject4804 = object;
		}
	}

	public void method38(int i, int i_7_) {
		if (null == aMap200) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, Integer.valueOf(i_7_)));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 == null)
				aMap200.put(Integer.valueOf(i), new Class425(i, Integer.valueOf(i_7_)));
			else
				class425.anObject4804 = Integer.valueOf(i_7_);
		}
	}

	public void method33() {
		if (null != aMap200)
			aMap200.clear();
	}

	public void method34() {
		if (null != aMap200)
			aMap200.clear();
	}

	public Iterator iterator() {
		if (aMap200 == null)
			return Collections.emptyList().iterator();
		return aMap200.values().iterator();
	}

	public void method36(int i) {
		if (aMap200 != null)
			aMap200.remove(Integer.valueOf(i));
	}

	public int method26(int i) {
		if (aMap200 != null) {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (null != class425)
				return ((Integer) class425.anObject4804).intValue();
		}
		return ((Integer) anInterface53_199.method354(i, 585526259)).intValue();
	}

	public void method32() {
		if (null != aMap200)
			aMap200.clear();
	}

	public void method13(int i, int i_8_) {
		if (null == aMap200) {
			aMap200 = new HashMap();
			aMap200.put(Integer.valueOf(i), new Class425(i, Integer.valueOf(i_8_)));
		} else {
			Class425 class425 = (Class425) aMap200.get(Integer.valueOf(i));
			if (class425 == null)
				aMap200.put(Integer.valueOf(i), new Class425(i, Integer.valueOf(i_8_)));
			else
				class425.anObject4804 = Integer.valueOf(i_8_);
		}
	}

	static final void method745(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17265((byte) -50);
	}

	static final void method746(Class665 class665, int i) {
		Class527_Sub36 class527_sub36 = ((Class527_Sub36) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class527_sub36.anInt10671 * -1748166157;
	}

	static final void method747(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class329.method5811(class243, class240, class665, -964046224);
	}
}
