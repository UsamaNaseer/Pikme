package com.asadbaig.android.pikme;

public class HistoryItem{
	private String to_latlong;

	private String from_latlong;

	private String status;

	private String vehicle_type;

	private String statusType;

	private String type;

	private String from_place;

	private String middleSeat;

	private String to_place;

	private String price;

	private String seatsAvailable;

	private String offerRide_ID;

	private String no_seats;

	private String user_id;

	private String rating;

	private String profile_pic;

	private String ride_comment;

	private String datetime;

	private String complaint;

	public String getTo_latlong ()
	{
		return to_latlong;
	}

	public void setTo_latlong (String to_latlong)
	{
		this.to_latlong = to_latlong;
	}

	public String getFrom_latlong ()
	{
		return from_latlong;
	}

	public void setFrom_latlong (String from_latlong)
	{
		this.from_latlong = from_latlong;
	}

	public String getStatus ()
	{
		return status;
	}

	public void setStatus (String status)
	{
		this.status = status;
	}

	public String getVehicle_type ()
	{
		return vehicle_type;
	}

	public void setVehicle_type (String vehicle_type)
	{
		this.vehicle_type = vehicle_type;
	}

	public String getStatusType ()
	{
		return statusType;
	}

	public void setStatusType (String statusType)
	{
		this.statusType = statusType;
	}

	public String getType ()
	{
		return type;
	}

	public void setType (String type)
	{
		this.type = type;
	}

	public String getFrom_place ()
	{
		return from_place;
	}

	public void setFrom_place (String from_place)
	{
		this.from_place = from_place;
	}

	public String getMiddleSeat ()
	{
		return middleSeat;
	}

	public void setMiddleSeat (String middleSeat)
	{
		this.middleSeat = middleSeat;
	}

	public String getTo_place ()
	{
		return to_place;
	}

	public void setTo_place (String to_place)
	{
		this.to_place = to_place;
	}

	public String getPrice ()
	{
		return price;
	}

	public void setPrice (String price)
	{
		this.price = price;
	}

	public String getSeatsAvailable ()
	{
		return seatsAvailable;
	}

	public void setSeatsAvailable (String seatsAvailable)
	{
		this.seatsAvailable = seatsAvailable;
	}

	public String getOfferRide_ID ()
	{
		return offerRide_ID;
	}

	public void setOfferRide_ID (String offerRide_ID)
	{
		this.offerRide_ID = offerRide_ID;
	}

	public String getNo_seats ()
	{
		return no_seats;
	}

	public void setNo_seats (String no_seats)
	{
		this.no_seats = no_seats;
	}

	public String getUser_id ()
	{
		return user_id;
	}

	public void setUser_id (String user_id)
	{
		this.user_id = user_id;
	}

	public String getRating ()
	{
		return rating;
	}

	public void setRating (String rating)
	{
		this.rating = rating;
	}

	public String getProfile_pic ()
	{
		return profile_pic;
	}

	public void setProfile_pic (String profile_pic)
	{
		this.profile_pic = profile_pic;
	}

	public String getRide_comment ()
	{
		return ride_comment;
	}

	public void setRide_comment (String ride_comment)
	{
		this.ride_comment = ride_comment;
	}

	public String getDatetime ()
	{
		return datetime;
	}

	public void setDatetime (String datetime)
	{
		this.datetime = datetime;
	}

	public String getComplaint ()
	{
		return complaint;
	}

	public void setComplaint (String complaint)
	{
		this.complaint = complaint;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [to_latlong = "+to_latlong+", from_latlong = "+from_latlong+", status = "+status+", vehicle_type = "+vehicle_type+", statusType = "+statusType+", type = "+type+", from_place = "+from_place+", middleSeat = "+middleSeat+", to_place = "+to_place+", price = "+price+", seatsAvailable = "+seatsAvailable+", offerRide_ID = "+offerRide_ID+", no_seats = "+no_seats+", user_id = "+user_id+", rating = "+rating+", profile_pic = "+profile_pic+", ride_comment = "+ride_comment+", datetime = "+datetime+", complaint = "+complaint+"]";
	}


}
