package simple;

import java.util.List;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-10
 */
public class ConcretePrototypeA implements Cloneable{
    private int age;
    private Integer height;
    private String name;
    private List<String>  hobby;
    private String[]  parents;

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
        ConcretePrototypeA c=new ConcretePrototypeA();
        c.setAge(this.getAge());
        c.setHeight(this.getHeight());
        c.setName(this.getName());
        c.setHobby(this.getHobby());
        c.setParents(this.getParents());
        return c;
    }
}
