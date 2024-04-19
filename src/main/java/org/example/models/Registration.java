package org.example.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "reg_form")
@Data
public class Registration {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "confirmation_code")
    private long confirmation_code;
    @Column(name = "password")
    private String password;
    @Column(name = "password_repeat")
    private String password_repeat;
    @Column(name = "confirm_terms") // тут будет кнопка принять пользовательское соглашение
    private String confirm_terms;




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getConfirmation_code() {
        return confirmation_code;
    }

    public void setConfirmation_code(long confirmation_code) {
        this.confirmation_code = confirmation_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_repeat() {
        return password_repeat;
    }

    public void setPassword_repeat(String password_repeat) {
        this.password_repeat = password_repeat;
    }

    public String getConfirm_terms() {
        return confirm_terms;
    }

    public void setConfirm_terms(String confirm_terms) {
        this.confirm_terms = confirm_terms;
    }
}

