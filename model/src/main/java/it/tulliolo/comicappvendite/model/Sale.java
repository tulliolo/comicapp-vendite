package it.tulliolo.comicappvendite.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

import java.util.Date;

/**
 * Created by 11617047 on 26/05/2017.
 */

@Entity
public class Sale {
    @Id(autoincrement = true)
    private long id;

    private long comicId;
    private long price;
    @Index
    private Date date;

    @Generated(hash = 670056099)
    public Sale(long id, long comicId, long price, Date date) {
        this.id = id;
        this.comicId = comicId;
        this.price = price;
        this.date = date;
    }

    @Generated(hash = 983461670)
    public Sale() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getComicId() {
        return this.comicId;
    }

    public void setComicId(long comicId) {
        this.comicId = comicId;
    }

    public long getPrice() {
        return this.price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
