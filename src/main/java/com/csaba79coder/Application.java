package com.csaba79coder;

import com.csaba79coder.exception.CustomException;
import com.csaba79coder.service.ArithmeticalOperation;

public class Application {

    public static void main(String[] args) {

        double result;
        try {
            result = new ArithmeticalOperation().perform(10, 2);
            System.out.println(result);
        } catch (CustomException e) {
            // Handle CustomException here
            e.printStackTrace();
        }

        try {
            result = new ArithmeticalOperation().perform(10, 0);
            System.out.println(result);
        } catch (CustomException e) {
            // Handle CustomException here
            System.out.println(e.getMessage());
        }

        try {
            result = new ArithmeticalOperation().perform(100, 2);
            System.out.println(result);
        } catch (CustomException e) {
            // Handle CustomException here
            e.printStackTrace();
        }
    }
}
