package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instance;
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        if(Holder.instance == null)
            Holder.instance = new SingletonLazyHolder();
        return Holder.instance;
    }
}
