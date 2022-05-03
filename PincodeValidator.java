/*
 * The Pin Code Validator program implements an application that needs
 * to ensure all validations in different ways.
 *
 * @author: Lokesh
 * @date: 3-05-2022
 */
package com.Bridgelab.day19_Pincode;

import java.util.regex.Pattern;

    public class PincodeValidator{
        /*
         * isValid method
         */
        static public boolean isValid(String regex,String input) {
            Pattern pattern = Pattern.compile(regex);
            return pattern.matches(regex,input);

        }
        public static void main(String[] args) {
            boolean regexCheck = isValid("^[1-9]{1}[0-9]{2}\\s{0,1}?[0-9]{3}$","530 028");
            System.out.println(regexCheck);
        }
    }
