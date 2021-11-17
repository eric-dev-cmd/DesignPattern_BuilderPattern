package builderPattern;

public class TestBuilderComputer {
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments
        //management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        Computer comp1 = new Computer.ComputerBuilder(
                "200 GB", "3 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        System.out.println("==== Computer ====");
        System.out.println(comp);
        System.out.println(comp1);
        System.out.println("==== Student ====");
        Student student = new Student.StudentBuilder(
                1, "Trung Vinh", "DHKTPM 14", 21, "Male"
        )
                .setAddress("GV, HCM").setFathername("Baba")
                .setMothername("Mama").setNationality("Viet Name")
                .setReligion("CA").build();
        Student student1 = new Student.StudentBuilder(
                1, "Danh Huy", "KHMT 14", 21, "Male"
        )
                .setAddress("GV, HCM").setFathername("Baba")
                .setMothername("Mama").setNationality("Viet Name")
                .setReligion("CA").build();
        System.out.println(student);
        System.out.println(student1);

    }
}
