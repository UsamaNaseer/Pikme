package com.asadbaig.android.pikme;

/**
 * Created by Asad Baig on 2/23/2018.
 */

public class CheckUserResponseModel {

    private String success;

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [success = "+success+"]";
    }


}
