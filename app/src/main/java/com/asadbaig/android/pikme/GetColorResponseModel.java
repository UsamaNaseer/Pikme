package com.asadbaig.android.pikme;

/**
 * Created by usamanaseer on 14/02/2018.
 */

public class GetColorResponseModel {

        private String createdAt;
        private int colorId;
        private String color;
        private Object updatedAt;

        public void setCreatedAt(String createdAt){
            this.createdAt = createdAt;
        }

        public String getCreatedAt(){
            return createdAt;
        }

        public void setColorId(int colorId){
            this.colorId = colorId;
        }

        public int getColorId(){
            return colorId;
        }

        public void setColor(String color){
            this.color = color;
        }

        public String getColor(){
            return color;
        }

        public void setUpdatedAt(Object updatedAt){
            this.updatedAt = updatedAt;
        }

        public Object getUpdatedAt(){
            return updatedAt;
        }

        @Override
        public String toString(){
            return
                    "Color Response{" +
                            "createdAt = '" + createdAt + '\'' +
                            ",color_id = '" + colorId + '\'' +
                            ",color = '" + color + '\'' +
                            ",updatedAt = '" + updatedAt + '\'' +
                            "}";
        }
    }


