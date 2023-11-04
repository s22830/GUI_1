package housing;

import exeptions.ProblematicTenantException;
import people.Person;
import people.TenantLetter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Apartment {
    private static int nextId = 1;
    private int id;
    private int volume;
    private List<Person> tenants;
    private List<TenantLetter> tenantLetter;

    public Apartment(int volume) {
        this.id = nextId++;
        this.volume = volume;
        this.tenants = new ArrayList<>();
        this.tenantLetter = new ArrayList<>();
    }

    public Apartment(int weight, int high, int length) {
        this.id = nextId++;
        this.volume = weight * high * length;
        this.tenants = new ArrayList<>();
        this.tenantLetter = new ArrayList<>();
    }

    public void addTenant(Person person) throws ProblematicTenantException {
        if (person.hasProblematicTenant()) {
            throw new ProblematicTenantException("Person " + person.getName() + " already has problem's");
        }
        tenants.add(person);

    }

    public void removeTenant(Person person) {
        this.tenants.remove(person);
    }

    public void checkRentStatus() {
        Date currentDate = new Date();

        for (TenantLetter letter : tenantLetter) {
            if (currentDate.after(letter.getRentEndDate())) {
                //TO DO
            }
        }
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Apartment.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Person> getTenants() {
        return tenants;
    }

    public void setTenants(List<Person> tenants) {
        this.tenants = tenants;
    }

    public List<TenantLetter> getTenantLetter() {
        return tenantLetter;
    }

    public void setTenantLetter(List<TenantLetter> tenantLetter) {
        this.tenantLetter = tenantLetter;
    }


}
