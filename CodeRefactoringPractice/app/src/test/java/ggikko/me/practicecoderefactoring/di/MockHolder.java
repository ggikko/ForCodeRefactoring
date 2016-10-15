package ggikko.me.practicecoderefactoring.di;

import android.support.annotation.Nullable;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

/**
 * Created by ggikko on 2016. 10. 16..
 */

public class MockHolder {

    private Map<Type, Object> mockMap = new HashMap<>();

    private static MockHolder staticMockHolder;

    static void init(MockHolder mockHolder) {
        staticMockHolder = mockHolder;
    }

    public static void addMock(Type type, Object object) {
        staticMockHolder.add(type, object);
    }

    public static <T> T addMock(Type type) {
        T t = (T) mock(type.getClass());
        staticMockHolder.add(type, t);
        return t;
    }

    public static <T> T returnMockIfExist(Object object, Type type) {
        if (staticMockHolder.isExist(type)) {
            T t = staticMockHolder.get(type);
            if (t != null) {
                return t;
            }
        }

        return (T) object;
    }

    public void add(Type type, Object object) {
        if (object != null) {
            mockMap.put(type, object);
        }
    }

    public boolean isExist(Type type) {
        return mockMap.containsKey(type);
    }

    @Nullable
    public <T> T get(Type type) {
        if (mockMap.containsKey(type)) {
            return (T) mockMap.get(type);
        }

        return null;
    }
}
