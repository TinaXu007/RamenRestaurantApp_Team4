package com.alpharamen.customer;

import org.junit.Test;

import static org.junit.Assert.*;

import com.alpharamen.customer.utils.ValidateUtils;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    // Using email examples from:
    // https://help.xmatters.com/ondemand/trial/valid_email_format.htm

    String validEmail1 = "yxx914@case.edu";
    String validEmail2 = "tinayq1@gmail.com";
    String validEmail3 = "abc-d@mail.com";
    String validEmail4 = "abc.def@mail.com";
    String validEmail5 = "abc@mail.com";
    String validEmail6 = "abc_def@mail.com";

// TODO: Debug with Ziang
//    String invalidEmail1 = "abc-@mail.com";
//    String invalidEmail2 = "abc..def@mail.com";
//    String invalidEmail3 = "abc@mail.com";
    String invalidEmail4 = "abc#def@mail.com";

    String validPhoneNumber1 = "3302346789";
    String validPhoneNumber2 = "33089076598";
    String invalidPhoneNumber1 = "330+191900";
    String invalidPhoneNumber2 = "*246191900";

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void email_isValid() throws Exception {
        assertEquals(true, ValidateUtils.isEmailValid(validEmail1));
        assertEquals(true, ValidateUtils.isEmailValid(validEmail2));
        assertEquals(true, ValidateUtils.isEmailValid(validEmail3));
        assertEquals(true, ValidateUtils.isEmailValid(validEmail4));
        assertEquals(true, ValidateUtils.isEmailValid(validEmail5));
        assertEquals(true, ValidateUtils.isEmailValid(validEmail6));
    }

    @Test
    public void email_isInvalid() throws Exception {
// TODO: Debug with Ziang
//        assertEquals(false, ValidateUtils.isEmailValid(invalidEmail1));
//        assertEquals(false, ValidateUtils.isEmailValid(invalidEmail2));
//        assertEquals(false, ValidateUtils.isEmailValid(invalidEmail3));
        assertEquals(false, ValidateUtils.isEmailValid(invalidEmail4));
    }

    @Test
    public void phoneNumber_isValid() throws Exception {
        assertEquals(true, ValidateUtils.isPhoneNumberValid(validPhoneNumber1));
        assertEquals(true, ValidateUtils.isPhoneNumberValid(validPhoneNumber1));
    }
// TODO: Debug with Ziang
//    @Test
//    public void phoneNumber_isInvalid() throws Exception {
//        assertEquals(true, ValidateUtils.isPhoneNumberValid(invalidPhoneNumber1));
//        assertEquals(true, ValidateUtils.isPhoneNumberValid(invalidPhoneNumber2));
//    }
}