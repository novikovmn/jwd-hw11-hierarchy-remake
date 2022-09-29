package by.epam.hw11.remake.hierarchy.bean;

import java.util.Objects;

public abstract class ElectricComputingDevice extends ElectricalAppliance {

	private String operatingSystem;
	private double displayInches;
	private String batteryCapacity;

	public ElectricComputingDevice() {

	}

	public ElectricComputingDevice(String brand, String operatingSystem, double displayInches, String batteryCapacity) {
		super(brand);
		this.operatingSystem = operatingSystem;
		this.displayInches = displayInches;
		this.batteryCapacity = batteryCapacity;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, displayInches, operatingSystem);
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
		ElectricComputingDevice other = (ElectricComputingDevice) obj;
		return Objects.equals(batteryCapacity, other.batteryCapacity)
				&& Double.doubleToLongBits(displayInches) == Double.doubleToLongBits(other.displayInches)
				&& Objects.equals(operatingSystem, other.operatingSystem);
	}

}
