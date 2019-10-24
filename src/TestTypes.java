
public class TestTypes 
{
	public static void TestByte()
	{
		byte a = 8;
		byte b = 3;
		byte c = 0;
		c = (byte) (a + b);
		System.out.printf("Addition: %d + %d = %d\n", a, b, c);
		c = (byte) (a - b);
		System.out.printf("Subtraction: %d - %d = %d\n", a, b, c);
		c = (byte) (a * b);
		System.out.printf("Multiplication: %d * %d = %d\n", a, b, c);
		c = (byte) (a / b);
		System.out.printf("Division: %d / %d = %d\n", a, b, c);
		c = (byte) -a;
		System.out.printf("Unary Minus: -%d = %d\n", a, c);
		c = (byte) +a;
		System.out.printf("Unary Plus: +%d = %d\n", a, c);
		//bitwice
		c = (byte) (a & b);
		System.out.printf("Bitwice AND: %d & %d = %d\n", a, b, c);
		c = (byte) (a | b);
		System.out.printf("Bitwice OR: %d | %d = %d\n", a, b, c);
		c = (byte) (a ^ b);
		System.out.printf("Bitwice XOR: %d ^ %d = %d\n", a, b, c);
		c = (byte) (a << 1);
		System.out.printf("Left Shift: %d << 1 = %d\n", a, c);
		c = (byte) (a >> 1);
		System.out.printf("Right Shift: %d >> 1 = %d\n", a, c);
		c = 10;
		//assignment operators
		System.out.printf("Ñompound addition: %d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("Ñompound division: %d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("Ñompound bitwice OR: %d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("Ñompound bitwice AND: %d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("Ñompound bitwice XOR: %d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("Ñompound right shift: %d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("Ñompound left shift: %d <<= 1 --> c = %d\n", c, c <<= 1);
		//relation
		System.out.printf("More: %d > %d --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("Less: %d < %d --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %d == %d --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %d != %d --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%d > %d) && (%d > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%d >= %d) || (%d != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%d >= %d) --> %b\n", a, b, !(a >= b));
		//cast
		short sh = -200;
		char ch = 'a';
		long l = 10000000L;
		float f = 1.9f;
		double d = 123.456;
	    int i = 10;
	    c = (byte) i;
	    System.out.printf("Int -> byte: %d --> %d\n", i, c);
		c = (byte) sh;
		System.out.printf("Short -> byte: %d --> %d\n", sh, c);
		c = (byte) ch;
		System.out.printf("Char -> byte: '%c' --> %d\n", ch, c);
		c = (byte) l;
		System.out.printf("Long -> byte: %d --> %d\n", l, c);
		c = (byte) f;
		System.out.printf("Float -> byte: %f --> %d\n", f, c);
		c = (byte) d;
		System.out.printf("Double -> byte: %f --> %d\n", d, c);
	}
	public static void TestShort()
	{
		short a = 12;
		short b = 6;
		short c = 0;
		c = (short) (a + b);
		System.out.printf("Addition: %d + %d = %d\n", a, b, c);
		c = (short) (a - b);
		System.out.printf("Subtraction: %d - %d = %d\n", a, b, c);
		c = (short) (a * b);
		System.out.printf("Multiplication: %d * %d = %d\n", a, b, c);
		c = (short) (a / b);
		System.out.printf("Division: %d / %d = %d\n", a, b, c);
		c = (short) -a;
		System.out.printf("Unary Minus: -%d = %d\n", a, c);
		c = (short) +a;
		System.out.printf("Unary Plus: +%d = %d\n", a, c);
		//bitwice
		c = (short) (a & b);
		System.out.printf("Bitwice AND: %d & %d = %d\n", a, b, c);
		c = (short) (a | b);
		System.out.printf("Bitwice OR: %d | %d = %d\n", a, b, c);
		c = (short) (a ^ b);
		System.out.printf("Bitwice XOR: %d ^ %d = %d\n", a, b, c);
		c = (short) (a << 1);
		System.out.printf("Left Shift: %d << 1 = %d\n", a, c);
		c = (short) (a >> 1);
		System.out.printf("Right Shift: %d >> 1 = %d\n", a, c);
		c = 10;
		//assignment operators
		System.out.printf("Ñompound addition: %d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("Ñompound division: %d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("Ñompound bitwice OR: %d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("Ñompound bitwice AND: %d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("Ñompound bitwice XOR: %d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("Ñompound right shift: %d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("Ñompound left shift: %d <<= 1 --> c = %d\n", c, c <<= 1);
		//relation
		System.out.printf("More: %d > %d --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("Less: %d < %d --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %d == %d --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %d != %d --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%d > %d) && (%d > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%d >= %d) || (%d != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%d >= %d) --> %b\n", a, b, !(a >= b));
		//cast
		byte by = 30;
		char ch = 'a';
		long l = 10000000L;
		float f = 1.9f;
		double d = 123.456;
	    int i = 10;
	    c = (short) i;
	    System.out.printf("Int -> short: %d --> %d\n", i, c);
		c = (short) by;
		System.out.printf("Byte -> short: %d --> %d\n", by, c);
		c = (short) ch;
		System.out.printf("Char -> short: '%c' --> %d\n", ch, c);
		c = (short) l;
		System.out.printf("Long -> short: %d --> %d\n", l, c);
		c = (short) f;
		System.out.printf("Float -> short: %f --> %d\n", f, c);
		c = (short) d;
		System.out.printf("Double -> short: %f --> %d\n", d, c);
	}
	public static void TestInt()
	{
		int a = 40;
		int b = 12;
		int c = 0;
		c = (int) (a + b);
		System.out.printf("Addition: %d + %d = %d\n", a, b, c);
		c = (int) (a - b);
		System.out.printf("Subtraction: %d - %d = %d\n", a, b, c);
		c = (int) (a * b);
		System.out.printf("Multiplication: %d * %d = %d\n", a, b, c);
		c = (int) (a / b);
		System.out.printf("Division: %d / %d = %d\n", a, b, c);
		c = (int) -a;
		System.out.printf("Unary Minus: -%d = %d\n", a, c);
		c = (int) +a;
		System.out.printf("Unary Plus: +%d = %d\n", a, c);
		//bitwice
		c = (int) (a & b);
		System.out.printf("Bitwice AND: %d & %d = %d\n", a, b, c);
		c = (int) (a | b);
		System.out.printf("Bitwice OR: %d | %d = %d\n", a, b, c);
		c = (int) (a ^ b);
		System.out.printf("Bitwice XOR: %d ^ %d = %d\n", a, b, c);
		c = (int) (a << 1);
		System.out.printf("Left Shift: %d << 1 = %d\n", a, c);
		c = (int) (a >> 1);
		System.out.printf("Right Shift: %d >> 1 = %d\n", a, c);
		c = 10;
		//assignment operators
		System.out.printf("Ñompound addition: %d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("Ñompound division: %d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("Ñompound bitwice OR: %d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("Ñompound bitwice AND: %d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("Ñompound bitwice XOR: %d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("Ñompound right shift: %d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("Ñompound left shift: %d <<= 1 --> c = %d\n", c, c <<= 1);
		//relation
		System.out.printf("More: %d > %d --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("Less: %d < %d --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %d == %d --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %d != %d --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%d > %d) && (%d > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%d >= %d) || (%d != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%d >= %d) --> %b\n", a, b, !(a >= b));
		//cast
		byte by = 30;
		char ch = 'a';
		long l = 10000000L;
		float f = 1.9f;
		double d = 123.456;
	    short sh = -10;
	    c = (int) sh;
	    System.out.printf("Short -> int: %d --> %d\n", sh, c);
		c = (int) by;
		System.out.printf("Byte -> int: %d --> %d\n", by, c);
		c = (int) ch;
		System.out.printf("Char -> int: '%c' --> %d\n", ch, c);
		c = (int) l;
		System.out.printf("Long -> int: %d --> %d\n", l, c);
		c = (int) f;
		System.out.printf("Float -> int: %f --> %d\n", f, c);
		c = (int) d;
		System.out.printf("Double -> int: %f --> %d\n", d, c);
	}
	public static void TestLong()
	{
		long a = 50;
		long b = 40;
		long c = 0;
		c = (long) (a + b);
		System.out.printf("Addition: %d + %d = %d\n", a, b, c);
		c = (long) (a - b);
		System.out.printf("Subtraction: %d - %d = %d\n", a, b, c);
		c = (long) (a * b);
		System.out.printf("Multiplication: %d * %d = %d\n", a, b, c);
		c = (long) (a / b);
		System.out.printf("Division: %d / %d = %d\n", a, b, c);
		c = (long) -a;
		System.out.printf("Unary Minus: -%d = %d\n", a, c);
		c = (long) +a;
		System.out.printf("Unary Plus: +%d = %d\n", a, c);
		//bitwice
		c = (long) (a & b);
		System.out.printf("Bitwice AND: %d & %d = %d\n", a, b, c);
		c = (long) (a | b);
		System.out.printf("Bitwice OR: %d | %d = %d\n", a, b, c);
		c = (long) (a ^ b);
		System.out.printf("Bitwice XOR: %d ^ %d = %d\n", a, b, c);
		c = (long) (a << 1);
		System.out.printf("Left Shift: %d << 1 = %d\n", a, c);
		c = (long) (a >> 1);
		System.out.printf("Right Shift: %d >> 1 = %d\n", a, c);
		c = 10;
		//assignment operators
		System.out.printf("Ñompound addition: %d += %d --> c = %d\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %d -= %d --> c = %d\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %d *= %d --> c = %d\n", c, a, c *= a);
		System.out.printf("Ñompound division: %d /= %d --> c = %d\n", c, a, c /= a);
		System.out.printf("Ñompound bitwice OR: %d |= %d --> c = %d\n", c, a, c |= a);
		System.out.printf("Ñompound bitwice AND: %d &= %d --> c = %d\n", c, a, c &= a);
		System.out.printf("Ñompound bitwice XOR: %d ^= %d --> c = %d\n", c, a, c ^= a);
		System.out.printf("Ñompound right shift: %d >>= 1 --> c = %d\n", c, c >>= 1);
		System.out.printf("Ñompound left shift: %d <<= 1 --> c = %d\n", c, c <<= 1);
		//relation
		System.out.printf("More: %d > %d --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %d >= %d --> %b\n", a, b, a >= b);
		System.out.printf("Less: %d < %d --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %d <= %d --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %d == %d --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %d != %d --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%d > %d) && (%d > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%d >= %d) || (%d != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%d >= %d) --> %b\n", a, b, !(a >= b));
		//cast
		byte by = 30;
		char ch = 'a';
		short sh = 20;
		float f = 1.9f;
		double d = 123.456;
	    int i = 10;
	    c = (long) i;
	    System.out.printf("Int -> long: %d --> %d\n", i, c);
		c = (long) by;
		System.out.printf("Byte -> long: %d --> %d\n", by, c);
		c = (long) ch;
		System.out.printf("Char -> long: '%c' --> %d\n", ch, c);
		c = (long) sh;
		System.out.printf("Short -> long: %d --> %d\n", sh, c);
		c = (long) f;
		System.out.printf("Float -> long: %f --> %d\n", f, c);
		c = (long) d;
		System.out.printf("Double -> long: %f --> %d\n", d, c);
	}
	public static void TestFloat()
	{
		float a = 2.5f;
		float b = 1.3f;
		float c = 0;
		c = (float) (a + b);
		System.out.printf("Addition: %f + %f = %f\n", a, b, c);
		c = (float) (a - b);
		System.out.printf("Subtraction: %f - %f = %f\n", a, b, c);
		c = (float) (a * b);
		System.out.printf("Multiplication: %f * %f = %f\n", a, b, c);
		c = (float) (a / b);
		System.out.printf("Division: %f / %f = %f\n", a, b, c);
		c = (float) -a;
		System.out.printf("Unary Minus: -%f = %f\n", a, c);
		c = (float) +a;
		System.out.printf("Unary Plus: +%f = %f\n", a, c);
		
		c = 10;
		//assignment operators
		System.out.printf("Ñompound addition: %f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("Ñompound division: %f /= %f --> c = %f\n", c, a, c /= a);
		//relation
		System.out.printf("More: %f > %f --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %f >= %f --> %b\n", a, b, a >= b);
		System.out.printf("Less: %f < %f --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %f <= %f --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %f == %f --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %f != %f --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%f > %f) && (%f > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%f >= %f) || (%f != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%f >= %f) --> %b\n", a, b, !(a >= b));
		//cast
		byte by = 30;
		char ch = 'a';
		short sh = 20;
		long l = 100;
		double d = 123.456;
	    int i = 10;
	    c = (float) i;
	    System.out.printf("Int -> float: %d --> %f\n", i, c);
		c = (float) by;
		System.out.printf("Byte -> float: %d --> %f\n", by, c);
		c = (float) ch;
		System.out.printf("Char -> float: '%c' --> %f\n", ch, c);
		c = (float) sh;
		System.out.printf("Short -> float: %d --> %f\n", sh, c);
		c = (float) l;
		System.out.printf("Long -> float: %d --> %f\n", l, c);
		c = (float) d;
		System.out.printf("Double -> float: %f --> %f\n", d, c);
	}
	public static void TestDouble()
	{
		double a = 123.456;
		double b = 34.567;
		double c = 0;
		c = (double) (a + b);
		System.out.printf("Addition: %f + %f = %f\n", a, b, c);
		c = (double) (a - b);
		System.out.printf("Subtraction: %f - %f = %f\n", a, b, c);
		c = (double) (a * b);
		System.out.printf("Multiplication: %f * %f = %f\n", a, b, c);
		c = (double) (a / b);
		System.out.printf("Division: %f / %f = %f\n", a, b, c);
		c = (double) -a;
		System.out.printf("Unary Minus: -%f = %f\n", a, c);
		c = (double) +a;
		System.out.printf("Unary Plus: +%f = %f\n", a, c);
		
		c = 10;
		//assignment operators
		System.out.printf("Ñompound addition: %f += %f --> c = %f\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %f -= %f --> c = %f\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %f *= %f --> c = %f\n", c, a, c *= a);
		System.out.printf("Ñompound division: %f /= %f --> c = %f\n", c, a, c /= a);
		//relation
		System.out.printf("More: %f > %f --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %f >= %f --> %b\n", a, b, a >= b);
		System.out.printf("Less: %f < %f --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %f <= %f --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %f == %f --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %f != %f --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%f > %f) && (%f > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%f >= %f) || (%f != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%f >= %f) ^ (%f != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%f >= %f) --> %b\n", a, b, !(a >= b));
		//cast
		byte by = 30;
		char ch = 'a';
		short sh = 20;
		long l = 100;
		float f = 1.9f;
	    int i = 10;
	    c = (double) i;
	    System.out.printf("Int -> double: %d --> %f\n", i, c);
		c = (double) by;
		System.out.printf("Byte -> double: %d --> %f\n", by, c);
		c = (double) ch;
		System.out.printf("Char -> double: '%c' --> %f\n", ch, c);
		c = (double) sh;
		System.out.printf("Short -> double: %d --> %f\n", sh, c);
		c = (double) l;
		System.out.printf("Long -> double: %d --> %f\n", l, c);
		c = (double) f;
		System.out.printf("Float -> double: %f --> %f\n", f, c);
	}
	public static void TestChar()
	{
		char a = 'a';
		char b = 'b';
		char c = 0;
		c = (char) (a + b);
		System.out.printf("Addition: %c + %c = %c\n", a, b, c);
		c = (char) (a - b);
		System.out.printf("Subtraction: %c - %c = %c\n", a, b, c);
		c = (char) (a * b);
		System.out.printf("Multiplication: %c * %c = %c\n", a, b, c);
		c = (char) (a / b);
		System.out.printf("Division: %c / %c = %c\n", a, b, c);
		c = (char) -a;
		System.out.printf("Unary Minus: -%c = %c\n", a, c);
		c = (char) +a;
		System.out.printf("Unary Plus: +%c = %c\n", a, c);
		
		c = 'f';
		//assignment operators
		System.out.printf("Ñompound addition: %c += %c --> c = %c\n", c, a, c += a);
		System.out.printf("Ñompound subtraction: %c -= %c --> c = %c\n", c, a, c -= a);
		System.out.printf("Ñompound multiplication: %c *= %c --> c = %c\n", c, a, c *= a);
		System.out.printf("Ñompound division: %c /= %c --> c = %c\n", c, a, c /= a);
		System.out.printf("Ñompound bitwice OR: %c |= %c --> c = %c\n", c, a, c |= a);
		System.out.printf("Ñompound bitwice AND: %c &= %c --> c = %c\n", c, a, c &= a);
		System.out.printf("Ñompound bitwice XOR: %c ^= %c --> c = %c\n", c, a, c ^= a);
		System.out.printf("Ñompound right shift: %c >>= 1 --> c = %c\n", c, c >>= 1);
		System.out.printf("Ñompound left shift: %c <<= 1 --> c = %c\n", c, c <<= 1);
	
		//relation
		System.out.printf("More: %c > %c --> %b\n", a, b, a > b);
		System.out.printf("More or equal: %c >= %c --> %b\n", a, b, a >= b);
		System.out.printf("Less: %c < %c --> %b\n", a, b, a < b);
		System.out.printf("Less or equal: %c <= %c --> %b\n", a, b, a <= b);
		System.out.printf("Equality: %c == %c --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %c != %c --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: (%c > %c) && (%c > 0) --> %b\n", a, b, a,(a > b) && (a > 0));
		System.out.printf("Logical OR: (%c >= %c) || (%c != 0) --> %b\n", a, b, b,(a >= b) || (b != 0));
		System.out.printf("Logical XOR: (%c >= %c) ^ (%c != 0) --> %b\n", a, b, b,(a >= b) ^ (b != 0));
		System.out.printf("Logical NOT: !(%c >= %c) --> %b\n", a, b, !(a >= b));
		//cast
		byte by = 30;
		double d = 1234.466;
		short sh = 20;
		long l = 100;
		float f = 1.9f;
	    int i = 10;
	    c = (char) i;
	    System.out.printf("Int -> char: %d --> %c\n", i, c);
		c = (char) by;
		System.out.printf("Byte -> char: %d --> %c\n", by, c);
		c = (char) d;
		System.out.printf("Double -> char: '%f' --> %c\n", d, c);
		c = (char) sh;
		System.out.printf("Short -> char: %d --> %c\n", sh, c);
		c = (char) l;
		System.out.printf("Long -> char: %d --> %c\n", l, c);
		c = (char) f;
		System.out.printf("Float -> char: %f --> %c\n", f, c);
	}
	public static void TestBool()
	{
		boolean a = true;
		boolean b = false;
		boolean c;
		c = (boolean) (a & b);
		System.out.printf("Bitwice AND: %b & %b = %b\n", a, b, c);
		c = (boolean) (a | b);
		System.out.printf("Bitwice OR: %b | %b = %b\n", a, b, c);
		c = (boolean) (a ^ b);
		System.out.printf("Bitwice XOR: %b ^ %b = %b\n", a, b, c);
		//assignment
		System.out.printf("Ñompound bitwice OR: %b |= %b --> c = %b\n", c, a, c |= a);
		System.out.printf("Ñompound bitwice AND: %b &= %b --> c = %b\n", c, a, c &= a);
		System.out.printf("Ñompound bitwice XOR: %b ^= %b --> c = %b\n", c, a, c ^= a);
		//relation
		System.out.printf("Equality: %b == %b --> %b\n", a, b, a == b);
		System.out.printf("Inequality: %b != %b --> %b\n", a, b, a != b);
		//logical
		System.out.printf("Logical AND: %b && %b = %b\n", a, b, c);
		System.out.printf("Logical OR: %b || %b = %b\n", a, b, c);
		System.out.printf("Logical XOR: %b ^ %b = %b\n", a, b, c);
		System.out.printf("Logical NOT: !%b --> %b\n", a, b, c);
	}

}
