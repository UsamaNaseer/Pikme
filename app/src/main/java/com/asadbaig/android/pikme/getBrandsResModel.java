package com.asadbaig.android.pikme;

/**
 * Created by Asad Baig on 2/23/2018.
 */

public class getBrandsResModel {
    private String updatedAt;

    private String model;

    private String createdAt;

    private String brand_id;

    private String brand;

    public String getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getModel ()
    {
        return model;
    }

    public void setModel (String model)
    {
        this.model = model;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getBrand_id ()
    {
        return brand_id;
    }

    public void setBrand_id (String brand_id)
    {
        this.brand_id = brand_id;
    }

    public String getBrand ()
    {
        return brand;
    }

    public void setBrand (String brand)
    {
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [updatedAt = "+updatedAt+", model = "+model+", createdAt = "+createdAt+", brand_id = "+brand_id+", brand = "+brand+"]";
    }
}
