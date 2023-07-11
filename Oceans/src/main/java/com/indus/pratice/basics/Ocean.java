package com.indus.pratice.basics;


public enum Ocean {
    ARCTIC("north", "west"),
    NORTH_ATLANTIC("north", "east"),
    SOUTH_ATLANTIC("east", "south"),
    NORTH_PACIFIC("west", "north"),
    SOUTH_PACIFIC("south", "east"),
    INDIAN("south", "west"),
    SOUTHERN("south", "east"), 
    UNKNOWN();

    private String direction1;
    private String direction2;

    Ocean(String direction1, String direction2) {
        this.direction1 = direction1;
        this.direction2 = direction2;
    }

    Ocean() {
		// TODO Auto-generated constructor stub
	}

	public String getDirection1() {
        return direction1;
    }

    public String getDirection2() {
        return direction2;
    }
}
