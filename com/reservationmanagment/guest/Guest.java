package com.reservationmanagment.guest;

import com.reservationmanagment.person.Person;
import com.reservationmanagment.person.Platform;
import com.reservationmanagment.person.ReservationType;

public class Guest {
    public String getAdress() {
        return adress;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public int getPayment() {
        return payment;
    }

    public Platform getReservationPlatform() {
        return reservationPlatform;
    }

    public ReservationType getReservationType() {
        return reservationType;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setReservationPlatform(Platform reservationPlatform) {
        this.reservationPlatform = reservationPlatform;
    }

    public void setReservationType(ReservationType reservationType) {
        this.reservationType = reservationType;
    }

    public Guest(String adress, int roomNo, int payment, Platform reservationPlatform, ReservationType reservationType) {
        this.adress = adress;
        this.roomNo = roomNo;
        this.payment = payment;
        this.reservationPlatform = reservationPlatform;
        this.reservationType = reservationType;
    }

    public String adress;
    public int roomNo;
    public int payment;
    public Platform reservationPlatform;
    public ReservationType reservationType;

    public void reservation() {

    }
}
