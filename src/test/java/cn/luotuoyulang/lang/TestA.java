package cn.luotuoyulang.lang;

import cn.luotuoyulang.lang.entity.Dog;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liuyuhu
 * @Description
 * @Package cn.luotuoyulang.lang
 * CreaterName liuyuhu
 * @Email 17600520726@163.com
 * @Date 2019/4/27
 */
public class TestA {

    public static void main(String[] args) throws ClassNotFoundException {
//      通过.class 获取类
        Class<Dog> clz1 = Dog.class;
//      通过对象获取类
        Class<? extends Dog> clz2 = new Dog().getClass();
//      通过全路径获取对象
        Class<?> clz3 = Class.forName("cn.luotuoyulang.lang.entity.Dog");

        System.out.println(clz1 == clz2);

        System.out.println(clz2 == clz3);
    }

    @Test
    public void createTest() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//     获取对象class
        Class<?> clz = Class.forName("cn.luotuoyulang.lang.entity.Dog");
//     获取对象的构造方法
        Constructor<?> con = clz.getConstructor();
//     根据构造方法创建对象
        Object o = con.newInstance();
        System.out.println(o);
    }

    @Test
    public void createTest1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//     获取对象class
        Class<?> clz = Class.forName("cn.luotuoyulang.lang.entity.Dog");
//     获取对象的构造方法
        Constructor<?> con = clz.getConstructor(String.class);
//     根据构造方法创建对象
        Object o = con.newInstance("红色");
        System.out.println(o);
    }
}
