package lessons.lesson24.school;

public class Student {

    int id;
    String name;
    String dataBD;
    String phoneNumber;
    int groupId;

    public Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Student(String name, String dataBD, String phoneNumber, int groupId) {
        this.name = name;
        this.dataBD = dataBD;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dataBD='" + dataBD + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
