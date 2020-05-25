public class Main {
    public static void main(String[] args) {
        // field
        // AirConditionerを生成
        AirConditioner ac1 = new AirConditioner();
        AirConditioner ac2 = new AirConditioner();

        // method
        ac1.start();
        ac1.decreaseTargetTemp();
        ac1.decreaseTargetTemp();

        ac2.start();
        ac2.decreaseTargetTemp();
        ac2.decreaseTargetTemp();
        ac2.decreaseTargetTemp();

        ac1.stop();

        System.out.println(ac1.targetTemp);
        System.out.println(ac2.targetTemp);
    }
}