package be.pxl.generics.opgave1.opgave_f;

import be.pxl.generics.opgave1.Motorized;
import be.pxl.generics.opgave1.Vehicle;

public class WorkingPlaceUtility {
	public static <T extends Motorized> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
