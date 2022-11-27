package zadania.zd16;

import java.util.Arrays;

public enum Runner {
    BEGGINER (301,400),
    INTERMEDIATE (241,300),
    ADVENCED (180,240);

    int minTime;
    int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public Runner getFitnessLevel(int time){
        if(time <= ADVENCED.getMaxTime() && time >= ADVENCED.getMinTime() ) {
            return Runner.ADVENCED;
        } else if (time >= INTERMEDIATE.getMinTime() && time <= INTERMEDIATE.getMaxTime()) {
            return Runner.INTERMEDIATE;
        } else if (time >= BEGGINER.getMinTime() && time <= BEGGINER.getMaxTime()) {
            return Runner.BEGGINER;
        }
        return null;
    }


}
