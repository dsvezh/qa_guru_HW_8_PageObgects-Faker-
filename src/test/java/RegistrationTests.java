import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.ResaltTableModal;



public class RegistrationTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ResaltTableModal resaltTableModal = new ResaltTableModal();
    RandomTestData testData = new RandomTestData();

    @Test
    void successfullRegistrationTest() {


        registrationPage.openPage()
                        .removeFooterBanner()
                        .checkHeadline(testData.headline)
                        .setFirstName(testData.firstName)
                        .setLastName(testData.lastName)
                        .setEmail(testData.email)
                        .setGender(testData.gender)
                        .setUserNumber(testData.userPhoneNumber)
                        .setDateOfBirth(testData.dayOfBirth, testData.monthOfBirth , testData.yearOfBirth)
                        .setHomeAddress(testData.homeAddress)
                        .setSubjects(testData.subjects)
                        .setHobbies(testData.hobbies)
                        .setPicture(testData.picture)
                        .setState(testData.state)
                        .setCity(testData.city)
                        .clickSubmit();



        resaltTableModal.checkResultTableAppear()
                        .checkTitleTable("Thanks for submitting the form")
                        .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                        .checkResult("Student Email", testData.email)
                        .checkResult("Mobile", testData.userPhoneNumber)
                        .checkResult("Date of Birth", testData.dayOfBirth + " " + testData.monthOfBirth + "," + testData.yearOfBirth)
                        .checkResult("Subjects", testData.subjects)
                        .checkResult("Hobbies", testData.hobbies)
                        .checkResult("Picture", testData.picture)
                        .checkResult("Address", testData.homeAddress)
                        .checkResult("State and City", testData.state + " " + testData.city);



    }
}