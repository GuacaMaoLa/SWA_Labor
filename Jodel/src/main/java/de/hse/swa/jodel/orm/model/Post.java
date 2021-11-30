/*========================================================================*
 *                                                                        *
 * This software is governed by the GPL version 2.                        *
 *                                                                        *
 * Copyright: Joerg Friedrich, University of Applied Sciences Esslingen   *
 *                                                                        *
 * $Id:$
 *                                                                        *
 *========================================================================*/
package de.hse.swa.jodel.orm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

// import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the POST database table.
 * 
 */
@Entity
public class Post implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "postSeq", sequenceName = "ZSEQ_POST_ID", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator = "postSeq")

    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "postedat")
    private Date postedat;

    @Column(name = "authorId")
    private Long authorId;

    ublic Post() {
    }

    public Post(String text, double longitude, double latitude, Long userId) {
        this.text =text;
        this.longitude = longitude;
        this.latitude = latitude;
        this.authorId = userId;
        this.postedat = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Date getPostedat() {
        return postedat;
    }

    public void setPostedat(Date postedat) {
        this.postedat = postedat;
    }

    public Long getAuthorId() { return this.authorId; }

    public void setAuthorId(Long authorId) {

        this.authorId = authorId;
    }



}