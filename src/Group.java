import java.util.ArrayList;

public class Group {

    private ArrayList groupList = new ArrayList();

    public Group(int size) {
        this.groupList = new ArrayList(size);
    }

    public Group() {
    }

    public void addStudentToGroupList(Student newStudent){
        groupList.add(newStudent);
    }

    public void removeLastFromGroupList(){
        groupList.remove(groupList.size()-1);
    }

    public void removeRandomFromGroupList(){
        if (groupList.size() < 1){
            System.out.println("Can not remove");
        } else {
            groupList.remove((int) (Math.random() * ((groupList.size()))));
        }
    }

    public void showAllFromGroupList(){
        for (Object item: groupList){
            System.out.println(item);
        }
    }

    public void showAllFromGroupListByInputAge(int age){
        for (Object item: groupList){
            if (item instanceof Student){
                if (((Student) item).getAge() == age){
                    System.out.println(item);
                }
            }
        }

    }



    public boolean hasStudentInGroupList(Student bogdan){
       return groupList.contains(student);
    }
}
