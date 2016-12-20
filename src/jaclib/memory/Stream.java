/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer aBuffer1123;
	private int anInt1124;
	private int anInt1125;
	private int anInt1126;
	private byte[] aByteArray1127;
	private static boolean aBool1128 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		aByteArray1127 = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.method1());
	}

	private Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.method1() < 4096 ? buffer.method1() : 4096);
		method1703(buffer, i, i_0_);
	}

	private void method1703(Buffer buffer, int i, int i_1_) {
		method1709();
		aBuffer1123 = buffer;
		anInt1125 = i * -1280321467;
		anInt1124 = 916091131 * (i_1_ + i);
		if (-140109261 * anInt1124 > buffer.method1())
			throw new RuntimeException();
	}

	public int method1704() {
		return -864769735 * anInt1126 + anInt1125 * -1936622963;
	}

	public void method1705(int i) {
		method1709();
		anInt1125 = i * -1280321467;
	}

	public void method1706(int i) {
		if (-864769735 * anInt1126 >= aByteArray1127.length)
			method1709();
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
	}

	public void method1707(float f) {
		if (3 + anInt1126 * -864769735 >= aByteArray1127.length)
			method1709();
		int i = floatToRawIntBits(f);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 24);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 16);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 8);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
	}

	public void method1708(float f) {
		if (anInt1126 * -864769735 + 3 >= aByteArray1127.length)
			method1709();
		int i = floatToRawIntBits(f);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 8);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 16);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 24);
	}

	public void method1709() {
		if (-864769735 * anInt1126 > 0) {
			if (-1936622963 * anInt1125 + anInt1126 * -864769735 > -140109261 * anInt1124)
				throw new RuntimeException();
			aBuffer1123.method3(aByteArray1127, 0, anInt1125 * -1936622963, -864769735 * anInt1126);
			anInt1125 += 321959005 * anInt1126;
			anInt1126 = 0;
		}
	}

	public static final boolean method1710() {
		return aBool1128;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);

	private void method1711(Buffer buffer, int i, int i_2_) {
		method1709();
		aBuffer1123 = buffer;
		anInt1125 = i * -1280321467;
		anInt1124 = 916091131 * (i_2_ + i);
		if (-140109261 * anInt1124 > buffer.method1())
			throw new RuntimeException();
	}

	private void method1712(Buffer buffer, int i, int i_3_) {
		method1709();
		aBuffer1123 = buffer;
		anInt1125 = i * -1280321467;
		anInt1124 = 916091131 * (i_3_ + i);
		if (-140109261 * anInt1124 > buffer.method1())
			throw new RuntimeException();
	}

	public int method1713() {
		return -864769735 * anInt1126 + anInt1125 * -1936622963;
	}

	public int method1714() {
		return -864769735 * anInt1126 + anInt1125 * -1936622963;
	}

	public int method1715() {
		return -864769735 * anInt1126 + anInt1125 * -1936622963;
	}

	public int method1716() {
		return -864769735 * anInt1126 + anInt1125 * -1936622963;
	}

	public void method1717(int i) {
		method1709();
		anInt1125 = i * -1280321467;
	}

	public void method1718(int i) {
		method1709();
		anInt1125 = i * -1280321467;
	}

	public void method1719(int i) {
		if (-864769735 * anInt1126 >= aByteArray1127.length)
			method1709();
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
	}

	public void method1720(int i) {
		if (-864769735 * anInt1126 >= aByteArray1127.length)
			method1709();
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
	}

	public void method1721(float f) {
		if (3 + anInt1126 * -864769735 >= aByteArray1127.length)
			method1709();
		int i = floatToRawIntBits(f);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 24);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 16);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 8);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
	}

	public void method1722(float f) {
		if (anInt1126 * -864769735 + 3 >= aByteArray1127.length)
			method1709();
		int i = floatToRawIntBits(f);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) i;
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 8);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 16);
		aByteArray1127[(anInt1126 += -838372087) * -864769735 - 1] = (byte) (i >> 24);
	}

	public void method1723() {
		if (-864769735 * anInt1126 > 0) {
			if (-1936622963 * anInt1125 + anInt1126 * -864769735 > -140109261 * anInt1124)
				throw new RuntimeException();
			aBuffer1123.method3(aByteArray1127, 0, anInt1125 * -1936622963, -864769735 * anInt1126);
			anInt1125 += 321959005 * anInt1126;
			anInt1126 = 0;
		}
	}

	public void method1724() {
		if (-864769735 * anInt1126 > 0) {
			if (-1936622963 * anInt1125 + anInt1126 * -864769735 > -140109261 * anInt1124)
				throw new RuntimeException();
			aBuffer1123.method3(aByteArray1127, 0, anInt1125 * -1936622963, -864769735 * anInt1126);
			anInt1125 += 321959005 * anInt1126;
			anInt1126 = 0;
		}
	}

	public static final boolean method1725() {
		return aBool1128;
	}

	public static final boolean method1726() {
		return aBool1128;
	}
}
