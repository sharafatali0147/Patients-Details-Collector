package com.example.testament.businessLayer;

class Patient extends Person {
    private String disease;
    private int bloodPressure;
    private int temperature;
    private boolean coldsAndFlue;
    private boolean vomiting;
    private boolean headache;

    public Patient(String name, String gender, int age, String disease, int bloodPressure, int temperature, boolean coldsAndFlue, boolean vomiting, boolean headache) {
        super(name, gender, age);
        this.disease = disease;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.coldsAndFlue = coldsAndFlue;
        this.vomiting = vomiting;
        this.headache = headache;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isColdsAndFlue() {
        return coldsAndFlue;
    }

    public void setColdsAndFlue(boolean coldsAndFlue) {
        this.coldsAndFlue = coldsAndFlue;
    }

    public boolean isVomiting() {
        return vomiting;
    }

    public void setVomiting(boolean vomiting) {
        this.vomiting = vomiting;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "disease='" + disease + '\'' +
                ", bloodPressure=" + bloodPressure +
                ", temperature=" + temperature +
                ", coldsAndFlue=" + coldsAndFlue +
                ", vomiting=" + vomiting +
                ", headache=" + headache +
                '}';
    }
}
