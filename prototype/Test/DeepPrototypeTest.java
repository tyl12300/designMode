import deep.Client;
import deep.ConcretePrototypeB;

import java.util.ArrayList;
import java.util.List;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-10
 */
public class DeepPrototypeTest {
    public static void main(String[] args) {
        //test1 是否能克隆           结果：是
//        ConcretePrototypeB c1 = new ConcretePrototypeB();
//        c1.setName("c");
//        c1.setAge(18);
//        c1.setHeight(172);
//        c1.setParents(new String[]{"a", "b"});
//        List<String> list = new ArrayList<>();
//        list.add("eat");
//        list.add("drink");
//        c1.setHobby(list);
//
//        ConcretePrototypeB c2 = new Client(c1).clonePrototype();
//        System.out.println("c1:   "+c1.getName());
//        System.out.println("c2:   "+c2.getName());
//
//        System.out.println("--------------------");
//
//        System.out.println("c1:   "+c1.getAge());
//        System.out.println("c2:   "+c2.getAge());
//
//        System.out.println("--------------------");
//
//        System.out.println("c1:   "+c1.getHeight());
//        System.out.println("c2:   "+c2.getHeight());
//
//        System.out.println("--------------------");
//
//        for (String hobby : c1.getHobby()) {
//            System.out.println("c1:   "+hobby);
//        }
//        for (String hobby : c2.getHobby()) {
//            System.out.println("c2:   "+hobby);
//        }
//        System.out.println("--------------------");
//        for (String parent : c1.getParents()) {
//            System.out.println("c1:   "+parent);
//        }
//        for (String parent : c2.getParents()) {
//            System.out.println("c2:   "+parent);
//        }
//        System.out.println("--------------------");
//    }
    //运行结果
//    c1:   c
//    c2:   c
//--------------------
//    c1:   18
//    c2:   18
//            --------------------
//    c1:   172
//    c2:   172
//            --------------------
//    c1:   eat
//    c1:   drink
//    c2:   eat
//    c2:   drink
//--------------------
//    c1:   a
//    c1:   b
//    c2:   a
//    c2:   b
//--------------------
        //test2 检查是否统一引用        结果 发现修改c1 c2 任为c1 修改前结果，表明 此为 浅克隆
        ConcretePrototypeB c1 = new ConcretePrototypeB();
        c1.setName("c");
        c1.setAge(18);
        c1.setHeight(172);
        c1.setParents(new String[]{"a", "b"});
        List<String> list = new ArrayList<>();
        list.add("eat");
        list.add("drink");
        c1.setHobby(list);

        ConcretePrototypeB c2 = new Client(c1).clonePrototype();
        System.out.println("c1:   "+c1.getName());
        c1.setName("d");
        System.out.println("c1:   "+c1.getName() +"     change");
        System.out.println("c2:   "+c2.getName());

        System.out.println("--------------------");

        System.out.println("c1:   "+c1.getAge());
        c1.setAge(1);
        System.out.println("c1:   "+c1.getAge()+"     change");
        System.out.println("c2:   "+c2.getAge());

        System.out.println("--------------------");

        System.out.println("c1:   "+c1.getHeight());
        c1.setHeight(149);
        // public final class Integer 应该可以视为与 String 差不多意思
        System.out.println("c1:   "+c1.getHeight()+"     change");
        System.out.println("c2:   "+c2.getHeight());

        System.out.println("--------------------");

        for (String hobby : c1.getHobby()) {
            System.out.println("c1:   "+hobby);
        }
        c1.getHobby().add("play");
        for (String hobby : c1.getHobby()) {
            System.out.println("c1:   "+hobby+"     change");
        }
        for (String hobby : c2.getHobby()) {
            System.out.println("c2:   "+hobby);
        }
        System.out.println("--------------------");
        for (String parent : c1.getParents()) {
            System.out.println("c1:   "+parent);
        }
        c1.getParents()[1]="z";
        for (String parent : c1.getParents()) {
            System.out.println("c1:   "+parent+"     change");
        }
        for (String parent : c2.getParents()) {
            System.out.println("c2:   "+parent);
        }
        System.out.println("--------------------");
    }
    //运行结果
//    c1:   c
//    c1:   d     change
//    c2:   c
//--------------------
//    c1:   18
//    c1:   1     change
//    c2:   18
//            --------------------
//    c1:   172
//    c1:   149     change
//    c2:   172
//            --------------------
//    c1:   eat
//    c1:   drink
//    c1:   eat     change
//    c1:   drink     change
//    c1:   play     change
//    c2:   eat
//    c2:   drink
//--------------------
//    c1:   a
//    c1:   b
//    c1:   a     change
//    c1:   z     change
//    c2:   a
//    c2:   b
//--------------------
}
