package class_ex;

public class AirConditioner {
    int targetTemp = 28;
    boolean running;
    final int DEFAULT_TARGET = 28;

    public void start() {
        this.running = true;
    }

    public void stop() {
        this.running = false;
        this.targetTemp = this.DEFAULT_TARGET;
    }

    public void increaseTargetTemp() {
        this.targetTemp++;
    }

    public void decreaseTargetTemp() {
        this.targetTemp--;
    }

    public void resetTargetTemp() {
        this.targetTemp = this.DEFAULT_TARGET;
    }
}