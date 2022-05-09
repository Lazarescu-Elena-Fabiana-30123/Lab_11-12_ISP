package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Equipment {
    private final String name;
    private final String serialNumber;

    public Equipment(String serialNumber) {
        this.name = "NONE";
        this.serialNumber = serialNumber;
    }

    public Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return getName() + "_" + getSerialNumber();
    }

    @Override
    public boolean equals(Object obj) {
        Equipment equipment = (Equipment) obj;

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

            return this.name.equals(equipment.getName()) &&
                   this.serialNumber.equals(equipment.getSerialNumber());
    }

    public String getName() {
        return this.name;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}
