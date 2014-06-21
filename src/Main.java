public class Main {
    public static void main(String[] args) {

        /** Subject programming = new Subject("Programming", 120);
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

        programming.giveStudentMarkForThisSubject();

        bogdanSkochynskyi.subjects[1].passExams();

        bogdanSkochynskyi.subjects[1].giveStudentMarkForThisSubject();

        bogdanSkochynskyi.outputAverageMarkFromAllSubjects(); **/

        Student bogdan = new Student("Bogdan Skochynskyi", 23);
        Student katya = new Student("Ekaterina Igorjokhina", 13);
        Student dima = new Student("Dima Ivanov", 14);
        Student igar = new Student("IGAAAAR", 30);

        Group group = new Group(5);
        group.addStudentToGroupList(bogdan);
        group.addStudentToGroupList(dima);
        group.addStudentToGroupList(katya);
        group.addStudentToGroupList(igar);

        group.showAllFromGroupList();

        group.removeLastFromGroupList();

        group.showAllFromGroupList();

        System.out.println(group.hasStudentInGroupList(bogdan));
        System.out.println("");
        group.showAllFromGroupListByInputAge(13);

        group.removeRandomFromGroupList();
        group.showAllFromGroupList();

    }
}
