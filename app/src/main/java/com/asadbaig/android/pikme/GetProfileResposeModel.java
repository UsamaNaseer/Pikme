package com.asadbaig.android.pikme;

/**
 * Created by usamanaseer on 14/02/2018.
 */

public class GetProfileResposeModel {


        private Object birthday;
        private String country;
        private String fname;
        private String number;
        private String password;
        private String amount;
        private boolean approved;
        private Object gender;
        private String profilePic;
        private String rating;
        private String type;
        private String email;

        public void setBirthday(Object birthday){
            this.birthday = birthday;
        }

        public Object getBirthday(){
            return birthday;
        }

        public void setCountry(String country){
            this.country = country;
        }

        public String getCountry(){
            return country;
        }

        public void setFname(String fname){
            this.fname = fname;
        }

        public String getFname(){
            return fname;
        }

        public void setNumber(String number){
            this.number = number;
        }

        public String getNumber(){
            return number;
        }

        public void setPassword(String password){
            this.password = password;
        }

        public String getPassword(){
            return password;
        }

        public void setAmount(String amount){
            this.amount = amount;
        }

        public String getAmount(){
            return amount;
        }

        public void setApproved(boolean approved){
            this.approved = approved;
        }

        public boolean isApproved(){
            return approved;
        }

        public void setGender(Object gender){
            this.gender = gender;
        }

        public Object getGender(){
            return gender;
        }

        public void setProfilePic(String profilePic){
            this.profilePic = profilePic;
        }

        public String getProfilePic(){
            return profilePic;
        }

        public void setRating(String rating){
            this.rating = rating;
        }

        public String getRating(){
            return rating;
        }

        public void setType(String type){
            this.type = type;
        }

        public String getType(){
            return type;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public String getEmail(){
            return email;
        }

        @Override
        public String toString(){
            return
                    "Profile Response{" +
                            "birthday = '" + birthday + '\'' +
                            ",country = '" + country + '\'' +
                            ",fname = '" + fname + '\'' +
                            ",number = '" + number + '\'' +
                            ",password = '" + password + '\'' +
                            ",amount = '" + amount + '\'' +
                            ",approved = '" + approved + '\'' +
                            ",gender = '" + gender + '\'' +
                            ",profilePic = '" + profilePic + '\'' +
                            ",rating = '" + rating + '\'' +
                            ",type = '" + type + '\'' +
                            ",email = '" + email + '\'' +
                            "}";
        }
    }


