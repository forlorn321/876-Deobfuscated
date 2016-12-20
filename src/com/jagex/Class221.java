/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class221 {
	List aList2306;
	static final int anInt2307 = 8;
	static Integer anInteger2308 = Integer.valueOf(-1);
	public int anInt2309;
	List aList2310;
	static final int anInt2311 = 40;
	List aList2312;
	List aList2313;

	public void method4072(int i, int i_0_) {
		aList2310.remove(i);
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method4073(int i, int i_1_) {
		return ((Integer) aList2306.get(i)).intValue();
	}

	public int method4074(int i) {
		return aList2306.size();
	}

	public int method4075(int i, byte i_2_) {
		return aList2306.indexOf(Integer.valueOf(i));
	}

	public void method4076(int i, boolean bool, int i_3_) {
		aList2312.set(i, bool ? Integer.valueOf(i) : anInteger2308);
	}

	public int method4077(int i, byte i_4_) {
		return aList2310.indexOf(Integer.valueOf(i));
	}

	public void method4078(int i, int i_5_) {
		aList2312.set(i, Integer.valueOf(i_5_));
	}

	public int method4079(int i, byte i_6_) {
		return method4083(i, -1, (byte) 20);
	}

	void method4080(int i, int i_7_, byte i_8_) {
		aList2306.add(i_7_, aList2306.remove(i));
		aList2312.add(i_7_, aList2312.remove(i));
		aList2313.add(i_7_, aList2313.remove(i));
	}

	public void method4081(int i, int i_9_, byte i_10_) {
		aList2312.set(i, Integer.valueOf(i_9_));
	}

	public boolean method4082(int i, byte i_11_) {
		return !((Integer) aList2312.get(i)).equals(anInteger2308);
	}

	public int method4083(int i, int i_12_, byte i_13_) {
		if (aList2310.size() == 8)
			throw new RuntimeException("");
		if (method4077(i, (byte) -13) != -1)
			throw new RuntimeException("");
		if (-1 == i_12_)
			i_12_ = aList2310.size();
		aList2310.add(i_12_, Integer.valueOf(i));
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_12_, null);
		}
		return i_12_;
	}

	void method4084(int i, int i_14_) {
		aList2306.add(i_14_, aList2306.remove(i));
		aList2312.add(i_14_, aList2312.remove(i));
		aList2313.add(i_14_, aList2313.remove(i));
	}

	public int method4085(int i) {
		return aList2310.size();
	}

	public void method4086(int i, int i_15_, int i_16_) {
		method4080(i, i_15_, (byte) -30);
		for (int i_17_ = 0; i_17_ < aList2312.size(); i_17_++) {
			Integer integer = (Integer) aList2312.get(i_17_);
			if (!integer.equals(anInteger2308)) {
				Integer integer_18_ = Integer.valueOf(i_17_);
				if (!integer.equals(integer_18_))
					aList2312.set(i_17_, integer_18_);
			}
		}
	}

	public void method4087(int i, int i_19_, Object object) {
		((List) aList2313.get(i)).set(i_19_, object);
	}

	public int method4088(int i, int i_20_, int i_21_) {
		if (aList2306.size() == 40)
			throw new RuntimeException("");
		if (method4075(i, (byte) 4) != -1)
			throw new RuntimeException("");
		if (i_20_ == -1)
			i_20_ = aList2306.size();
		method4101(i, i_20_, 620710563);
		for (int i_22_ = 1 + i_20_; i_22_ < aList2306.size(); i_22_++) {
			Integer integer = (Integer) aList2312.get(i_22_);
			if (!integer.equals(anInteger2308) && integer.intValue() < i_22_)
				method4080(i_22_, i_22_ - 1, (byte) -14);
		}
		return method4075(i, (byte) 4);
	}

	void method4089(int i, int i_23_) {
		aList2306.add(i_23_, Integer.valueOf(i));
		aList2312.add(i_23_, anInteger2308);
		ArrayList arraylist = new ArrayList();
		for (int i_24_ = 0; i_24_ < aList2310.size(); i_24_++)
			arraylist.add(null);
		aList2313.add(i_23_, arraylist);
	}

	public void method4090(int i, short i_25_) {
		method4091(i, -1602253861);
		int i_26_ = i;
		for (int i_27_ = i; i_27_ < aList2306.size(); i_27_++) {
			if (!method4082(i_27_, (byte) 68)) {
				if (i_27_ != i_26_)
					method4080(i_27_, i_26_, (byte) -73);
				i_26_ = i_27_ + 1;
			}
		}
	}

	void method4091(int i, int i_28_) {
		aList2306.remove(i);
		aList2312.remove(i);
		aList2313.remove(i);
	}

	public void method4092(int i, int i_29_, int i_30_) {
		aList2310.add(i_29_, aList2310.remove(i));
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_29_, list.remove(i));
		}
	}

	public void method4093(int i) {
		aList2310.remove(i);
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method4094(int i, byte i_31_) {
		return ((Integer) aList2310.get(i)).intValue();
	}

	public int method4095() {
		return aList2310.size();
	}

	public int method4096() {
		return aList2310.size();
	}

	public int method4097() {
		return aList2310.size();
	}

	public void method4098(int i, boolean bool) {
		aList2312.set(i, bool ? Integer.valueOf(i) : anInteger2308);
	}

	public int method4099() {
		return aList2306.size();
	}

	public int method4100(int i) {
		return aList2306.indexOf(Integer.valueOf(i));
	}

	void method4101(int i, int i_32_, int i_33_) {
		aList2306.add(i_32_, Integer.valueOf(i));
		aList2312.add(i_32_, anInteger2308);
		ArrayList arraylist = new ArrayList();
		for (int i_34_ = 0; i_34_ < aList2310.size(); i_34_++)
			arraylist.add(null);
		aList2313.add(i_32_, arraylist);
	}

	void method4102(int i, int i_35_) {
		aList2306.add(i_35_, Integer.valueOf(i));
		aList2312.add(i_35_, anInteger2308);
		ArrayList arraylist = new ArrayList();
		for (int i_36_ = 0; i_36_ < aList2310.size(); i_36_++)
			arraylist.add(null);
		aList2313.add(i_35_, arraylist);
	}

	public int method4103(int i) {
		return ((Integer) aList2306.get(i)).intValue();
	}

	public int method4104(int i) {
		return ((Integer) aList2306.get(i)).intValue();
	}

	public int method4105(int i) {
		return ((Integer) aList2306.get(i)).intValue();
	}

	public int method4106(int i) {
		return method4083(i, -1, (byte) 53);
	}

	public int method4107(int i) {
		return ((Integer) aList2310.get(i)).intValue();
	}

	public int method4108(int i) {
		return ((Integer) aList2310.get(i)).intValue();
	}

	public int method4109(int i) {
		return ((Integer) aList2310.get(i)).intValue();
	}

	void method4110(int i) {
		aList2306.remove(i);
		aList2312.remove(i);
		aList2313.remove(i);
	}

	public int method4111(int i) {
		return aList2306.indexOf(Integer.valueOf(i));
	}

	public int method4112(int i, int i_37_) {
		if (aList2306.size() == 40)
			throw new RuntimeException("");
		if (method4075(i, (byte) 4) != -1)
			throw new RuntimeException("");
		if (i_37_ == -1)
			i_37_ = aList2306.size();
		method4101(i, i_37_, -1456159421);
		for (int i_38_ = 1 + i_37_; i_38_ < aList2306.size(); i_38_++) {
			Integer integer = (Integer) aList2312.get(i_38_);
			if (!integer.equals(anInteger2308) && integer.intValue() < i_38_)
				method4080(i_38_, i_38_ - 1, (byte) -109);
		}
		return method4075(i, (byte) 4);
	}

	public int method4113(int i, int i_39_) {
		if (aList2310.size() == 8)
			throw new RuntimeException("");
		if (method4077(i, (byte) -91) != -1)
			throw new RuntimeException("");
		if (-1 == i_39_)
			i_39_ = aList2310.size();
		aList2310.add(i_39_, Integer.valueOf(i));
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_39_, null);
		}
		return i_39_;
	}

	public void method4114(int i, boolean bool) {
		aList2312.set(i, bool ? Integer.valueOf(i) : anInteger2308);
	}

	public void method4115(int i, int i_40_) {
		aList2312.set(i, Integer.valueOf(i_40_));
	}

	public int method4116(int i) {
		return aList2310.indexOf(Integer.valueOf(i));
	}

	public boolean method4117(int i) {
		return !((Integer) aList2312.get(i)).equals(anInteger2308);
	}

	public int method4118(int i) {
		return method4083(i, -1, (byte) 91);
	}

	public Object method4119(int i, int i_41_, int i_42_) {
		return ((List) aList2313.get(i)).get(i_41_);
	}

	public void method4120(int i) {
		aList2310.remove(i);
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public void method4121(int i) {
		aList2310.remove(i);
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public void method4122(int i) {
		aList2310.remove(i);
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	void method4123(int i, int i_43_) {
		aList2306.add(i_43_, aList2306.remove(i));
		aList2312.add(i_43_, aList2312.remove(i));
		aList2313.add(i_43_, aList2313.remove(i));
	}

	public void method4124(int i) {
		aList2310.remove(i);
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.remove(i);
		}
	}

	public int method4125(int i) {
		return method4088(i, -1, -973715644);
	}

	public int method4126(int i, int i_44_) {
		if (aList2310.size() == 8)
			throw new RuntimeException("");
		if (method4077(i, (byte) -86) != -1)
			throw new RuntimeException("");
		if (-1 == i_44_)
			i_44_ = aList2310.size();
		aList2310.add(i_44_, Integer.valueOf(i));
		Iterator iterator = aList2313.iterator();
		while (iterator.hasNext()) {
			List list = (List) iterator.next();
			list.add(i_44_, null);
		}
		return i_44_;
	}

	public void method4127(int i, int i_45_) {
		method4080(i, i_45_, (byte) -120);
		for (int i_46_ = 0; i_46_ < aList2312.size(); i_46_++) {
			Integer integer = (Integer) aList2312.get(i_46_);
			if (!integer.equals(anInteger2308)) {
				Integer integer_47_ = Integer.valueOf(i_46_);
				if (!integer.equals(integer_47_))
					aList2312.set(i_46_, integer_47_);
			}
		}
	}

	public int method4128(int i, int i_48_) {
		return method4088(i, -1, 1446879890);
	}

	public void method4129(int i, int i_49_) {
		method4080(i, i_49_, (byte) -61);
		for (int i_50_ = 0; i_50_ < aList2312.size(); i_50_++) {
			Integer integer = (Integer) aList2312.get(i_50_);
			if (!integer.equals(anInteger2308)) {
				Integer integer_51_ = Integer.valueOf(i_50_);
				if (!integer.equals(integer_51_))
					aList2312.set(i_50_, integer_51_);
			}
		}
	}

	public int method4130(int i) {
		return ((Integer) aList2310.get(i)).intValue();
	}

	public int method4131() {
		return aList2310.size();
	}

	public int method4132(int i) {
		return aList2306.indexOf(Integer.valueOf(i));
	}

	public void method4133(int i, int i_52_) {
		method4080(i, i_52_, (byte) -36);
		for (int i_53_ = 0; i_53_ < aList2312.size(); i_53_++) {
			Integer integer = (Integer) aList2312.get(i_53_);
			if (!integer.equals(anInteger2308)) {
				Integer integer_54_ = Integer.valueOf(i_53_);
				if (!integer.equals(integer_54_))
					aList2312.set(i_53_, integer_54_);
			}
		}
	}

	void method4134(int i, int i_55_) {
		aList2306.add(i_55_, Integer.valueOf(i));
		aList2312.add(i_55_, anInteger2308);
		ArrayList arraylist = new ArrayList();
		for (int i_56_ = 0; i_56_ < aList2310.size(); i_56_++)
			arraylist.add(null);
		aList2313.add(i_55_, arraylist);
	}

	public Class221(int i) {
		anInt2309 = i * -2018007427;
		aList2310 = new ArrayList();
		aList2306 = new ArrayList();
		aList2312 = new ArrayList();
		aList2313 = new ArrayList();
	}

	public void method4135(int i, int i_57_, Object object, int i_58_) {
		((List) aList2313.get(i)).set(i_57_, object);
	}

	public void method4136(int i) {
		method4091(i, -1602253861);
		int i_59_ = i;
		for (int i_60_ = i; i_60_ < aList2306.size(); i_60_++) {
			if (!method4082(i_60_, (byte) 26)) {
				if (i_60_ != i_59_)
					method4080(i_60_, i_59_, (byte) -65);
				i_59_ = i_60_ + 1;
			}
		}
	}

	public void method4137(int i) {
		method4091(i, -1602253861);
		int i_61_ = i;
		for (int i_62_ = i; i_62_ < aList2306.size(); i_62_++) {
			if (!method4082(i_62_, (byte) 55)) {
				if (i_62_ != i_61_)
					method4080(i_62_, i_61_, (byte) -86);
				i_61_ = i_62_ + 1;
			}
		}
	}

	public void method4138(int i) {
		method4091(i, -1602253861);
		int i_63_ = i;
		for (int i_64_ = i; i_64_ < aList2306.size(); i_64_++) {
			if (!method4082(i_64_, (byte) 19)) {
				if (i_64_ != i_63_)
					method4080(i_64_, i_63_, (byte) -31);
				i_63_ = i_64_ + 1;
			}
		}
	}

	void method4139(int i) {
		aList2306.remove(i);
		aList2312.remove(i);
		aList2313.remove(i);
	}

	public int method4140(int i) {
		return method4088(i, -1, 608189017);
	}

	public Object method4141(int i, int i_65_) {
		return ((List) aList2313.get(i)).get(i_65_);
	}

	public Object method4142(int i, int i_66_) {
		return ((List) aList2313.get(i)).get(i_66_);
	}

	public Object method4143(int i, int i_67_) {
		return ((List) aList2313.get(i)).get(i_67_);
	}

	public void method4144(int i, int i_68_, Object object) {
		((List) aList2313.get(i)).set(i_68_, object);
	}

	void method4145(int i, int i_69_) {
		aList2306.add(i_69_, aList2306.remove(i));
		aList2312.add(i_69_, aList2312.remove(i));
		aList2313.add(i_69_, aList2313.remove(i));
	}

	public void method4146(int i, int i_70_, Object object) {
		((List) aList2313.get(i)).set(i_70_, object);
	}

	public static int method4147(byte[] is, int i, CharSequence charsequence, byte i_71_) {
		int i_72_ = charsequence.length();
		int i_73_ = i;
		for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
			int i_75_ = charsequence.charAt(i_74_);
			if (i_75_ <= 127)
				is[i_73_++] = (byte) i_75_;
			else if (i_75_ <= 2047) {
				is[i_73_++] = (byte) (0xc0 | i_75_ >> 6);
				is[i_73_++] = (byte) (0x80 | i_75_ & 0x3f);
			} else {
				is[i_73_++] = (byte) (0xe0 | i_75_ >> 12);
				is[i_73_++] = (byte) (0x80 | i_75_ >> 6 & 0x3f);
				is[i_73_++] = (byte) (0x80 | i_75_ & 0x3f);
			}
		}
		return i_73_ - i;
	}

	static final void method4148(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
	}

	static final void method4149(Class665 class665, int i) {
		int i_76_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_76_, 1180826809);
		Class240 class240 = Class183.aClass240Array2100[i_76_ >> 16];
		Class249.method4659(class243, class240, false, 1, class665, (byte) 22);
	}

	static final void method4150(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_77_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_78_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (i_78_ == -1)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class708.aClass463_8847.method7621(i_77_, 1148696561).method18482((char) i_78_, 583827088);
	}
}
