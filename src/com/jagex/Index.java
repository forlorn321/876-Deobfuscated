/* Class459_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.zip.CRC32;

public class Index extends Class459 {
	int anInt10128;
	Class460 aClass460_10129;
	long aLong10130;
	Class466 aClass466_10131;
	Class547 aClass547_10132;
	int anInt10133 = 0;
	MainFile index255;
	int anInt10135;
	byte[] aByteArray10136;
	byte[] aByteArray10137;
	Class4 aClass4_10139 = new Class4(16);
	ReferenceTable table;
	int anInt10143;
	boolean aBool10144;
	boolean aBool10145;
	boolean aBool10146;
	int anInt10148 = 0;
	static final int anInt10149 = 250;
	Class708 aClass708_10150 = new Class708();
	boolean aBool10151;
	Class708 aClass708_10152;
	Class547 aClass547_10154;
	static CRC32 aCRC32_10155 = new CRC32();
	Class449 aClass449_10158;

	void method5506(int i) {
		if (aClass547_10132 != null) {
			for (Class536 class536 = aClass708_10150.method8308(1867269829); class536 != null; class536 = aClass708_10150.method8311(1063315667)) {
				if ((long) i == -6909195213925454795L * class536.aLong7133)
					return;
			}
			Class536 class536 = new Class536();
			class536.aLong7133 = -6756113042487376355L * (long) i;
			aClass708_10150.method8335(class536, -159209604);
		}
	}

	void method5513(int i) {
		if (aClass547_10132 != null) {
			for (Class536 class536 = aClass708_10150.method8308(1867269829); class536 != null; class536 = aClass708_10150.method8311(1834288577)) {
				if ((long) i == -6909195213925454795L * class536.aLong7133)
					return;
			}
			Class536 class536 = new Class536();
			class536.aLong7133 = -6756113042487376355L * (long) i;
			aClass708_10150.method8335(class536, 680966508);
		}
	}

	public int getCompletionPercent() {
		if (getReferenceTable((byte) -68) == null) {
			if (null == index255)
				return 0;
			return index255.getCompletionPercent();
		}
		return 100;
	}

	ReferenceTable getReferenceTable(byte i) {
		if (table != null)
			return table;
		if (null == index255) {
			if (aClass460_10129.method5528((byte) 1))
				return null;
			index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
		}
		if (index255.aBool11777)
			return null;
		byte[] archiveData = index255.getData(1956015802);
		if (index255 instanceof Class536_Sub18_Sub15_Sub1) {
			try {
				if (null == archiveData)
					throw new RuntimeException();
				table = new ReferenceTable(archiveData, -246169895 * anInt10135, aByteArray10136);
				if (table.revision * 1548762795 != anInt10128 * -416049697)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
		} else {
			try {
				if (null == archiveData)
					throw new RuntimeException();
				table = new ReferenceTable(archiveData, anInt10135 * -246169895, aByteArray10136);
			} catch (RuntimeException runtimeexception) {
				aClass460_10129.method5527(255, -1029966251 * anInt10143, -1100540231);
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
			if (null != aClass547_10154)
				aClass466_10131.method5670(anInt10143 * -1029966251, archiveData, aClass547_10154, (byte) 100);
		}
		index255 = null;
		if (null != aClass547_10132) {
			aByteArray10137 = new byte[table.archiveSize * 608172963];
			anInt10133 = 0;
		}
		return table;
	}

	byte[] method5514(int i, int i_0_) {
		MainFile class536_sub18_sub15 = method9256(i, 0, 1908362508);
		if (class536_sub18_sub15 == null)
			return null;
		byte[] is = class536_sub18_sub15.getData(2120245279);
		class536_sub18_sub15.method6484();
		return is;
	}

	void method9234(int i) {
		if (null != aClass708_10152 && getReferenceTable((byte) -81) != null) {
			for (Class536 class536 = aClass708_10150.method8308(1867269829); null != class536; class536 = aClass708_10150.method8311(1457014802)) {
				int i_1_ = (int) (class536.aLong7133 * -6909195213925454795L);
				if (i_1_ < 0 || i_1_ >= 608172963 * table.archiveSize || table.validFileIds[i_1_] == 0)
					class536.method6484();
				else {
					if (0 == aByteArray10137[i_1_])
						method9256(i_1_, 1, 1567970848);
					if (aByteArray10137[i_1_] == -1)
						method9256(i_1_, 2, 791262591);
					if (aByteArray10137[i_1_] == 1)
						class536.method6484();
				}
			}
		}
	}

	public int method9236(int i) {
		if (table == null)
			return 0;
		return table.validArchivesCount * 1483398979;
	}

	void method9237(int i, byte[] is, int i_2_, int i_3_, int i_4_) {
		if (!method9246(i, is, i_2_, i_3_, (byte) 96)) {
			anInt10135 = i * 452649321;
			aByteArray10136 = is;
			anInt10128 = -365533665 * i_2_;
			table = null;
			index255 = null;
			if (!aClass460_10129.method5528((byte) 1))
				index255 = aClass460_10129.method5522(255, -1029966251 * anInt10143, (byte) 0, true, 1099044667);
		}
	}

	public int method9238(byte i) {
		if (table == null)
			return 0;
		if (!aBool10146)
			return 1483398979 * table.validArchivesCount;
		Class536 class536 = aClass708_10152.method8308(1867269829);
		if (null == class536)
			return 0;
		return (int) (-6909195213925454795L * class536.aLong7133);
	}

	public void method9239(int i) {
		if (aClass449_10158 == null && null != aClass547_10132) {
			aBool10145 = true;
			aBool10144 = true;
			if (null == aClass708_10152)
				aClass708_10152 = new Class708();
		}
	}

	void method5508(int i, int i_5_) {
		if (aClass547_10132 != null) {
			for (Class536 class536 = aClass708_10150.method8308(1867269829); class536 != null; class536 = aClass708_10150.method8311(1710746457)) {
				if ((long) i == -6909195213925454795L * class536.aLong7133)
					return;
			}
			Class536 class536 = new Class536();
			class536.aLong7133 = -6756113042487376355L * (long) i;
			aClass708_10150.method8335(class536, -597897388);
		}
	}

	int method5511(int i, byte i_6_) {
		MainFile class536_sub18_sub15 = (MainFile) aClass4_10139.method556((long) i);
		if (null != class536_sub18_sub15)
			return class536_sub18_sub15.getCompletionPercent();
		return 0;
	}

	public boolean method9240(int i) {
		return aBool10144;
	}

	boolean method9241(int i) {
		return aClass449_10158 != null;
	}

	public int method9242(byte i) {
		return anInt10133 * -948660157;
	}

	ReferenceTable method5510() {
		if (table != null)
			return table;
		if (null == index255) {
			if (aClass460_10129.method5528((byte) 1))
				return null;
			index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
		}
		if (index255.aBool11777)
			return null;
		byte[] is = index255.getData(2065877079);
		if (index255 instanceof Class536_Sub18_Sub15_Sub1) {
			try {
				if (null == is)
					throw new RuntimeException();
				table = new ReferenceTable(is, -246169895 * anInt10135, aByteArray10136);
				if (table.revision * 1548762795 != anInt10128 * -416049697)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				table = new ReferenceTable(is, anInt10135 * -246169895, aByteArray10136);
			} catch (RuntimeException runtimeexception) {
				aClass460_10129.method5527(255, -1029966251 * anInt10143, -1100540231);
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
			if (null != aClass547_10154)
				aClass466_10131.method5670(anInt10143 * -1029966251, is, aClass547_10154, (byte) 100);
		}
		index255 = null;
		if (null != aClass547_10132) {
			aByteArray10137 = new byte[table.archiveSize * 608172963];
			anInt10133 = 0;
		}
		return table;
	}

	ReferenceTable method5507() {
		if (table != null)
			return table;
		if (null == index255) {
			if (aClass460_10129.method5528((byte) 1))
				return null;
			index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
		}
		if (index255.aBool11777)
			return null;
		byte[] is = index255.getData(2101045081);
		if (index255 instanceof Class536_Sub18_Sub15_Sub1) {
			try {
				if (null == is)
					throw new RuntimeException();
				table = new ReferenceTable(is, -246169895 * anInt10135, aByteArray10136);
				if (table.revision * 1548762795 != anInt10128 * -416049697)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				table = new ReferenceTable(is, anInt10135 * -246169895, aByteArray10136);
			} catch (RuntimeException runtimeexception) {
				aClass460_10129.method5527(255, -1029966251 * anInt10143, -1100540231);
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
			if (null != aClass547_10154)
				aClass466_10131.method5670(anInt10143 * -1029966251, is, aClass547_10154, (byte) 100);
		}
		index255 = null;
		if (null != aClass547_10132) {
			aByteArray10137 = new byte[table.archiveSize * 608172963];
			anInt10133 = 0;
		}
		return table;
	}

	ReferenceTable method5509() {
		if (table != null)
			return table;
		if (null == index255) {
			if (aClass460_10129.method5528((byte) 1))
				return null;
			index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
		}
		if (index255.aBool11777)
			return null;
		byte[] is = index255.getData(1923716522);
		if (index255 instanceof Class536_Sub18_Sub15_Sub1) {
			try {
				if (null == is)
					throw new RuntimeException();
				table = new ReferenceTable(is, -246169895 * anInt10135, aByteArray10136);
				if (table.revision * 1548762795 != anInt10128 * -416049697)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				table = new ReferenceTable(is, anInt10135 * -246169895, aByteArray10136);
			} catch (RuntimeException runtimeexception) {
				aClass460_10129.method5527(255, -1029966251 * anInt10143, -1100540231);
				table = null;
				if (aClass460_10129.method5528((byte) 1))
					index255 = null;
				else
					index255 = aClass460_10129.method5522(255, anInt10143 * -1029966251, (byte) 0, true, 1099044667);
				return null;
			}
			if (null != aClass547_10154)
				aClass466_10131.method5670(anInt10143 * -1029966251, is, aClass547_10154, (byte) 100);
		}
		index255 = null;
		if (null != aClass547_10132) {
			aByteArray10137 = new byte[table.archiveSize * 608172963];
			anInt10133 = 0;
		}
		return table;
	}

	void method5515(int i) {
		if (aClass547_10132 != null) {
			for (Class536 class536 = aClass708_10150.method8308(1867269829); class536 != null; class536 = aClass708_10150.method8311(1440296074)) {
				if ((long) i == -6909195213925454795L * class536.aLong7133)
					return;
			}
			Class536 class536 = new Class536();
			class536.aLong7133 = -6756113042487376355L * (long) i;
			aClass708_10150.method8335(class536, -376808687);
		}
	}

	int method5516(int i) {
		MainFile class536_sub18_sub15 = (MainFile) aClass4_10139.method556((long) i);
		if (null != class536_sub18_sub15)
			return class536_sub18_sub15.getCompletionPercent();
		return 0;
	}

	int method5517(int i) {
		MainFile class536_sub18_sub15 = (MainFile) aClass4_10139.method556((long) i);
		if (null != class536_sub18_sub15)
			return class536_sub18_sub15.getCompletionPercent();
		return 0;
	}

	void method9244(boolean bool, byte i) {
		aClass449_10158.method5405(bool, (byte) 8);
	}

	boolean method9246(int i, byte[] is, int i_7_, int i_8_, byte i_9_) {
		if (-246169895 * anInt10135 == i && anInt10128 * -416049697 == i_7_) {
			boolean bool = true;
			for (int i_10_ = 0; i_10_ < aByteArray10136.length; i_10_++) {
				if (aByteArray10136[i_10_] != is[i_10_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	void method9248(int i) {
		if (aClass708_10152 != null) {
			if (getReferenceTable((byte) -107) == null)
				return;
			if (aBool10146) {
				boolean bool = true;
				for (Class536 class536 = aClass708_10152.method8308(1867269829); null != class536; class536 = aClass708_10152.method8311(1274262687)) {
					int i_11_ = (int) (class536.aLong7133 * -6909195213925454795L);
					if (aByteArray10137[i_11_] == 0)
						method9256(i_11_, 1, 1863198798);
					if (aByteArray10137[i_11_] != 0)
						class536.method6484();
					else
						bool = false;
				}
				while (anInt10148 * -256279131 < table.validFileIds.length) {
					if (0 == (table.validFileIds[-256279131 * anInt10148]))
						anInt10148 += 1171333677;
					else {
						if (2126553935 * aClass466_10131.anInt5320 >= anInt10149) {
							bool = false;
							break;
						}
						if (0 == aByteArray10137[anInt10148 * -256279131])
							method9256(anInt10148 * -256279131, 1, 1146319488);
						if (0 == aByteArray10137[-256279131 * anInt10148]) {
							Class536 class536 = new Class536();
							class536.aLong7133 = (long) anInt10148 * -3090544993841112655L;
							aClass708_10152.method8335(class536, 826342272);
							bool = false;
						}
						anInt10148 += 1171333677;
					}
				}
				if (bool) {
					aBool10146 = false;
					anInt10148 = 0;
				}
			} else if (aBool10145) {
				boolean bool = true;
				for (Class536 class536 = aClass708_10152.method8308(1867269829); class536 != null; class536 = aClass708_10152.method8311(1873496272)) {
					int i_12_ = (int) (class536.aLong7133 * -6909195213925454795L);
					if (1 != aByteArray10137[i_12_])
						method9256(i_12_, 2, 1952753279);
					if (1 == aByteArray10137[i_12_])
						class536.method6484();
					else
						bool = false;
				}
				while (anInt10148 * -256279131 < table.validFileIds.length) {
					if (0 == (table.validFileIds[anInt10148 * -256279131]))
						anInt10148 += 1171333677;
					else {
						if (aClass460_10129.method5523(-1127686085)) {
							bool = false;
							break;
						}
						if (1 != aByteArray10137[anInt10148 * -256279131])
							method9256(-256279131 * anInt10148, 2, 1602140924);
						if (1 != aByteArray10137[anInt10148 * -256279131]) {
							Class536 class536 = new Class536();
							class536.aLong7133 = (long) anInt10148 * -3090544993841112655L;
							aClass708_10152.method8335(class536, -477761223);
							bool = false;
						}
						anInt10148 += 1171333677;
					}
				}
				if (bool) {
					aBool10145 = false;
					anInt10148 = 0;
				}
			} else
				aClass708_10152 = null;
		}
		if (aBool10151 && (Class249.method3450(1738738262) >= aLong10130 * 4899522255437735741L)) {
			for (MainFile class536_sub18_sub15 = ((MainFile) aClass4_10139.method562(-1909249768)); class536_sub18_sub15 != null; class536_sub18_sub15 = ((MainFile) aClass4_10139.method567(722885335))) {
				if (!class536_sub18_sub15.aBool11777) {
					if (class536_sub18_sub15.aBool11779) {
						if (!class536_sub18_sub15.aBool11778)
							throw new RuntimeException();
						class536_sub18_sub15.method6484();
					} else
						class536_sub18_sub15.aBool11779 = true;
				}
			}
			aLong10130 = ((Class249.method3450(2086266075) + 1000L) * 5159172616384407573L);
		}
	}

	byte[] method5512(int i) {
		MainFile class536_sub18_sub15 = method9256(i, 0, 1835366357);
		if (class536_sub18_sub15 == null)
			return null;
		byte[] is = class536_sub18_sub15.getData(2125064494);
		class536_sub18_sub15.method6484();
		return is;
	}

	Index(int i, Class547 class547, Class547 class547_13_, Class460 class460, Class449 class449, Class466 class466, int i_14_, byte[] is, int i_15_, boolean bool, int i_16_) {
		aLong10130 = 0L;
		anInt10143 = i * 94983933;
		aClass547_10132 = class547;
		if (aClass547_10132 == null)
			aBool10146 = false;
		else {
			aBool10146 = true;
			aClass708_10152 = new Class708();
		}
		aClass547_10154 = class547_13_;
		aClass460_10129 = class460;
		aClass449_10158 = class449;
		aClass466_10131 = class466;
		anInt10135 = i_14_ * 452649321;
		aByteArray10136 = is;
		anInt10128 = -365533665 * i_15_;
		aBool10151 = bool;
		if (aClass547_10154 != null)
			index255 = aClass466_10131.method5669(-1029966251 * anInt10143, aClass547_10154, 1935681493);
	}

	MainFile method9256(int i, int i_17_, int i_18_) {
		MainFile class536_sub18_sub15 = (MainFile) aClass4_10139.method556((long) i);
		if (null != class536_sub18_sub15 && 0 == i_17_ && !class536_sub18_sub15.aBool11778 && class536_sub18_sub15.aBool11777) {
			class536_sub18_sub15.method6484();
			class536_sub18_sub15 = null;
		}
		if (null == class536_sub18_sub15) {
			if (0 == i_17_) {
				if (aClass547_10132 != null && aByteArray10137[i] != -1)
					class536_sub18_sub15 = aClass466_10131.method5669(i, aClass547_10132, -982300169);
				else if (aClass449_10158 != null) {
					class536_sub18_sub15 = aClass449_10158.method5413(anInt10143 * -1029966251, i, (byte) 2, true, (table.crcs[i]), (table.anIntArray5337[i]), 55237047);
					if (class536_sub18_sub15 == null)
						return null;
				} else if (!aClass460_10129.method5528((byte) 1))
					class536_sub18_sub15 = aClass460_10129.method5522(anInt10143 * -1029966251, i, (byte) 2, true, 1099044667);
				else
					return null;
			} else if (1 == i_17_) {
				if (aClass547_10132 == null)
					throw new RuntimeException();
				class536_sub18_sub15 = aClass466_10131.method5679(i, aClass547_10132, (byte) 116);
			} else if (i_17_ == 2) {
				if (aClass547_10132 == null)
					throw new RuntimeException();
				if (aByteArray10137[i] != -1)
					throw new RuntimeException();
				if (aClass449_10158 != null)
					return null;
				if (!aClass460_10129.method5523(236060283))
					class536_sub18_sub15 = aClass460_10129.method5522(-1029966251 * anInt10143, i, (byte) 2, false, 1099044667);
				else
					return null;
			} else
				throw new RuntimeException();
			aClass4_10139.method560(class536_sub18_sub15, (long) i);
		}
		if (class536_sub18_sub15.aBool11777)
			return null;
		byte[] is = class536_sub18_sub15.getData(2113122685);
		if (class536_sub18_sub15 instanceof Class536_Sub18_Sub15_Sub1) {
			MainFile class536_sub18_sub15_19_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_10155.reset();
				aCRC32_10155.update(is, 0, is.length - 2);
				int i_20_ = (int) aCRC32_10155.getValue();
				if (i_20_ != table.crcs[i])
					throw new RuntimeException();
				if (null != table.whirlpools && table.whirlpools[i] != null) {
					byte[] is_21_ = table.whirlpools[i];
					byte[] is_22_ = Class601.method7165(is, 0, is.length - 2, (byte) -116);
					for (int i_23_ = 0; i_23_ < 64; i_23_++) {
						if (is_22_[i_23_] != is_21_[i_23_])
							throw new RuntimeException();
					}
				}
				int i_24_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_24_ != (table.anIntArray5337[i] & 0xffff))
					throw new RuntimeException();
				if (1 != aByteArray10137[i]) {
					if (aByteArray10137[i] != 0) {
						/* empty */
					}
					anInt10133 += -2076019605;
					aByteArray10137[i] = (byte) 1;
				}
				if (!class536_sub18_sub15.aBool11778)
					class536_sub18_sub15.method6484();
				class536_sub18_sub15_19_ = class536_sub18_sub15;
			} catch (Exception exception) {
				aByteArray10137[i] = (byte) -1;
				class536_sub18_sub15.method6484();
				if (class536_sub18_sub15.aBool11778) {
					if (null != aClass449_10158) {
						if (!aClass449_10158.method5406((byte) -1)) {
							Class536_Sub18_Sub15_Sub3 class536_sub18_sub15_sub3 = (aClass449_10158.method5413(anInt10143 * -1029966251, i, (byte) 2, true, table.crcs[i], table.anIntArray5337[i], -1247600037));
							if (class536_sub18_sub15_sub3 != null)
								aClass4_10139.method560(class536_sub18_sub15_sub3, (long) i);
						}
					} else if (!aClass460_10129.method5528((byte) 1)) {
						JS5ArchiveRequest class536_sub18_sub15_sub2 = aClass460_10129.method5522((-1029966251 * anInt10143), i, (byte) 2, true, 1099044667);
						aClass4_10139.method560(class536_sub18_sub15_sub2, (long) i);
					}
				}
				return null;
			}
			return class536_sub18_sub15_19_;
		}
		try {
			if (null == is || is.length <= 2) {
				if (null != aClass449_10158) {
					class536_sub18_sub15.method6484();
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_10155.reset();
			aCRC32_10155.update(is, 0, is.length - 2);
			int i_25_ = (int) aCRC32_10155.getValue();
			if (i_25_ != table.crcs[i])
				throw new RuntimeException();
			if (null != table.whirlpools && table.whirlpools[i] != null) {
				byte[] is_26_ = table.whirlpools[i];
				byte[] is_27_ = Class601.method7165(is, 0, is.length - 2, (byte) -120);
				for (int i_28_ = 0; i_28_ < 64; i_28_++) {
					if (is_26_[i_28_] != is_27_[i_28_])
						throw new RuntimeException();
				}
			}
			if (null != aClass449_10158) {
				aClass460_10129.anInt5195 = 0;
				aClass460_10129.anInt5196 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			aClass460_10129.method5527(-1029966251 * anInt10143, i, -1100540231);
			class536_sub18_sub15.method6484();
			if (class536_sub18_sub15.aBool11778) {
				if (null != aClass449_10158) {
					if (!aClass449_10158.method5406((byte) -1)) {
						Class536_Sub18_Sub15_Sub3 class536_sub18_sub15_sub3 = (aClass449_10158.method5413(anInt10143 * -1029966251, i, (byte) 2, true, table.crcs[i], table.anIntArray5337[i], 707598905));
						if (class536_sub18_sub15_sub3 != null)
							aClass4_10139.method560(class536_sub18_sub15_sub3, (long) i);
					}
				} else if (!aClass460_10129.method5528((byte) 1)) {
					JS5ArchiveRequest class536_sub18_sub15_sub2 = aClass460_10129.method5522(anInt10143 * -1029966251, i, (byte) 2, true, 1099044667);
					aClass4_10139.method560(class536_sub18_sub15_sub2, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) (table.anIntArray5337[i] >>> 8);
		is[is.length - 1] = (byte) table.anIntArray5337[i];
		if (null != aClass547_10132) {
			aClass466_10131.method5670(i, is, aClass547_10132, (byte) 100);
			if (aByteArray10137[i] != 1) {
				anInt10133 += -2076019605;
				aByteArray10137[i] = (byte) 1;
			}
		}
		if (!class536_sub18_sub15.aBool11778)
			class536_sub18_sub15.method6484();
		return class536_sub18_sub15;
	}

	public static final void method9264(int i) {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4494, class106.aClass15_1258, 1742252608);
		class536_sub23.stream.writeByte(0);
		class106.writePacket(class536_sub23, 1567417629);
	}
}
