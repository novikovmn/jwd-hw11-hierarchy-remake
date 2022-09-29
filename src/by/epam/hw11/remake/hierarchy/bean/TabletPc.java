package by.epam.hw11.remake.hierarchy.bean;

import java.io.Serializable;
import java.util.Objects;

public class TabletPc extends ElectricComputingDevice implements Serializable {

	private static final long serialVersionUID = 1658034446181128959L;

	private boolean fingerScanner;
	private boolean chipNfc;
	private boolean portIr;

	public TabletPc() {

	}

	public TabletPc(String brand, String operatingSystem, double displayInches, String batteryCapacity,
			boolean fingerScanner, boolean chipNfc, boolean portIr) {
		super(brand, operatingSystem, displayInches, batteryCapacity);
		this.fingerScanner = fingerScanner;
		this.chipNfc = chipNfc;
		this.portIr = portIr;
	}

	public boolean isFingerScanner() {
		return fingerScanner;
	}

	public void setFingerScanner(boolean fingerScanner) {
		this.fingerScanner = fingerScanner;
	}

	public boolean isChipNfc() {
		return chipNfc;
	}

	public void setChipNfc(boolean chipNfc) {
		this.chipNfc = chipNfc;
	}

	public boolean isPortIr() {
		return portIr;
	}

	public void setPortIr(boolean portIr) {
		this.portIr = portIr;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(chipNfc, fingerScanner, portIr);
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
		TabletPc other = (TabletPc) obj;
		return chipNfc == other.chipNfc && fingerScanner == other.fingerScanner && portIr == other.portIr;
	}

	@Override
	public String toString() {
		return "TabletPc [fingerScanner=" + fingerScanner + ", chipNfc=" + chipNfc + ", portIr=" + portIr + "]";
	}

}
