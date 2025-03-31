package oops_concept;

public class diff_methods {
    static class person {
        String name;
        int age;
        String gender;
        String occupation;
        String phoneNumber;
        String email;

        // Without Parameters & Without Return Type
        void displayInfo() {
            System.out.println("Person Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Occupation: " + occupation);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
        }

        //Without Parameters & With Return Type
        String getFullName() {
            return "Full Name: " + name;
        }

        // With Parameters & Without Return Type
        void updatePhoneNumber(String newPhoneNumber) {
            phoneNumber = newPhoneNumber;
            System.out.println("Number updated to: " + phoneNumber);
        }

        //With Parameters & With Return Type
        int calculateBirthYear(int currentYear) {
            return currentYear - age;
        }
    }

    public static class Person1 {
        public static void main(String[] args) {
            person p1 = new person();
            p1.name = "sunil";
            p1.age = 27;
            p1.gender = "male";
            p1.occupation = "software engineer";
            p1.phoneNumber = "9848326107";
            p1.email ="advantureperson@gmail.com";

            p1.displayInfo();

            System.out.println(p1.getFullName());

            p1.updatePhoneNumber("9858113420");

            int birthYear = p1.calculateBirthYear(2025);
            System.out.println("Birth Year: " + birthYear);
        }
    }
}

