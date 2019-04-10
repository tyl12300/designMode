package simple;

/**
 * designMode
 *
 * @Author tyl
 * @Date 2019-04-10
 */
public class Client {
    private ConcretePrototypeA prototype;

    public Client(ConcretePrototypeA prototype){
        this.prototype=prototype;
    }

    public ConcretePrototypeA clonePrototype(){
        ConcretePrototypeA temp=null;
        try {
            temp= (ConcretePrototypeA) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
