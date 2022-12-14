package day09_IfStatements;

public class LearnToOperatingSystem {

    public static void main(String[] args) {

        String device = "Mac",
               os;
        if(device == "Mac"){
          os = "MacOS";
        }else if (device == "Lenova") {
          os = "Windows";  
        }else if (device == "Iphone") {
          os = "IOS";
        }else os = "Android";

        System.out.println("Your operating system is " + os);




      /*
       Write a java program in order to learn to OS
Mac     ->     MacOS
Lenova  ->     Windows
Iphone  ->     IOS
Samsung ->     Android

input : Mac
output: MacOS
       */

    }
}
