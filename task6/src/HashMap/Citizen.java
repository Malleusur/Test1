package HashMap;

public class Citizen {
    String citizenName;
    String citizenSurname;


    public String getCitizenName() {
        return citizenName;
    }
    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }
    public String getCitizenSurname() {
        return citizenSurname;
    }
    public void setCitizenSurname(String citizenSurname) {
        this.citizenSurname = citizenSurname;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((citizenName == null) ? 0 : citizenName.hashCode());
        result = prime * result + ((citizenSurname == null) ? 0 : citizenSurname.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Citizen other = (Citizen) obj;
        if (citizenName == null) {
            if (other.citizenName != null)
                return false;
        } else if (!citizenName.equals(other.citizenName))
            return false;
        if (citizenSurname == null) {
            if (other.citizenSurname != null)
                return false;
        } else if (!citizenSurname.equals(other.citizenSurname))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Citizen [name - " + citizenName + ", surname - " + citizenSurname + "]";
    }
}
