package com.zipcodewilmington.phonebook;

    public class PhoneNumbers {
        private String number;
        private String type;



        public PhoneNumbers(String number){
        this.number=number;
        this.type=type;
    }

        public String getNumber() {
            return number;
        }

        public String getType() {
            return type;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
