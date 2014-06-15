public class Student {
    private String studentName;
    private Address studentAddress;
    private Subject studentSubjects;
    public int numberOfStudentSubjects;
    Subject [] subjects = new Subject[10];

    public int getNumberOfStudentSubjects() {
        return numberOfStudentSubjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public Subject getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentSubjects(Subject studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    public void toStudy(Subject subjectThatWillBeStudy, int studyTime){

    }

    public void addSubjectToStudyList(Subject subjectToAdd){

    }

    public void deleteLastSubjectFromStudyList(){

    }

    public void outputAllInformationAboutSubjects(){

    }

    public void outputAverageMarkFromAllSubjects(){

    }
}

