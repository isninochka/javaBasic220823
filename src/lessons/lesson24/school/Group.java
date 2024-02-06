package lessons.lesson24.school;

public class Group {
    Student[] students = new Student [25];
    int id;
    public Group(int id){
        this.id = id;
    }

    public void addStudent (Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i]=student;
                students[i].setGroupId(id);
                return;
            }

        }
    }
}
