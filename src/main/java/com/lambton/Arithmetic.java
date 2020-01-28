package com.lambton;

import javafx.beans.binding.Bindings;

public class Arithmetic {
    int add(int a , int b){
        return a+b;

    }

   float a1(float a, float b){
        return a+b;
    }
   String add(String a, String b)
   {
       return a+b;

    }

    String add(String a, int b)
    {

        return a+b;

    }

   String s3(int a, String b)
   {
        return a+b;

    }
    int add(int a , int b,int c)
    {
        return a+b+c;

    }
   float add(int a , int b,float c)
   {
        return (float) add(a, b)+ c;

    }








}
