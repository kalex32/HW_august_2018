class Student {
    private String lastName;
    private int yearOfBirth;

    Student(String lastName, int yearOfBirth) {
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    String getLastName() {
        return lastName;
    }

    int getYearOfBirth() {
        return yearOfBirth;
    }
}
