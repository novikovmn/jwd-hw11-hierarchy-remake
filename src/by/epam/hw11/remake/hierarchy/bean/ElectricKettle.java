package by.epam.hw11.remake.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class ElectricKettle extends KitchenDevice implements Serializable {

	private static final long serialVersionUID = 8634682706154271709L;

	private String housingMaterial;

	public ElectricKettle() {
		super();
	}

	public ElectricKettle(String brand, boolean timerManagment, String housingMaterial) {
		super(brand, timerManagment);
		this.housingMaterial = housingMaterial;
	}

	public String getHousingMaterial() {
		return housingMaterial;
	}

	public void setHousingMaterial(String housingMaterial) {
		this.housingMaterial = housingMaterial;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(housingMaterial);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricKettle other = (ElectricKettle) obj;
		return Objects.equals(housingMaterial, other.housingMaterial);
	}

	@Override
	public String toString() {
		return "ElectricKettle [housingMaterial=" + housingMaterial + "]";
	}

}
