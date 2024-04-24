package pojos;

public class PojoHerOkuAppBookingdates {
    private String checkin;
    private String checkout;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public PojoHerOkuAppBookingdates(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public PojoHerOkuAppBookingdates() {
    }

    @Override
    public String toString() {
        return "PojoHerOkuAppBookingdates{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }
}
