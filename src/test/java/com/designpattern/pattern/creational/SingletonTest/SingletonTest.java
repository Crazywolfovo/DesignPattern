package com.designpattern.pattern.creational.SingletonTest;

import com.designpattern.pattern.creational.singleton.CustomThread;
import com.designpattern.pattern.creational.singleton.EnumInstance;
import com.designpattern.pattern.creational.singleton.HungrySingleton;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    @Test
    public void test() {
        Thread thread1 = new Thread(new CustomThread());
        Thread thread2 = new Thread(new CustomThread());
        thread1.start();
        thread2.start();
        System.out.println("programe end.");
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        //HungrySingleton instance = HungrySingleton.getInstance();
        EnumInstance instance = EnumInstance.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton_file"));
        oos.writeObject(instance);
        File file = new File("Singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        EnumInstance newInstance = (EnumInstance) ois.readObject();
        Assert.assertEquals(instance, newInstance);
    }

    /**
     * 单例模式反射攻击
     */
    @Test
    public void test3() {
        try {
            Class<HungrySingleton> objectClass = HungrySingleton.class;
            Constructor<HungrySingleton> constructor = objectClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            HungrySingleton newInstance = constructor.newInstance();
            HungrySingleton instance = HungrySingleton.getInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEnum() {
        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();
    }

}
