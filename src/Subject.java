public class Subject {
    private String subjectName;
    private int howMuchHoursInSemestr;
    private int howMuchHoursStudentWorks;
    private int studentMark = 1;

    public Subject(String subjectName, int howMuchHoursInSemestr) {
        this.subjectName = subjectName;
        this.howMuchHoursInSemestr = howMuchHoursInSemestr;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getHowMuchHoursInSemestr() {
        return howMuchHoursInSemestr;
    }

    public int getHowMuchHoursStudentWorks() {
        return howMuchHoursStudentWorks;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setHowMuchHoursInSemestr(int howMuchHoursInSemestr) {
        this.howMuchHoursInSemestr = howMuchHoursInSemestr;
    }

    public void setHowMuchHoursStudentWorks(int howMuchHoursStudentWorks) {
        this.howMuchHoursStudentWorks = howMuchHoursStudentWorks;
    }

    public void passExams(){
        if (getHowMuchHoursInSemestr() > getHowMuchHoursStudentWorks()){
            System.out.println("You lazy! Study more time! You need to study " + (getHowMuchHoursInSemestr()-getHowMuchHoursStudentWorks()) + " hours!");
        } else {
            System.out.println("You pass exams good!");
            setStudentMark(4);
        }

    }

    public static void outputInformationAboutSubject(Subject subjectToOutputInformation){
        System.out.println("Subject name: " + subjectToOutputInformation.getSubjectName());
        System.out.println("How much hours in semester: " + subjectToOutputInformation.getHowMuchHoursInSemestr());
    }

    public void giveStudentMarkForThisSubject(){
        System.out.println("You have " + getStudentMark() + " mark on " + getSubjectName());

    }


}
