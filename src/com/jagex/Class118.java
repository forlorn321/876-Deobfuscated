/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class118 {
	static final boolean method1508(int i, int i_0_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1509(int i, int i_1_) {
		return (i & 0x21) != 0;
	}

	static final boolean method1510(int i, int i_2_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1511(int i, int i_3_) {
		return (i & 0x34) != 0;
	}

	static final boolean method1512(int i, int i_4_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1513(int i, int i_5_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method1514(int i, int i_6_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method1515(int i, int i_7_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1516(int i, int i_8_) {
		return ((method1509(i, i_8_) | method1559(i, i_8_) | method1511(i, i_8_)) & method1521(i, i_8_));
	}

	static final boolean method1517(int i, int i_9_) {
		return (i & 0x10) != 0;
	}

	static final boolean method1518(int i, int i_10_) {
		if ((i & 0x10000) != 0 | method1513(i, i_10_) || method1561(i, i_10_))
			return true;
		return (i_10_ & 0x37) == 0 && method1528(i, i_10_);
	}

	static final boolean method1519(int i, int i_11_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1520(int i, int i_12_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1521(int i, int i_13_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1522(int i, int i_14_) {
		return (i & 0x800) != 0 && (i_14_ & 0x37) != 0;
	}

	static final boolean method1523(int i, int i_15_) {
		return (i & 0x34) != 0;
	}

	static final boolean method1524(int i, int i_16_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1525(int i, int i_17_) {
		return ((i & 0x60000) != 0 | method1517(i, i_17_) || method1528(i, i_17_) || method1530(i, i_17_));
	}

	static final boolean method1526(int i, int i_18_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1527(int i, int i_19_) {
		return false;
	}

	static final boolean method1528(int i, int i_20_) {
		if (!method1510(i, i_20_))
			return false;
		if ((i & 0xb000) != 0 | method1514(i, i_20_) | method1586(i, i_20_))
			return true;
		return ((i_20_ & 0x37) == 0 & (method1513(i, i_20_) | method1556(i, i_20_)));
	}

	static final boolean method1529(int i, int i_21_) {
		return method1527(i, i_21_) & method1524(i, i_21_);
	}

	static final boolean method1530(int i, int i_22_) {
		return method1517(i, i_22_) & method1526(i, i_22_);
	}

	static final boolean method1531(int i, int i_23_) {
		return ((i & 0x70000) != 0 | method1509(i, i_23_) || method1589(i, i_23_));
	}

	static final boolean method1532(int i, int i_24_) {
		return ((i & 0x70000) != 0 | method1559(i, i_24_) || method1589(i, i_24_));
	}

	static final boolean method1533(int i, int i_25_) {
		return ((i & 0x70000) != 0 | method1511(i, i_25_) || method1589(i, i_25_));
	}

	static final boolean method1534(int i, int i_26_) {
		if ((i & 0x10000) != 0 | method1513(i, i_26_) || method1561(i, i_26_))
			return true;
		return (i_26_ & 0x37) == 0 && method1528(i, i_26_);
	}

	static final boolean method1535(int i, int i_27_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method1536(int i, int i_28_) {
		return ((i & 0x40000) != 0 | method1586(i, i_28_) || method1528(i, i_28_));
	}

	static final boolean method1537(int i, int i_29_) {
		return method1514(i, i_29_) || method1528(i, i_29_);
	}

	static final boolean method1538(int i, int i_30_) {
		return (i & 0x180) != 0;
	}

	static final boolean method1539(int i, int i_31_) {
		return (i & 0x20) != 0;
	}

	static final boolean method1540(int i, int i_32_) {
		return (i & 0x400) != 0;
	}

	static final boolean method1541(int i, int i_33_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method1542(int i, int i_34_) {
		return (i & 0x800) != 0 | method1535(i, i_34_) || method1528(i, i_34_);
	}

	Class118() throws Throwable {
		throw new Error();
	}

	static final boolean method1543(int i, int i_35_) {
		return (i & 0x21) != 0;
	}

	static final boolean method1544(int i, int i_36_) {
		return method1527(i, i_36_) & method1524(i, i_36_);
	}

	static final boolean method1545(int i, int i_37_) {
		return (i & 0x34) != 0;
	}

	static final boolean method1546(int i, int i_38_) {
		return (i & 0x20) != 0;
	}

	static final boolean method1547(int i, int i_39_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1548(int i, int i_40_) {
		return method1514(i, i_40_) || method1528(i, i_40_);
	}

	static final boolean method1549(int i, int i_41_) {
		if ((i & 0x10000) != 0 | method1513(i, i_41_) || method1561(i, i_41_))
			return true;
		return (i_41_ & 0x37) == 0 && method1528(i, i_41_);
	}

	static final boolean method1550(int i, int i_42_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method1551(int i, int i_43_) {
		return ((i & 0x40000) != 0 | method1586(i, i_43_) || method1528(i, i_43_));
	}

	static final boolean method1552(int i, int i_44_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method1553(int i, int i_45_) {
		return false;
	}

	static final boolean method1554(int i, int i_46_) {
		return false;
	}

	static final boolean method1555(int i, int i_47_) {
		return false;
	}

	static final boolean method1556(int i, int i_48_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method1557(int i, int i_49_) {
		return method1514(i, i_49_) || method1528(i, i_49_);
	}

	static final boolean method1558(int i, int i_50_) {
		return (i & 0x10) != 0;
	}

	static final boolean method1559(int i, int i_51_) {
		return (i & 0x22) != 0;
	}

	static final boolean method1560(int i, int i_52_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1561(int i, int i_53_) {
		return (((i & 0x2000) != 0 | method1513(i, i_53_) | method1556(i, i_53_)) & method1522(i, i_53_));
	}

	static final boolean method1562(int i, int i_54_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1563(int i, int i_55_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1564(int i, int i_56_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1565(int i, int i_57_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1566(int i, int i_58_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1567(int i, int i_59_) {
		return (i & 0x800) != 0 && (i_59_ & 0x37) != 0;
	}

	static final boolean method1568(int i, int i_60_) {
		if (!method1510(i, i_60_))
			return false;
		if ((i & 0xb000) != 0 | method1514(i, i_60_) | method1586(i, i_60_))
			return true;
		return ((i_60_ & 0x37) == 0 & (method1513(i, i_60_) | method1556(i, i_60_)));
	}

	static final boolean method1569(int i, int i_61_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1570(int i, int i_62_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1571(int i, int i_63_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1572(int i, int i_64_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1573(int i, int i_65_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1574(int i, int i_66_) {
		return (((i & 0x2000) != 0 | method1513(i, i_66_) | method1556(i, i_66_)) & method1522(i, i_66_));
	}

	static final boolean method1575(int i, int i_67_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1576(int i, int i_68_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1577(int i, int i_69_) {
		return method1517(i, i_69_) & method1526(i, i_69_);
	}

	static final boolean method1578(int i, int i_70_) {
		return method1517(i, i_70_) & method1526(i, i_70_);
	}

	static final boolean method1579(int i, int i_71_) {
		return ((i & 0x70000) != 0 | method1509(i, i_71_) || method1589(i, i_71_));
	}

	static final boolean method1580(int i, int i_72_) {
		return ((i & 0x70000) != 0 | method1509(i, i_72_) || method1589(i, i_72_));
	}

	static final boolean method1581(int i, int i_73_) {
		return ((i & 0x70000) != 0 | method1559(i, i_73_) || method1589(i, i_73_));
	}

	static final boolean method1582(int i, int i_74_) {
		return ((i & 0x70000) != 0 | method1559(i, i_74_) || method1589(i, i_74_));
	}

	static final boolean method1583(int i, int i_75_) {
		return ((i & 0x70000) != 0 | method1511(i, i_75_) || method1589(i, i_75_));
	}

	static final boolean method1584(int i, int i_76_) {
		return ((i & 0x70000) != 0 | method1511(i, i_76_) || method1589(i, i_76_));
	}

	static final boolean method1585(int i, int i_77_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1586(int i, int i_78_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method1587(int i, int i_79_) {
		return ((i & 0x60000) != 0 | method1517(i, i_79_) || method1528(i, i_79_) || method1530(i, i_79_));
	}

	static final boolean method1588(int i, int i_80_) {
		return method1514(i, i_80_) || method1528(i, i_80_);
	}

	static final boolean method1589(int i, int i_81_) {
		return ((method1509(i, i_81_) | method1559(i, i_81_) | method1511(i, i_81_)) & method1521(i, i_81_));
	}

	static final boolean method1590(int i, int i_82_) {
		return ((i & 0x40000) != 0 | method1586(i, i_82_) || method1528(i, i_82_));
	}

	static final boolean method1591(int i, int i_83_) {
		return (i & 0x21) != 0;
	}

	static final boolean method1592(int i, int i_84_) {
		return method1527(i, i_84_) || method1529(i, i_84_);
	}

	static final boolean method1593(int i, int i_85_) {
		return (i & 0x180) != 0;
	}

	static final boolean method1594(int i, int i_86_) {
		return (i & 0x400) != 0;
	}

	static final boolean method1595(int i, int i_87_) {
		return (i & 0x20) != 0;
	}

	static final boolean method1596(int i, int i_88_) {
		return (i & 0x400) != 0;
	}

	static final boolean method1597(int i, int i_89_) {
		return method1527(i, i_89_) || method1529(i, i_89_);
	}

	static final boolean method1598(int i, int i_90_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1599(int i, int i_91_) {
		return (i & 0x800) != 0 | method1535(i, i_91_) || method1528(i, i_91_);
	}
}
