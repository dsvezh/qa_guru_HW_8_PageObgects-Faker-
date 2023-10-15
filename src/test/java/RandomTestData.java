import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RandomTestData {
    Faker faker = new Faker(new Locale("EN"));

    final Map<String, String[]> stateAndCity = new HashMap<>();

    {
        stateAndCity.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        stateAndCity.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        stateAndCity.put("Haryana", new String[]{"Karnal", "Panipat"});
        stateAndCity.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
    }

    public String headline = "Student Registration Form";


    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.options().option("Male", "Female", "Other"),
            userPhoneNumber = faker.phoneNumber().subscriberNumber(10),

            dayOfBirth = String.valueOf(faker.number().numberBetween(10, 28)),
            monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November", "December"),
            yearOfBirth = String.valueOf(faker.number().numberBetween(1901, 2023)),

            subjects = faker.options().option("English", "Physics", "Chemistry", "Maths", "Arts"),
            hobbies = faker.options().option("Sports", "Reading", "Music"),
            picture = faker.options().option("1.png", "2.png", "3.png"),
            homeAddress = faker.address().fullAddress(),
            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = getRandomCity(state);

    public String getRandomCity(String state) {
        String city = null;
        if (state.equals("NCR")) {
            city = faker.options().option("Delhi", "Gurgaon", "Noida");
        }
        if (state.equals("Uttar Pradesh") ) {
            city = faker.options().option("Agra", "Lucknow", "Merrut");
        }
        if (state.equals("Haryana") ) {
            city =  faker.options().option("Karnal", "Panipat");
        }
        if (state.equals("Rajasthan") ) {
            city = faker.options().option("Jaipur", "Jaiselmer");
        }

        return city;
    }

}

