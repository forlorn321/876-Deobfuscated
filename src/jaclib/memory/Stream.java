/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer aBuffer1130;
	private int anInt1131;
	private int anInt1132;
	private int anInt1133;
	private byte[] aByteArray1134;
	private static boolean aBool1135 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		aByteArray1134 = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.method1());
	}

	private Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.method1() < 4096 ? buffer.method1() : 4096);
		method1269(buffer, i, i_0_);
	}

	private void method1269(Buffer buffer, int i, int i_1_) {
		method1275();
		aBuffer1130 = buffer;
		anInt1132 = 1062738863 * i;
		anInt1131 = (i_1_ + i) * -336568465;
		if (anInt1131 * 1534582671 > buffer.method1())
			throw new RuntimeException();
	}

	public int method1270() {
		return 1679741267 * anInt1133 + anInt1132 * -1436804273;
	}

	public void method1271(int i) {
		method1275();
		anInt1132 = i * 1062738863;
	}

	public void method1272(int i) {
		if (1679741267 * anInt1133 >= aByteArray1134.length)
			method1275();
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) i;
	}

	public void method1273(float f) {
		if (3 + anInt1133 * 1679741267 >= aByteArray1134.length)
			method1275();
		int i = floatToRawIntBits(f);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 24);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 16);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 8);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) i;
	}

	public void method1274(float f) {
		if (3 + 1679741267 * anInt1133 >= aByteArray1134.length)
			method1275();
		int i = floatToRawIntBits(f);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) i;
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 8);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 16);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 24);
	}

	public void method1275() {
		if (1679741267 * anInt1133 > 0) {
			if (-1436804273 * anInt1132 + 1679741267 * anInt1133 > anInt1131 * 1534582671)
				throw new RuntimeException();
			aBuffer1130.method3(aByteArray1134, 0, -1436804273 * anInt1132, 1679741267 * anInt1133);
			anInt1132 += anInt1133 * 313317565;
			anInt1133 = 0;
		}
	}

	public static final boolean method1276() {
		return aBool1135;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);

	public int method1277() {
		return 1679741267 * anInt1133 + anInt1132 * -1436804273;
	}

	public int method1278() {
		return 1679741267 * anInt1133 + anInt1132 * -1436804273;
	}

	public void method1279(int i) {
		method1275();
		anInt1132 = i * 1062738863;
	}

	public void method1280(int i) {
		method1275();
		anInt1132 = i * 1062738863;
	}

	public void method1281(int i) {
		method1275();
		anInt1132 = i * 1062738863;
	}

	public void method1282(int i) {
		method1275();
		anInt1132 = i * 1062738863;
	}

	public void method1283(float f) {
		if (3 + anInt1133 * 1679741267 >= aByteArray1134.length)
			method1275();
		int i = floatToRawIntBits(f);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 24);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 16);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 8);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) i;
	}

	public void method1284(float f) {
		if (3 + anInt1133 * 1679741267 >= aByteArray1134.length)
			method1275();
		int i = floatToRawIntBits(f);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 24);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 16);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) (i >> 8);
		aByteArray1134[(anInt1133 += -947021093) * 1679741267 - 1] = (byte) i;
	}

	public void method1285() {
		if (1679741267 * anInt1133 > 0) {
			if (-1436804273 * anInt1132 + 1679741267 * anInt1133 > anInt1131 * 1534582671)
				throw new RuntimeException();
			aBuffer1130.method3(aByteArray1134, 0, -1436804273 * anInt1132, 1679741267 * anInt1133);
			anInt1132 += anInt1133 * 313317565;
			anInt1133 = 0;
		}
	}

	public void method1286() {
		if (1679741267 * anInt1133 > 0) {
			if (-1436804273 * anInt1132 + 1679741267 * anInt1133 > anInt1131 * 1534582671)
				throw new RuntimeException();
			aBuffer1130.method3(aByteArray1134, 0, -1436804273 * anInt1132, 1679741267 * anInt1133);
			anInt1132 += anInt1133 * 313317565;
			anInt1133 = 0;
		}
	}

	public static final boolean method1287() {
		return aBool1135;
	}
}
