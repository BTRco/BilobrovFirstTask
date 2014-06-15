public class Subject {
    private String subjectName;
    private int howMuchHoursInSemestr;
    private int howMuchHoursStudentWorks;
    private int studentMark = 1;

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

    public void passExams(Subject subjectOnWitchExamPasses){

    }

    public void outputInformationAboutSubject(Subject subjectToOutputInformation){

    }

    public void giveStudentMarkForThisSubject(Subject subjectOnWitchStudentNeededMark){

    }
}
