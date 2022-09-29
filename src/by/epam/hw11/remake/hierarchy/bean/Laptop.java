package by.epam.hw11.remake.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class Laptop extends ElectricComputingDevice implements Serializable {

	private static final long serialVersionUID = -7299148249211569339L;

	private boolean cardReader;
	private boolean cdRom;
	private String coolingType;

	public Laptop() {
	}

	public Laptop(String brand, String operatingSystem, double displayInches, String batteryCapacity,
			boolean cardReader, boolean cdRom, String coolingType) {
		super(brand, operatingSystem, displayInches, batteryCapacity);
		this.cardReader = cardReader;
		this.cdRom = cdRom;
		this.coolingType = coolingType;
	}

	public boolean isCardReader() {
		return cardReader;
	}

	public void setCardReader(boolean cardReader) {
		this.cardReader = cardReader;
	}

	public boolean isCdRom() {
		return cdRom;
	}

	public void setCdRom(boolean cdRom) {
		this.cdRom = cdRom;
	}

	public String getCoolingType() {
		return coolingType;
	}

	public void setCoolingType(String coolingType) {
		this.coolingType = coolingType;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cardReader, cdRom, coolingType);
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
		Laptop other = (Laptop) obj;
		return cardReader == other.cardReader && cdRom == other.cdRom && Objects.equals(coolingType, other.coolingType);
	}

	@Override
	public String toString() {
		return "Laptop [cardReader=" + cardReader + ", cdRom=" + cdRom + ", coolingType=" + coolingType + "]";
	}

}
