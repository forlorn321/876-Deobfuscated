/* Class460_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Iterator;

public class Class460_Sub1 extends Class460 {
	Class567 aClass567_10290;
	static int anInt10291;

	void method5548(int i, int i_0_) {
		try {
			aClass567_10290.method6913(-842345557);
		} catch (Exception exception) {
			/* empty */
		}
		aClass567_10290 = null;
		anInt5195 += 971530315;
		anInt5196 = 938617607;
		aByte5182 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt5197 = 1688272219 * i;
		anInt5183 = i_0_ * 1278660259;
	}

	void method9323(byte i) {
		if (null != aClass567_10290) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(6, 465637339);
				aClass536_Sub33_5193.write24BitInt(4, 1755473822);
				aClass536_Sub33_5193.writeShort(0, -1778059594);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) 15);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
	}

	public boolean method5537(byte i) {
		if (aClass567_10290 != null) {
			long l = Class249.method3450(1936160013);
			int i_1_ = (int) (l - -3374237855994863421L * aLong5192);
			aLong5192 = l * 5457350524624408555L;
			if (i_1_ > 200)
				i_1_ = 200;
			anInt5191 += -429078247 * i_1_;
			if (anInt5191 * -1802730711 > 30000) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
			}
		}
		if (null == aClass567_10290) {
			if (method5526(963482457) == 0 && method5525(-750783480) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5185.method8248(498551233)); class536_sub18_sub15_sub2 != null; class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5185.method8241(696658288))) {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(1, 465637339);
				aClass536_Sub33_5193.write36BitLong((class536_sub18_sub15_sub2.aLong10507) * 4749301371101216403L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) 12);
				aClass700_5181.method8239(class536_sub18_sub15_sub2, (byte) -24);
			}
			for (Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5187.method8248(-694625628)); class536_sub18_sub15_sub2 != null; class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5187.method8241(-553315345))) {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(0, 465637339);
				aClass536_Sub33_5193.write36BitLong((class536_sub18_sub15_sub2.aLong10507) * 4749301371101216403L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -12);
				aClass700_5190.method8239(class536_sub18_sub15_sub2, (byte) 8);
			}
			for (int i_2_ = 0; i_2_ < 100; i_2_++) {
				int i_3_ = aClass567_10290.method6898(1962551527);
				if (i_3_ < 0)
					throw new IOException();
				if (i_3_ == 0)
					break;
				anInt5191 = 0;
				if (aClass536_Sub18_Sub15_Sub2_5202 == null) {
					int i_4_ = 5 - aClass536_Sub33_5199.off * -810172525;
					if (i_4_ > i_3_)
						i_4_ = i_3_;
					aClass567_10290.method6899((aClass536_Sub33_5199.buffer), (aClass536_Sub33_5199.off * -810172525), i_4_, -1540123216);
					if (aByte5182 != 0) {
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
							aClass536_Sub33_5199.buffer[i_5_ + (aClass536_Sub33_5199.off * -810172525)] ^= aByte5182;
					}
					aClass536_Sub33_5199.off += 516175515 * i_4_;
					if (aClass536_Sub33_5199.off * -810172525 >= 5) {
						aClass536_Sub33_5199.off = 0;
						int i_6_ = aClass536_Sub33_5199.readUnsignedByte();
						int i_7_ = aClass536_Sub33_5199.readInt();
						boolean bool_8_ = (i_7_ & ~0x7fffffff) != 0;
						int i_9_ = i_7_ & 0x7fffffff;
						long l = (long) i_9_ + ((long) i_6_ << 32);
						if (bool_8_) {
							Iterator iterator = aClass700_5190.iterator();
							while (iterator.hasNext()) {
								Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) iterator.next());
								if (l == (class536_sub18_sub15_sub2.aLong10507 * 4749301371101216403L)) {
									aClass536_Sub18_Sub15_Sub2_5202 = class536_sub18_sub15_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass700_5181.iterator();
							while (iterator.hasNext()) {
								Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) iterator.next());
								if ((class536_sub18_sub15_sub2.aLong10507 * 4749301371101216403L) == l) {
									aClass536_Sub18_Sub15_Sub2_5202 = class536_sub18_sub15_sub2;
									break;
								}
							}
						}
						if (aClass536_Sub18_Sub15_Sub2_5202 == null)
							throw new IOException();
						anInt5201 = -1828991779;
						aClass536_Sub33_5199.off = 0;
						buffer.off = 0;
					}
				} else {
					RSByteBuffer class536_sub33 = (aClass536_Sub18_Sub15_Sub2_5202.aClass536_Sub33_12114);
					if (class536_sub33 == null) {
						int i_10_ = 5 - buffer.off * -810172525;
						if (i_10_ > i_3_)
							i_10_ = i_3_;
						aClass567_10290.method6899(buffer.buffer, -810172525 * buffer.off, i_10_, 1702247399);
						if (aByte5182 != 0) {
							for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
								buffer.buffer[-810172525 * (buffer.off) + i_11_] ^= aByte5182;
						}
						buffer.off += i_10_ * 516175515;
						if (buffer.off * -810172525 >= 5) {
							buffer.off = 0;
							int i_12_ = buffer.readUnsignedByte();
							int i_13_ = buffer.readInt();
							int i_14_ = 5;
							if (i_12_ != Class463.aClass463_5222.method78())
								i_14_ = 9;
							class536_sub33 = aClass536_Sub18_Sub15_Sub2_5202.aClass536_Sub33_12114 = (new RSByteBuffer(aClass536_Sub18_Sub15_Sub2_5202.aByte12115 + (i_13_ + i_14_)));
							class536_sub33.writeByte(i_12_, 465637339);
							class536_sub33.writeInt(i_13_, -149241618);
							anInt5201 += -1828991779;
						}
					} else {
						int i_15_ = (class536_sub33.buffer.length - aClass536_Sub18_Sub15_Sub2_5202.aByte12115);
						int i_16_ = 102400 - anInt5201 * -1671095991;
						if (i_16_ > i_15_ - -810172525 * class536_sub33.off)
							i_16_ = (i_15_ - -810172525 * class536_sub33.off);
						if (i_16_ > i_3_)
							i_16_ = i_3_;
						aClass567_10290.method6899((class536_sub33.buffer), -810172525 * (class536_sub33.off), i_16_, -660377501);
						if (aByte5182 != 0) {
							for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
								class536_sub33.buffer[i_17_ + (class536_sub33.off * -810172525)] ^= aByte5182;
						}
						class536_sub33.off += 516175515 * i_16_;
						anInt5201 += -1224791815 * i_16_;
						if (-810172525 * class536_sub33.off == i_15_) {
							aClass536_Sub18_Sub15_Sub2_5202.method9521(-1681250483);
							aClass536_Sub18_Sub15_Sub2_5202.aBool11777 = false;
							aClass536_Sub18_Sub15_Sub2_5202 = null;
						} else if (anInt5201 * -1671095991 == 102400) {
							anInt5201 = 0;
							aClass536_Sub18_Sub15_Sub2_5202 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass567_10290.method6913(-842345557);
			} catch (Exception exception) {
				/* empty */
			}
			aClass567_10290 = null;
			anInt5195 += 971530315;
			anInt5196 = 1877235214;
			if (method5526(963482457) == 0 && method5525(-1862991695) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method5543() {
		if (null != aClass567_10290) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(7, 465637339);
				aClass536_Sub33_5193.write36BitLong(0L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -52);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
	}

	public void method5530(boolean bool, byte i) {
		if (null != aClass567_10290) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(bool ? 2 : 3, 465637339);
				aClass536_Sub33_5193.write36BitLong(0L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -37);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
	}

	public void method5531(int i) {
		if (null != aClass567_10290) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(7, 465637339);
				aClass536_Sub33_5193.write36BitLong(0L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -15);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
	}

	public void method5532(int i) {
		if (aClass567_10290 != null)
			aClass567_10290.method6913(-842345557);
	}

	public boolean method5540() {
		if (aClass567_10290 != null) {
			long l = Class249.method3450(1420245672);
			int i = (int) (l - -3374237855994863421L * aLong5192);
			aLong5192 = l * 5457350524624408555L;
			if (i > 200)
				i = 200;
			anInt5191 += -429078247 * i;
			if (anInt5191 * -1802730711 > 30000) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
			}
		}
		if (null == aClass567_10290) {
			if (method5526(963482457) == 0 && method5525(1785499836) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5185.method8248(-216156270)); class536_sub18_sub15_sub2 != null; class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5185.method8241(1687994474))) {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(1, 465637339);
				aClass536_Sub33_5193.write36BitLong((class536_sub18_sub15_sub2.aLong10507) * 4749301371101216403L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -4);
				aClass700_5181.method8239(class536_sub18_sub15_sub2, (byte) 114);
			}
			for (Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5187.method8248(-1114398637)); class536_sub18_sub15_sub2 != null; class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5187.method8241(-527021473))) {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(0, 465637339);
				aClass536_Sub33_5193.write36BitLong((class536_sub18_sub15_sub2.aLong10507) * 4749301371101216403L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -1);
				aClass700_5190.method8239(class536_sub18_sub15_sub2, (byte) 20);
			}
			for (int i = 0; i < 100; i++) {
				int i_18_ = aClass567_10290.method6898(2115177941);
				if (i_18_ < 0)
					throw new IOException();
				if (i_18_ == 0)
					break;
				anInt5191 = 0;
				if (aClass536_Sub18_Sub15_Sub2_5202 == null) {
					int i_19_ = 5 - aClass536_Sub33_5199.off * -810172525;
					if (i_19_ > i_18_)
						i_19_ = i_18_;
					aClass567_10290.method6899((aClass536_Sub33_5199.buffer), (aClass536_Sub33_5199.off * -810172525), i_19_, 1273047684);
					if (aByte5182 != 0) {
						for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
							aClass536_Sub33_5199.buffer[i_20_ + (aClass536_Sub33_5199.off * -810172525)] ^= aByte5182;
					}
					aClass536_Sub33_5199.off += 516175515 * i_19_;
					if (aClass536_Sub33_5199.off * -810172525 >= 5) {
						aClass536_Sub33_5199.off = 0;
						int i_21_ = aClass536_Sub33_5199.readUnsignedByte();
						int i_22_ = aClass536_Sub33_5199.readInt();
						boolean bool_23_ = (i_22_ & ~0x7fffffff) != 0;
						int i_24_ = i_22_ & 0x7fffffff;
						long l = (long) i_24_ + ((long) i_21_ << 32);
						if (bool_23_) {
							Iterator iterator = aClass700_5190.iterator();
							while (iterator.hasNext()) {
								Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) iterator.next());
								if (l == (class536_sub18_sub15_sub2.aLong10507 * 4749301371101216403L)) {
									aClass536_Sub18_Sub15_Sub2_5202 = class536_sub18_sub15_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass700_5181.iterator();
							while (iterator.hasNext()) {
								Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) iterator.next());
								if ((class536_sub18_sub15_sub2.aLong10507 * 4749301371101216403L) == l) {
									aClass536_Sub18_Sub15_Sub2_5202 = class536_sub18_sub15_sub2;
									break;
								}
							}
						}
						if (aClass536_Sub18_Sub15_Sub2_5202 == null)
							throw new IOException();
						anInt5201 = -1828991779;
						aClass536_Sub33_5199.off = 0;
						buffer.off = 0;
					}
				} else {
					RSByteBuffer class536_sub33 = (aClass536_Sub18_Sub15_Sub2_5202.aClass536_Sub33_12114);
					if (class536_sub33 == null) {
						int i_25_ = 5 - buffer.off * -810172525;
						if (i_25_ > i_18_)
							i_25_ = i_18_;
						aClass567_10290.method6899(buffer.buffer, -810172525 * buffer.off, i_25_, 915699093);
						if (aByte5182 != 0) {
							for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
								buffer.buffer[-810172525 * (buffer.off) + i_26_] ^= aByte5182;
						}
						buffer.off += i_25_ * 516175515;
						if (buffer.off * -810172525 >= 5) {
							buffer.off = 0;
							int i_27_ = buffer.readUnsignedByte();
							int i_28_ = buffer.readInt();
							int i_29_ = 5;
							if (i_27_ != Class463.aClass463_5222.method78())
								i_29_ = 9;
							class536_sub33 = aClass536_Sub18_Sub15_Sub2_5202.aClass536_Sub33_12114 = (new RSByteBuffer(aClass536_Sub18_Sub15_Sub2_5202.aByte12115 + (i_28_ + i_29_)));
							class536_sub33.writeByte(i_27_, 465637339);
							class536_sub33.writeInt(i_28_, -149241618);
							anInt5201 += -1828991779;
						}
					} else {
						int i_30_ = (class536_sub33.buffer.length - aClass536_Sub18_Sub15_Sub2_5202.aByte12115);
						int i_31_ = 102400 - anInt5201 * -1671095991;
						if (i_31_ > i_30_ - -810172525 * class536_sub33.off)
							i_31_ = (i_30_ - -810172525 * class536_sub33.off);
						if (i_31_ > i_18_)
							i_31_ = i_18_;
						aClass567_10290.method6899((class536_sub33.buffer), -810172525 * (class536_sub33.off), i_31_, -908692013);
						if (aByte5182 != 0) {
							for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
								class536_sub33.buffer[i_32_ + (class536_sub33.off * -810172525)] ^= aByte5182;
						}
						class536_sub33.off += 516175515 * i_31_;
						anInt5201 += -1224791815 * i_31_;
						if (-810172525 * class536_sub33.off == i_30_) {
							aClass536_Sub18_Sub15_Sub2_5202.method9521(-1877804171);
							aClass536_Sub18_Sub15_Sub2_5202.aBool11777 = false;
							aClass536_Sub18_Sub15_Sub2_5202 = null;
						} else if (anInt5201 * -1671095991 == 102400) {
							anInt5201 = 0;
							aClass536_Sub18_Sub15_Sub2_5202 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass567_10290.method6913(-842345557);
			} catch (Exception exception) {
				/* empty */
			}
			aClass567_10290 = null;
			anInt5195 += 971530315;
			anInt5196 = 1877235214;
			if (method5526(963482457) == 0 && method5525(637426703) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public boolean method5524() {
		if (aClass567_10290 != null) {
			long l = Class249.method3450(2094336933);
			int i = (int) (l - -3374237855994863421L * aLong5192);
			aLong5192 = l * 5457350524624408555L;
			if (i > 200)
				i = 200;
			anInt5191 += -429078247 * i;
			if (anInt5191 * -1802730711 > 30000) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
			}
		}
		if (null == aClass567_10290) {
			if (method5526(963482457) == 0 && method5525(-214662071) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5185.method8248(-1049829315)); class536_sub18_sub15_sub2 != null; class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5185.method8241(1179760332))) {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(1, 465637339);
				aClass536_Sub33_5193.write36BitLong((class536_sub18_sub15_sub2.aLong10507) * 4749301371101216403L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) 8);
				aClass700_5181.method8239(class536_sub18_sub15_sub2, (byte) 45);
			}
			for (Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5187.method8248(-1646630221)); class536_sub18_sub15_sub2 != null; class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5187.method8241(1963039271))) {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(0, 465637339);
				aClass536_Sub33_5193.write36BitLong((class536_sub18_sub15_sub2.aLong10507) * 4749301371101216403L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -10);
				aClass700_5190.method8239(class536_sub18_sub15_sub2, (byte) 56);
			}
			for (int i = 0; i < 100; i++) {
				int i_33_ = aClass567_10290.method6898(1639777703);
				if (i_33_ < 0)
					throw new IOException();
				if (i_33_ == 0)
					break;
				anInt5191 = 0;
				if (aClass536_Sub18_Sub15_Sub2_5202 == null) {
					int i_34_ = 5 - aClass536_Sub33_5199.off * -810172525;
					if (i_34_ > i_33_)
						i_34_ = i_33_;
					aClass567_10290.method6899((aClass536_Sub33_5199.buffer), (aClass536_Sub33_5199.off * -810172525), i_34_, 341199586);
					if (aByte5182 != 0) {
						for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
							aClass536_Sub33_5199.buffer[i_35_ + (aClass536_Sub33_5199.off * -810172525)] ^= aByte5182;
					}
					aClass536_Sub33_5199.off += 516175515 * i_34_;
					if (aClass536_Sub33_5199.off * -810172525 >= 5) {
						aClass536_Sub33_5199.off = 0;
						int i_36_ = aClass536_Sub33_5199.readUnsignedByte();
						int i_37_ = aClass536_Sub33_5199.readInt();
						boolean bool_38_ = (i_37_ & ~0x7fffffff) != 0;
						int i_39_ = i_37_ & 0x7fffffff;
						long l = (long) i_39_ + ((long) i_36_ << 32);
						if (bool_38_) {
							Iterator iterator = aClass700_5190.iterator();
							while (iterator.hasNext()) {
								Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) iterator.next());
								if (l == (class536_sub18_sub15_sub2.aLong10507 * 4749301371101216403L)) {
									aClass536_Sub18_Sub15_Sub2_5202 = class536_sub18_sub15_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = aClass700_5181.iterator();
							while (iterator.hasNext()) {
								Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) iterator.next());
								if ((class536_sub18_sub15_sub2.aLong10507 * 4749301371101216403L) == l) {
									aClass536_Sub18_Sub15_Sub2_5202 = class536_sub18_sub15_sub2;
									break;
								}
							}
						}
						if (aClass536_Sub18_Sub15_Sub2_5202 == null)
							throw new IOException();
						anInt5201 = -1828991779;
						aClass536_Sub33_5199.off = 0;
						buffer.off = 0;
					}
				} else {
					RSByteBuffer class536_sub33 = (aClass536_Sub18_Sub15_Sub2_5202.aClass536_Sub33_12114);
					if (class536_sub33 == null) {
						int i_40_ = 5 - buffer.off * -810172525;
						if (i_40_ > i_33_)
							i_40_ = i_33_;
						aClass567_10290.method6899(buffer.buffer, -810172525 * buffer.off, i_40_, -301530719);
						if (aByte5182 != 0) {
							for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
								buffer.buffer[-810172525 * (buffer.off) + i_41_] ^= aByte5182;
						}
						buffer.off += i_40_ * 516175515;
						if (buffer.off * -810172525 >= 5) {
							buffer.off = 0;
							int i_42_ = buffer.readUnsignedByte();
							int i_43_ = buffer.readInt();
							int i_44_ = 5;
							if (i_42_ != Class463.aClass463_5222.method78())
								i_44_ = 9;
							class536_sub33 = aClass536_Sub18_Sub15_Sub2_5202.aClass536_Sub33_12114 = (new RSByteBuffer(aClass536_Sub18_Sub15_Sub2_5202.aByte12115 + (i_43_ + i_44_)));
							class536_sub33.writeByte(i_42_, 465637339);
							class536_sub33.writeInt(i_43_, -149241618);
							anInt5201 += -1828991779;
						}
					} else {
						int i_45_ = (class536_sub33.buffer.length - aClass536_Sub18_Sub15_Sub2_5202.aByte12115);
						int i_46_ = 102400 - anInt5201 * -1671095991;
						if (i_46_ > i_45_ - -810172525 * class536_sub33.off)
							i_46_ = (i_45_ - -810172525 * class536_sub33.off);
						if (i_46_ > i_33_)
							i_46_ = i_33_;
						aClass567_10290.method6899((class536_sub33.buffer), -810172525 * (class536_sub33.off), i_46_, 714761375);
						if (aByte5182 != 0) {
							for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
								class536_sub33.buffer[i_47_ + (class536_sub33.off * -810172525)] ^= aByte5182;
						}
						class536_sub33.off += 516175515 * i_46_;
						anInt5201 += -1224791815 * i_46_;
						if (-810172525 * class536_sub33.off == i_45_) {
							aClass536_Sub18_Sub15_Sub2_5202.method9521(-134553865);
							aClass536_Sub18_Sub15_Sub2_5202.aBool11777 = false;
							aClass536_Sub18_Sub15_Sub2_5202 = null;
						} else if (anInt5201 * -1671095991 == 102400) {
							anInt5201 = 0;
							aClass536_Sub18_Sub15_Sub2_5202 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				aClass567_10290.method6913(-842345557);
			} catch (Exception exception) {
				/* empty */
			}
			aClass567_10290 = null;
			anInt5195 += 971530315;
			anInt5196 = 1877235214;
			if (method5526(963482457) == 0 && method5525(1312140061) == 0)
				return true;
			return false;
		}
		return bool;
	}

	void method5527(int i, int i_48_, int i_49_) {
		try {
			aClass567_10290.method6913(-842345557);
		} catch (Exception exception) {
			/* empty */
		}
		aClass567_10290 = null;
		anInt5195 += 971530315;
		anInt5196 = 938617607;
		aByte5182 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt5197 = 1688272219 * i;
		anInt5183 = i_48_ * 1278660259;
	}

	public void method5542(boolean bool) {
		if (null != aClass567_10290) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(bool ? 2 : 3, 465637339);
				aClass536_Sub33_5193.write36BitLong(0L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -33);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
	}

	public void method5533(byte i) {
		if (null != aClass567_10290)
			aClass567_10290.method6902(1871380173);
	}

	public void method5544() {
		if (null != aClass567_10290) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(7, 465637339);
				aClass536_Sub33_5193.write36BitLong(0L);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) 51);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
	}

	public void method5545() {
		if (aClass567_10290 != null)
			aClass567_10290.method6913(-842345557);
	}

	public void method5546() {
		if (null != aClass567_10290)
			aClass567_10290.method6902(1923240608);
	}

	public void method5529(Object object, boolean bool, byte i) {
		if (aClass567_10290 != null) {
			try {
				aClass567_10290.method6913(-842345557);
			} catch (Exception exception) {
				/* empty */
			}
			aClass567_10290 = null;
		}
		aClass567_10290 = (Class567) object;
		method9323((byte) 1);
		method5530(bool, (byte) -76);
		aClass536_Sub33_5199.off = 0;
		buffer.off = 0;
		aClass536_Sub18_Sub15_Sub2_5202 = null;
		for (;;) {
			Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5181.method8237(398162282));
			if (null == class536_sub18_sub15_sub2)
				break;
			class536_sub18_sub15_sub2.aClass536_Sub33_12114 = null;
			aClass700_5185.method8239(class536_sub18_sub15_sub2, (byte) -37);
		}
		for (;;) {
			Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5190.method8237(906825177));
			if (null == class536_sub18_sub15_sub2)
				break;
			class536_sub18_sub15_sub2.aClass536_Sub33_12114 = null;
			aClass700_5187.method8239(class536_sub18_sub15_sub2, (byte) 28);
		}
		if (0 != aByte5182) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(4, 465637339);
				aClass536_Sub33_5193.writeByte(aByte5182, 465637339);
				aClass536_Sub33_5193.writeInt(0, -149241618);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) -26);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
		anInt5191 = 0;
		aLong5192 = Class249.method3450(1621521300) * 5457350524624408555L;
	}

	public void method5538() {
		if (null != aClass567_10290)
			aClass567_10290.method6902(2051949043);
	}

	public void method5534() {
		if (null != aClass567_10290)
			aClass567_10290.method6902(1922562062);
	}

	public void method5547() {
		if (null != aClass567_10290)
			aClass567_10290.method6902(2005400561);
	}

	public void method5541(Object object, boolean bool) {
		if (aClass567_10290 != null) {
			try {
				aClass567_10290.method6913(-842345557);
			} catch (Exception exception) {
				/* empty */
			}
			aClass567_10290 = null;
		}
		aClass567_10290 = (Class567) object;
		method9323((byte) 1);
		method5530(bool, (byte) -51);
		aClass536_Sub33_5199.off = 0;
		buffer.off = 0;
		aClass536_Sub18_Sub15_Sub2_5202 = null;
		for (;;) {
			Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5181.method8237(950213440));
			if (null == class536_sub18_sub15_sub2)
				break;
			class536_sub18_sub15_sub2.aClass536_Sub33_12114 = null;
			aClass700_5185.method8239(class536_sub18_sub15_sub2, (byte) -27);
		}
		for (;;) {
			Class536_Sub18_Sub15_Sub2 class536_sub18_sub15_sub2 = ((Class536_Sub18_Sub15_Sub2) aClass700_5190.method8237(1991335175));
			if (null == class536_sub18_sub15_sub2)
				break;
			class536_sub18_sub15_sub2.aClass536_Sub33_12114 = null;
			aClass700_5187.method8239(class536_sub18_sub15_sub2, (byte) 13);
		}
		if (0 != aByte5182) {
			try {
				aClass536_Sub33_5193.off = 0;
				aClass536_Sub33_5193.writeByte(4, 465637339);
				aClass536_Sub33_5193.writeByte(aByte5182, 465637339);
				aClass536_Sub33_5193.writeInt(0, -149241618);
				aClass567_10290.method6912(aClass536_Sub33_5193.buffer, 0, aClass536_Sub33_5193.buffer.length, (byte) 17);
			} catch (IOException ioexception) {
				try {
					aClass567_10290.method6913(-842345557);
				} catch (Exception exception) {
					/* empty */
				}
				aClass567_10290 = null;
				anInt5195 += 971530315;
				anInt5196 = 1877235214;
			}
		}
		anInt5191 = 0;
		aLong5192 = Class249.method3450(1432736651) * 5457350524624408555L;
	}
}
