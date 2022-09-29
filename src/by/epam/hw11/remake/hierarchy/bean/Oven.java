package by.epam.hw11.remake.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends KitchenDevice implements Serializable {

	private static final long serialVersionUID = 6862473288363610955L;

	private double maxTemperature;

	public Oven() {
	}

	public Oven(String brand, boolean timerManagment, double maxTemperature) {
		super(brand, timerManagment);
		this.maxTemperature = maxTemperature;
	}

	public double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	@Override
	public boolean isOn() {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(maxTemperature);
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
		Oven other = (Oven) obj;
		return Double.doubleToLongBits(maxTemperature) == Double.doubleToLongBits(other.maxTemperature);
	}

	@Override
	public String toString() {
		return "Oven [maxTemperature=" + maxTemperature + "]";
	}

}
