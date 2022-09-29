package by.epam.hw11.remake.hierarchy.bean;

import java.util.Objects;

public abstract class KitchenDevice extends ElectricalAppliance {

	private boolean timerManagment;

	public KitchenDevice() {
	}

	public KitchenDevice(boolean timerManagment) {
		super();
		this.timerManagment = timerManagment;
	}

	public KitchenDevice(String brand, boolean timerManagment) {
		super(brand);
		this.timerManagment = timerManagment;
	}

	public boolean isTimerManagment() {
		return timerManagment;
	}

	public void setTimerManagment(boolean timerManagment) {
		this.timerManagment = timerManagment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(timerManagment);
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
		KitchenDevice other = (KitchenDevice) obj;
		return timerManagment == other.timerManagment;
	}

}
