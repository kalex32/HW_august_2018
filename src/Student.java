class Student {
    private String lastName;
    private int yearOfBirth;
    private int est1;
    private int est2;
    private int est3;
    private double averageEst;

    Student(String lastName, int yearOfBirth) {
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.est1=0;
        this.est2=0;
        this.est3=0;
        this.averageEst=0.0;
    }

    String getLastName() {
        return lastName;
    }

    int getYearOfBirth(){
        return yearOfBirth;
    }

    int getEst1() {
        return est1;
    }

    void setEst1(int est1) {
        this.est1 = est1;
    }

    int getEst2() {
        return est2;
    }

    void setEst2(int est2) {
        this.est2 = est2;
    }

    int getEst3() {
        return est3;
    }

    void setEst3(int est3) {
        this.est3 = est3;
    }

    private double getAverageEst() {
        return averageEst;
    }

    void setAverageEst(double averageEst) {
        this.averageEst = averageEst;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Студент: фамилия - ").append(getLastName());
        sb.append(", год рождения: ").append(getYearOfBirth());
        sb.append(", оценка 1 =").append(getEst1());
        sb.append(", оценка 2 =").append(getEst2());
        sb.append(", оценка 3 =").append(getEst3());
        sb.append(", средняя оценка =").append(getAverageEst());
        sb.append("\n");
        return sb.toString();
    }
}
