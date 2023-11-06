package com.reservationmanagment.employee;

import com.reservationmanagment.person.Person;

public class Employee {
    private Job job;

    public void newReservation() {
        if (job == Job.RECEPTIONIST || job == Job.BOOKER) {
            // Guest Information
        } else if (job == Job.ACCOUNTANT) {
            System.out.println("Guest payed");
        }
    }

    private void checkIn() {
        if (job == Job.RECEPTIONIST || job == Job.BOOKER) {

        } else if (job == Job.ACCOUNTANT) {

        }
    }

    private void checkOut() {
        if (job == Job.RECEPTIONIST || job == Job.BOOKER) {

        } else if (job == Job.ACCOUNTANT) {

        }
    }

    private void reservationAlteration() {
        if (job == Job.RECEPTIONIST || job == Job.BOOKER) {
            //reservationSerch();
            //reservationSerch();
        }
    }

    private void reservationSerch() {

    }

    private void reservationCancelation() {
        //reservationSerch();
    }
}
