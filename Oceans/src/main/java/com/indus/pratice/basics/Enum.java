package com.indus.pratice.basics;

import com.indus.pratice.exception.ENumException;

public class Enum  {
	public Ocean oceans(Ocean OceanInput)throws ENumException{
		


        switch (OceanInput) {
            case ARCTIC:
                System.out.println("Arctic Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            case NORTH_ATLANTIC:
                System.out.println("North Atlantic Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            case SOUTH_ATLANTIC:
                System.out.println("South Atlantic Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            case NORTH_PACIFIC:
                System.out.println("North Pacific Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            case SOUTH_PACIFIC:
                System.out.println("South Pacific Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            case INDIAN:
                System.out.println("Indian Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            case SOUTHERN:
                System.out.println("Southern Ocean - Directions: " + OceanInput.getDirection1() + ", " + OceanInput.getDirection2());
                break;
            default:
                System.out.println("Unknown Ocean");
        }
		return OceanInput;
    }
}

 

