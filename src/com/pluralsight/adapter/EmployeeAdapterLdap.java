package com.pluralsight.adapter;

public class EmployeeAdapterLdap implements Employee {
    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }
    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName(){
        return instance.getGivenName();
    }
    @Override
    public String getLastName() {
        return instance.getSurname();
    }
    @Override
    public String getEmail() {
        return instance.getMail();
    }
    //Some argue that this is more like a decorator, not an adaptor
    public String toString() {
        return "ID: " + instance.getCn() + ", First name: " + instance.getGivenName()
                + ", Last mame: " + instance.getSurname() + ", Email: " + instance.getMail();
    }
}
