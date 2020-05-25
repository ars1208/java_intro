public class Main {
    public static void main(String[] args) {
        // field
        // AirConditionerを生成
        AirConditioner ac1 = new AirConditioner();

        // method
        ac1.start();
        ac1.decreaseTargetTemp();
        ac1.decreaseTargetTemp();

        System.out.println(ac1.targetTemp);
    }
}