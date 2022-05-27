package org.example.support;

import org.example.dto.UserDto;
import org.example.enums.CompanyEnum;
import org.example.enums.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {

    private static final String[] namesMale = {"Ivan", "Valera", "Sergey", "Petr", "Vladimir", "Dmitrii", "Uriy",
            "Evgeniy", "Pavel", "Zaur", "Vasiliy", "Artem", "Mikhail", "Vyacheslav", "Alexey"};

    private static final String[] namesFemale = {"Maria", "Olga", "Tatiana", "Alexandra", "Marina", "Nataliya",
            "Kseniya", "Varvara", "Irina", "Darya", "Ulya"};

    private static final String[] companyName = {"ARMTEK", "SBER", "ITEKO", "AUTORUS", "AG", "BLACKWATER"};

    private static final String[] department = {"IT", "HR", "Workers", "Marketing", "Sales", "AXO" };

    public static List<UserDto> getUserList(int listSize){
        List<UserDto> resultList = new ArrayList<>();

        for (int i = 0; i < listSize; i++){
            if (getMaleFemaleChance() <= 5){
                resultList.add(createMale());
            }else {
                resultList.add(createFemale());
            }
        }
        return resultList;
    }

    private static int getMaleFemaleChance(){
        return ((int)(Math.random()*10) +1);
    }

    private static String getString(String[] strMass){
        int index = ((int) (Math.random() * (strMass.length)));
        return strMass[index];
    }

    private static int getSalary(){
        int min = 20_000;
        int max = 500_000;
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

    private static UserDto createMale(){
        return new UserDto(getString(namesMale), getString(companyName), getString(department), getSalary(), Sex.MALE );
    }

    private static UserDto createFemale(){
        return new UserDto(getString(namesFemale), getString(companyName) , getString(department), getSalary(), Sex.FEMALE);
    }





}
