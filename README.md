# Software Testing Labs
the source code of labs of Software Testing course

## lab1

Write a java program for the given problem and test the program with Junit. 
1) Description of the problem:
There are one 50 yuan, one 20 yuan, one 10 yuan, two 5 yuan bills and three 1 yuan coins in your pocket. Write a program to find out whether you can take out a given number (x) yuan. 
2) Design nine test cases, three for each interface, using assertEquals( ), assertTrue( ), and assertFalse( )


## lab2

1.	Write a java program for the given problem:
Given a positive integer N, split it into the sum of at least two positive integers, and maximize the product of these integers. Returns the largest product value M.
Input:
N a positive integer
Output:
M the largest product value
		Sample Input:
			10
		Sample Output
36 (10 = 3 + 4 + 4， 3 *3*4 = 36)
2.	Test the program with Advanced Junit Usage.
a)	Add `@Before`, `@BeforeClass`, `@After`, `@AfterClass` to different functions, and write logs in each function, observe the execution order.
b)	Given the input list `testinput.txt`, each line with a test input and expected output, separated by comma, eg. `10,36` means `10 = 3 + 3 + 4` and the result should be `3 * 3 * 4 = 36`. Each line only contains one test case. Use `@RunWith(Parameterized.class)` to load the test file, and test all test cases.
3.	Use Cobertura to produce coverage.

