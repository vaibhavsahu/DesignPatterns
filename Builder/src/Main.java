public class Main {
    public static void main(String[] args) {
        PersonalInfo p1 = new PersonalInfo.PersonalInfoBuilder().name("john").build();
        PersonalInfo p2 = new PersonalInfo.PersonalInfoBuilder().name("test").address("test").build();
    }
}
