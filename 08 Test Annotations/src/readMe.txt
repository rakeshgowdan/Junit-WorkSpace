Annotation
Annotations are like meta-tags that you can add to your code, and apply them to methods or in class. These annotations in JUnit provide the following information about test methods −

which methods are going to run before and after test methods.
which methods run before and after all the methods, and.
which methods or classes will be ignored during the execution.
The following table provides a list of annotations and their meaning in JUnit −

Sr.No.	Annotation & Description
1	
@Test

The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.

2	
@Before

Several tests need similar objects created before they can run. Annotating a public void method with @Before causes that method to be run before each Test method.

3	
@After

If you allocate external resources in a Before method, you need to release them after the test runs. Annotating a public void method with @After causes that method to be run after the Test method.

4	
@BeforeClass

Annotating a public static void method with @BeforeClass causes it to be run once before any of the test methods in the class.

5	
@AfterClass

This will perform the method after all tests have finished. This can be used to perform clean-up activities.

6	
@Ignore

The Ignore annotation is used to ignore the test and that test will not be executed.