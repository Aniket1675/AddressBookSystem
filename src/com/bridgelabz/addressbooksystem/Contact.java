package com.bridgelabz.addressbooksystem;

public class Contact
{
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private long zipCode;
        private long phoneNumber;
        private String email;

        public Contact(String firstName, String lastName, String address, String city, String state, long zipCode,
                       long phoneNumber, String email)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public long getZipCode() {
            return zipCode;
        }

        public void setZipCode(long zip) {
            this.zipCode = zip;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void showPersonsDetails()
        {
            System.out.println("------------------------------------------------------------------");
            System.out.format("| %20s: %30s |\n","First Name", this.getFirstName());
            System.out.format("| %20s: %30s |\n","Last Name", this.getLastName());
            System.out.format("| %20s: %30s |\n","Phone Number", this.getPhoneNumber());
            System.out.format("| %20s: %30s |\n","City", this.getCity());
            System.out.format("| %20s: %30s |\n","State", this.getState());
            System.out.format("| %20s: %30s |\n","Address", this.getAddress());
            System.out.format("| %20s: %30s |\n","Zip Code", this.getZipCode());
            System.out.format("| %20s: %30s |\n","Email", this.getEmail());
            System.out.println("------------------------------------------------------------------");

        }
}


