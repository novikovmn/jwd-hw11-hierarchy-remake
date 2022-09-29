package by.epam.hw11.remake.hierarchy.bean;

import java.util.Objects;

public abstract class ElectricalAppliance {

	private String brand;

	public ElectricalAppliance() {

	}

	public ElectricalAppliance(String brand) {
		this.brand = brand;
	}

	/*
	 * abstract method
	 */
	public abstract boolean isOn();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectricalAppliance other = (ElectricalAppliance) obj;
		return Objects.equals(brand, other.brand);
	}

	@Override
	public String toString() {
		return "ElectricalAppliance [brand=" + brand + "]";
	}
	
	
	

}
