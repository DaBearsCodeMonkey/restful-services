package com.carlos.weightlossprogram.weightloss.katchtdee;


class KatchTdeePayload {
    private int bodyFatPercentage;
    private int weight;

    public KatchTdeePayload() {
    }

    public KatchTdeePayload(int bodyFatPercentage, int weight) {
        this.bodyFatPercentage = bodyFatPercentage;
        this.weight = weight;
    }

    int getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    int getWeight() {
        return weight;
    }
}
