public class Main {
    public static void main(String[] args) {

        Subject programming = new Subject("Programming", 120);
        Subject mathematic = new Subject("Mathematic", 70);
        Subject physics = new Subject("Physics", 45);
        Student bogdanSkochynskyi = new Student("Bogdan Skochynskyi", new Address("Ukraine", "Kyiv", "Nizhyns'ka", "29D"));

        bogdanSkochynskyi.addSubjectToStudyList(programming);
        bogdanSkochynskyi.addSubjectToStudyList(mathematic);
        bogdanSkochynskyi.addSubjectToStudyList(physics);
        bogdanSkochynskyi.addSubjectToStudyList(physics);

        bogdanSkochynskyi.outputAllInformationAboutSubjects();

        bogdanSkochynskyi.deleteLastSubjectFromStudyList();

        bogdanSkochynskyi.outputAllInformationAboutSubjects();

        bogdanSkochynskyi.toStudy(programming, 120);
        bogdanSkochynskyi.toStudy(mathematic, 70);
        bogdanSkochynskyi.toStudy(physics, 45);

        programming.giveStudentMarkForThisSubject(programming);


    }
}
