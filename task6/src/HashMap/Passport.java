package HashMap;

public class Passport  {
    private String series;
    private String serialNumber;

    public String getSeries(){
        return series;
    }

    public void setSeries(String series){
        this.series = series;
    }

    public String getSerialNumber(){
        return series;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((series == null) ? 0 : series.hashCode());
        result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());

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
        Passport other = (Passport) obj;
        if (serialNumber == null) {
            if (other.serialNumber != null)
                return false;
        } else if (!serialNumber.equals(other.serialNumber))
            return false;
        if (series
                == null) {
            if (other.series != null)
                return false;
        } else if (!series.equals(other.series))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Passport [series=" + series + ", serialNumber=" + serialNumber + "]";
    }

}
