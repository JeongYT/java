package test04;

public class CommandCenterTest {
    public static void main(String[] args) {
        CommandCenter command = CommandCenter.getInstance();

        Factory tank = command.createFactory("탱크");
        Factory golliat = command.createFactory("골리앗");

        System.out.println(tank.getUnit());
        System.out.println(tank.getUnitCount());
        System.out.println(golliat.getUnit());
        System.out.println(golliat.getUnitCount());

    }
}
