package builderPattern;

public class Student {
    //required parameters
    private int id;
    private String name;
    private String classname;
    private int age;
    private String gender;
    //optional parameters
    private String address;
    private String fathername;
    private String mothername;
    private String nationality;
    private String religion;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassname() {
        return classname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getFathername() {
        return fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public String getNationality() {
        return nationality;
    }

    public String getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", fathername='" + fathername + '\'' +
                ", mothername='" + mothername + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }

    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.classname = builder.classname;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.fathername = builder.fathername;
        this.mothername = builder.mothername;
        this.nationality = builder.nationality;
        this.religion = builder.religion;
    }

    public static class StudentBuilder {
        //required parameters
        private int id;
        private String name;
        private String classname;
        private int age;
        private String gender;
        //optional parameters
        private String address;
        private String fathername;
        private String mothername;
        private String nationality;
        private String religion;

        public StudentBuilder(int id, String name, String classname, int age, String gender) {
            this.id = id;
            this.name = name;
            this.classname = classname;
            this.age = age;
            this.gender = gender;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setFathername(String fathername) {
            this.fathername = fathername;
            return this;
        }

        public StudentBuilder setMothername(String mothername) {
            this.mothername = mothername;
            return this;
        }

        public StudentBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
