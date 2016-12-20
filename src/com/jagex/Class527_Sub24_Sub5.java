/* Class527_Sub24_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub24_Sub5 extends Class527_Sub24 {
	Class352 this$0;
	String aString11640;

	void method16244(Class346 class346, int i) {
		class346.aString3722 = aString11640;
	}

	void method16248(RSByteBuffer class527_sub38, byte i) {
		aString11640 = class527_sub38.readString(1667653672);
		class527_sub38.readInt();
	}

	Class527_Sub24_Sub5(Class352 class352) {
		this$0 = class352;
	}

	void method16246(RSByteBuffer class527_sub38) {
		aString11640 = class527_sub38.readString(1973851713);
		class527_sub38.readInt();
	}

	void method16247(RSByteBuffer class527_sub38) {
		aString11640 = class527_sub38.readString(1784960024);
		class527_sub38.readInt();
	}

	void method16245(Class346 class346) {
		class346.aString3722 = aString11640;
	}

	void method16249(Class346 class346) {
		class346.aString3722 = aString11640;
	}
}
