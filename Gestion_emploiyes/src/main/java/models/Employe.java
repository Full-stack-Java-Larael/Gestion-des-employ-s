package models;

import java.sql.Date;

public class Employe extends User{
    private Date entry_date;
    private boolean gone_out;

    public Date getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    public boolean isGone_out() {
        return gone_out;
    }

    public void setGone_out(boolean gone_out) {
        this.gone_out = gone_out;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmploye{" +
                "entry_date=" + entry_date +
                ", gone_out=" + gone_out +
                '}';
    }
}
