package com.unimelb.jigarthakkar.safedrivesystem;

/**
 * Created by Tang on 9/28/17.
 */

import com.google.gson.annotations.SerializedName;

/**
 This is a class for table User in azure mobile service table.
 */
public class User {

    /**
     * Item Id
     * An id is required and it is automatically generated by mobile service table.
     */
    @SerializedName("id")
    private String mId;

    /**
     * Item text
     */
    @SerializedName("name")
    private String mName;

    /**
     * Item email
     */
    @SerializedName("email")
    private String mEmail;

    /**
     * Item password
     */
    @SerializedName("password")
    private String mPassword;

    /**
     * User constructor
     */
    public User() {

    }

    @Override
    public String toString() {
        return getText();
    }

    /**
     * Initializes a new User
     *
     * @param name
     *            The item text
     * @param id
     *            The item id
     */
    public User(String name, String id, String email, String password ) {
        this.setText(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    // GET methods

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Returns the item text
     */
    public String getText() {
        return mName;
    }

    /**
     * Returns the item email
     */
    public String getEmail() {
        return mEmail;
    }

    /**
     * Returns the item password
     */
    public String getPassword() {
        return mPassword;
    }

    //SET methods

    /**
     * Sets the item id
     *
     * @param id
     *          id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Sets the item text
     *
     * @param name
     *          text to set
     */
    public final void setText(String name) {
        mName = name;
    }

    /**
     * Sets the item email
     *
     * @param email
     *          text to set
     */
    public final void setEmail(String email) {
        mEmail = email;
    }

    /**
     * Sets the item password
     *
     * @param password
     *          text to set
     */
    public final void setPassword(String password) {
        mPassword = password;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof User && ((User) o).mName == mName;
    }
}
