package deep;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-10
 */
public class Client {
    private ConcretePrototypeB prototype;

    public Client(ConcretePrototypeB prototype){
        this.prototype=prototype;
    }

    public ConcretePrototypeB clonePrototype(){
        ConcretePrototypeB temp=null;
        try {
            temp= (ConcretePrototypeB) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
