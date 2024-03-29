# Software Testing Labs
the source code of labs of Software Testing course

## Lab1 Junit

Write a java program for the given problem and test the program with Junit. 
1) Description of the problem:
There are one 50 yuan, one 20 yuan, one 10 yuan, two 5 yuan bills and three 1 yuan coins in your pocket. Write a program to find out whether you can take out a given number (x) yuan. 
2) Design nine test cases, three for each interface, using assertEquals( ), assertTrue( ), and assertFalse( )


## Lab2 Cobertura

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

## Lab3 Major

1.	Install Major Mutation Framework.

2.	Coding a program named ‘UpgradedTriangle’. Given the length value (integer) of 3 sides of a triangle. Finish 2 functions respectively, 
a)	classifying the triangle
given 3 length of sides(integers), output the shape of triangle made up by given sides. (Output a String, the shape could be “SCALENE”,“EQUILATERAL”,“ISOSCELES”,“INVALID”.)
b)	calculating the area of valid triangle.
given 3 length of sides(integers), if these 3 sides can make up a valid triangle, output the area of the triangle (double or float), otherwise, return 0. (reference : Heron's formula)

3.	Write testing cases for 2 functions with Junit according to your previous study (MC/DC, boundary value, equivalence partitioning, etc.), guarantee the sufficiency and diversity of your test set. Each function should have 15 test cases. 

4.	Then run mutants on the test sets with Major Mutation Framework. 

5.	Analyzing the report provided by Major.  Calculate these values: 
- The number of mutants generated
- The number of mutants covered by the test suite
- The number of mutants killed by the test suite
- The number of live mutants
- The overall mutation score / adequacy of the test suite

Discuss and explain your results: (Here are some Viewpoints you could discuss)
- What do the results tell you about your test suite? 
- Does the test suite exhibit weaknesses? How can it be improved? 
- Does the test suite exhibit strengths? How do you recognize them? 
- Do you have any other interesting insights or opinions on the experience?
- Among the generated mutants, If both killed and unkilled mutants were generated, what was the type of operator used? How was it applied to the code (how did the code change)? 
- According to your mutation analysis result, which part of the source code need to be strengthened in further coding? Which test case in your suite are more important compared with others.



## Lab4 pytest

1. Install pytest testing framework. 
2. Implement the two functions mentioned in Lab3 in Python.  
3. Design test cases for these functions according to your  previous study (MC/DC, boundary value, equivalence  partitioning, etc.), guarantee the sufficiency and diversity of  your test set.  
4. Conventions for pytest test discovery your test files should be  named 'test_*.py' or '*_test.py' From those test files, pytest  collect test items: test prefixed test functions or methods  outside of class (test_) test prefixed test functions or methods  inside Test prefixed test classes (without an __init__ method)  (Class Test*) So manage your files and project structure  carefully so that pytest can automativally collect your test  cases. As a suggestion, we recommend you to put tests into  an extra directory outside your actual application code (often  a good idea). 
5. Analyse the report provided by pytest. 



## Lab5  selenium

Task 1: Verify Google/Baidu search results page 

Task 2: Test a login form  

Task 3: Test form validation  

Task 4: Test website navigation  

Task 5: Test dynamic content 



# Lab6 PITest

- Download the PITest example to learn how to use PITest for mutation testing based on Ant projects. https://github.com/hcoles/pitest-ant-example 
- Write code to implement the following functions: BubbleSort.java is an implementation of bubble sort algorithm BackPack.java is a solution of 01 backpack problem. 
- Try to generate Mutants of 2 programs with PITest.
- Write testing cases for 2 functions with Junit according to your previous study (MC/DC, boundary value, equivalence partitioning, etc.), guarantee the sufficiency and diversity of your test set. Each function should have 15 test cases.
- Use Cobertura to produce coverage. 
- Then run mutants on the test sets with PITest. In order for you to learn how to modify the build.xml file, please make the final file structure like follow:

```txt
.
├── lib
├── pitResults
│ ├── 202304030933
│ └── export
├── src
│ ├── main
│ │ └── java
│ └── test
│ └── java
└── target
├── classes
├── test-classes
└── test-result 
```

- - lib : the jars that need to be used
  - pitResults/<TimeStamp> : the web page generated after the mutation test 
  - pitResults/export : the mutants created after the mutation test 
  - src/main/java : source code 
  - src/test/java : test program source code 
  - target/classes : class file of source code 
  - target/test-classes : class file of test program 
  - target/test-result : the execution results of the 30 test cases you designed

- Analyzing the report provided by PITest 
- Discuss and explain your results

