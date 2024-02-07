public class Student {
    private String Id;
    private String Name;
    private  String dateBirth;
    private String classList;

    public Student(String id, String name, String dateBirth, String classList) {
        this.Id = id;
       this.Name = name;
        this.dateBirth = dateBirth;
        this.classList = classList;
    }
    public  String toString(){
        return "Student{" + "Id = "+ Id + '\'' + ", dateBirth= " + dateBirth + '\'' + ", classList= " + classList + '\'' + '}';
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
