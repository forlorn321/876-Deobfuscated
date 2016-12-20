/* Class452_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Iterator;

public class Class452_Sub1 extends Class452 {
	Class563 aClass563_10292;

	void method15944() {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(6, -1720202822);
				aClass527_Sub38_4952.writeTriByte(4, 169926200);
				aClass527_Sub38_4952.writeShort(0, 1404835786);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 74);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 37);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}

	void method7302(int i, int i_0_, int i_1_) {
		try {
			aClass563_10292.method9470((byte) 125);
		} catch (Exception exception) {
			/* empty */
		}
		aClass563_10292 = null;
		anInt4949 += 182778823;
		anInt4942 = -85151;
		aByte4953 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt4956 = -1393292253 * i;
		anInt4957 = i_0_ * 1193760277;
	}

	public boolean method7303(int i) {
		if (null != aClass563_10292) {
			long l = Class234.method4347(-1408626088);
			int i_2_ = (int) (l - aLong4951 * -2040518128667581089L);
			aLong4951 = l * 1730208957201086111L;
			if (i_2_ > 200)
				i_2_ = 200;
			anInt4959 += i_2_ * 445900511;
			if (anInt4959 * -1133423329 > 30000) {
				try {
					aClass563_10292.method9470((byte) 25);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
			}
		}
		if (aClass563_10292 == null) {
			if (method7301(514395710) == 0 && method7296(583463581) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4960.method14072(823248222)); class527_sub8_sub13_sub3 != null; class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4960.method14059(1824925742))) {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(1, -638856815);
				aClass527_Sub38_4952.write36BitLong((class527_sub8_sub13_sub3.aLong10401) * -8775265850242314087L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 94);
				aClass693_4947.method14055(class527_sub8_sub13_sub3, 791330976);
			}
			for (Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4948.method14072(-1881320048)); null != class527_sub8_sub13_sub3; class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4948.method14059(1169656295))) {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(0, 216489843);
				aClass527_Sub38_4952.write36BitLong(-8775265850242314087L * (class527_sub8_sub13_sub3.aLong10401));
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 67);
				aClass693_4954.method14055(class527_sub8_sub13_sub3, 549123495);
			}
			for (int i_3_ = 0; i_3_ < 100; i_3_++) {
				int i_4_ = aClass563_10292.method9473(848042272);
				if (i_4_ < 0)
					throw new IOException();
				if (i_4_ == 0)
					break;
				anInt4959 = 0;
				if (null == aClass527_Sub8_Sub13_Sub3_4950) {
					int i_5_ = 5 - aClass527_Sub38_4958.anInt10689 * -441238943;
					if (i_5_ > i_4_)
						i_5_ = i_4_;
					aClass563_10292.method9472((aClass527_Sub38_4958.buffer), (aClass527_Sub38_4958.anInt10689 * -441238943), i_5_, -226630132);
					if (aByte4953 != 0) {
						for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
							aClass527_Sub38_4958.buffer[(aClass527_Sub38_4958.anInt10689 * -441238943 + i_6_)] ^= aByte4953;
					}
					aClass527_Sub38_4958.anInt10689 += i_5_ * 1474750881;
					if (aClass527_Sub38_4958.anInt10689 * -441238943 >= 5) {
						aClass527_Sub38_4958.anInt10689 = 0;
						int i_7_ = aClass527_Sub38_4958.readUnsignedByte();
						int i_8_ = aClass527_Sub38_4958.readInt();
						boolean bool_9_ = 0 != (i_8_ & ~0x7fffffff);
						int i_10_ = i_8_ & 0x7fffffff;
						long l = ((long) i_7_ << 32) + (long) i_10_;
						if (bool_9_) {
							Iterator iterator = aClass693_4954.iterator();
							while (iterator.hasNext()) {
								Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) iterator.next());
								if ((class527_sub8_sub13_sub3.aLong10401 * -8775265850242314087L) == l) {
									aClass527_Sub8_Sub13_Sub3_4950 = class527_sub8_sub13_sub3;
									break;
								}
							}
						} else {
							Iterator iterator = aClass693_4947.iterator();
							while (iterator.hasNext()) {
								Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) iterator.next());
								if ((-8775265850242314087L * class527_sub8_sub13_sub3.aLong10401) == l) {
									aClass527_Sub8_Sub13_Sub3_4950 = class527_sub8_sub13_sub3;
									break;
								}
							}
						}
						if (aClass527_Sub8_Sub13_Sub3_4950 == null)
							throw new IOException();
						anInt4961 = -1663378257;
						aClass527_Sub38_4958.anInt10689 = 0;
						aClass527_Sub38_4946.anInt10689 = 0;
					}
				} else {
					RSByteBuffer class527_sub38 = aClass527_Sub8_Sub13_Sub3_4950.aClass527_Sub38_12119;
					if (null == class527_sub38) {
						int i_11_ = 5 - aClass527_Sub38_4946.anInt10689 * -441238943;
						if (i_11_ > i_4_)
							i_11_ = i_4_;
						aClass563_10292.method9472(aClass527_Sub38_4946.buffer, -441238943 * aClass527_Sub38_4946.anInt10689, i_11_, -226630132);
						if (0 != aByte4953) {
							for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
								aClass527_Sub38_4946.buffer[i_12_ + -441238943 * (aClass527_Sub38_4946.anInt10689)] ^= aByte4953;
						}
						aClass527_Sub38_4946.anInt10689 += i_11_ * 1474750881;
						if (-441238943 * aClass527_Sub38_4946.anInt10689 >= 5) {
							aClass527_Sub38_4946.anInt10689 = 0;
							int i_13_ = aClass527_Sub38_4946.readUnsignedByte();
							int i_14_ = aClass527_Sub38_4946.readInt();
							int i_15_ = 5;
							if (i_13_ != Class472.aClass472_5368.method87())
								i_15_ = 9;
							class527_sub38 = aClass527_Sub8_Sub13_Sub3_4950.aClass527_Sub38_12119 = (new RSByteBuffer(aClass527_Sub8_Sub13_Sub3_4950.aByte12118 + (i_15_ + i_14_)));
							class527_sub38.writeByte(i_13_, -136267537);
							class527_sub38.writeInt(i_14_, 1737416881);
							anInt4961 += -1663378257;
						}
					} else {
						int i_16_ = (class527_sub38.buffer.length - aClass527_Sub8_Sub13_Sub3_4950.aByte12118);
						int i_17_ = 102400 - 1895162763 * anInt4961;
						if (i_17_ > i_16_ - class527_sub38.anInt10689 * -441238943)
							i_17_ = (i_16_ - -441238943 * class527_sub38.anInt10689);
						if (i_17_ > i_4_)
							i_17_ = i_4_;
						aClass563_10292.method9472((class527_sub38.buffer), -441238943 * (class527_sub38.anInt10689), i_17_, -226630132);
						if (aByte4953 != 0) {
							for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
								class527_sub38.buffer[(-441238943 * class527_sub38.anInt10689 + i_18_)] ^= aByte4953;
						}
						class527_sub38.anInt10689 += 1474750881 * i_17_;
						anInt4961 += 1385311267 * i_17_;
						if (class527_sub38.anInt10689 * -441238943 == i_16_) {
							aClass527_Sub8_Sub13_Sub3_4950.method16057((byte) -77);
							aClass527_Sub8_Sub13_Sub3_4950.aBool11768 = false;
							aClass527_Sub8_Sub13_Sub3_4950 = null;
						} else if (anInt4961 * 1895162763 == 102400) {
							anInt4961 = 0;
							aClass527_Sub8_Sub13_Sub3_4950 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass563_10292.method9470((byte) 3);
			} catch (Exception exception) {
				/* empty */
			}
			aClass563_10292 = null;
			anInt4949 += 182778823;
			anInt4942 = -170302;
			if (method7301(1410732026) == 0 && method7296(583463581) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method7304(Object object, boolean bool, int i) {
		if (aClass563_10292 != null) {
			try {
				aClass563_10292.method9470((byte) 107);
			} catch (Exception exception) {
				/* empty */
			}
			aClass563_10292 = null;
		}
		aClass563_10292 = (Class563) object;
		method15945(478195126);
		method7305(bool, -1877645654);
		aClass527_Sub38_4958.anInt10689 = 0;
		aClass527_Sub38_4946.anInt10689 = 0;
		aClass527_Sub8_Sub13_Sub3_4950 = null;
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4947.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4960.method14055(class527_sub8_sub13_sub3, 1838013152);
		}
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4954.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4948.method14055(class527_sub8_sub13_sub3, 1291020767);
		}
		if (aByte4953 != 0) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(4, -1135285903);
				aClass527_Sub38_4952.writeByte(aByte4953, 871790379);
				aClass527_Sub38_4952.writeInt(0, -577080155);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 83);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 111);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
		anInt4959 = 0;
		aLong4951 = Class234.method4347(-1408626088) * 1730208957201086111L;
	}

	void method15945(int i) {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(6, 1961959935);
				aClass527_Sub38_4952.writeTriByte(4, 2354285);
				aClass527_Sub38_4952.writeShort(0, 1404835786);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 112);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 31);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}

	public void method7305(boolean bool, int i) {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(bool ? 2 : 3, -933739038);
				aClass527_Sub38_4952.write36BitLong(0L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 35);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 107);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}

	public void method7306(int i) {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(7, -101396541);
				aClass527_Sub38_4952.write36BitLong(0L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 121);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 74);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}

	public void method7307(int i) {
		if (aClass563_10292 != null)
			aClass563_10292.method9470((byte) 22);
	}

	public void method7328() {
		if (aClass563_10292 != null)
			aClass563_10292.method9471(886036841);
	}

	void method7317(int i, int i_19_) {
		try {
			aClass563_10292.method9470((byte) 72);
		} catch (Exception exception) {
			/* empty */
		}
		aClass563_10292 = null;
		anInt4949 += 182778823;
		anInt4942 = -85151;
		aByte4953 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt4956 = -1393292253 * i;
		anInt4957 = i_19_ * 1193760277;
	}

	public boolean method7308() {
		if (null != aClass563_10292) {
			long l = Class234.method4347(-1408626088);
			int i = (int) (l - aLong4951 * -2040518128667581089L);
			aLong4951 = l * 1730208957201086111L;
			if (i > 200)
				i = 200;
			anInt4959 += i * 445900511;
			if (anInt4959 * -1133423329 > 30000) {
				try {
					aClass563_10292.method9470((byte) 106);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
			}
		}
		if (aClass563_10292 == null) {
			if (method7301(-105478052) == 0 && method7296(583463581) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4960.method14072(-1550293896)); class527_sub8_sub13_sub3 != null; class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4960.method14059(-713625567))) {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(1, 327162167);
				aClass527_Sub38_4952.write36BitLong((class527_sub8_sub13_sub3.aLong10401) * -8775265850242314087L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 25);
				aClass693_4947.method14055(class527_sub8_sub13_sub3, 1362086293);
			}
			for (Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4948.method14072(-453887953)); null != class527_sub8_sub13_sub3; class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4948.method14059(516373369))) {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(0, 2081188846);
				aClass527_Sub38_4952.write36BitLong(-8775265850242314087L * (class527_sub8_sub13_sub3.aLong10401));
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 24);
				aClass693_4954.method14055(class527_sub8_sub13_sub3, 668071082);
			}
			for (int i = 0; i < 100; i++) {
				int i_20_ = aClass563_10292.method9473(808488184);
				if (i_20_ < 0)
					throw new IOException();
				if (i_20_ == 0)
					break;
				anInt4959 = 0;
				if (null == aClass527_Sub8_Sub13_Sub3_4950) {
					int i_21_ = 5 - aClass527_Sub38_4958.anInt10689 * -441238943;
					if (i_21_ > i_20_)
						i_21_ = i_20_;
					aClass563_10292.method9472((aClass527_Sub38_4958.buffer), (aClass527_Sub38_4958.anInt10689 * -441238943), i_21_, -226630132);
					if (aByte4953 != 0) {
						for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
							aClass527_Sub38_4958.buffer[(aClass527_Sub38_4958.anInt10689 * -441238943 + i_22_)] ^= aByte4953;
					}
					aClass527_Sub38_4958.anInt10689 += i_21_ * 1474750881;
					if (aClass527_Sub38_4958.anInt10689 * -441238943 >= 5) {
						aClass527_Sub38_4958.anInt10689 = 0;
						int i_23_ = aClass527_Sub38_4958.readUnsignedByte();
						int i_24_ = aClass527_Sub38_4958.readInt();
						boolean bool_25_ = 0 != (i_24_ & ~0x7fffffff);
						int i_26_ = i_24_ & 0x7fffffff;
						long l = ((long) i_23_ << 32) + (long) i_26_;
						if (bool_25_) {
							Iterator iterator = aClass693_4954.iterator();
							while (iterator.hasNext()) {
								Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) iterator.next());
								if ((class527_sub8_sub13_sub3.aLong10401 * -8775265850242314087L) == l) {
									aClass527_Sub8_Sub13_Sub3_4950 = class527_sub8_sub13_sub3;
									break;
								}
							}
						} else {
							Iterator iterator = aClass693_4947.iterator();
							while (iterator.hasNext()) {
								Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) iterator.next());
								if ((-8775265850242314087L * class527_sub8_sub13_sub3.aLong10401) == l) {
									aClass527_Sub8_Sub13_Sub3_4950 = class527_sub8_sub13_sub3;
									break;
								}
							}
						}
						if (aClass527_Sub8_Sub13_Sub3_4950 == null)
							throw new IOException();
						anInt4961 = -1663378257;
						aClass527_Sub38_4958.anInt10689 = 0;
						aClass527_Sub38_4946.anInt10689 = 0;
					}
				} else {
					RSByteBuffer class527_sub38 = aClass527_Sub8_Sub13_Sub3_4950.aClass527_Sub38_12119;
					if (null == class527_sub38) {
						int i_27_ = 5 - aClass527_Sub38_4946.anInt10689 * -441238943;
						if (i_27_ > i_20_)
							i_27_ = i_20_;
						aClass563_10292.method9472(aClass527_Sub38_4946.buffer, -441238943 * aClass527_Sub38_4946.anInt10689, i_27_, -226630132);
						if (0 != aByte4953) {
							for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
								aClass527_Sub38_4946.buffer[i_28_ + -441238943 * (aClass527_Sub38_4946.anInt10689)] ^= aByte4953;
						}
						aClass527_Sub38_4946.anInt10689 += i_27_ * 1474750881;
						if (-441238943 * aClass527_Sub38_4946.anInt10689 >= 5) {
							aClass527_Sub38_4946.anInt10689 = 0;
							int i_29_ = aClass527_Sub38_4946.readUnsignedByte();
							int i_30_ = aClass527_Sub38_4946.readInt();
							int i_31_ = 5;
							if (i_29_ != Class472.aClass472_5368.method87())
								i_31_ = 9;
							class527_sub38 = aClass527_Sub8_Sub13_Sub3_4950.aClass527_Sub38_12119 = (new RSByteBuffer(aClass527_Sub8_Sub13_Sub3_4950.aByte12118 + (i_31_ + i_30_)));
							class527_sub38.writeByte(i_29_, -164256992);
							class527_sub38.writeInt(i_30_, 220188354);
							anInt4961 += -1663378257;
						}
					} else {
						int i_32_ = (class527_sub38.buffer.length - aClass527_Sub8_Sub13_Sub3_4950.aByte12118);
						int i_33_ = 102400 - 1895162763 * anInt4961;
						if (i_33_ > i_32_ - class527_sub38.anInt10689 * -441238943)
							i_33_ = (i_32_ - -441238943 * class527_sub38.anInt10689);
						if (i_33_ > i_20_)
							i_33_ = i_20_;
						aClass563_10292.method9472((class527_sub38.buffer), -441238943 * (class527_sub38.anInt10689), i_33_, -226630132);
						if (aByte4953 != 0) {
							for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
								class527_sub38.buffer[(-441238943 * class527_sub38.anInt10689 + i_34_)] ^= aByte4953;
						}
						class527_sub38.anInt10689 += 1474750881 * i_33_;
						anInt4961 += 1385311267 * i_33_;
						if (class527_sub38.anInt10689 * -441238943 == i_32_) {
							aClass527_Sub8_Sub13_Sub3_4950.method16057((byte) -2);
							aClass527_Sub8_Sub13_Sub3_4950.aBool11768 = false;
							aClass527_Sub8_Sub13_Sub3_4950 = null;
						} else if (anInt4961 * 1895162763 == 102400) {
							anInt4961 = 0;
							aClass527_Sub8_Sub13_Sub3_4950 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass563_10292.method9470((byte) 46);
			} catch (Exception exception) {
				/* empty */
			}
			aClass563_10292 = null;
			anInt4949 += 182778823;
			anInt4942 = -170302;
			if (method7301(692888142) == 0 && method7296(583463581) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method7300(Object object, boolean bool) {
		if (aClass563_10292 != null) {
			try {
				aClass563_10292.method9470((byte) 40);
			} catch (Exception exception) {
				/* empty */
			}
			aClass563_10292 = null;
		}
		aClass563_10292 = (Class563) object;
		method15945(-1908741604);
		method7305(bool, -1877645654);
		aClass527_Sub38_4958.anInt10689 = 0;
		aClass527_Sub38_4946.anInt10689 = 0;
		aClass527_Sub8_Sub13_Sub3_4950 = null;
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4947.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4960.method14055(class527_sub8_sub13_sub3, 1476924225);
		}
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4954.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4948.method14055(class527_sub8_sub13_sub3, 1715542389);
		}
		if (aByte4953 != 0) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(4, -1693344239);
				aClass527_Sub38_4952.writeByte(aByte4953, 1970813884);
				aClass527_Sub38_4952.writeInt(0, -2055974983);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 121);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 80);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
		anInt4959 = 0;
		aLong4951 = Class234.method4347(-1408626088) * 1730208957201086111L;
	}

	public void method7318(boolean bool) {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(bool ? 2 : 3, 1782048140);
				aClass527_Sub38_4952.write36BitLong(0L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 92);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 70);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}

	public void method7321(Object object, boolean bool) {
		if (aClass563_10292 != null) {
			try {
				aClass563_10292.method9470((byte) 121);
			} catch (Exception exception) {
				/* empty */
			}
			aClass563_10292 = null;
		}
		aClass563_10292 = (Class563) object;
		method15945(-241917503);
		method7305(bool, -1877645654);
		aClass527_Sub38_4958.anInt10689 = 0;
		aClass527_Sub38_4946.anInt10689 = 0;
		aClass527_Sub8_Sub13_Sub3_4950 = null;
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4947.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4960.method14055(class527_sub8_sub13_sub3, 1736418535);
		}
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4954.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4948.method14055(class527_sub8_sub13_sub3, 619984659);
		}
		if (aByte4953 != 0) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(4, 1864203309);
				aClass527_Sub38_4952.writeByte(aByte4953, -701534959);
				aClass527_Sub38_4952.writeInt(0, 476746312);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 96);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 49);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
		anInt4959 = 0;
		aLong4951 = Class234.method4347(-1408626088) * 1730208957201086111L;
	}

	public void method7322(boolean bool) {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(bool ? 2 : 3, 1174507367);
				aClass527_Sub38_4952.write36BitLong(0L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 104);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 64);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}

	public void method7329(int i) {
		if (aClass563_10292 != null)
			aClass563_10292.method9471(475266851);
	}

	public void method7324() {
		if (aClass563_10292 != null)
			aClass563_10292.method9470((byte) 61);
	}

	public void method7330() {
		if (aClass563_10292 != null)
			aClass563_10292.method9470((byte) 102);
	}

	public void method7298() {
		if (aClass563_10292 != null)
			aClass563_10292.method9470((byte) 66);
	}

	public void method7327() {
		if (aClass563_10292 != null)
			aClass563_10292.method9471(980984811);
	}

	public void method7319() {
		if (aClass563_10292 != null)
			aClass563_10292.method9471(1519089336);
	}

	public void method7320(Object object, boolean bool) {
		if (aClass563_10292 != null) {
			try {
				aClass563_10292.method9470((byte) 45);
			} catch (Exception exception) {
				/* empty */
			}
			aClass563_10292 = null;
		}
		aClass563_10292 = (Class563) object;
		method15945(-1220828968);
		method7305(bool, -1877645654);
		aClass527_Sub38_4958.anInt10689 = 0;
		aClass527_Sub38_4946.anInt10689 = 0;
		aClass527_Sub8_Sub13_Sub3_4950 = null;
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4947.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4960.method14055(class527_sub8_sub13_sub3, 594944355);
		}
		for (;;) {
			Class527_Sub8_Sub13_Sub3 class527_sub8_sub13_sub3 = ((Class527_Sub8_Sub13_Sub3) aClass693_4954.method14056(518720638));
			if (null == class527_sub8_sub13_sub3)
				break;
			class527_sub8_sub13_sub3.aClass527_Sub38_12119 = null;
			aClass693_4948.method14055(class527_sub8_sub13_sub3, 1220728645);
		}
		if (aByte4953 != 0) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(4, 1343137000);
				aClass527_Sub38_4952.writeByte(aByte4953, 1711079066);
				aClass527_Sub38_4952.writeInt(0, -863019171);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 107);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 6);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
		anInt4959 = 0;
		aLong4951 = Class234.method4347(-1408626088) * 1730208957201086111L;
	}

	public void method7326() {
		if (null != aClass563_10292) {
			try {
				aClass527_Sub38_4952.anInt10689 = 0;
				aClass527_Sub38_4952.writeByte(7, -1871691812);
				aClass527_Sub38_4952.write36BitLong(0L);
				aClass563_10292.method9469(aClass527_Sub38_4952.buffer, 0, aClass527_Sub38_4952.buffer.length, (byte) 108);
			} catch (IOException ioexception) {
				try {
					aClass563_10292.method9470((byte) 21);
				} catch (Exception exception) {
					/* empty */
				}
				aClass563_10292 = null;
				anInt4949 += 182778823;
				anInt4942 = -170302;
			}
		}
	}
}
