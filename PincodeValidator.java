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
            boolean regexCheck = isValid("^[1-9]{1}[\\d]{5}$","520082");
            System.out.println(regexCheck);
        }
    }

