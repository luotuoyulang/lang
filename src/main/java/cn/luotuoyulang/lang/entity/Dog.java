package cn.luotuoyulang.lang.entity;

/**
 * @author liuyuhu
 * @Description
 * @Package cn.luotuoyulang.lang.entity
 * CreaterName liuyuhu
 * @Email 17600520726@163.com
 * @Date 2019/4/27
 */

public class Dog {



    private String color;
    public String name;
    public Dog() {}

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
