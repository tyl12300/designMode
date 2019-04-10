package deep;

import java.io.*;
import java.util.List;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-10
 */
public class ConcretePrototypeB implements Cloneable ,Serializable{
    private int age;
    private Integer height;
    private String name;
    private List<String> hobby;
    private String[] parents;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public String[] getParents() {
        return parents;
    }

    public void setParents(String[] parents) {
        this.parents = parents;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcretePrototypeB c = null;
        //输出流
        ByteArrayOutputStream bos = null;
        //输入流
        ByteArrayInputStream bis = null;
        //对象输出流
        ObjectOutputStream oos = null;
        //对象输入流
        ObjectInputStream ois = null;
        try {
            bos =new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis =new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            c = (ConcretePrototypeB) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return c;
    }
}
