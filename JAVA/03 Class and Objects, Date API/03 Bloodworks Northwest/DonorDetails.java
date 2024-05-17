public class DonorDetails {
    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private long phoneNumber;

    public DonorDetails(String name, int age, String gender, String bloodGroup, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void displayDetails() {
        System.out.println("Name:" + this.getName());
        System.out.println("Age:" + this.getAge());
        System.out.println("Gender:" + this.getGender());
        System.out.println("Blood group:" + this.getBloodGroup());
        System.out.println("Phone no:" + this.getPhoneNumber());
    }
}
