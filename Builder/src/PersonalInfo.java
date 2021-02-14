public class PersonalInfo {
    private String name;
    private String contact;
    private String address;
    private int age;
    private String gender;
    private boolean isEmployed;

    public PersonalInfo(PersonalInfoBuilder personalInfoBuilder){
        this.name = personalInfoBuilder.name;
        this.contact = personalInfoBuilder.contact;
        this.address = personalInfoBuilder.address;
        this.age = personalInfoBuilder.age;
        this.gender = personalInfoBuilder.gender;
        this.isEmployed = personalInfoBuilder.isEmployed;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public static class PersonalInfoBuilder{

        private String name;
        private String contact;
        private String address;
        private int age;
        private String gender;
        private boolean isEmployed;

        public PersonalInfoBuilder name(String name){
            this.name = name;
            return this;
        }

        public PersonalInfoBuilder contact(String contact){
            this.contact = contact;
            return this;
        }


        public PersonalInfoBuilder address(String address){
            this.address = address;
            return this;
        }


        public PersonalInfoBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonalInfoBuilder gender(String gender){
            this.gender = gender;
            return this;
        }

        public PersonalInfoBuilder employed(boolean isEmployed){
            this.isEmployed = isEmployed;
            return this;
        }

        public PersonalInfo build(){
            PersonalInfo personalInfo = new PersonalInfo(this);
            return personalInfo;
        }

    }

}
