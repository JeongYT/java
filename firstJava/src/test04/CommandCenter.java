package test04;

public class CommandCenter {

    private static CommandCenter instance = new CommandCenter();
    private CommandCenter(){ };

    public static CommandCenter getInstance(){
        return instance;
    }

    public Factory createFactory(String name) {
        Factory factory = new Factory(name);
//        Golliat 골리앗 = new Golliat();
        return factory;
    }
}
