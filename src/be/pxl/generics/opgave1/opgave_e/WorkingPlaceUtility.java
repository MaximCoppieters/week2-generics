package be.pxl.generics.opgave1.opgave_e;

import be.pxl.generics.opgave1.Vehicle;

public class WorkingPlaceUtility {
	public static <T extends Vehicle> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
