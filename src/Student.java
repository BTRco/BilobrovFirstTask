public class Student {
    private String studentName;
    private Address studentAddress;
    private int age;
    public int numberOfStudentSubjects;
    Subject [] subjects = new Subject[10];

    public Student(String studentName, Address studentAddress) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    @Override
    public String toString() {
        return studentName + " " + age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if (!(obj instanceof Student)){
            return false;
        }

        Student stud = (Student) obj;
        if ((stud).getAge() == this.getAge()){
            if ((stud).getStudentName().equals(this.getStudentName())){
                return true;
            }
        }
        
        return false;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getNumberOfStudentSubjects() {
        return numberOfStudentSubjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void toStudy(Subject subjectThatWillBeStudy, int studyTime){
        subjectThatWillBeStudy.setHowMuchHoursStudentWorks((subjectThatWillBeStudy.getHowMuchHoursStudentWorks()+studyTime));
        System.out.println("You study well for " + studyTime + " hours.");
        System.out.println("To pass exams you need to study " + (subjectThatWillBeStudy.getHowMuchHoursInSemestr()-subjectThatWillBeStudy.getHowMuchHoursStudentWorks()) + " hours more");

    }

    public void addSubjectToStudyList(Subject subjectToAdd){
        subjects[numberOfStudentSubjects++] = subjectToAdd;
    }

    public void deleteLastSubjectFromStudyList(){
        subjects[--numberOfStudentSubjects] = null;

    }

    public void outputAllInformationAboutSubjects(){
        for (int i = 0;  i<numberOfStudentSubjects; i++)
            if (subjects[i]!=null){
                subjects[i].outputInformationAboutSubject(subjects[i]);
            }

    }

    public void outputAverageMarkFromAllSubjects(){
        float averageMark = 0;
        for (int i = 0;  i<numberOfStudentSubjects; i++)
            if (subjects[i]!=null){
                averageMark+=subjects[i].getStudentMark();
            }
        averageMark=averageMark/numberOfStudentSubjects;
        System.out.println("Average mark: " + averageMark);
    }
}

