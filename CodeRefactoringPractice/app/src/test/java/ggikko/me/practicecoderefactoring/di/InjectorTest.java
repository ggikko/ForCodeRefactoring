package ggikko.me.practicecoderefactoring.di;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by ggikko on 2016. 10. 16..
 */

@RunWith(JUnit4.class)
public class InjectorTest {

    private TestInterfaceMock testMock;
    private TestClassMock testClassMock;

    @Before
    public void setUp() throws Exception{
        testMock = mock(TestInterfaceMock.class);
        testClassMock = new TestClassMock();
    }

    @Test
    public void testInterfaceMockHolderIsExistTest(){
        MockHolder mockHolder = new MockHolder();
        mockHolder.add(TestInterfaceMock.class, testMock);
        assertThat("Is exist ? ", mockHolder.isExist(TestInterfaceMock.class));
    }

    @Test
    public void testClassMockHolderIsExistTest(){
        MockHolder mockHolder = new MockHolder();
        mockHolder.add(TestClassMock.class, testClassMock);
        assertThat("Is exist ? ", mockHolder.isExist(TestClassMock.class));
    }

    @Test
    public void testClassMockHolderIsSameTest(){
        MockHolder mockHolder = new MockHolder();
        mockHolder.add(TestClassMock.class, testClassMock);
        TestClassMock testClassMockFromHolder = mockHolder.get(TestClassMock.class);
        assertThat("Is same ? ", testClassMock , is(testClassMockFromHolder));
    }
}
