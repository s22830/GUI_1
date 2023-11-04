package people;

import java.util.Date;

public class TenantLetter {
    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    private int apartmentId;

    public Date getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(Date rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    private Date rentStartDate;
    private Date rentEndDate;
    private Date creationDate;


    public TenantLetter( Date rentStartDate, Date rentEndDate, Date creationDate)
    {
    this.rentStartDate = rentStartDate;
    this.rentEndDate = rentEndDate;
    this.creationDate = creationDate;
    }
}


