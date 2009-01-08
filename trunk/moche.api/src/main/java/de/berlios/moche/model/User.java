package de.berlios.moche.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jjhop
 */
public class User {

    private Long userId;      // id do wiązania w bazce
    private String userToken; // id na zewnatrz
    private String email;     // sluzy rowniez jako login
    private String password;  //
    private String salz;
    private boolean isActive;
    private List<Role> roles;
    private String description;
    private String miniPhoto; // mala fotka/awatar wyswietlany przy komentarzach i zgloszeniach
    private String midiPhoto; // fotka wyswietlany przy profilu
    private Date lastLogged;  // data ostatniego logowania

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getLastLogged() {
        return lastLogged;
    }

    public void setLastLogged(Date lastLogged) {
        this.lastLogged = lastLogged;
    }

    public String getMidiPhoto() {
        return midiPhoto;
    }

    public void setMidiPhoto(String midiPhoto) {
        this.midiPhoto = midiPhoto;
    }

    public String getMiniPhoto() {
        return miniPhoto;
    }

    public void setMiniPhoto(String miniPhoto) {
        this.miniPhoto = miniPhoto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getSalz() {
        return salz;
    }

    public void setSalz(String salz) {
        this.salz = salz;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
